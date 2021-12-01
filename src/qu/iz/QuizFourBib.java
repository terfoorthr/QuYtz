package qu.iz;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
	
	public class QuizFourBib extends JDialog implements ActionListener {
		public static final long serialVersionUID = 1L;
	

		
		int	score = 0;
        
        ButtonGroup group = new ButtonGroup();
        JButton btnOk = new JButton("", new ImageIcon("BreakableCoordinatedGosling-small.gif"));
        JButton exit = new JButton("", new ImageIcon("exit.1.jpg"));
        JButton menu = new JButton("", new ImageIcon("menu-2.png"));
        
    	List<Question> questions = new ArrayList<Question>();
            
 
        public QuizFourBib(){
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
            
     	   
            
            questions.add(new Question("<html>Die Marketing-Entscheidungen der Frankfurter Bremsen AG basieren auf Daten, die aus vielen Informationsquellen stammen.<br/> Bei welcher Quelle handelt & sich um eine externe Informationsquelle?</html>", 
            		new String[]{"ABC-Analyse", "Auftragsstatistik", "Fachzeitschriften", "Lieferantendatei", "Marktberichte der Handlungsreisenden"}, 
            		"Fachzeitschriften"));
            		
            questions.add(new Question("Welche Maßnahme gehört NICHT zu den Aufgabenbereichen des Marketing?", 
            		new String[]{"Die Produktpolitik", "Die Preispolitik", "Die Service und Konditionenpolitik", "Die Gewinnanalysen", "Die Vertriebspolitik"}, 
            		"Die Gewinnanalysen"));
       
            questions.add(new Question("Was ist unter dem Begriff Diversifikation zu verstehen??  ", 
            		new String[]{"Verbreiterung des Sortiments durch neue, andersartige, bisher nicht angebotene Produktgruppen ", "Bereinigung des Programms durch Herausnahme von Produkten bzw. Produktgruppen", "Umstellen des Fertigungsprogrammes auf wenige Produkte", "Erweiterung einer bereits angebotenen Produktgruppe", "Veränderung bereits eingeführter Produkte"}, 
            		"Verbreiterung des Sortiments durch neue, andersartige, bisher nicht angebotene Produktgruppen "));
          
            questions.add(new Question("  Was versteht man in der Marktforschung unter einem repräsentativen Querschnitt??  ", 
            		new String[]{"Eine Auswahl typischer Erzeugnisse eines Produktionsunternehmens", "Eine Auswahl der besten Erzeugnisse eines Industrieunternehmens", "Einen Vergleich des Umsatzes eines Produktes mit dem Gesamtumsatz", "Eine Auswahl möglicher Käufer, die nach Geschlecht, Alter und Kaufkraft mit dem gesamten Abnehmerkreis vergleichbar ist", "Eine willkürliche Auswahl möglicher Käufer" }, 
            		"Eine Auswahl möglicher Käufer, die nach Geschlecht, Alter und Kaufkraft mit dem gesamten Abnehmerkreis vergleichbar ist"));
    
            questions.add(new Question("Welche Aussage über die Marktanalyse ist richtig", 
            		new String[]{"Sie will mit Mitteln der Psychologie und der Soziologie herausfinden, welche bewussten oder unbewussten Gründe die Kaufentscheidungen der Kunden beeinflussen", "Sie versucht durch Befragungen die Konsumgewohnheiten der Käufer zu erfassen", "Sie untersucht den Markt zu einem gegebenen Zeitpunkt und gibt ein Bild der Marktlage n diesem Augenblick", "Sie stellt Veränderungen der volkswirtschaftlichen Daten fest", "Sie umfasst alle Maßnahmen, die sich daraufrichten, die Meinung und die Entscheidung eines anderen zugunsten des Werbenden zu beeinflussen"}, 
            		"Sie untersucht den Markt zu einem gegebenen Zeitpunkt und gibt ein Bild der Marktlage n diesem Augenblick"));
           
            questions.add(new Question("<html>Um den Absatz im Ausland zu fördern, entschließt sich die Textilwerke AG, eine räumliche Preisdifferenzierung vorzunchmen.<br/> Welches Beispiel beschreibt diese Maßnahme</html>?", 
            		new String[]{"Bettwäsche aus auslaufenden Serien wird überall billiger angeboten", "Tischwäsche wird in England in anderen Ausführungen angeboten als in Holland", " Bettwäsche wird im Herbst teurer angeboten als sonst im Jahr", "Tischwäsche wird in Holland billiger angeboten als ın Belgien", "Bettwäsche aus einer neu entwickelten Kunstfaser wird mit einem hohen Preis eingeführt", "Tisch und Bettwäsche wird in verschiedenen Qualitäten und Preisen angeboten"}, 
            		"Tischwäsche wird in Holland billiger angeboten als ın Belgien"));
         
            questions.add(new Question("Welche Aussage über Mengen und Preispolitik als absatzpolitische Maßnahme ist richtig???", 
            		new String[]{"Durch Gewährung von Sonderrabatten kann der Absatz zu Lasten des Gewinns je Stück erhöht werden", "tarre Preispolitik wirkt sich auf den Absatz nicht aus, da es nur aufdie Qualität der Ware ankommt", "Rabatte und Skonti sind als Instrumente zur Ausweitung des Absatzes ungeeignet", "Durch Rabattgewährung kann der Absatz gesteigert werden; das Betriebsergebnis wird hierdurch nicht berührt", "Die Entwicklung des Absatzes ist von der Preispolitik in der Regel unabhängig"}, 
            		"Durch Gewährung von Sonderrabatten kann der Absatz zu Lasten des Gewinns je Stück erhöht werden"));
                  
            questions.add(new Question("<html>Welche Voraussetzung muss gegeben sein,<br/> damit ein Unternehmen eine räumliche Preisdifferenzierung durchführen kann?</html>", 
            		new String[]{"Die Produkte müssen unterschiedlich verwendet werden können", "Die Produkte miissen in unterschiedlichen Qualitätsstufen hergestellt werden ‚können", "Die Teilmärkte müssen sich regional abgrenzen lassen", "Zwischen den einzelnen Teilmärkten muß eine möglichst große Markttransparenz bestehen", " Die Transportkosten müssen unterschiedlich hoch sein"}, 
            		"Die Teilmärkte müssen sich regional abgrenzen lassen"));

            questions.add(new Question("<html>Em Industriebetrieb fertigt Nähmaschinen für Industrie und Haushalt<br/>im Unternehmen werden folgende absatzfördernde Maßnahmen diskutiert.<br/> Welche Maßnahme verstößt gegen gesetzliche Vorschriften???</html>", 
            		new String[]{"Die neue Haushaltsnähmaschine Electronica soll im Versandhaus mit einem Sonderrabatt von 25% angeboten werden", "in einer Fachzeitschrift für die Textilund Bekleidungsindustrie soll diese Anzeige erscheinen: Die neue Electronica ist die beste, die esje gab. Bitte vergleichen Sie!", "im Geschäftsbericht für das abgelaufene Wirtschaftsjahr soll der hohe Marktanteil des Unternehmens für Industrienähmaschinen aufdem deutschen Markt veröffentlicht werden","Den Einzelhändlern soll mitgeteilt werden, dass Ihnen die neue Haushaltsnähmaschine Elektronica nur geliefert wird, wenn Sie das Gerät für 950,€ weiterverkaufen","Für die Nähmaschinen soll erstmals auch der ausländische Markt erschlossenwerden. Dabei entfällt die Mehrwertsteuer"}, 
            		"Den Einzelhändlern soll mitgeteilt werden, dass Ihnen die neue Haushaltsnähmaschine Elektronica nur geliefert wird, wenn Sie das Gerät für 950,€ weiterverkaufen"));
          
            
            questions.add(new Question(" Welchen Aussage kennzeichnet den Begriff Marktprognose?", 
            		new String[]{"Der Markt für Rasenmäher wird z. Z. von 5 Herstellern beherrscht, die zusammen einen Marktanteil von 9 °o besitzen",
            				"Die Vorteile des Modells RM Ill liegen ın der auch für Hausfrauen einfachen Bedienung",
            				"Das Modell RM TI wird künftig auch im Ausland einen größeren Käuferkreis ansprechen, wenn die Verkaufspreise nicht erhöht werden",
            				"Alle Händler für den \"RM IIl\"-Rasenmäher sind im Branchenverzeichnis der Telefon bücher verzeichnet.",
            				"Der Trend zum Elektrorasenmäher hat sich im vergangenen Jahr wiederum bestätigt"}, 
            		"Das Modell RM TI wird künftig auch im Ausland einen größeren Käuferkreis ansprechen, wenn die Verkaufspreise nicht erhöht werden"));
        
            
            questions.add(new Question("<html>Dem Warengeschäft zwischen einem Wiesbadener Lieferer und einem Münchner Kunden liegt neben anderen Vereinbarungen die Lieferbedingung:<br/>  frei Haus<br/>  zugrunde. Über den Erfüllungsort und den Gefahrenübergang wurden keine Vereinbarungen getroffen.<br/>  Welche rechtliche Wirkung hat die Vereinbarung grei Haus auf den Erfüllungsort und den Gefahrenübergang?</html>", 
            		new String[]{"Die Vereinbarung frei Haus hat aufden Erfüllungsort keinen Einfluss; durch sie “wird nur der Gefahrenübergang nach München verlegt",
            				"Die Bestimmung \"frei Haus\" hat keinen Einfluss aufErfüllungsort und Gefahrenübergang, sie regelt nur die Übernahme der Transportkosten",
            				"Durch die Lieferbedingung \"frei Haus\" werden Erfüllungsort und Gefahrenübergang nach München verlegt",
            				"Erfüllungsort und Gefahrenübergang befinden sich trotz der Vereinbarung \"frei Haus\" gemäß den gesetzlichen Bestimmungen des BGB in München",
            				"Durch die Vereinbarung \"frei Haus” wird der Erfüllungsort nach München verlegt, der Gefahrenübergang jedoch ist weiterhin in Wiesbaden. "}, 
            		"Die Bestimmung \"frei Haus\" hat keinen Einfluss aufErfüllungsort und Gefahrenübergang, sie regelt nur die Übernahme der Transportkosten"));
        
            
            questions.add(new Question("95 % aller Haushalte haben einen Kühlschrank ... Welche Aussage über Absatzmöglichkeiten läßt sich daraus ableiten?", 
            		new String[]{"1% der Markt einen hohen Sättigungsgrad erreicht hat, sollten keine Kühlschränke mehr produziert werden",
            				"Künftig können jährlich nur noch 5 % Umsatzsteigerung erreicht werden",
            				"Der Markt ist während der nächsten 10 Jahre für die Marktführer absolut uninteressant",
            				"Man kann von dieser Zahl nicht ableiten, dass Kühlschränke generell unverkäuflich geworden sind",
            				"Auch mit Billigst-Angeboten ist nichts mehr zu verkaufen"}, 
            		"Man kann von dieser Zahl nicht ableiten, dass Kühlschränke generell unverkäuflich geworden sind"));
          
            questions.add(new Question("<html> Welchen Einfluss hat das kaufmännische Mahnverfahren auf die Verjährung von Forderungen <br/> aus zweiseitigen Handelsgeschäften?</html>", 
            		new String[]{"Es hat keinen Einfluss auf die Verjährung",
            				"Die Verjährung wird unterbrochen",
            				"Die Verjährung wird gehemmt",
            				"Die Forderung verjährt",
            				"Die Verjährungsfrist wird von 2 auf4 Jahre verlängert"}, 
            		"Die Verjährung wird gehemmt"));
            
            questions.add(new Question("Was wird unter Marketing-Mix verstanden?", 
            		new String[]{"Die horizontale Aufgliederung der Absatzmärkte für die verschiedenen Produktarten",
            				"Der Einsatz eines absatzpolitschen Instruments, abgestimmt aufdie verschiedenen Produktarten",
            				"Der Verkaufder verschiedenen Produkte zu unterschiedlichen Preisen aufmehreren Märkten",
            				"Der kombinierte Einsatz verschiedener Marketing-Instrumente",
            				"Der Verkauf verschiedener Produktarten über differenzierte Absatzwege aufden verschiedenen Märkten"}, 
            		"Der kombinierte Einsatz verschiedener Marketing-Instrumente"));
            
            questions.add(new Question("Welche Aussage über die Sekundärerbebung ist richtig", 
            		new String[]{"Im Rahmen der Sekundärerhebung wird für andere Zwecke erhobenes und aufbereitetes Material ausgewertet",
            				"Nur die Sekundärerhebung dient als Grundlage für die amtlichen Statistiken",
            				"Die Sekundärerhebung wird insbesondere in Form von Befragungen und Beobachtungen durchgeführt",
            				"Die Sekundärerhebung liefert stets die genaueren Ergebnisse als die Primärerhebung",
            				"Die Sekundärerhebung ist im allgemeinen teurer und aufwändiger als die Primärerhebung"}, 
            		"Im Rahmen der Sekundärerhebung wird für andere Zwecke erhobenes und aufbereitetes Material ausgewertet"));
         
        }
        public int startQuiz(){
            int score=0;
            for (Question quizM : questions){
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

            ImageIcon icon = new ImageIcon("fr.jpg");    
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


		 
	   
	  
	  
	  	
    