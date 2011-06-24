package com.babel17.netbeans;

import org.netbeans.spi.project.*;
import org.netbeans.spi.project.ui.*;
import org.netbeans.spi.project.ui.support.*;
import org.netbeans.api.project.*;
import org.openide.filesystems.*;
import org.openide.loaders.*;
import org.openide.util.lookup.*;
import org.openide.util.*;
import org.openide.nodes.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.Image;

class Babel17ProjectLogicalView implements LogicalViewProvider {

    private final Babel17Project project;
 
    public Babel17ProjectLogicalView(Babel17Project project) {
        this.project = project;
    }

    @Override
    public org.openide.nodes.Node createLogicalView() {
        try {
            //Get the Text directory, creating if deleted
            FileObject text = project.getSrcFolder(true);

            //Get the DataObject that represents it
            DataFolder textDataObject =
                    DataFolder.findFolder(text);

            //Get its default node-we'll wrap our node around it to change the
            //display name, icon, etc
            Node realTextFolderNode = textDataObject.getNodeDelegate();

            //This FilterNode will be our project node
            return new TextNode(realTextFolderNode, project);

        } catch (DataObjectNotFoundException donfe) {
            Exceptions.printStackTrace(donfe);
            //Fallback-the directory couldn't be created -
            //read-only filesystem or something evil happened
            return new AbstractNode(Children.LEAF);
        }
    }

    /** This is the node you actually see in the project tab for the project */
    private static final class TextNode extends FilterNode {

        final Babel17Project project;

        public TextNode(Node node, Babel17Project project) throws DataObjectNotFoundException {
            super(node, new FilterNode.Children(node),
                    //The projects system wants the project in the Node's lookup.
                    //NewAction and friends want the original Node's lookup.
                    //Make a merge of both
                    new ProxyLookup(new Lookup[]{Lookups.singleton(project),
                        node.getLookup()
                    }));
            this.project = project;
        }

        @Override
        public Action[] getActions(boolean arg0) {
            Action[] nodeActions = new Action[7];
            nodeActions[0] = CommonProjectActions.newFileAction();
            nodeActions[1] = CommonProjectActions.copyProjectAction();
            nodeActions[2] = CommonProjectActions.deleteProjectAction();
            nodeActions[5] = CommonProjectActions.setAsMainProjectAction();
            nodeActions[6] = CommonProjectActions.closeProjectAction();
            return nodeActions;
        }

        @Override
        public Image getIcon(int type) {
            return ImageUtilities.loadImage("com/babel17/netbeans/b17projecticon.png");
        }

        @Override
        public Image getOpenedIcon(int type) {
            return getIcon(type);
        }

        @Override
        public String getDisplayName() {
            return project.getProjectDirectory().getName();
        }

    }

    @Override
    public Node findPath(Node root, Object target) {
        //leave unimplemented for now
        return null;
    }

}