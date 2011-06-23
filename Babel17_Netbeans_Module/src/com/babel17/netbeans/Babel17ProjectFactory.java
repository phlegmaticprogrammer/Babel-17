package com.babel17.netbeans;

import org.netbeans.spi.project.*;
import org.netbeans.api.project.*;
import org.openide.filesystems.*;
import java.io.*;

@org.openide.util.lookup.ServiceProvider(service=ProjectFactory.class)
public class Babel17ProjectFactory implements ProjectFactory {

    public static final String PROJECT_DIR = "babel17_src";

    //Specifies when a project is a project, i.e.,
    //if the project directory "texts" is present:
    @Override
    public boolean isProject(FileObject projectDirectory) {
        return projectDirectory.getFileObject(PROJECT_DIR) != null;
    }

    //Specifies when the project will be opened, i.e.,
    //if the project exists:
    @Override
    public Project loadProject(FileObject dir, ProjectState state) throws IOException {
        return isProject(dir) ? new Babel17Project(dir, state) : null;
    }

    @Override
    public void saveProject(final Project project) throws IOException, ClassCastException {
        FileObject projectRoot = project.getProjectDirectory();
        if (projectRoot.getFileObject(PROJECT_DIR) == null) {
            throw new IOException("Project dir " + projectRoot.getPath() +
                    " deleted," +
                    " cannot save project");
        }
        //Force creation of the texts dir if it was deleted:
        ((Babel17Project) project).getSrcFolder(true);
    }

}