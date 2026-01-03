import javax.swing.*;
import java.awt.*;


public class Main {
    static double num1=0;
    static double num2=0;
    static char operation;
    static double result=0;

    public static void main(String[] args){
        JFrame frame= new JFrame("Calculator");

        JPanel panel0= new JPanel(new BorderLayout());
        JPanel panel1=new JPanel(new GridLayout(5,4,5,5));


        JButton[] buttons= new JButton[20];
        buttons[0]= new JButton("%");
        buttons[1]= new JButton("C");
        buttons[2]= new JButton("<-");
        buttons[3]= new JButton("/");
        buttons[4]= new JButton("7");
        buttons[5]= new JButton("8");
        buttons[6]= new JButton("9");
        buttons[7]= new JButton("*");
        buttons[8]= new JButton("4");
        buttons[9]= new JButton("5");
        buttons[10]= new JButton("6");
        buttons[11]= new JButton("-");
        buttons[12]= new JButton("1");
        buttons[13]= new JButton("2");
        buttons[14]= new JButton("3");
        buttons[15]= new JButton("+");
        buttons[16]= new JButton("+/-");
        buttons[17]= new JButton("0");
        buttons[18]= new JButton(".");
        buttons[19]= new JButton("=");

        JTextField textField= new JTextField();




        buttons[0].addActionListener(e -> {
            if (!( textField.getText().contains("/") || textField.getText().contains("+") || textField.getText().contains("-") || textField.getText().contains("*") || textField.getText().contains("%") )){
                num1=Double.parseDouble(textField.getText());
                result= num1/100;
                textField.setText(String.valueOf(result));
            }

        });
        buttons[1].addActionListener(e -> {
            textField.setText("");

        });
        buttons[2].addActionListener(e -> {
            String string = textField.getText();
            textField.setText("");
            for(int i=0;i<string.length()-1;i++) {
                textField.setText(textField.getText()+string.charAt(i));
            }

        });
        buttons[3].addActionListener(e -> {
            if (!( textField.getText().contains("/") || textField.getText().contains("+") ||  textField.getText().contains("*") || textField.getText().contains("%") )){
                num1 = Double.parseDouble(textField.getText());
                operation='/';
                textField.setText("");
            }

        });
        buttons[4].addActionListener(e -> {
            textField.setText(textField.getText().concat("7"));

        });
        buttons[5].addActionListener(e -> {
            textField.setText(textField.getText().concat("8"));

        });
        buttons[6].addActionListener(e -> {
            textField.setText(textField.getText().concat("9"));

        });
        buttons[7].addActionListener(e -> {
            if (!( textField.getText().contains("/") || textField.getText().contains("+") ||  textField.getText().contains("*") || textField.getText().contains("%") )){
                num1 = Double.parseDouble(textField.getText());
                operation='*';
                textField.setText("");
            }

        });
        buttons[8].addActionListener(e -> {
            textField.setText(textField.getText().concat("4"));

        });
        buttons[9].addActionListener(e -> {
            textField.setText(textField.getText().concat("5"));

        });
        buttons[10].addActionListener(e -> {
            textField.setText(textField.getText().concat("6"));

        });
        buttons[11].addActionListener(e -> {
            if (!( textField.getText().contains("/") || textField.getText().contains("+") ||  textField.getText().contains("*") || textField.getText().contains("%") )){
                num1 = Double.parseDouble(textField.getText());
                operation='-';
                textField.setText("");
            }

        });
        buttons[12].addActionListener(e -> {
            textField.setText(textField.getText().concat("1"));

        });
        buttons[13].addActionListener(e -> {
            textField.setText(textField.getText().concat("2"));

        });
        buttons[14].addActionListener(e -> {
            textField.setText(textField.getText().concat("3"));

        });
        buttons[15].addActionListener(e -> {
            if (!( textField.getText().contains("/") || textField.getText().contains("+") ||  textField.getText().contains("*") || textField.getText().contains("%") )){
                num1 = Double.parseDouble(textField.getText());
                operation='+';
                textField.setText("");
            }

        });
        buttons[16].addActionListener(e -> {
            if (!( textField.getText().contains("/") || textField.getText().contains("+") ||  textField.getText().contains("*") || textField.getText().contains("%") )){
                double num=  Double.parseDouble(textField.getText());
                num*=-1;
                textField.setText(String.valueOf(num));
            }

        });
        buttons[17].addActionListener(e -> {
            textField.setText(textField.getText().concat("0"));

        });
        buttons[18].addActionListener(e -> {
            if (!(textField.getText().contains(".") || textField.getText().contains("/") || textField.getText().contains("+") || textField.getText().contains("-") || textField.getText().contains("*") || textField.getText().contains("%") )){
                textField.setText(textField.getText().concat("."));
            }

        });
        buttons[19].addActionListener(e -> {
            if (!(textField.getText().contains("/") || textField.getText().contains("+") || textField.getText().contains("-") || textField.getText().contains("*") || textField.getText().contains("%") )){
                num2=Double.parseDouble(textField.getText());

                switch (operation){
                    case '+' -> {
                        result = num1 + num2;
                        break;
                    }

                    case '-' -> {
                        result = num1 - num2;
                        break;
                    }

                    case '*' -> {
                        result = num1*num2;
                        break;
                    }

                    case '/' -> {
                        if (num2!=0){
                            result = num1/num2;
                            break;
                        }
                    }

                }

                textField.setText(String.valueOf(result));
                num1=result;

            }

        });

        for (int i=0; i<20; i++){
            buttons[i].setFont(new Font("Calibri",Font.BOLD,25));
            buttons[i].setFocusable(false);
            panel1.add(buttons[i]);
        }



        textField.setPreferredSize(new Dimension(300, 50));
        textField.setFont(new Font("Calibri",Font.BOLD,25));
        textField.setEditable(false);
        panel0.add(textField, BorderLayout.NORTH);
        panel0.add(panel1, BorderLayout.CENTER);






        frame.setSize(320,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel0);

    }



}
