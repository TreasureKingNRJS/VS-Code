package Java.Calculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;



public class calc implements ActionListener{
    JFrame jf;
    JLabel jl;
    JButton left,right,per,clear,one,two,three,four,five,six,seven,eight,nine,zero,point,div,mul,min,add,equal;
    String o,n;
    int op ;
    float ans;
    char or;
    boolean check = false , error = false;
    public calc(){
        
        jf = new JFrame("CALCULATOR");
        jf.setLayout(null);
        jf.setSize(690,565);
        jf.setLocation(345,121);
        jf.getContentPane().setBackground(Color.BLACK);

        jl = new JLabel();
        jl.setBounds(14, 14, 647, 122);
        jl.setBorder(new LineBorder(Color.GRAY));
        jl.setBackground(Color.decode("#000000"));
        jl.setForeground(Color.WHITE);
        jl.setOpaque(true);
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        jl.setFont(new Font("Arial", Font.PLAIN, 50));
        jf.add(jl);
        
        

        left = new JButton("Welcome");
        left.addActionListener(this);
        left.setBounds(14, 150, 151, 61);
        left.setFont(new Font("Arial", Font.PLAIN, 20));
        left.setBackground(Color.decode("#303030"));
        left.setForeground(Color.WHITE);
        jf.add(left);

        right = new JButton(" To ");
        right.addActionListener(this);
        right.setBounds(178, 150, 151, 61);
        right.setFont(new Font("Arial", Font.PLAIN, 40));
        right.setBackground(Color.decode("#303030"));
        right.setForeground(Color.WHITE);
        jf.add(right);

        per = new JButton("Calculator");
        per.addActionListener(this);
        per.setBounds(343, 150, 151, 61);
        per.setFont(new Font("Arial", Font.PLAIN, 20));
        per.setBackground(Color.decode("#303030"));
        per.setForeground(Color.WHITE);
        jf.add(per);

        clear = new JButton("Clear");
        clear.addActionListener(this);
        clear.setBounds(508, 150, 151, 61);
        clear.setFont(new Font("Arial", Font.PLAIN, 40));
        clear.setBackground(Color.decode("#303030"));
        clear.setForeground(Color.WHITE);
        jf.add(clear);

        seven = new JButton("7");
        seven.setBounds(14, 225, 151, 61);
        seven.setFont(new Font("Arial", Font.PLAIN, 40));
        seven.setBackground(Color.decode("#121212"));
        seven.setForeground(Color.WHITE);
        seven.addActionListener(this);
        jf.add(seven);

        eight = new JButton("8");
        eight.addActionListener(this);
        eight.setBounds(178, 225, 151, 61);
        eight.setFont(new Font("Arial", Font.PLAIN, 40));
        eight.setBackground(Color.decode("#121212"));
        eight.setForeground(Color.WHITE);
        jf.add(eight);
        
        nine = new JButton("9");
        nine.addActionListener(this);
        nine.setBounds(343, 225, 151, 61);
        nine.setFont(new Font("Arial", Font.PLAIN, 40));
        nine.setBackground(Color.decode("#121212"));
        nine.setForeground(Color.WHITE);
        jf.add(nine);

        div = new JButton("÷");
        div.addActionListener(this);
        div.setBounds(508, 225, 151, 61);
        div.setFont(new Font("Arial", Font.PLAIN, 50));
        div.setBackground(Color.decode("#303030"));
        div.setForeground(Color.WHITE);
        jf.add(div);

        four = new JButton("4");
        four.addActionListener(this);
        four.setBounds(14, 300, 151, 61);
        four.setFont(new Font("Arial", Font.PLAIN, 40));
        four.setBackground(Color.decode("#121212"));
        four.setForeground(Color.WHITE);
        jf.add(four);

        five = new JButton("5");
        five.addActionListener(this);
        five.setBounds(178, 300, 151, 61);
        five.setFont(new Font("Arial", Font.PLAIN, 40));
        five.setBackground(Color.decode("#121212"));
        five.setForeground(Color.WHITE);
        jf.add(five);

        six = new JButton("6");
        six.addActionListener(this);
        six.setBounds(343, 300, 151, 61);
        six.setFont(new Font("Arial", Font.PLAIN, 40));
        six.setBackground(Color.decode("#121212"));
        six.setForeground(Color.WHITE);
        jf.add(six);

        mul = new JButton("×");
        mul.addActionListener(this);
        mul.setBounds(508, 300, 151, 61);
        mul.setFont(new Font("Arial", Font.PLAIN, 50));
        mul.setBackground(Color.decode("#303030"));
        mul.setForeground(Color.WHITE);
        jf.add(mul);

        one = new JButton("1");
        one.addActionListener(this);
        one.setBounds(14, 375, 151, 61);
        one.setFont(new Font("Arial", Font.PLAIN, 40));
        one.setBackground(Color.decode("#121212"));
        one.setForeground(Color.WHITE);
        jf.add(one);

        two = new JButton("2");
        two.addActionListener(this);
        two.setBounds(178, 375, 151, 61);
        two.setFont(new Font("Arial", Font.PLAIN, 40));
        two.setBackground(Color.decode("#121212"));
        two.setForeground(Color.WHITE);
        jf.add(two);

        three = new JButton("3");
        three.addActionListener(this);
        three.setBounds(343, 375, 151, 61);
        three.setFont(new Font("Arial", Font.PLAIN, 40));
        three.setBackground(Color.decode("#121212"));
        three.setForeground(Color.WHITE);
        jf.add(three);

        min = new JButton("−");
        min.addActionListener(this);
        min.setBounds(508, 375, 151, 61);
        min.setFont(new Font("Arial", Font.PLAIN, 50));
        min.setBackground(Color.decode("#303030"));
        min.setForeground(Color.WHITE);
        jf.add(min);

        zero = new JButton("0");
        zero.addActionListener(this);
        zero.setBounds(14, 450, 151, 61);
        zero.setFont(new Font("Arial", Font.PLAIN, 40));
        zero.setBackground(Color.decode("#121212"));
        zero.setForeground(Color.WHITE);
        jf.add(zero);

        point = new JButton(".");
        point.addActionListener(this);
        point.setBounds(178, 450, 151, 61);
        point.setFont(new Font("Arial", Font.PLAIN, 40));
        point.setBackground(Color.decode("#121212"));
        point.setForeground(Color.WHITE);
        jf.add(point);

        equal = new JButton("=");
        equal.addActionListener(this);
        equal.setBounds(343, 450, 151, 61);
        equal.setFont(new Font("Arial", Font.PLAIN, 60));
        equal.setBackground(Color.decode("#51c0db"));
        equal.setForeground(Color.BLACK);
        jf.add(equal);

        add = new JButton("+");
        add.addActionListener(this);
        add.setBounds(508, 450, 151, 61);
        add.setFont(new Font("Arial", Font.PLAIN, 40));
        add.setBackground(Color.decode("#303030"));
        add.setForeground(Color.WHITE);
        jf.add(add);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new calc();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == clear){
            jl.setText("");
        }else if(e.getSource() == seven){
            if(check){
                jl.setText("7");
            }else{
            jl.setText(jl.getText()+"7");
            }
        }
            

        else if(e.getSource() == eight){
            if(check){
                jl.setText("8");
            }else{
            jl.setText(jl.getText()+"8");
            }
            }

        else if(e.getSource() == nine){
            if(check){
                jl.setText("9");
            }else{
            jl.setText(jl.getText()+"9");
            }
            }

        else if(e.getSource() == div){
            o = jl.getText();
            op =4;
            jl.setText("");

        }else if(e.getSource() == four){
            if(check){
                jl.setText("4");
            }else{
            jl.setText(jl.getText()+"4");
            }

        }else if(e.getSource() == five){
            if(check){
                jl.setText("5");
            }else{
            jl.setText(jl.getText()+"5");
            }
            }

        else if(e.getSource() == six){
            if(check){
                jl.setText("6");
            }else{
            jl.setText(jl.getText()+"6");
            }

        }else if(e.getSource() == mul){
            o = jl.getText();
            op = 3;
            jl.setText("");

        }else if(e.getSource() == one){
            if(check){
                jl.setText("1");
            }else{
            jl.setText(jl.getText()+"1");
            }

        }else if(e.getSource() == two){
            if(check){
                jl.setText("2");
            }else{
            jl.setText(jl.getText()+"2");
            }

        }else if(e.getSource() == three){
            if(check){
                jl.setText("3");
            }else{
            jl.setText(jl.getText()+"3");
            }

        }else if(e.getSource() == min){
            o = jl.getText();
            op=2;
            jl.setText("");

        }else if(e.getSource() == zero){
            if(check){
                jl.setText("0");
            }else{
            jl.setText(jl.getText()+"0");
            }

        }else if(e.getSource() == point){

            jl.setText(jl.getText()+".");

        }else if(e.getSource() == equal){

            n = jl.getText();
            if(op == 1){
                or = '+';
                ans = Float.parseFloat(o)+Float.parseFloat(n);

            }else if(op == 2){
                or = '−';
                ans = Float.parseFloat(o)-Float.parseFloat(n);
            }else if(op == 3){
                or = '×';
                ans = Float.parseFloat(o)*Float.parseFloat(n);
            }else{
                or = '÷';
                if(Integer.parseInt(n) != 0){
                    ans = Float.parseFloat(o)/Float.parseFloat(n);
                }else{
                    error = true;
                }
                
            }

            if(!(error)){
                jl.setText(ans+"");
            }else{
                jl.setText("Invalid");
            }

        }else if(e.getSource() == add){
            //old = jl.getText();
            o = jl.getText();
            jl.setText("");
            op=1;

        }else{

        }
}
}