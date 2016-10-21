package _jsoup._test2.view;

import _jsoup._test2.content.Section;
import _jsoup._test2.model.StrategySet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by USER on 21.10.2016, 10:30.
 */
class SwingGUI extends GUI {
    private JFrame frame;
    private JTabbedPane tabbedPane;

    private class ParsePanel extends JPanel {
        public ParsePanel() {
            super(new FlowLayout());
            JLabel label = new JLabel("Label: " + Math.random());
            add(label);

            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        label.setText("Label: " + Math.random());
                    }
                }
            }).start();
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
                        menuItemLAF.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    UIManager.setLookAndFeel(laf);
                                    SwingUtilities.updateComponentTreeUI(frame);
                                } catch (UnsupportedLookAndFeelException e1) {
                                    e1.printStackTrace();
                                }
                            }
                        });
                        add(menuItemLAF);
                    }
                } catch (Exception ignored) {
                    // If ANYTHING weird happens, don't add this L&F
                }
            }
        }
    }


    @Override
    protected void startGUI() {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                buildAndShowGUI();
            }
        });
    }

    private void buildAndShowGUI() {
        // initial standard frame settings
        frame = new JFrame("Content parser");
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {}
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

        JMenuBar menuBar    = new JMenuBar();

        // menu standard
        //
        JMenu menu = new JMenu("Menu");
        menu.setMnemonic    (KeyEvent.VK_M);

        // submenu
        JMenu submenu = new JMenu("+ Add new parser tab");
        submenu.setMnemonic (KeyEvent.VK_A);

        // submenu elements
        JMenuItem menuItemParser;
        StrategySet[] menuItemsSet = StrategySet.values();
        for (StrategySet value : menuItemsSet) {
            menuItemParser = new JMenuItem(value.getName());
            menuItemParser.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    tabbedPane.addTab(value.getName(), new ParsePanel());
                }
            });
            submenu.add(menuItemParser);
        }

        // quit
        JMenuItem menuItem = new JMenuItem("Quit");
        menuItem.setMnemonic(KeyEvent.VK_Q);
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quit(frame);
            }
        });

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
