import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;
 
 
class Calc implements ActionListener
{
    JFrame f;
    JTextField t;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bsub,badd,bdec,beq,bdel,bclr;
    // additional functions
    JButton bSquare,bSqRoot,bExp,bEuler;
    JButton bNeg;
 
    static double a=0,b=0,result=0;
    static int operator=0;
 
    Calc()
    {
    // Create image objects for buttons and set image files
    ImageIcon iplus = new ImageIcon("plus.png");
    ImageIcon ione = new ImageIcon("one.png");
    ImageIcon itwo = new ImageIcon("two.png");
    ImageIcon ithree = new ImageIcon("three.png");
    ImageIcon ifour = new ImageIcon("four.png");
    ImageIcon ifive = new ImageIcon("five.png");
    ImageIcon isix = new ImageIcon("six.png");
    ImageIcon iseven = new ImageIcon("seven.png");
    ImageIcon ieight = new ImageIcon("eight.png");
    ImageIcon inine = new ImageIcon("nine.png");
    ImageIcon izero = new ImageIcon("zero.png");
    ImageIcon iminus = new ImageIcon("minus.png");
    ImageIcon itimes = new ImageIcon("times.png");
    ImageIcon idivide = new ImageIcon("divide.png");
    ImageIcon ipoint = new ImageIcon("point.png");
    ImageIcon iequals = new ImageIcon("equals.png");
    ImageIcon idel = new ImageIcon("del.png");
    ImageIcon iclr = new ImageIcon("clear.png");
    
    ImageIcon ieuler = new ImageIcon("eulers.png");
    ImageIcon isquare = new ImageIcon("square.png");
    ImageIcon iexp = new ImageIcon("exp.png");
    ImageIcon isqrt = new ImageIcon("sqrt.png");


    // Create JButton, JFrame, and TextFeild Object
        f=new JFrame("John B's Calculator");
        t=new JTextField();
        b1=new JButton(ione);
        b2=new JButton(itwo);
        b3=new JButton(ithree);
        b4=new JButton(ifour);
        b5=new JButton(ifive);
        b6=new JButton(isix);
        b7=new JButton(iseven);
        b8=new JButton(ieight);
        b9=new JButton(inine);
        b0=new JButton(izero);
        bdiv=new JButton(idivide);
        bmul=new JButton(itimes);
        bsub=new JButton(iminus);
        badd=new JButton(iplus);
        bdec=new JButton(ipoint);
        beq=new JButton(iequals);
        bdel=new JButton(idel);
        bclr=new JButton(iclr);
        // additional utility
        bNeg = new JButton("+/-"); 

        // additional functions
        
        bSquare = new JButton(isquare);
        bSqRoot = new JButton(isqrt);
        bExp = new JButton(iexp);
        bEuler = new JButton(ieuler);


        // Set button properties (x,y,width,height)
        t.setBounds(30,40,280,30); 

        // 1st row
        b7.setBounds(40,100,50,40);
        b8.setBounds(110,100,50,40);
        b9.setBounds(180,100,50,40);
        bdiv.setBounds(250,100,50,40);
        bSquare.setBounds(320,100,60,40);

        // 2nd row
        b4.setBounds(40,170,50,40);
        b5.setBounds(110,170,50,40);
        b6.setBounds(180,170,50,40);
        bmul.setBounds(250,170,50,40);
        bSqRoot.setBounds(320,170,60,40);
        
        // 3rd row
        b1.setBounds(40,240,50,40);
        b2.setBounds(110,240,50,40);
        b3.setBounds(180,240,50,40);
        bsub.setBounds(250,240,50,40);
        bExp.setBounds(320,240,60,40);
        
        // 4th row
        bdec.setBounds(40,310,50,40);
        b0.setBounds(110,310,50,40);
        beq.setBounds(180,310,50,40);
        badd.setBounds(250,310,50,40);
        bEuler.setBounds(320,310,60,40);

        // 5th row (utility)
        bdel.setBounds(110,380,80,50);
        bclr.setBounds(280,380,80,50);
        //bNeg.setBounds(40,380,50,40);

        // add buttons to frame
        // basic functions
        f.add(t);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(bdiv);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(bmul);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(bsub);
        f.add(bdec);
        f.add(b0);
        f.add(beq);
        f.add(badd);
        f.add(bdel);
        f.add(bclr);

        // additional functions
       // f.add(bNeg);
        f.add(bSquare);
        f.add(bSqRoot);
        f.add(bExp);
        f.add(bEuler);

        
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(500,500); // window size
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false); // set user resize option
        f.getContentPane().setBackground(Color.DARK_GRAY);

        // add button action listener (GUI Functionality)
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        badd.addActionListener(this);
        bdiv.addActionListener(this);
        bmul.addActionListener(this);
        bsub.addActionListener(this);
        bdec.addActionListener(this);
        beq.addActionListener(this);
        bdel.addActionListener(this);
        bclr.addActionListener(this);

        // additional function action listener
        //bNeg.addActionListener(this);
        bSquare.addActionListener(this);
        bSqRoot.addActionListener(this);
        bExp.addActionListener(this);
        bEuler.addActionListener(this);

    }
 
    public void actionPerformed(ActionEvent e)
    {
        // set text on button press
        if(e.getSource()==b1)
            t.setText(t.getText().concat("1"));
        
        if(e.getSource()==b2)
            t.setText(t.getText().concat("2"));
        
        if(e.getSource()==b3)
            t.setText(t.getText().concat("3"));
        
        if(e.getSource()==b4)
            t.setText(t.getText().concat("4"));
        
        if(e.getSource()==b5)
            t.setText(t.getText().concat("5"));
        
        if(e.getSource()==b6)
            t.setText(t.getText().concat("6"));
        
        if(e.getSource()==b7)
            t.setText(t.getText().concat("7"));
        
        if(e.getSource()==b8)
            t.setText(t.getText().concat("8"));
        
        if(e.getSource()==b9)
            t.setText(t.getText().concat("9"));
        
        if(e.getSource()==b0)
            t.setText(t.getText().concat("0"));
        
        if(e.getSource()==bdec)
            t.setText(t.getText().concat("."));

        // additional functionality - setText

        
        if(e.getSource()==badd)
        {
            a=Double.parseDouble(t.getText());
            operator=1;
            t.setText("");
        } 
        
        if(e.getSource()==bsub)
        {
            a=Double.parseDouble(t.getText());
            operator=2;
            t.setText("");
        }
        
        if(e.getSource()==bmul)
        {
            a=Double.parseDouble(t.getText());
            operator=3;
            t.setText("");
        }
        
        if(e.getSource()==bdiv)
        {
            a=Double.parseDouble(t.getText());
            operator=4;
            t.setText("");
        }

        // additional functions operator number
        //2-VAR
        if(e.getSource()==bExp) //X^Y
        {
            a=Double.parseDouble(t.getText());
            operator=5;
            t.setText("");
        }

        //1-VAR
        
        if(e.getSource()==bSquare) //X^2
        {
            a=Double.parseDouble(t.getText());
            operator=6;
            t.setText(""); 
        }

        if(e.getSource()==bSqRoot) //sqrt(x)
        {
            a=Double.parseDouble(t.getText());
            operator=7;
            t.setText("");
        }

        if(e.getSource()==bEuler)
        {
            a=Double.parseDouble(t.getText());
            operator=8;
            t.setText("");
        }
       
        // write operator logic
        if(e.getSource()==beq)
        {
            // 2 var or 1 var function?
            if(operator<=5) 
            b=Double.parseDouble(t.getText());
        
            switch(operator)
            {
                case 1: result=a+b;
                    break;
        
                case 2: result=a-b;
                    break;
        
                case 3: result=a*b;
                    break;
        
                case 4: result=a/b;
                    break;

                // additional functionality 
                // 2-Var
                case 5: result=Math.pow(a,b);
                    break;

                // 1 var
                case 6: result=a*a; 
                    break;

                case 7: result=Math.sqrt(a);
                    break;

                case 8: result=Math.pow(Math.E, a);
                    break;

                default: result=0;
            }
        
            t.setText(""+result);
        }
        
        // utility
        if(e.getSource()==bclr)
            t.setText("");
        
        if(e.getSource()==bdel)
        {
            String s=t.getText();
            t.setText("");
            for(int i=0;i<s.length()-1;i++)
            t.setText(t.getText()+s.charAt(i));
        }        
    }
 
    public static void main(String...s)
    {
        new Calc();
    }
}