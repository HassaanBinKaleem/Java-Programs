import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class S
{
		static String firstNumber;
		static String secondNumber;
		static String operator;
}

public class Calculator extends S
{
	public static void main(String args[])
	{	
		JFrame frm = new JFrame("Calculator");
		frm.setSize(450,450);
		frm.setLayout(null);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//First Horizontal Line of Button
		JButton btn7 = new JButton("7");
		JButton btn4 = new JButton("4");
		JButton btn1 = new JButton("1");
		JButton btnS1 = new JButton(".");
		
		//Second Horizontal Line of Button
		JButton btn8 = new JButton("8");
		JButton btn5 = new JButton("5");
		JButton btn2 = new JButton("2");
		JButton btn0 = new JButton("0");
		
		//Third Horizontal Line of Button
		JButton btn9 = new JButton("9");
		JButton btn6 = new JButton("6");
		JButton btn3 = new JButton("3");
		JButton btnS2 = new JButton("=");
		
		//Forth Horizontal Line of Button
		JButton btnS5 = new JButton("/");
		JButton btnS6 = new JButton("*");
		JButton btnS7 = new JButton("-");
		JButton btnS8 = new JButton("+");
		
		//Middle Button
		JButton btnS3 = new JButton("Delete");
		JButton btnS4 = new JButton("Clear");
		
		//Creating TextField
		TextField tf = new TextField();
		
		//Setting Bounds of First Line of Button
		btn7.setBounds(40,100,50,50);
		btn4.setBounds(40,160,50,50);
		btn1.setBounds(40,220,50,50);
		btnS1.setBounds(40,280,50,50);
		
		//Setting Bounds of Second Line of Button
		btn8.setBounds(110,100,50,50);
		btn5.setBounds(110,160,50,50);
		btn2.setBounds(110,220,50,50);
		btn0.setBounds(110,280,50,50);
		
		//Setting Bounds of Third Line of Button
		btn9.setBounds(180,100,50,50);
		btn6.setBounds(180,160,50,50);
		btn3.setBounds(180,220,50,50);
		btnS2.setBounds(180,280,50,50);
		
		//Setting Bounds of Forth Line of Button
		btnS5.setBounds(250,100,50,50);
		btnS6.setBounds(250,160,50,50);
		btnS7.setBounds(250,220,50,50);
		btnS8.setBounds(250,280,50,50);
		
		//Setting Bounds of Middle Line of Button
		btnS3.setBounds(60,340,90,50);
		btnS4.setBounds(170,340,90,50);
		
		//Setting Bounds of TextField
		tf.setBounds(40,50,260,40);
		
		//Adding First Rows of Button
		frm.add(btn7);
		frm.add(btn4);
		frm.add(btn1);
		frm.add(btnS1);
		
		//Adding Second Rows of Button
		frm.add(btn8);
		frm.add(btn5);
		frm.add(btn2);
		frm.add(btn0);
		
		//Adding Third Row of Button
		frm.add(btn9);
		frm.add(btn6);
		frm.add(btn3);
		frm.add(btnS2);
		
		//Adding Forth Row of Button
		frm.add(btnS5);
		frm.add(btnS6);
		frm.add(btnS7);
		frm.add(btnS8);
		
		//Adding Middle Row of Button
		frm.add(btnS3);
		frm.add(btnS4);
		
		//Adding TextField
		frm.add(tf);
		
		//Addind ActionListener for First Line
		btn7.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				tf.setText(tf.getText()+"7");
			}
		});
		
		btn4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				tf.setText(tf.getText()+"4");
			}
		});
		
		btn1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				tf.setText(tf.getText()+"1");
			}
		});
		
		btnS1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				tf.setText(tf.getText()+".");
			}
		});
		
		//Adding ActionListener for Second line
		btn8.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				tf.setText(tf.getText()+"8");
			}
		});
		
		btn5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				tf.setText(tf.getText()+"5");
			}
		});
		
		btn2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				tf.setText(tf.getText()+"2");
			}
		});
		
		btn0.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				tf.setText(tf.getText()+ "0");
			}
		});
		
		//Adding ActionListener for Third Line
		btn9.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				tf.setText(tf.getText()+"9");
			}
		});
		
		btn6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				tf.setText(tf.getText()+"6");
			}
		});
		
		btn3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				tf.setText(tf.getText()+"3");
			}
		});
		
		btnS2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				secondNumber = tf.getText();
				if(operator.equals("+"))
				{
					Double result = Double.parseDouble(firstNumber) + Double.parseDouble(secondNumber);
					tf.setText(result.toString());
				}
				if(operator.equals("-"))
				{
					Double result = Double.parseDouble(firstNumber) - Double.parseDouble(secondNumber);
					tf.setText(result.toString());
				}
				if(operator.equals("*"))
				{
					Double result = Double.parseDouble(firstNumber) * Double.parseDouble(secondNumber);
					tf.setText(result.toString());
				}
				if(operator.equals("/"))
				{
					Double result = Double.parseDouble(firstNumber) / Double.parseDouble(secondNumber);
					tf.setText(result.toString());
				}
			}
		});
		
		//Adding ActionListener for Forth Line
		btnS5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				firstNumber = tf.getText();
				operator = "/";
				tf.setText("");
			}
		});
		
		btnS6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				firstNumber = tf.getText();
				operator = "*";
				tf.setText("");
			}
		});
		
		btnS7.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				firstNumber = tf.getText();
				operator = "-";
				tf.setText("");
			}
		});
		
		btnS8.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				firstNumber = tf.getText();
				operator = "+";
				tf.setText("");
			}
		});
		
		btnS4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				tf.setText("");
			}
		});
		
		btnS3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				String s = tf.getText();
				int lengths = s.length();
				
				if(lengths>0)
				{
					tf.setText(s.substring(0,lengths-1));
				}
			}
		});
		
		frm.setVisible(true);
	}
}