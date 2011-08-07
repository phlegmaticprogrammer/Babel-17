package com.babel17.netbeans;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import org.netbeans.api.project.ProjectUtils;
import org.netbeans.spi.project.ui.CustomizerProvider;
import org.netbeans.spi.project.ui.support.ProjectCustomizer;
import org.netbeans.spi.project.ui.support.ProjectCustomizer.Category;


public class Babel17CustomizerImpl implements CustomizerProvider {

  private ProjectCustomizer.Category[] categories;
  private ProjectCustomizer.CategoryComponentProvider panelProvider;  
  private Babel17Project project;
  
  private static class PanelProvider implements ProjectCustomizer.CategoryComponentProvider {
        private Map panels;
        
        private JPanel EMPTY_PANEL = new JPanel();
        
        public PanelProvider(Map panels) {
            this.panels = panels;
        }
        
        public JComponent create(ProjectCustomizer.Category category) {
            JComponent panel = (JComponent) panels.get(category);
            return panel == null ? EMPTY_PANEL : panel;
        }
        
  }  
  
  private static class OptionListener implements ActionListener {
    private Babel17Project project;
    public JTextArea javalibs;
        
    OptionListener(Babel17Project project) {
        this.project = project;
    }
        
    public void actionPerformed(ActionEvent e) {
      Preferences prefs = project.getPreferences();
      prefs.put("JAVALIBS", javalibs.getText());
      try {
        prefs.flush();
      } catch (BackingStoreException x) {
      }
    }
}  
  
  public Babel17CustomizerImpl(Babel17Project project) {
    this.project = project;
    categories = new ProjectCustomizer.Category[] {createCategory()};
  }
  
  private void init(OptionListener listener) {
    Map panels = new HashMap();
    panels.put(categories[0], createComponent(listener));        
    panelProvider = new PanelProvider(panels);    
  }
  
  public void showCustomizer() {
    OptionListener listener = new OptionListener(project);
    init(listener);
    Dialog dialog = ProjectCustomizer.createCustomizerDialog(categories, panelProvider,
    null, listener, null);
    
    dialog.setTitle(ProjectUtils.getInformation(project).getDisplayName());
    
    dialog.setVisible(true);    
  }
  
  public Category createCategory() {
        return ProjectCustomizer.Category.create(
                    "JAVALIBS",
                    "Java Libraries",
                    null);
  }    
    
  public JComponent createComponent(OptionListener listener) {
    JPanel p = new JPanel();
    p.setLayout(new BorderLayout());
    p.add(new JLabel("Paths to JAR files (separate via semicolon):"), BorderLayout.NORTH);
    JTextArea t = new JTextArea();
    listener.javalibs = t;
    Preferences prefs = project.getPreferences();
    t.setText(prefs.get("JAVALIBS", ""));
    t.setLineWrap(true);
    t.setAutoscrolls(true);
    JScrollPane scrollPane = new JScrollPane(t);
    p.add(scrollPane, BorderLayout.CENTER);  
    
    return p;
  }
  

}
