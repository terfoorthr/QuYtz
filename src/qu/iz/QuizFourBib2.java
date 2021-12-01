package qu.iz;



import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class QuizFourBib2 extends JDialog implements ActionListener {
	   

	private static final long serialVersionUID = 1L;

	
    int score=0;
    ButtonGroup group = new ButtonGroup();
    JButton btnOk = new JButton("", new ImageIcon("BreakableCoordinatedGosling-small.gif"));
    JButton exit = new JButton("", new ImageIcon("exit.1.jpg"));
    JButton menu = new JButton("", new ImageIcon("menu-2.png"));
	List<Question> questions1 = new ArrayList<Question>();

	public QuizFourBib2(){
        super();
        setModal(true);
     	
        
        setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
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
        		//sets frame position when mouse dragged			
        		setLocation (evt.getXOnScreen()-posX,evt.getYOnScreen()-posY);
        					
             }
        });
        
        btnOk.addActionListener(new ActionListener(){
        	
        	
            public void actionPerformed(ActionEvent e) {
            	
                                      
                setVisible(false);
            }
        });
  

  	   
     
        
        questions1.add(new Question("Wie lautet bei einem Export von Teilschlüsseln der Dateityp (Suffix)?", 
        		new String[]{"Hkey","Hzg", "Reg", "Key"}, 
        		"Reg"));
        
        questions1.add(new Question("", 
        		new String[]{"","", "", ""}, 
        		""));
        
        questions1.add(new Question("", 
        		new String[]{"","", "", ""}, 
        		""));
        
        questions1.add(new Question("", 
        		new String[]{"","", "", ""}, 
        		""));
        
        questions1.add(new Question("", 
        		new String[]{"","", "", ""}, 
        		""));
        
        questions1.add(new Question("", 
        		new String[]{"","", "", ""}, 
        		""));
        
        questions1.add(new Question("", 
        		new String[]{"","", "", ""}, 
        		""));
        
        questions1.add(new Question("", 
        		new String[]{"","", "", ""}, 
        		""));
        
        questions1.add(new Question("", 
        		new String[]{"","", "", ""}, 
        		""));
        

    }

    public int startQuiz(){
        int score=0;
        for (Question quizM : questions1){
            displayQuestion(quizM);
            
           while (group.isSelected(null))
            
            {	
            	JOptionPane.showMessageDialog(null, "Es muss eine Antwort ausgewählt werden!", "Fehler", JOptionPane.ERROR_MESSAGE);	           	
            	group.clearSelection();
            	displayQuestion(quizM);
            
            
            }
            
            if (group.getSelection().getActionCommand().equals(quizM.getCorrectAnswer())){
                          
            	 JOptionPane.showMessageDialog(null,"Richtige Antwort, weiter so","Volltreffer",JOptionPane.INFORMATION_MESSAGE);  	
                 score++;
                
            } 
            
            else JOptionPane.showMessageDialog(null, quizM.getCorrectAnswer(), "Leider Falsch, die richtige Antwort währe...", JOptionPane.ERROR_MESSAGE);
            
        }
        dispose();
        return score;           
    }
     int posX=0;
 		 int posY=0;
 
    
    private void displayQuestion(Question quizM){
     
        getContentPane().removeAll();
        for (Enumeration<?> buttonGroup=group.getElements(); buttonGroup.hasMoreElements(); ){
        	
        	
            group.remove((AbstractButton)buttonGroup.nextElement());
           
        }
     
        JLabel questionText = new JLabel(quizM.getQuestion());

        ImageIcon icon = new ImageIcon("Fragezeichen-Icon1-300x300.jpg");    
        icon = new ImageIcon(icon.getImage().getScaledInstance(150, 100, BufferedImage.SCALE_SMOOTH));
        questionText.setIcon(icon);
        Font font = new Font("Consolas", Font.BOLD, 22);
        Font font1 = new Font("Arial", Font.BOLD, 16);
        questionText.setFont(font);
        questionText.setForeground(Color.yellow);
        questionText.setAlignmentX(CENTER_ALIGNMENT);



        
        
        getContentPane().setBackground(Color.black);
        getContentPane().add(questionText);
        for (String answer : quizM.getAnswers()){
        	
        	
      
            JRadioButton radio = new JRadioButton(answer);
            radio.setActionCommand(answer);
            radio.setFont(font1);
            radio.setForeground(Color.WHITE);
            radio.setBackground(Color.black);
            radio.setAlignmentX(CENTER_ALIGNMENT);
   
            
            group.add(radio);
            getContentPane().setBackground(Color.black);
           
         
            getContentPane().add(radio);
        }
        getContentPane().add(btnOk);
        btnOk.setOpaque(false);
        btnOk.setBackground(new Color(0,0,0,0));
        btnOk.setBorderPainted(false);
        btnOk.setAlignmentX(CENTER_ALIGNMENT);
        
        getContentPane().add(menu);
        menu.setOpaque(false);
        menu.setBackground(Color.white);
        menu.setBorderPainted(false);
        menu.setAlignmentX(CENTER_ALIGNMENT);
        menu.addActionListener(this); 
        
        getContentPane().add(exit);
        exit.setOpaque(false);
        exit.setBackground(new Color(0,0,0,0));
        exit.setBorderPainted(false);
        exit.setAlignmentX(CENTER_ALIGNMENT);
        exit.addActionListener(this);
        pack();
        setVisible(true);
              
        
        
    }

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == this.exit) {
				System.exit(0);
			}
			if(e.getSource() == this.menu)		
			{ setVisible(false);
				MainMenu a = new MainMenu();
					a.setSize(600,800);
					a.setVisible(true);		
		}
			
		}

}


