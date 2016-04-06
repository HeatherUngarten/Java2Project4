
import javax.swing.*; //needed for swing class
import java.awt.event.*;
import java.awt.*;
import java.util.Stack;

public class JavaApplicationIII extends JFrame
{
    //constructor
    private final int WINDOW_WIDTH = 500;
    private final int WINDOW_HEIGHT = 250;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JTextField textfield;
    private JButton oneButton;
    private JButton twoButton;
    private JButton threeButton;
    private JButton fourButton;
    private JButton fiveButton;
    private JButton sixButton;
    private JButton sevenButton;
    private JButton eightButton;
    private JButton nineButton;
    private JButton zeroButton;
    private JButton plusButton;
    private JButton minusButton;
    private JButton divideButton;
    private JButton multiplyButton;    
    private JButton calcButton;
    private JButton clearButton;
    private JButton spaceButton;
    private JButton equalsButton;
    String display = "";
    String finalAnswer;
    //end constructor
    
    public JavaApplicationIII()
    {
        setTitle("A Simple Window");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);    
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout()); 
        buildPanel();
        add(panel1, BorderLayout.NORTH);
        add(panel2, BorderLayout.CENTER);
        add(panel3, BorderLayout.EAST);
        add(panel4, BorderLayout.SOUTH);
        setVisible(true);      
    }
    
    private void buildPanel() 
    {
        textfield = new JTextField(30); 
        textfield.setEditable(false);
        oneButton = new JButton("1");
        twoButton = new JButton("2");
        threeButton = new JButton("3");
        fourButton = new JButton("4");
        fiveButton = new JButton("5");
        sixButton = new JButton("6");
        sevenButton = new JButton("7");
        eightButton = new JButton("8");
        nineButton = new JButton("9");
        zeroButton = new JButton("0");
        plusButton = new JButton("+");
        minusButton = new JButton("-");
        divideButton = new JButton("/");
        multiplyButton = new JButton("*");
        equalsButton = new JButton("=");
        calcButton = new JButton("Calculate");
        clearButton = new JButton("Clear");
        spaceButton = new JButton("Space");    
        
        calcButton.addActionListener (new calcButtonListener());
        oneButton.addActionListener (new ButtonListener1());
        twoButton.addActionListener (new ButtonListener2());
        threeButton.addActionListener (new ButtonListener3());
        fourButton.addActionListener (new ButtonListener4());
        fiveButton.addActionListener (new ButtonListener5());
        sixButton.addActionListener (new ButtonListener6());
        sevenButton.addActionListener (new ButtonListener7());
        eightButton.addActionListener (new ButtonListener8());
        nineButton.addActionListener (new ButtonListener9());
        zeroButton.addActionListener (new ButtonListener0());
        plusButton.addActionListener (new ButtonListenerP());
        minusButton.addActionListener (new ButtonListenerM());
        divideButton.addActionListener (new ButtonListenerD());
        multiplyButton.addActionListener (new ButtonListenerMT());
        equalsButton.addActionListener (new ButtonListenerE());
        clearButton.addActionListener (new clearButtonListener());
        spaceButton.addActionListener (new spaceButtonListener());
    

        panel1 = new JPanel();
        panel2 = new JPanel(); 
        panel2.setLayout( new GridLayout (4, 3));
        panel3 = new JPanel();
        panel4 = new JPanel();
        panel1.add(textfield);        
        panel2.add(oneButton); 
        panel2.add(twoButton); 
        panel2.add(threeButton); 
        panel2.add(fourButton); 
        panel2.add(fiveButton); 
        panel2.add(sixButton); 
        panel2.add(sevenButton); 
        panel2.add(eightButton); 
        panel2.add(nineButton); 
        panel2.add(zeroButton); 
        panel3.add(plusButton); 
        panel3.add(minusButton); 
        panel3.add(multiplyButton); 
        panel3.add(divideButton);
        panel3.add(equalsButton);
        panel4.add(spaceButton);
        panel4.add(clearButton);
        panel4.add(calcButton);
    }

   
    private class ButtonListener1 implements ActionListener
    {
    
        public void actionPerformed (ActionEvent e)
        {
            display = textfield.getText();
            textfield.setText(display + "1");
        }   
    }

   
      private class ButtonListener2 implements ActionListener
    {
    
        public void actionPerformed (ActionEvent e)
        {
            display = textfield.getText();
            textfield.setText(display + "2");
        }    
    }
      
       private class ButtonListener3 implements ActionListener
    {
    
        public void actionPerformed (ActionEvent e)
        {
            display = textfield.getText();
            textfield.setText(display + "3");
        }    
    }
       
        private class ButtonListener4 implements ActionListener
    {
    
        public void actionPerformed (ActionEvent e)
        {
            display = textfield.getText();
            textfield.setText(display + "4");
        }
 
    }
        
        
         private class ButtonListener5 implements ActionListener
    {
    
        public void actionPerformed (ActionEvent e)
        {
            display = textfield.getText();
            textfield.setText(display + "5");
        }
    }
         
          private class ButtonListener6 implements ActionListener
    {
    
        public void actionPerformed (ActionEvent e)
        {
            display = textfield.getText();
            textfield.setText(display + "6");
        }   
    }
          
    private class ButtonListener7 implements ActionListener
    {
    
        public void actionPerformed (ActionEvent e)
        {
            display = textfield.getText();
            textfield.setText(display + "7");
        }
    }
           
    private class ButtonListener8 implements ActionListener
    {
    
        public void actionPerformed (ActionEvent e)
        {
            display = textfield.getText();
            textfield.setText(display + "8");
        }
    }
            
    private class ButtonListener9 implements ActionListener
    {
    
        public void actionPerformed (ActionEvent e)
        {
            display = textfield.getText();
            textfield.setText(display + "9");
        }
    }
             
    private class ButtonListener0 implements ActionListener
    {
    
        public void actionPerformed (ActionEvent e)
        {
            display = textfield.getText();
            textfield.setText(display + "0");
        }
    }
              
    private class ButtonListenerP implements ActionListener
    {
    
        public void actionPerformed (ActionEvent e)
        {
            display = textfield.getText();
            textfield.setText(display + "+");
        }
    }
               
    private class ButtonListenerM implements ActionListener
    {
    
        public void actionPerformed (ActionEvent e)
        {
            display = textfield.getText();
            textfield.setText(display + "-");
        }
    }
    
    private class ButtonListenerD implements ActionListener
    {
    
        public void actionPerformed (ActionEvent e)
        {
            display = textfield.getText();
            textfield.setText(display + "/");
        }
    }
    
    
    private class ButtonListenerMT implements ActionListener
    {
    
        public void actionPerformed (ActionEvent e)
        {
            display = textfield.getText();
            textfield.setText(display + "*");
        }
    }
    
    private class ButtonListenerE implements ActionListener
    {
    
        public void actionPerformed (ActionEvent e)
        {
            display = textfield.getText();
            textfield.setText(display + "=");
        }
    }
   
    private class clearButtonListener implements ActionListener
    {
    
        public void actionPerformed (ActionEvent e)
        {
            display = textfield.getText();
            textfield.setText("");
        }
        
    }
    
    private class spaceButtonListener implements ActionListener
    {
        public void actionPerformed (ActionEvent e)
        {
            display = textfield.getText();
            textfield.setText(display + " ");
        }
    }
   
    public class calcButtonListener implements ActionListener
    {
    
        public void actionPerformed (ActionEvent e)
        {
           String plus = "+";
           String minus = "-";
           String times = "*";
           String divide = "/";
           String equals = "=";
           double total;
           display = textfield.getText();
           textfield.setText(finalAnswer);     
           Stack<Double> stack = new Stack<Double>();
           String space = " ";
           String [] array = (display.split(space));
           int tokenCount = array.length;

           
           
           
           for (int i = 0; i < tokenCount; i++)
           {   System.out.println(array[i]);
                if((array[i]).equals (plus))
                {   
                    if (!stack.isEmpty())
                    {   
                        double pop1 = stack.pop();
                        double pop2 = stack.pop();
                        total = pop1 + pop2;
                        stack.push(total);  
                        printStack(stack);    
                    }
                    else
                    {
                        display = "Error";
                    }
                }   

                else if ((array[i]).equals (minus))
                {   
                    if (!stack.isEmpty())
                    {          
                        double pop1 = stack.pop();
                        double pop2 = stack.pop();
                        total = pop2 - pop1;
                        stack.push(total);
                        printStack(stack);       
                    }
                    else
                    {
                        display = "Error";
                    }
                }
                else if ((array[i]).equals (times))
                {
                    if (!stack.isEmpty())
                        {  
                           
                           double pop1 = stack.pop();
                           double pop2 = stack.pop();
                           pop1 = stack.pop();
                           pop2 = stack.pop();
                           total = pop1 * pop2;
                           stack.push(total);
                           printStack(stack);
                       }  
                    else
                    {
                        display = "Error";
                    }

                }//end else if    

                else if ((array[i]).equals (divide))
                {  
                    if (!stack.isEmpty())
                    {
                        double pop1 = stack.pop();
                        double pop2 = stack.pop();
                        total = pop2 / pop1;
                        stack.push(total);
                        printStack(stack);
                    }
                    else
                    {
                        display = "Error";
                    }
                }//end last else    

                else if ((array[i]).equals (equals))
                {
                    if (!stack.isEmpty())
                    {
                       double pop1 = stack.pop();
                       total = pop1;
                       System.out.println("total: " + total);
                       printStack(stack);
                       display = Double.toString(total);
                       textfield.setText(display);
                    }
                    else
                    {
                        display = "Error";
                    }
                }

                else if ((array[i]).contains ("1") || (array[i]).contains ("2") || 
                        (array[i]).contains ("3") || (array[i]).contains ("4") || 
                        (array[i]).contains ("5") || (array[i]).contains ("6") || 
                        (array[i]).contains ("7") || (array[i]).contains ("8") || 
                        (array[i]).contains ("9") || (array[i]).contains ("0"))
                        {
                           double number = Double.parseDouble(array[i]);
                           stack.push(number);  
                           printStack(stack);
                        }
           }//end for
        }//end action performed
    }// end calc button
    
    private static void printStack(Stack <Double> s)
    {
        if (s.isEmpty())
            System.out.println ("zero");
        
        else 
            System.out.printf("%s TOP\n", s);
    }
    
    public static void main(String[] args) 
    {
        new JavaApplicationIII();
    }//end main
    

        
   
}//end program
