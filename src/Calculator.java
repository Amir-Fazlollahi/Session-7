import javax.swing.*;
import java.awt.*;

/**
 * Class Calculator creates and displays the user interface for a
 * calculator
 */
public class Calculator {

    private JFrame calculatorFrame;

    /**
     * Instantiating this class and adding components to them
     */
    public Calculator() {

//        Creating the main frame and configuring it
        calculatorFrame = new JFrame("Calculator");
        calculatorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculatorFrame.setLocation(100, 10);
        calculatorFrame.setResizable(false);
        calculatorFrame.setSize(new Dimension(600, 600));

//        Creating the simple calculator scroll panel and keyboard
        JPanel simpleCalcTab = new JPanel();
        simpleCalcTab.setLayout(new BorderLayout());
        JPanel simpleCalcPanel = new JPanel();
        simpleCalcPanel.setLayout(new GridLayout(5, 4, 5, 5));
        for (int i = 7; i < 10; ++i) {
            simpleCalcPanel.add(new JButton("" + i));
        }
        simpleCalcPanel.add(new JButton(" + "));
        for (int i = 4; i < 7; ++i) {
            simpleCalcPanel.add(new JButton("" + i));
        }
        simpleCalcPanel.add(new JButton(" x "));
        for (int i = 1; i < 4; ++i) {
            simpleCalcPanel.add(new JButton("" + i));
        }
        simpleCalcPanel.add(new JButton(" / "));
        simpleCalcPanel.add(new JButton(" = "));
        simpleCalcPanel.add(new JButton(" 0 "));
        simpleCalcPanel.add(new JButton(" % "));
        simpleCalcPanel.add(new JButton(" - "));
        simpleCalcPanel.add(new JButton(" AC "));
        JScrollPane scrollPanel = new JScrollPane();
        scrollPanel.setPreferredSize(new Dimension(550, 200));
        simpleCalcTab.add(scrollPanel, BorderLayout.NORTH);
        simpleCalcTab.add(simpleCalcPanel, BorderLayout.CENTER);

//        Creating the engineering calculator scroll panel and keyboard
        JPanel engineeringCalcTab = new JPanel(new BorderLayout());
        JPanel engineeringCalcPanel = new JPanel(new GridLayout(5, 5, 5, 5));
        for (int i = 7; i < 10; ++i) {
            engineeringCalcPanel.add(new JButton("" + i));
        }
        engineeringCalcPanel.add(new JButton(" + "));
        engineeringCalcPanel.add(new JButton(" SIN/cos "));
        for (int i = 4; i < 7; ++i) {
            engineeringCalcPanel.add(new JButton("" + i));
        }
        engineeringCalcPanel.add(new JButton(" x "));
        engineeringCalcPanel.add(new JButton(" TG/cot "));
        for (int i = 1; i < 4; ++i) {
            engineeringCalcPanel.add(new JButton("" + i));
        }
        engineeringCalcPanel.add(new JButton(" / "));
        engineeringCalcPanel.add(new JButton(" ^X/log x "));
        engineeringCalcPanel.add(new JButton(" = "));
        engineeringCalcPanel.add(new JButton(" 0 "));
        engineeringCalcPanel.add(new JButton(" % "));
        engineeringCalcPanel.add(new JButton(" - "));
        engineeringCalcPanel.add(new JButton(" EXP/ln "));
        engineeringCalcPanel.add(new JButton(" shift "));
        engineeringCalcPanel.add(new JButton(" e "));
        engineeringCalcPanel.add(new JButton(" PI "));
        engineeringCalcPanel.add(new JButton(" mode "));
        engineeringCalcPanel.add(new JButton(" AC "));
        JScrollPane scrollPane1 = new JScrollPane();
        scrollPane1.setPreferredSize(new Dimension(550, 200));
        engineeringCalcTab.add(scrollPane1, BorderLayout.NORTH);
        engineeringCalcTab.add(engineeringCalcPanel, BorderLayout.CENTER);

//        Creating tabs and adding the two types of calculators
        JTabbedPane tabs = new JTabbedPane();
        tabs.add("Simple Calculator", simpleCalcTab);
        tabs.add("Engineering Calculator", engineeringCalcTab);

//        Adding the whole garbage to the main frame
        calculatorFrame.add(tabs);

//        Making it visible, otherwise, we wouldn't have delivered our message
        calculatorFrame.setVisible(true);
    }
}
