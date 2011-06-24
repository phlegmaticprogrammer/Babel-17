package com.babel17.netbeans;

import org.netbeans.spi.project.*;
import org.netbeans.api.project.*;
import org.openide.filesystems.*;
import org.openide.util.lookup.*;
import org.openide.util.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.beans.PropertyChangeListener;
import org.netbeans.spi.project.ui.support.DefaultProjectOperations;

import com.babel17.naive.FileCentral;
import org.openide.windows.WindowManager;
import org.openide.windows.Mode;
import org.openide.windows.TopComponent;


class Babel17Project implements Project {

    private final FileObject projectDir;
    private final ProjectState state;
    private volatile FileCentral fileCentral;
   
    private Lookup lkp;

    public Babel17Project(FileObject projectDir, ProjectState state) {
        System.out.println("Babel17Project opened!");
        this.projectDir = projectDir;
        this.state = state;
        this.fileCentral = makeFileCentral();
        if (this.fileCentral != null)
            projectDir.addRecursiveListener(new FCListener());        
    }
    
    private FileCentral makeFileCentral() {
        FileObject srcdir = projectDir.getFileObject("babel17_src");
        if (srcdir == null) return null;
        FileCentral fc = new FileCentral();
        collectFiles(fc, srcdir);
        return fc;       
    }
    
    private boolean isBabel17File(FileObject fo) {
        if (fo.isFolder()) return false;
        String ext = fo.getExt();
        if (ext.equals("b17") || ext.equals("babel17") || ext.equals("babel-17"))
          return true;
        else
          return false;
    }
    
    private void collectFiles(FileCentral fc, FileObject fo) {
        if (fo.isFolder()) {
            FileObject[] files = fo.getChildren();
            for (FileObject co : files) collectFiles(fc, co);
        } else {
            if (isBabel17File(fo)) {
                String p = fo.getPath();
                System.out.println("collectFiles: '"+p+"'");
                fc.updateB17File(p);
            }
        }
    }
    
    public String[] getSourceFiles() {
        FileCentral fc = makeFileCentral();
        if (fc == null) return new String[]{};
        else return fc.getFileNames();
    }
    
    
    
    public FileCentral getFileCentral() {
        return fileCentral;
    }

    @Override
    public FileObject getProjectDirectory() {
        return projectDir;
    }

    FileObject getSrcFolder(boolean create) {
        FileObject result =
                projectDir.getFileObject(Babel17ProjectFactory.PROJECT_DIR);
        if (result == null && create) {
            try {
                result = projectDir.createFolder(Babel17ProjectFactory.PROJECT_DIR);
            } catch (IOException ioe) {
                Exceptions.printStackTrace(ioe);
            }
        }
        return result;
    }

    //The project type's capabilities are registered in the project's lookup:
    @Override
    public Lookup getLookup() {
        if (lkp == null) {
            lkp = Lookups.fixed(new Object[]{
                        state, //allow outside code to mark the project as needing saving
                        new ActionProviderImpl(), //Provides standard actions like Build and Clean
                        new DemoDeleteOperation(),
                        new DemoCopyOperation(this),
                        new Info(), //Project information implementation
                        new Babel17ProjectLogicalView(this), //Logical view of project implementation
                    });
        }
        return lkp;
    }
    
    private final class FCListener extends FileChangeAdapter {
        public void fileChanged(FileEvent e) {
            FileObject fo = e.getFile();
            if (isBabel17File(fo)) {
                String p = fo.getPath();
                System.out.println("fileChanged: '"+p+"'");
                fileCentral.updateB17File(p);
            }
        }
        public void fileDeleted(FileEvent e) {
            FileObject fo = e.getFile();
            if (isBabel17File(fo)) {
                String p = fo.getPath();
                System.out.println("fileDeleted: '"+p+"'");
                fileCentral.deleteB17File(p);
            }
        }
        public void fileRenamed(FileRenameEvent e) {
            FileObject fo = e.getFile();
            if (fo.isFolder()) {
                System.out.println("folder renamed: "+e);
                fileCentral = makeFileCentral();
            } else if (isBabel17File(fo)) {
                String p = fo.getPath();
                File newf = new File(p);
                File oldf = new File(newf.getParentFile(), e.getName()+"."+e.getExt());
                String q = oldf.getPath();
                System.out.println("fileRenamed: "+q+" -> "+p);
                fileCentral.deleteB17File(q);
                fileCentral.updateB17File(p);
            }
        }                
    }

    private final class ActionProviderImpl implements ActionProvider {

        private String[] supported = new String[]{
            ActionProvider.COMMAND_DELETE,
            ActionProvider.COMMAND_COPY,
        };

        @Override
        public String[] getSupportedActions() {
            return supported;
        }

        @Override
        public void invokeAction(String string, Lookup lookup) throws IllegalArgumentException {
            if (string.equalsIgnoreCase(ActionProvider.COMMAND_DELETE)) {
                DefaultProjectOperations.performDefaultDeleteOperation(Babel17Project.this);
            }
            if (string.equalsIgnoreCase(ActionProvider.COMMAND_COPY)) {
                DefaultProjectOperations.performDefaultCopyOperation(Babel17Project.this);
            }
        }

        @Override
        public boolean isActionEnabled(String command, Lookup lookup) throws IllegalArgumentException {
            if ((command.equals(ActionProvider.COMMAND_DELETE))) {
                return true;
            } else if ((command.equals(ActionProvider.COMMAND_COPY))) {
                return true;
            } else {
                throw new IllegalArgumentException(command);
            }
        }
    }

    private final class DemoDeleteOperation implements DeleteOperationImplementation {

        public void notifyDeleting() throws IOException {
        }

        public void notifyDeleted() throws IOException {
        }

        public List<FileObject> getMetadataFiles() {
            List<FileObject> dataFiles = new ArrayList<FileObject>();
            return dataFiles;
        }

        public List<FileObject> getDataFiles() {
            List<FileObject> dataFiles = new ArrayList<FileObject>();
            return dataFiles;
        }
    }

    private final class DemoCopyOperation implements CopyOperationImplementation {

        private final Babel17Project project;
        private final FileObject projectDir;

        public DemoCopyOperation(Babel17Project project) {
            this.project = project;
            this.projectDir = project.getProjectDirectory();
        }

        public List<FileObject> getMetadataFiles() {
            return Collections.EMPTY_LIST;
        }

        public List<FileObject> getDataFiles() {
            return Collections.EMPTY_LIST;
        }

        public void notifyCopying() throws IOException {
        }

        public void notifyCopied(Project arg0, File arg1, String arg2) throws IOException {
        }
    }

    private final class Info implements ProjectInformation {

        @Override
        public Icon getIcon() {
            return new ImageIcon(ImageUtilities.loadImage(
                    "com/babel17/netbeans/b17projecticon.png"));
        }

        @Override
        public String getName() {
            return getProjectDirectory().getName();
        }

        @Override
        public String getDisplayName() {
            return getName();
        }

        @Override
        public void addPropertyChangeListener(PropertyChangeListener pcl) {
            //do nothing, won't change
        }

        @Override
        public void removePropertyChangeListener(PropertyChangeListener pcl) {
            //do nothing, won't change
        }

        @Override
        public Project getProject() {
            return Babel17Project.this;
        }
    }
}