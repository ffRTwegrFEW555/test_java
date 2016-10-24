package _jsoup._test2.view;

import _jsoup._test2.content.Section;
import _jsoup._test2.model.StrategySet;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.util.List;

/**
 * Created by USER on 21.10.2016, 10:30.
 */
class SwingGUI extends GUI {
    private JFrame frame;
    private JTabbedPane tabbedPane;

    private static JPanel getPanel(int boxLayout, float align) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, boxLayout));
//        panel.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        if (align != -1) {
            panel.setAlignmentX(align);
        }

        return panel;
    }

    private static JPanel getPanel(String headerText, int sizeX, int sizeY) {
        //
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(sizeX, sizeY));
//        panel.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setAlignmentX(Component.LEFT_ALIGNMENT);

        //
        panel.add(getLabel(headerText));

        //
        JPanel checkBoxList = new JPanel();
//        checkBoxList.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        checkBoxList.setLayout(new BoxLayout(checkBoxList, BoxLayout.Y_AXIS));
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
//        label.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        label.setAlignmentX(Component.LEFT_ALIGNMENT);
        label.setBorder(new EmptyBorder(5, 5, 5, 5));
        label.setFont(new Font(null, Font.ITALIC, 12));
        return label;
    }

    private class ParsePanel extends JPanel {
        public ParsePanel() {
            super();
            setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
            setBorder(new EmptyBorder(10, 10, 10, 10));

            // Header panel
            JPanel headerPanel = getPanel(BoxLayout.Y_AXIS, Component.LEFT_ALIGNMENT);
            JLabel headerTextLabel = new JLabel("Header, header, header, header, header, header, header, header, header, " +
                    "header, header, header, header, ");
            headerTextLabel.setBorder(new CompoundBorder(
                    BorderFactory.createTitledBorder("Information"),
                    new EmptyBorder(5, 10, 5, 10)));
            headerPanel.add(headerTextLabel);
            add(headerPanel);

            // ==> Body panel
            JPanel bodyPanel = getPanel(BoxLayout.X_AXIS, Component.LEFT_ALIGNMENT);

            // ==> (Body panel) First column
            JPanel firstColumnPanel = getPanel(BoxLayout.Y_AXIS, -1);
            firstColumnPanel.setMaximumSize(new Dimension(200, 700));

            //
            firstColumnPanel.add(Box.createRigidArea(new Dimension(0, 10)));
            firstColumnPanel.add(getPanel("Product categories", 200, 330));
            firstColumnPanel.add(Box.createVerticalGlue());
            firstColumnPanel.add(getPanel("Product options", 200, 150));

            //
            JPanel buttonsPanel = getPanel(BoxLayout.Y_AXIS, Component.LEFT_ALIGNMENT);
            buttonsPanel.add(Box.createRigidArea(new Dimension(0, 20)));
            buttonsPanel.add(new JButton("Fill category and options lists"));
            buttonsPanel.add(Box.createRigidArea(new Dimension(0, 10)));
            buttonsPanel.add(new JButton("Start parse"));
            firstColumnPanel.add(buttonsPanel);

            //
            bodyPanel.add(firstColumnPanel);

            // <== (Body panel) First column

            // <== Body panel

            //
            add(bodyPanel);
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
                } catch (Exception ignored) {}
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

    //This method must be evoked from the event-dispatching thread.
    private void quit(JFrame frame) {
        int n = JOptionPane.showOptionDialog(frame,
                "Windows are still open.\nDo you really want to quit?",
                "Quit Confirmation",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new String[]{"Quit", "Cancel"},
                "Quit");
        if (n == JOptionPane.YES_OPTION) {
            System.out.println("Quitting.");
            System.exit(0);
        } else {
            System.out.println("Quit operation not confirmed; staying alive.");
        }
    }

    @Override
    public void updateSections(List<Section> allSections) {

    }

    @Override
    public void updateParseResult(List<Section> result) {

    }
}
