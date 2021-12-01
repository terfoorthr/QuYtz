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

public class QuizFourBib4 extends JDialog implements ActionListener {
	   

	private static final long serialVersionUID = 1L;

    int score=0;
    ButtonGroup group = new ButtonGroup();
    JButton btnOk = new JButton("", new ImageIcon("BreakableCoordinatedGosling-small.gif"));
    JButton exit = new JButton("", new ImageIcon("exit.1.jpg"));
    JButton menu = new JButton("", new ImageIcon("menu-2.png"));
	List<Question> questions1 = new ArrayList<Question>();

	public QuizFourBib4(){
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
  

  	   
     
        
        questions1.add(new Question("Wählen Sie die richtige Syntax des CSS-Regelsatzes", 
        		new String[]{"Selector{Attribut:Wert;}","Selector{Duktus:Dignitas;}", "Delimiter{attribute:=Worth;}", "Tag{Attribut=Wert;}"}, 
        		"Selector{Attribut:Wert;}"));
        
        questions1.add(new Question("Es gibt mehrere Möglichkeiten CSS in HTML-Dokumente einzubinden. Wählen Sie die Richtigen", 
        		new String[]{"Inline-Style, Outsides-Style, Embedded-Style","Inline-Style, Embedded-Style, External-Style", "Inside-Style, Embedded-Style, External-Style", "Inline-Style, Embedded-Style, Extracter-Style"}, 
        		"Inline-Style, Embedded-Style, External-Style"));
        
        questions1.add(new Question("Welches Attribut legt in CSS einen oberen Innenabstand von 3 typografischen Punkten fest?", 
        		new String[]{"border-top:3pt;","margin-top:3pt;", "padding-top:3pt;", "padding-top=3pt;"}, 
        		"padding-top:3pt;"));
        
        questions1.add(new Question("Welches Attribut legt die Schriftart \"Symbol\" für die CSS-Box fest", 
        		new String[]{"font-family:Symbol;","font-type:Symbol;", "front-family:Symbol", "font-face:Symbol;"}, 
        		"font-family:Symbol;"));
        
        questions1.add(new Question("Wie lautet die CSS-Anweisung um einen 12 cm dicken Rahmen um eine Textbox zu erzeugen?", 
        		new String[]{"border-line:12cm;","border-width:12cm;", "border-height:12cm;", "border-thick:12cm;"}, 
        		"border-width:12cm;"));
        
        questions1.add(new Question("Wie lautet die CSS-Anweisung um auf der Webseite einen \"Wasserzeicheneffekt\" zu erzeugen?", 
        		new String[]{"background-cover:fixed;","background:fixed;", "background-watermarks:fixed;", "background-attachment:fixed;"}, 
        		"background-attachment:fixed;"));
        
        questions1.add(new Question("Welches Attribut legt in CSS die Eigenschaft für die Textdarstellung in Kapitälchen fest?", 
        		new String[]{"font-transform:small-caps;","font-decoration:small-caps;", "font-variant:small-caps;", "font-variant:kapitalized;"}, 
        		"font-variant:small-caps;"));
        
        questions1.add(new Question("Was passiert, wenn man für ein HTML-Element \"font-size:1Set;\" in CSS definiert?", 
        		new String[]{"Der Schriftsatz für das ganzen Dokument unveränderlich fest", "Nichts, diese schreibweise ist in CSS nicht existent", "Die Schreibweise ist ein übliches Font-Attribut unter CSS", "Die Schriftgröße kann nur um 1 Einheit vergrößert werden"}, 
        		"Nichts, diese schreibweise ist in CSS nicht existent"));
        
        questions1.add(new Question("Was ist in CSS nicht das gleiche wie: \"margin:28pt;\"?", 
        		new String[]{"ptmargin:28pt 26pt 28pt 28pt;","margin:28pt 28pt", "margin:28pt 28pt 28pt;", "margin:28pt 28pt 28pt 28pt;"}, 
        		"ptmargin:28pt 26pt 28pt 28pt;"));
        
        questions1.add(new Question("Welches der Elemente ist kein Medien-Typ (mediatype) von CSS?", 
        		new String[]{"all","screen", "devices", "print"}, 
        		"devices"));
        
        questions1.add(new Question("Welche Bedeutung hat die Abkürzung CSS3?", 
        		new String[]{"Community Service Site Generation 3","Cascading Style Sheets Level 3", "Community Style Sheet Level 3", "Cascading Server System Version 3"}, 
        		"Cascading Style Sheets Level 3"));
        
        questions1.add(new Question("Welches der CSS-Elemente kennzeichnet einen Kommentar?", 
        		new String[]{"<!-- Text -->","\\\\ Text", "# Text", "/* Text */"}, 
        		"/* Text */"));
        
        questions1.add(new Question("Welches der CSS-Elemente erzeugt vermutlich keinen weissen Hintergrund im Dokument?", 
        		new String[]{"background-color:white;","background:rgb(ff,ff,ff);", "background:#FFFFFF;", "background-image:url(\"white.png\");"}, 
        		"background-image:url(\"white.png\");"));
        
        questions1.add(new Question("Welcher Spezifitäts-Wert zur Kaskadierung von Elementen bestimmt die Wertigkeit der \"ID\"?", 
        		new String[]{"100","1000", "1", "10"}, 
        		""));
        
        questions1.add(new Question("Welche Bedeutung hat der Eintrag: #BGRange{background:url(HGBild.png);} ?", 
        		new String[]{"Die ID:\"#BGRange\" kann nur JPG-Grafik verwenden","Die CSS-BOX mit \"id=BGRange\" erhält eine Hintergrundgrafik", "Diese CSS-Sytax erstellt den Platzhalter für Grafielemente", "Eine solche Syntax ist in CSS \"depricated\"."}, 
        		"Die CSS-BOX mit \"id=BGRange\" erhält eine Hintergrundgrafik"));
        
        questions1.add(new Question("Wie erhält der Selector \"body\" einen Innenabstand von 2 cm oben/unten sowie 8 cm links/rechts", 
        		new String[]{"bodystyle=\"padding:2cm8cm;\"","style=\"body-margin:2cm8cm;\"", "body {margin:2cm 8cm;}", "body {padding:2cm 8cm;}"}, 
        		"body {padding:2cm 8cm;}"));
        
        questions1.add(new Question("Welches Attribut grenzt eine Box mit einer blauen, gestrichelten Linie 2px oben und unten ein?", 
        		new String[]{"border-top:2px dottet blue border-bottom:2px dottet blue;","border-top:2pt dottet blue border-bottom:2pt dottet blue;", "Line-top:2px dottet blue Line-bottom:2px dottet blue;", "border-top, border-bottom:2px dottet blue;"}, 
        		"border-top:2px dottet blue border-bottom:2px dottet blue;"));
        
        questions1.add(new Question("Was bewirkt das Attribut \"Postition\" für CSS-Elemente innerhalb einer Textpassage?", 
        		new String[]{"Für CSS-Elemente gibt effizientere Methoden es zu erreichen","Elemente können im Textfluss fest positioniert werden", "Elemente erhalten Platzhalter für bestimmbare Postitionen", "Elemente können losgelöst vom Textfluss positioniert werden"}, 
        		"Elemente können losgelöst vom Textfluss positioniert werden"));
        
        questions1.add(new Question("Was ist der korrekte HTML-Code für die Bezugnahme auf ein externes CSS-Stylesheet?", 
        		new String[]{"<stylesheet>mystyle.css</stylesheet>","<style src=\"mystyle.css\">", "<link rel=\"stylesheet\" type=\"text/css\" href=\"mystyle.css\">", "<link css=\"stylesheet\" type=\"text/css\" href=\"mystyle.css\">"}, 
        		"<link rel=\"stylesheet\" type=\"text/css\" href=\"mystyle.css\">"));
        
        questions1.add(new Question("Wo ist im HTML-Dokument gewöhnlich der richtige Ort, um auf ein externes CSS-Stylesheet zu verweisen?", 
        		new String[]{"In der Kopfzeile (head) des HTML-Dokuments","Am Ende jeden HTML-Dokuments", "Deklarationen innerhalb des Dokuments spielen keine Rolle", "Innerhalb des Body-Box Elements"}, 
        		"In der Kopfzeile (head) des HTML-Dokuments"));
        
        questions1.add(new Question("Mit welchem HTML-Tag wird ein internes CSS-Stylesheet definiert?", 
        		new String[]{"<css></css>","<css-style-type></css-style-type>", "<style></style>", "<script></script>"}, 
        		"<style></style>"));
        
        questions1.add(new Question("Wie fügen Sie eine rote Hintergrundfarbe für alle \"<H1>\" Elemente hinzu?", 
        		new String[]{"h1 {background-color:#ff0000;}","all.h1 {background-color:#ff0000;}", "h1.all {background-color:#ff0000;}", "h1 {color:#ff0000;}"}, 
        		"h1 {background-color:#ff0000;}"));
        
        questions1.add(new Question("Welches CSS-Eigenschaft verwenden Sie, um die Textfarbe in einer Element-Box zu ändern?", 
        		new String[]{"text-color","color", "fontcolor", "fgcolor"}, 
        		"color"));
        
        questions1.add(new Question("Mit welcher CSS-Eigenschaft steuern Sie die Textgröße innerhalb einer Element-Box?", 
        		new String[]{"text-size","text-style", "font-style", "font-size"}, 
        		"font-size"));
        
        questions1.add(new Question("Was ist die korrekte CSS-Syntax, um alle \"<p>\" -Elemente fett darzustellen?", 
        		new String[]{"p {font-weight:bold;}","p {text-size:bold;}", "<p style=\"text-size:bold;\">", "<p style=\"font-size:bold;\">"}, 
        		"p {font-weight:bold;}"));
        
        questions1.add(new Question("Mit welcher CSS-Syntax lässt man jedes Wort in einem Text mit einem Großbuchstaben beginnen?", 
        		new String[]{"text-transform:capitalize","text-transform:uppercase", "Dies ist mit CSS so nicht möglich", "text-transform:firstupper"}, 
        		"text-transform:capitalize"));
       
        questions1.add(new Question("Welche CSS-Eigenschaft wird die Schriftart einer Element-Box geändert?", 
        		new String[]{"font-family","font", "font-typ", "Schriftfamilien können nur im Kopf von HTML definiert sein"}, 
        		"font-family"));
        
        questions1.add(new Question("Mit welcher CSS-Eigenschaft können Sie den linken äußeren Rand eines Box-Elements ändern?", 
        		new String[]{"padding-left","indent", "margin-left", "margin-space"}, 
        		"margin-left"));
        
        questions1.add(new Question("Können für die CSS-Eigenschaft \"padding\" negative Werte verwendet werden?", 
        		new String[]{"Ja","Negative Werte werden im Standard mit 0 überschrieben", "Nur in Verbindung mit XHTML", "Nein"}, 
        		"Nein"));
        
        questions1.add(new Question("Mit welchem Ausdruck können Sie das Klassen-Element \"Hintergrund\" nur den SPAN-Boxen zuweisen?", 
        		new String[]{"span.hintergrund","#hintergrund", "class:=hintergrund", "hintergrund-style"}, 
        		"span.hintergrund"));
        
        questions1.add(new Question("Mit welcher CSS-Syntax weist man die Klasse \"blau\" nur dem HTML-Tag \"Absatz\" zu?", 
        		new String[]{"blau#p","p.blau", "blau&p", "blau p"}, 
        		"p.blau"));
        
        questions1.add(new Question("Wie gruppiert man, laut CSS-Syntax, mehrere Selektoren?", 
        		new String[]{"Trennen Sie jeden Selektor mit einem Pipezeiche","Trennen Sie jeden Selektor mit einem Semikolon", "Trennen Sie jeden Selektor mit einem Leerzeichen", "Trennen Sie jeden Selektor mit einem Komma"}, 
        		"Trennen Sie jeden Selektor mit einem Komma"));
        
        questions1.add(new Question("Was ist der Standardwert der CSS-Eigenschaft \"position\"?", 
        		new String[]{"absolute","fixed", "static", "relative"}, 
        		"static"));
        
        questions1.add(new Question("Mit welchem Ausdruck können Sie das ID-Element \"tester\" in einem Tag ansprechen?", 
        		new String[]{"#teste","id.tester", ".tester", "tester-Identifier"}, 
        		"#teste"));
        questions1.add(new Question("Was ist die Methoden um CSS mit einer Webseite zusammen in nur einem HTML-Dokument zu benutzen?", 
        		new String[]{"External und/oder Embedded","External, Embedded, Inline, und Filtered", "External, Embedded und/oder Inline", "Embedded und/oder Inline"}, 
        		"Embedded und/oder Inline"));
        
        questions1.add(new Question("Welche Reihe der CSS-Wertetypen ist vollständig richtig?", 
        		new String[]{"cm; em; pt; mm,in","pica;eco;cm;in,ex", "rad;turn;s;dpi;push", "vmax;er;ch;deg,ms"}, 
        		"cm; em; pt; mm,in"));
        
        questions1.add(new Question("Was ist richtig: Rahmen oben=10; Rahmen unten = 5; Rahmen links=20; Rahmen rechts= 1 (in pix.)?", 
        		new String[]{"border-width:10px 1px 5px 20px","border-width:5px 20px 10px 1px", "border-width:10px 5px 20px 1px", "border-width:10px 20px 5px 1px"}, 
        		"border-width:10px 1px 5px 20px"));
        
        questions1.add(new Question("Mit welchen CSS-Attributen ist es möglich einen Text in einem Element horizontal zu zentrieren?", 
        		new String[]{"text-center: true","text-align: center", "center: true", "align: center"}, 
        		"text-align: center"));
        
     
    }

    public int startQuiz(){
        int score=0;
        for (Question quizM : questions1){
            displayQuestion(quizM);
            while (group.isSelected(null))
                
            {	
            	JOptionPane.showMessageDialog(null, "Es muss eine Antwort ausgewählt werden!", "Halt halt halt!!!!", JOptionPane.ERROR_MESSAGE);	           	
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
        menu.setBackground(new Color(0,0,0,0));
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
					a.setVisible(true);		}
			
		}

}


