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
        sendUI(this);
    }

    private void sendDisplay() {
        display = new JTextField("0");
        display.setBounds(10,10,310,40);
        display.setEditable(false);
        display.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        display.setFont(new Font("Arial", Font.PLAIN, 40));
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
                String display = "";
                StringSelection string = new StringSelection(display);
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
        app.setSize(350,400);
        app.setResizable(false);
        app.setLayout(null);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
    }


}
