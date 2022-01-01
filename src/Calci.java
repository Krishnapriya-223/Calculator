import java.awt.event.*;
import java.text.NumberFormat;

import javax.swing.*;
import java.awt.*;

import javax.swing.border.EmptyBorder;
import javax.swing.text.NumberFormatter;

public class Calci extends JFrame{

	private JPanel contentPane;

	
	Label head;
	JLabel ans;
	TextField hold;
	Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bplus, bminus, bmul, bdiv, bclr, beq, bdel; 
	
	
	public Calci() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 100, 365, 608);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setBackground(Color.BLACK);
		setTitle("My Calci");
		contentPane.setLayout(null);
		
		head = new Label("CALCULATOR");
		head.setForeground(Color.WHITE);
		head.setBackground(Color.BLACK);
		head.setAlignment(Label.CENTER);
		head.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		head.setBounds(0,0,360,50);
		
		hold = new TextField();
		hold.setBounds(10, 75, 270, 50);
		hold.setFont(new Font("Bookman Old Style", Font.PLAIN, 35));
		
		ans = new JLabel();
		ans.setBounds(10, 135, 325, 110);
		ans.setHorizontalTextPosition(SwingConstants.RIGHT);
		ans.setHorizontalAlignment(SwingConstants.RIGHT);
		ans.setFont(new Font("Bookman Old Style", Font.BOLD, 44));
		
		b1 = new Button("1");
		b1.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		b1.setBounds(10, 250, 75, 70);
		b1.setForeground(Color.WHITE);
		b1.setBackground(Color.BLACK);
				
		b2 = new Button("2");
		b2.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		b2.setBounds(95, 250, 75, 70);
		b2.setForeground(Color.WHITE);
		b2.setBackground(Color.BLACK);
		
		b3 = new Button("3");
		b3.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		b3.setBounds(180, 250, 75, 70);
		b3.setForeground(Color.WHITE);
		b3.setBackground(Color.BLACK);
		
		b4 = new Button("4");
		b4.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		b4.setBounds(10, 330, 75, 70);
		b4.setForeground(Color.WHITE);
		b4.setBackground(Color.BLACK);
		
		b5 = new Button("5");
		b5.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		b5.setBounds(95, 330, 75, 70);
		b5.setForeground(Color.WHITE);
		b5.setBackground(Color.BLACK);
		
		b6 = new Button("6");
		b6.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		b6.setBounds(180, 330, 75, 70);
		b6.setForeground(Color.WHITE);
		b6.setBackground(Color.BLACK);
		
		b7 = new Button("7");
		b7.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		b7.setBounds(10, 410, 75, 70);
		b7.setForeground(Color.WHITE);
		b7.setBackground(Color.BLACK);
		
		b8 = new Button("8");
		b8.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		b8.setBounds(95, 410, 75, 70);
		b8.setForeground(Color.WHITE);
		b8.setBackground(Color.BLACK);
		
		b9 = new Button("9");
		b9.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		b9.setBounds(180, 410, 75, 70);
		b9.setForeground(Color.WHITE);
		b9.setBackground(Color.BLACK);
		
		bclr = new Button("AC");
		bclr.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		bclr.setBounds(10, 490, 75, 70);
		bclr.setForeground(Color.WHITE);
		bclr.setBackground(Color.BLACK);
		
		b0 = new Button("0");
		b0.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		b0.setBounds(95, 490, 75, 70);
		b0.setForeground(Color.WHITE);
		b0.setBackground(Color.BLACK);
		
		beq = new Button("=");
		beq.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		beq.setBounds(180, 490, 75, 70);
		beq.setForeground(Color.WHITE);
		beq.setBackground(Color.BLACK);
		
		bplus = new Button("+");
		bplus.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		bplus.setBounds(265, 250, 75, 70);
		bplus.setForeground(Color.WHITE);
		bplus.setBackground(Color.BLACK);
		
		bminus = new Button("-");
		bminus.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		bminus.setBounds(265, 330, 75, 70);
		bminus.setForeground(Color.WHITE);
		bminus.setBackground(Color.BLACK);
		
		bmul = new Button("x");
		bmul.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		bmul.setBounds(265, 410, 75, 70);
		bmul.setForeground(Color.WHITE);
		bmul.setBackground(Color.BLACK);
		
		bdiv = new Button("/");
		bdiv.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		bdiv.setBounds(265, 490, 75, 70);
		bdiv.setForeground(Color.WHITE);
		bdiv.setBackground(Color.BLACK);
		
		bdel = new Button("Del");
		bdel.setFont(new Font("Bookman Old Style", Font.BOLD, 24));
		bdel.setBounds(280, 75, 60, 50);
		bdel.setForeground(Color.WHITE);
		bdel.setBackground(Color.BLACK);
		
		b1.addActionListener(new Done());
		b1.setActionCommand("1");
		
		b2.addActionListener(new Done());
		b2.setActionCommand("2");
		
		b3.addActionListener(new Done());
		b3.setActionCommand("3");
		
		b4.addActionListener(new Done());
		b4.setActionCommand("4");
		
		b5.addActionListener(new Done());
		b5.setActionCommand("5");
		
		b6.addActionListener(new Done());
		b6.setActionCommand("6");
		
		b7.addActionListener(new Done());
		b7.setActionCommand("7");
		
		b8.addActionListener(new Done());
		b8.setActionCommand("8");
		
		b9.addActionListener(new Done());
		b9.setActionCommand("9");
		
		b0.addActionListener(new Done());
		b0.setActionCommand("0");
		
		bplus.addActionListener(new Done());
		bplus.setActionCommand("ADD");
		
		bminus.addActionListener(new Done());
		bminus.setActionCommand("SUB");
		
		bmul.addActionListener(new Done());
		bmul.setActionCommand("MUL");
		
		bdiv.addActionListener(new Done());
		bdiv.setActionCommand("DIV");
		
		beq.addActionListener(new Done());
		beq.setActionCommand("EQUAL");
		
		bclr.addActionListener(new Done());
		bclr.setActionCommand("CLEAR");
		
		bdel.addActionListener(new Done());
		bdel.setActionCommand("DEL");
		
		add(head);
		add(hold);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b0);
		add(bclr);
		add(beq);
		add(bplus);
		add(bminus);
		add(bmul);
		add(bdiv);
		add(ans);
		add(bdel);
	}
	
	
	public class Done implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String action = e.getActionCommand();
			int len = action.length();
			String holded = hold.getText();
			int leng = holded.length();
			if(action.equals("CLEAR"))
			{
				if(leng>0)
				{
					hold.setText(null);
					ans.setText(null);
				}
			}
			else if(action.equals("DEL"))
			{
				if(leng>0)
				{
					holded = holded.substring(0, leng-1);
					hold.setText(holded);
				}
			}
			else if(action.equals("1"))
			{
				holded += "1";
				hold.setText(holded);
			}
			else if(action.equals("2"))
			{
				holded += "2";
				hold.setText(holded);
			}
			else if(action.equals("3"))
			{
				holded += "3";
				hold.setText(holded);
			}
			else if(action.equals("4"))
			{
				holded += "4";
				hold.setText(holded);
			}
			else if(action.equals("5"))
			{
				holded += "5";
				hold.setText(holded);
			}
			else if(action.equals("6"))
			{
				holded += "6";
				hold.setText(holded);
			}
			else if(action.equals("7"))
			{
				holded += "7";
				hold.setText(holded);
			}
			else if(action.equals("8"))
			{
				holded += "8";
				hold.setText(holded);
			}
			else if(action.equals("9"))
			{
				holded += "9";
				hold.setText(holded);
			}
			else if(action.equals("0"))
			{
				holded += "0";
				hold.setText(holded);
			}
			else if(action.equals("ADD"))
			{
				holded += "+";
				hold.setText(holded);
			}
			else if(action.equals("SUB"))
			{
				holded += "-";
				hold.setText(holded);
			}
			else if(action.equals("MUL"))
			{
				holded += "x";
				hold.setText(holded);
			}
			else if(action.equals("DIV"))
			{
				holded += "/";
				hold.setText(holded);
			}
			else if(action.equals("EQUAL"))
			{
				int sum, sub, multi, divi;
				if(holded.contains("+"))
				{
					String given[] = holded.split("\\+");
					int num1 = Integer.parseInt(given[0]);
					int num2 = Integer.parseInt(given[1]);
					sum = num1+num2;
					ans.setText(Integer.toString(sum));
				}
				else if(holded.contains("-"))
				{
					String given[] = holded.split("-");
					int num1 = Integer.parseInt(given[0]);
					int num2 = Integer.parseInt(given[1]);
					sub = num1-num2;
					ans.setText(Integer.toString(sub));
				}
				else if(holded.contains("x"))
				{
					String given[] = holded.split("x");
					int num1 = Integer.parseInt(given[0]);
					int num2 = Integer.parseInt(given[1]);
					multi = num1*num2;
					ans.setText(Integer.toString(multi));
				}
				else if(holded.contains("/"))
				{
					String given[] = holded.split("/");
					int num1 = Integer.parseInt(given[0]);
					int num2 = Integer.parseInt(given[1]);
					divi = num1/num2;
					ans.setText(Integer.toString(divi));
				}
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calci frame = new Calci();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
}
