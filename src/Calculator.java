import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.*;

public class Calculator extends JFrame {

    private JMenuBar menuBar;
    private JMenu file;
    private JMenu edit;
    private JMenu help;
    private JMenuItem close;
    private JMenuItem copy;
    private JMenuItem view;
    private JMenuItem about;

    private JTextField display;

    private JButton seven;
    private JButton eight;
    private JButton nine;

    private JButton six;
    private JButton five;
    private JButton four;

    private JButton three;
    private JButton two;
    private JButton one;

    private JButton equal;
    private JButton zero;

    private JButton plus;
    private JButton minus;
    private JButton multiply;
    private JButton divide;

    private JButton clear;

    public static void main(String[] args){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            JFrame.setDefaultLookAndFeelDecorated(true);
        } catch (Exception e) {
            System.out.println("Could not even.");
        }
        new Calculator();
    }

    public Calculator() {
        super("Calculator");
        sendMenuBar();
        sendDisplay();
        sendButtons();
        sendUI(this);
    }

    private void sendButtons() {
        seven = new JButton("7");
        seven.setBounds(10, 70, 60, 60);
        seven.setFont(new Font ("Arial", Font.PLAIN, 15));
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(display.getText().length() > 12)
                    return;
                if (display.getText().equalsIgnoreCase("0")) {
                    display.setText("7");
                    return;
                }
                display.setText(display.getText() + "7");
            }
        });
        add(seven);
        eight = new JButton("8");
        eight.setBounds(70, 70, 60, 60);
        eight.setFont(new Font ("Arial", Font.PLAIN, 15));
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(display.getText().length() > 12)
                    return;
                if (display.getText().equalsIgnoreCase("0")) {
                    display.setText("8");
                    return;
                }
                display.setText(display.getText() + "8");
            }
        });
        add(eight);
        nine = new JButton("9");
        nine.setBounds(130, 70, 60, 60);
        nine.setFont(new Font ("Arial", Font.PLAIN, 15));
        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(display.getText().length() > 12)
                    return;
                if (display.getText().equalsIgnoreCase("0")) {
                    display.setText("9");
                    return;
                }
                display.setText(display.getText() + "9");
            }
        });
        add(nine);

        four = new JButton("4");
        four.setBounds(10, 130, 60, 60);
        four.setFont(new Font ("Arial", Font.PLAIN, 15));
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(display.getText().length() > 12)
                    return;
                if (display.getText().equalsIgnoreCase("0")) {
                    display.setText("4");
                    return;
                }
                display.setText(display.getText() + "4");
            }
        });
        add(four);
        five = new JButton("5");
        five.setBounds(70, 130, 60, 60);
        five.setFont(new Font ("Arial", Font.PLAIN, 15));
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(display.getText().length() > 12)
                    return;
                if (display.getText().equalsIgnoreCase("0")) {
                    display.setText("5");
                    return;
                }
                display.setText(display.getText() + "5");
            }
        });
        add(five);
        six = new JButton("6");
        six.setBounds(130, 130, 60, 60);
        six.setFont(new Font ("Arial", Font.PLAIN, 15));
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(display.getText().length() > 12)
                    return;
                if (display.getText().equalsIgnoreCase("0")) {
                    display.setText("6");
                    return;
                }
                display.setText(display.getText() + "6");
            }
        });
        add(six);

        one = new JButton("1");
        one.setBounds(130, 190, 60, 60);
        one.setFont(new Font ("Arial", Font.PLAIN, 15));
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(display.getText().length() > 12)
                    return;
                if (display.getText().equalsIgnoreCase("0")) {
                    display.setText("1");
                    return;
                }
                display.setText(display.getText() + "1");
            }
        });
        add(one);
        two = new JButton("2");
        two.setBounds(70, 190, 60, 60);
        two.setFont(new Font ("Arial", Font.PLAIN, 15));
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(display.getText().length() > 12)
                    return;
                if (display.getText().equalsIgnoreCase("0")) {
                    display.setText("2");
                    return;
                }
                display.setText(display.getText() + "2");
            }
        });
        add(two);
        three = new JButton("3");
        three.setBounds(10, 190, 60, 60);
        three.setFont(new Font ("Arial", Font.PLAIN, 15));
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(display.getText().length() > 12)
                    return;
                if (display.getText().equalsIgnoreCase("0")) {
                    display.setText("3");
                    return;
                }
                display.setText(display.getText() + "3");
            }
        });
        add(three);

        zero = new JButton("0");
        zero.setBounds(10, 250, 60, 60);
        zero.setFont(new Font ("Arial", Font.PLAIN, 15));
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(display.getText().length() > 10)
                    return;
                if (display.getText().equalsIgnoreCase("0")) {
                    display.setText("0");
                    return;
                }
                display.setText(display.getText() + "0");
            }
        });
        add(zero);
        equal = new JButton("=");
        equal.setBounds(70, 250, 120, 60);
        equal.setFont(new Font ("Arial", Font.PLAIN, 15));
        add(equal);

        plus = new JButton("+");
        plus.setBounds(210, 70, 60, 60);
        plus.setFont(new Font ("Arial", Font.PLAIN, 15));
        add(plus);
        minus = new JButton("-");
        minus.setBounds(210, 130, 60, 60);
        minus.setFont(new Font ("Arial", Font.PLAIN, 15));
        add(minus);
        multiply = new JButton("*");
        multiply.setBounds(210, 190, 60, 60);
        multiply.setFont(new Font ("Arial", Font.PLAIN, 15));
        add(multiply);
        divide = new JButton("/");
        divide.setBounds(210, 250, 60, 60);
        divide.setFont(new Font ("Arial", Font.PLAIN, 15));
        add(divide);

        clear = new JButton("Clear");
        clear.setBounds(10, 45, 120, 25);
        clear.setFont(new Font ("Arial", Font.PLAIN, 5));
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("0");
            }
        });
        add(clear);

    }

    private void sendDisplay() {
        display = new JTextField("0");
        display.setBounds(10,10,265,35);
        display.setEditable(false);
        display.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        display.setFont(new Font("Arial", Font.PLAIN, 37));
        add(display);

    }

    private void sendMenuBar() {
        menuBar = new JMenuBar();
        file = new JMenu(" File ");
        edit = new JMenu(" Edit ");
        help = new JMenu(" Help ");

        close = new JMenuItem("Close");
        copy = new JMenuItem("Copy");
        about = new JMenuItem("About Calculator");
        view = new JMenuItem("View Help");

        setJMenuBar(menuBar);
        menuBar.add(file);
        file.add(close);

        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        menuBar.add(edit);
        edit.add(copy);

        copy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp_display = display.getText();
                StringSelection string = new StringSelection(temp_display);
                Clipboard system = Toolkit.getDefaultToolkit().getSystemClipboard();
                system.setContents(string, string);
            }
        });

        menuBar.add(help);
        help.add(about);
        help.add(view);

        about.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Deez Nuts.", "Calculator", 1);
            }
        });

        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "There are currently no help topics to view.", "Calculator", 0);
            }
        });
    }

    private void sendUI(Calculator app) {
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(300,400);
        app.setResizable(false);
        app.setLayout(null);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
    }


}
