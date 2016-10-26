package _jsoup._test2.view;

import _jsoup._test2.content.Section;
import _jsoup._test2.model.StrategySet;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by USER on 21.10.2016, 10:30.
 */
class SwingGUI extends GUI {
    private JFrame frame;
    private JTabbedPane tabbedPane;

    private static JPanel getPanel(int boxLayout, float align, int sizeX, int sizeY) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, boxLayout));
        panel.setBorder(new CompoundBorder(
                BorderFactory.createLineBorder(Color.GRAY, 1),
                new EmptyBorder(5, 5, 5, 5)));
        if (align != -1) {
            panel.setAlignmentX(align);
        }

        if (sizeX != 0 && sizeY != 0) {
            panel.setMaximumSize(new Dimension(sizeX, sizeY));
        }

        return panel;
    }

    private static JPanel getPanel(String headerText, int sizeX, int sizeY) {
        //
        JPanel panel = new JPanel();
        panel.setMaximumSize(new Dimension(sizeX, sizeY));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));

        //
        panel.add(getLabel(headerText));

        //
        JPanel checkBoxList = new JPanel();
        checkBoxList.setLayout(new BoxLayout(checkBoxList, BoxLayout.Y_AXIS));
        JCheckBox jCheckBox = new JCheckBox("Select all");
        checkBoxList.add(jCheckBox);
        checkBoxList.add(Box.createRigidArea(new Dimension(0, 10)));

//        for (int i = 0; i < 20; i++) {
//            JCheckBox checkBox = new JCheckBox("CheckBox #: " + i);
//            checkBoxList.add(checkBox);
//        }
        JScrollPane checkBoxScrollPane = new JScrollPane(checkBoxList);
        checkBoxScrollPane.setAlignmentX(Component.LEFT_ALIGNMENT);

        //
        panel.add(checkBoxScrollPane);

        return panel;
    }

    private static JLabel getLabel(String text) {
        JLabel label = new JLabel(text);
        label.setAlignmentX(Component.LEFT_ALIGNMENT);
        label.setBorder(new CompoundBorder(
                BorderFactory.createLineBorder(Color.GRAY, 1),
                new EmptyBorder(5, 5, 5, 5)));
        return label;
    }

    private class ParsePanel extends JPanel {
        public ParsePanel() {
            super();
            setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
            setBorder(new EmptyBorder(5, 5, 5, 5));

            // ==> Panel: Settings
            JPanel settingsPanel = getPanel(BoxLayout.X_AXIS, Component.LEFT_ALIGNMENT, 1024, 300);

            // + Panel: Product categories
            settingsPanel.add(getPanel("Product categories:", 200, 300));

            //
            settingsPanel.add(Box.createRigidArea(new Dimension(5, 0)));

            // + Panel: Product options
            settingsPanel.add(getPanel("Product options:", 200, 300));

            // ==> Panel: Other options
            JPanel otherOptionsPanel = getPanel(BoxLayout.Y_AXIS, Component.LEFT_ALIGNMENT, 600, 300);
            otherOptionsPanel.setBorder(new CompoundBorder(
                    BorderFactory.createLineBorder(Color.GRAY, 1),
                    new EmptyBorder(0, 5, 0, 5)));

            // + Label: "URL"
            otherOptionsPanel.add(getLabel("URL:"));

            // + Panel: URL
            JPanel urlTextFieldPanel = getPanel(BoxLayout.X_AXIS, Component.LEFT_ALIGNMENT, 600, 30);
            urlTextFieldPanel.setBorder(new CompoundBorder(
                    BorderFactory.createLineBorder(Color.GRAY, 1),
                    new EmptyBorder(5, 0, 5, 0)));

            JTextField urlTextField = new JTextField("http://");
            urlTextField.setAlignmentX(Component.LEFT_ALIGNMENT);
            urlTextField.setMaximumSize(new Dimension(500, 25));
            urlTextField.setEditable(false);
            urlTextFieldPanel.add(urlTextField);

            urlTextFieldPanel.add(Box.createRigidArea(new Dimension(10, 0)));

            JButton changeUrlButton = new JButton("Change URL");
            changeUrlButton.setMaximumSize(new Dimension(100, 25));
            changeUrlButton.setPreferredSize(new Dimension(100, 25));
            changeUrlButton.addActionListener(e -> {
                        String result = JOptionPane.showInputDialog(
                                "Enter a new URL:"
                                        + "\n"
                                        + "(example: http://www.gamaliev.com)");
                        if (!result.contains("http://")) {
                            JOptionPane.showMessageDialog(urlTextFieldPanel, "Wrong URL address");
                        } else {
                            urlTextField.setText(result);
                        }
                    }
            );
            urlTextFieldPanel.add(changeUrlButton);

            otherOptionsPanel.add(urlTextFieldPanel);

            // + Label: "a Folder path to save"
            otherOptionsPanel.add(Box.createRigidArea(new Dimension(0, 10)));
            otherOptionsPanel.add(getLabel("a Folder path to save:"));

            // + Panel: a Folder path
            JPanel pathTextFieldPanel = getPanel(BoxLayout.X_AXIS, Component.LEFT_ALIGNMENT, 600, 30);
            pathTextFieldPanel.setBorder(new CompoundBorder(
                    BorderFactory.createLineBorder(Color.GRAY, 1),
                    new EmptyBorder(5, 0, 5, 0)));

            JTextField pathTextField = new JTextField(new File("").getAbsolutePath());
            pathTextField.setAlignmentX(Component.LEFT_ALIGNMENT);
            pathTextField.setMaximumSize(new Dimension(450, 25));
            pathTextField.setEditable(false);
            pathTextFieldPanel.add(pathTextField);

            pathTextFieldPanel.add(Box.createRigidArea(new Dimension(10, 0)));

            JButton selectFolderToSaveButton = new JButton("Select a folder to save");
            selectFolderToSaveButton.addActionListener(e -> {
                JFileChooser chooser = new JFileChooser();
                chooser.setCurrentDirectory(new File("."));
                chooser.setDialogTitle("Select a folder to save");
                chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                chooser.setAcceptAllFileFilterUsed(false);
                if (chooser.showOpenDialog(otherOptionsPanel) == JFileChooser.APPROVE_OPTION) {
                    pathTextField.setText(chooser.getSelectedFile().toString());
                }
            });
            selectFolderToSaveButton.setMaximumSize(new Dimension(150, 25));
            selectFolderToSaveButton.setPreferredSize(new Dimension(150, 25));
            pathTextFieldPanel.add(selectFolderToSaveButton);

            otherOptionsPanel.add(pathTextFieldPanel);

            //
            otherOptionsPanel.add(Box.createVerticalGlue());
            otherOptionsPanel.add(Box.createRigidArea(new Dimension(0, 10)));

            // + Panel: Save options and controls elements
            JPanel saveOptionsAndControlsElementsPanel
                    = getPanel(BoxLayout.X_AXIS, Component.LEFT_ALIGNMENT, 600, 130);
            saveOptionsAndControlsElementsPanel.setPreferredSize(new Dimension(600, 130));
            saveOptionsAndControlsElementsPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));

            otherOptionsPanel.add(saveOptionsAndControlsElementsPanel);


            settingsPanel.add(otherOptionsPanel);
            // <== Panel: Other options

            add(settingsPanel);
            // <== Panel: Settings
        }
    }

    private class JMenuLAF extends JMenu {
        public JMenuLAF(String name) {
            super(name);

            for (UIManager.LookAndFeelInfo lafInfo : UIManager.getInstalledLookAndFeels()) {
                try {
                    Class<?> lnfClass = Class.forName(lafInfo.getClassName());
                    LookAndFeel laf = (LookAndFeel) (lnfClass.newInstance());
                    if (laf.isSupportedLookAndFeel()) {
                        JMenuItem menuItemLAF = new JMenuItem(lafInfo.getName());
                        menuItemLAF.addActionListener(e -> {
                            try {
                                UIManager.setLookAndFeel(laf);
                                SwingUtilities.updateComponentTreeUI(frame);
                            } catch (UnsupportedLookAndFeelException e1) {
                                e1.printStackTrace();
                            }
                        });
                        add(menuItemLAF);
                    }
                } catch (Exception ignored) {
                }
            }
        }
    }


    @Override
    protected void startGUI() {
        javax.swing.SwingUtilities.invokeLater(this::buildAndShowGUI);
    }

    private void buildAndShowGUI() {
        // initial standard frame settings
        frame = new JFrame("Content parser");
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        }
        frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                quit(frame);
            }
        });
        frame.setResizable(false);
        frame.setSize(1024, 768);

        // create a form in the middle of the screen.
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(
                screenSize.width / 2 - (int) frame.getSize().getWidth() / 2,
                screenSize.height / 2 - (int) frame.getSize().getHeight() / 2);

        // set menuBar
        frame.setJMenuBar(createMenuBar());

        // set tabbed pane
        tabbedPane = new JTabbedPane();
        frame.setContentPane(tabbedPane);

        frame.setVisible(true);
    }

    private JMenuBar createMenuBar() {
        // TODO: pictures on menuItems

        JMenuBar menuBar = new JMenuBar();

        // menu standard
        //
        JMenu menu = new JMenu("Menu");
        menu.setMnemonic(KeyEvent.VK_M);

        // submenu
        JMenu submenu = new JMenu("+ Add new parser tab");
        submenu.setMnemonic(KeyEvent.VK_A);

        // submenu elements
        JMenuItem menuItemParser;
        StrategySet[] menuItemsSet = StrategySet.values();
        for (StrategySet value : menuItemsSet) {
            menuItemParser = new JMenuItem(value.getName());
            menuItemParser.addActionListener(e -> tabbedPane.addTab(value.getName(), new ParsePanel()));
            submenu.add(menuItemParser);
        }

        // quit
        JMenuItem menuItem = new JMenuItem("Quit");
        menuItem.setMnemonic(KeyEvent.VK_Q);
        menuItem.addActionListener(e -> quit(frame));

        // menu "Look and Feel"
        //
        JMenu menuLAF = new JMenuLAF("Look and Feel");

        // build menu
        menuBar.add(menu);
        menuBar.add(menuLAF);
        menu.add(submenu);
        menu.addSeparator();
        menu.add(menuItem);

        return menuBar;
    }

    private void quit(JFrame frame) {
        int n = JOptionPane.showOptionDialog(frame,
                "Do you really want to quit?",
                "Quit confirmation",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new String[]{"Quit", "Cancel"},
                "Quit");
        if (n == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    @Override
    public void updateSections(List<Section> allSections) {

    }

    @Override
    public void updateParseResult(List<Section> result) {

    }
}
