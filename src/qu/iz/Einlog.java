package qu.iz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


	
	public class Einlog extends JFrame implements ActionListener 
	{ 		User u = new User();  
		

		private static final long serialVersionUID = 1L;
	
		
		/*
		 * Klasse Login instanz
		 */
		
	
	 
	 String[] ids = new String[200];
	 
	 JButton SUBMIT;
	 JButton NewUser;
	 JPanel panel;
	 JLabel label1,label2;
	 final JTextField  text1,text2;
	 JLabel label3;
	 JLabel label4;
	 final JTextField text3;
	 final JTextField text4;
	 JLabel label5;
	 final JLabel label6;
	 JButton exit;
	 JButton inf;
	 int posX=0;
	 int posY=0;
	 
	   private final JLabel jlblStatus = new JLabel(" ");
	   private final JLabel jlblCreate = new JLabel(" ");
	 
	  Einlog() 	  
	  {
		  super();
	  label1 = new JLabel();
	  label1.setText("Benutzer:");
	  label1.setOpaque(true);
	  label1.setBackground(Color.black);
	  label1.setForeground(Color.lightGray);
	  Font font = new Font("Consolas", Font.BOLD, 16);
	  label1.setFont(font);
	 
	  text1 = new JTextField(15);
	  text1.setOpaque(true);
	  text1.setBackground(Color.LIGHT_GRAY);
	  text1.setForeground(Color.darkGray);
	  
	  label2 = new JLabel();
	  label2.setText("Passwort:");
	  label2.setOpaque(true);
	  label2.setBackground(Color.black);
	  label2.setForeground(Color.lightGray);
	  label2.setFont(font);
	  
	  text2 = new JPasswordField(15);
	  text2.setOpaque(true);
	  text2.setBackground(Color.DARK_GRAY);
	  text2.setForeground(Color.lightGray);
	  
	  label5 = new JLabel();
	  label5.setText("");
	  label5.setOpaque(true);
	  label5.setBackground(Color.BLACK);
	  label5.setForeground(Color.BLACK);
	  
	  label6 = new JLabel();
	  label6.setText("");
	  label6.setOpaque(true);
	  label6.setBackground(Color.BLACK);
	  label6.setForeground(Color.BLACK);
	 
	  label3 = new JLabel();
	  label3.setText("Neuer Benutzer:");
	  label3.setOpaque(true);
	  label3.setBackground(Color.BLACK);
	  label3.setForeground(Color.lightGray);
	  label3.setFont(font);
	  
	  text3 = new JTextField(15);
	  text3.setBackground(Color.LIGHT_GRAY);
	  text3.setForeground(Color.darkGray);
	  
	  label4 = new JLabel();
	  label4.setText("Neues Passwort:");
	  label4.setOpaque(true);
	  label4.setBackground(Color.black);
	  label4.setForeground(Color.lightGray);
	  label4.setFont(font);
	  
	  text4 = new JPasswordField(15);
	  text4.setOpaque(true);
	  text4.setBackground(Color.DARK_GRAY);
	  text4.setForeground(Color.lightGray);
	  

	  SUBMIT=new JButton("Login", new ImageIcon("button1.png"));
	  SUBMIT.setMnemonic('O');
	  NewUser=new JButton("Regestrieren", new ImageIcon("button2.png"));
	  SUBMIT.setMnemonic('O');

	  NewUser.setOpaque(true);
	  NewUser.setBackground(Color.CYAN);
	  NewUser.setForeground(Color.BLACK);
	  SUBMIT.setOpaque(true);
	  SUBMIT.setBackground(Color.CYAN);
	  SUBMIT.setForeground(Color.BLACK);	  
		
      jlblStatus.setForeground(Color.RED);
      jlblStatus.setHorizontalAlignment(SwingConstants.CENTER);
      jlblCreate.setForeground(Color.RED);
      jlblCreate.setHorizontalAlignment(SwingConstants.CENTER);
      
      exit = new JButton("ex", new ImageIcon("exit.1.jpg"));
      exit.setOpaque(false);
      exit.setBackground(new Color(0,0,0,0));
      exit.setBorderPainted(false);
      exit.addActionListener(this);

      inf = new JButton("in", new ImageIcon("inf.jpg"));
      inf.setOpaque(false);
      inf.setBackground(new Color(0,0,0,0));
    
      inf.setBorderPainted(false);
      inf.addActionListener(this);
      
	  panel=new JPanel(new GridLayout(8,4));     
	  panel.setOpaque(true);
	  panel.setBackground(Color.BLACK);
	  panel.setForeground(Color.green);
	  
	  panel.add(label1);
	  panel.add(text1);
	  panel.add(label2);
	  panel.add(text2);
	  panel.add(label5);
	  panel.add(label6);
	  panel.add(label3);
	  panel.add(text3);
	  panel.add(label4);
	  panel.add(text4);
	  panel.add(SUBMIT);
	  panel.add(NewUser);
	  add(panel,BorderLayout.CENTER);
	  panel.add(jlblStatus, BorderLayout.SOUTH);
	  panel.add(jlblCreate, BorderLayout.SOUTH);
	  panel.add(exit);
	  panel.add(inf);
	  
	  SUBMIT.addActionListener(this);
	  NewUser.addActionListener(this);	  
	  
	  this.setUndecorated(true);
	  
	  this.addMouseListener(new MouseAdapter()
	  {
	     public void mousePressed(MouseEvent e)
	     {
	        posX=e.getX();
	        posY=e.getY();
	     }
	  });
	  this.addMouseMotionListener(new MouseAdapter()
	  {
	       public void mouseDragged(MouseEvent evt)
	       {		
	  		setLocation (evt.getXOnScreen()-posX,evt.getYOnScreen()-posY);	  					
	       }
	  });
 }
	  
	  public void actionPerformed(ActionEvent ae)  {
		  		  
	  if(ae.getSource() == this.exit) {System.exit(0);}
	  
	  if(ae.getSource() == this.inf) {}
		  
	  if(ae.getSource() == this.NewUser) {	
		
		  
		  
	
		String value3=text3.getText();
		String value4=text4.getText();	 
		  if (text3.getText().equals("") || text4.getText().equals("")) {jlblCreate.setText("Name und Passwort eingeben");	}
			else	 {
	
			u.setUsername(value3);
			u.setPasswort(value4); 		
			u.setScore(0);
			u.setUserID(1);		
			
				jlblCreate.setText("Benutzer erstellt");
				
			text3.setText("");
			text4.setText("");
	
			/*  PROBLEM ->
			 *  Programm soll den erstellten User Account auslagern.
			 *  mein Versuch war ein Serialisierbares Objekt mit einem FileWriter zu schreiben.
			 *  
			 */
			
					JOptionPane.showMessageDialog(null,"Willkommen bei QuZ! " +  " " + u.getUsername(),
					"Glückwunsch",JOptionPane.INFORMATION_MESSAGE); 	   
			}
		}	
				
	  
		
	  if(ae.getSource() == this.SUBMIT){	
		 	 
		 String value1=text1.getText();
		 String value2=text2.getText();
	 
			 if (value1.equals(u.getUsername())&& value2.equals(u.getPasswort())) {
	   				setVisible(false);
	   				MainMenu a = new MainMenu();
	   					a.setSize(600,800);
	   					a.setVisible(true);
	   		}
			 
	  		else{ jlblStatus.setText("Falsches Passwort");	}	   		  		
		}		 
	  }	
    }


