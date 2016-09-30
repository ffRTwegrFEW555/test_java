package _gui._some_components;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by Vad on 04.06.2016.
 */
public class SomeComponents
        implements ActionListener, ItemListener, ListSelectionListener {
    JTextArea jTextArea;
    JCheckBox jCheckBox;
    JList jList;
    JList jList2;

    public static void main(String[] args) {
        SomeComponents SomeComponentsTest = new SomeComponents();
        SomeComponentsTest.go();
    }

    public void go() {
        //
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();
        JPanel jPanel2 = new JPanel();

        //
        JButton jButton = new JButton("Just Click it");
        jButton.addActionListener(this);

        //
        jTextArea = new JTextArea(10, 20);
        jTextArea.setLineWrap(true);

        //
        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        jScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jPanel.add(jScrollPane);

        //
        jCheckBox = new JCheckBox("Goes to 11");
        jCheckBox.addItemListener(this);

        //
        String[] strings = {"alpha", "beta", "gamma", "delta", "epsilon", "zeta", "eta", "theta"};
        int[] ints = {1, 2, 3, 4, 5, 6, 7};
        jList = new JList(strings);
        jList.setVisibleRowCount(4);
        jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jList.addListSelectionListener(this);
        // jList2 = new JList(ints); /* не получается создать список из примитивов.. */
        JScrollPane jScrollPane2 = new JScrollPane(jList);
        jScrollPane2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jPanel2.add(jScrollPane2);

        //
        jFrame.getContentPane().add(BorderLayout.NORTH, jPanel);
        jFrame.getContentPane().add(BorderLayout.WEST, jCheckBox);
        jFrame.getContentPane().add(BorderLayout.SOUTH, jButton);
        jFrame.getContentPane().add(BorderLayout.EAST, jPanel2);

        jFrame.setSize(500, 500);
        jFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jTextArea.append("button clicked \n");
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        jTextArea.append(jCheckBox.isSelected() ?   "Check box is on \n" :
                                                    "Check box is off \n");
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) {
            jTextArea.append(jList.getSelectedValue() + " \n");
        }

    }
}
