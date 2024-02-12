import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CalculatorEngine extends JFrame implements ActionListener{
    JTextField fldDisplayField;
    JPanel panel;
    JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8;
    JButton btn9, btnEqual, btnDecimal, btnDivide, btnAdd, btnSubtract, btnMultiply, btnClear;
    Font fntStyle = new Font("Verdana", Font.PLAIN, 30);
    double dblFirstNum = 0, dblSecondNum = 0, dblResult = 0;
    String strOperation;

    // Constructor
    public CalculatorEngine() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Basic Calculator");
        setLayout(null); // remove comment (//) to see difference
        //setLayout(new FlowLayout());
        setResizable(false);

        // For the textfield
        fldDisplayField = new JTextField();
        fldDisplayField.setHorizontalAlignment(SwingConstants.TRAILING);
        fldDisplayField.setBounds(60, 30, 300, 75);
        fldDisplayField.setColumns(100);
        fldDisplayField.setFont(fntStyle);
        fldDisplayField.setEditable(false);

        // Create buttons
        btn0 = new JButton("0");
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btnEqual = new JButton("=");
        btnDecimal = new JButton(".");
        btnDivide = new JButton("/");
        btnAdd = new JButton("+");
        btnSubtract = new JButton("-");
        btnMultiply = new JButton("*");
        btnClear = new JButton("Clear");
        btnClear.setBounds(140, 455, 125, 50);
        setFocusable(false);

        // Initialization of panel
        panel = new JPanel();
        panel.setBounds(60, 140, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        
        // Add component
        add(fldDisplayField);
        panel.add(btn7).setFont(fntStyle);
        panel.add(btn8).setFont(fntStyle);
        panel.add(btn9).setFont(fntStyle);
        panel.add(btnDivide).setFont(fntStyle);
        panel.add(btn4).setFont(fntStyle);
        panel.add(btn5).setFont(fntStyle);
        panel.add(btn6).setFont(fntStyle);
        panel.add(btnMultiply).setFont(fntStyle);
        panel.add(btn1).setFont(fntStyle);
        panel.add(btn2).setFont(fntStyle);
        panel.add(btn3).setFont(fntStyle);
        panel.add(btnSubtract).setFont(fntStyle);
        panel.add(btnDecimal).setFont(fntStyle);
        panel.add(btn0).setFont(fntStyle);
        panel.add(btnEqual).setFont(fntStyle);
        panel.add(btnAdd).setFont(fntStyle);
        add(btnClear).setFont(fntStyle);
        add(panel);

        // Button functionality
        btnClear.addActionListener(this);
        btn0.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btnEqual.addActionListener(this);
        btnDecimal.addActionListener(this);
        btnAdd.addActionListener(this);
        btnSubtract.addActionListener(this);
        btnMultiply.addActionListener(this);
        btnDivide.addActionListener(this);

        // For panel and frame background
        getContentPane().setBackground(Color.PINK);
        panel.setBackground(Color.PINK);
        setVisible(true);
    }

    // Method for handling response to a button click
    public void actionPerformed(ActionEvent e) {
        String Strcommand = e.getActionCommand(); // returns string

        switch (Strcommand) {
            case "=":
                calculateResult();
                break;
            case "Clear":
                fldDisplayField.setText("");
                break;
            case "+":
            case "-":
            case "*":
            case "/":
                storeFirstNumber(Strcommand);
                break;
            default:
                updateDisplay(Strcommand);
                break;
        }
    }

    // Method to calculate the result
    public void calculateResult() {
        try {
            dblSecondNum = Double.parseDouble(fldDisplayField.getText());

            switch (strOperation) {
                case "+":
                    dblResult = dblFirstNum + dblSecondNum;
                    break;
                case "-":
                    dblResult = dblFirstNum - dblSecondNum;
                    break;
                case "*":
                    dblResult = dblFirstNum * dblSecondNum;
                    break;
                case "/":
                    if (dblSecondNum == 0) {
                        throw new ArithmeticException("Can't Divide by 0");
                    }
                    dblResult = dblFirstNum / dblSecondNum;
            }
            fldDisplayField.setText(Double.toString(dblResult));
        } catch (NumberFormatException NumError) {
            fldDisplayField.setText("Error");
        } catch (ArithmeticException arrError) {
            fldDisplayField.setText(arrError.getMessage());
        }
    }

    // Method to get the first input
    public void storeFirstNumber(String strOperator) {
        try {
            dblFirstNum = Double.parseDouble(fldDisplayField.getText());
            strOperation = strOperator;
            fldDisplayField.setText("");
        } catch (NumberFormatException numError) {
            fldDisplayField.setText("Error");
        }
    }

    // Update to update display
    public void updateDisplay(String strField) {
        String strCurrent = fldDisplayField.getText();
        fldDisplayField.setText(strCurrent + strField);
    }
}

public class Villasor_CalculatorGUI {
    public static void main(String[] args) {
        CalculatorEngine calculator = new CalculatorEngine();
        calculator.setSize(430, 575);
    }
}
