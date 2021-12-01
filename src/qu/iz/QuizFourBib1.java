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

public class QuizFourBib1 extends JDialog implements ActionListener {
	   
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
    int score=0;
    ButtonGroup group = new ButtonGroup();
    JButton btnOk = new JButton("", new ImageIcon("Push-button.gif"));
    JButton exit = new JButton("", new ImageIcon("exit.1.jpg"));
    JButton menu = new JButton("", new ImageIcon("menu-2.png"));
	List<Question> questions1 = new ArrayList<Question>();

	public QuizFourBib1(){
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
  

  	   
        
        questions1.add(new Question("Was bedeutet der Begriff Cookie?", 
        		new String[]{"Metabefehl des CM-Model Objects des Browsers", "Infodatei einer Website wird auf der HDD gespeichert", "Anderer Begriff f�r Popup-Fenster auf einer Internetseite", "Virtueller Abfall durch fehlerhafte Links."}, 
        		"Infodatei einer Website wird auf der HDD gespeichert"));
       
        questions1.add(new Question("Was ist der Unterschied zwischen WWW und dem Inet", 
        		new String[]{"WWW ist ein Dienst des Internets","WWW und Internet ist das Gleiche nur andere Bezeichnung", "Internet ist Global und WWW ist nur ein Provider-Netzwerk", "WWW wird vom W3C bevorzugt"}, 
        		"WWW ist ein Dienst des Internets"));
       
        questions1.add(new Question("Welche Informationen bieten die sogenannten Favoriten??", 
        		new String[]{"Einstellungen des Internet Service Providers", "Links zu h�ufig besuchten Webseiten", "Webseiten, welche mehr als 6 x in der Woche besucht werden", "Die Top-Ten Ihrer bisher aufgerufenen Webseiten"}, 
        		"Links zu h�ufig besuchten Webseiten"));
      
        questions1.add(new Question("Was ben�tigen Sie um einen Internetdienst grunds�tzlich zu nutzen?", 
        		new String[]{"Eine eigene Webseite, Dom�ne, Root-Server", "Zugelassener Internet-Editor, Browser,Zertifizierte Software", "Ger�t mit Voice over Internet Protocol, DF�, Browser", "Modem, DSL, ISP"}, 
        		"Modem, DSL, ISP"));

        questions1.add(new Question("Was bedeutet der Begriff: Homepage?", 
        		new String[]{"Die Webseiten, welche man nur Zuhause �ffnen kann", "Wird verwendet, wenn die HTML-Seite zuhause erstellt wurde", "Die erste Seite eines Internetangebots", "Die zentrale Hauptseite eines Internet Providers"}, 
        		"Die erste Seite eines Internetangebots"));
       
        questions1.add(new Question("Erkl�ren Sie ein Intranet, wie es heutzutage vom Verwender anwendungstechnisch benutzt wird?", 
        		new String[]{"Netzwerke die in permanenter Verbindung stehen", "Das Netzwerk innerhalb einer Stadt", "Das Netzwerk innerhalb eines Landes", "Die Webstrukturen eines firmeninternen Netzwerkes"}, 
        		"Die Webstrukturen eines firmeninternen Netzwerkes"));
        
        questions1.add(new Question("Welche Software wird umgangssprachlich als Web-Software bezeichnet?", 
        		new String[]{"Software, welche nur einen Browser ben�tigt", "Das Netzwerk innerhalb einer Stadt", "Software, die mit Programmiersprache PHP geschrieben ist", "Software, welche nur Microsoft Silverlight ben�tigt"}, 
        		"Software, welche nur einen Browser ben�tigt"));
       
        questions1.add(new Question("Was bewirkt die Taste [ F11 ] beim Browser Firefox?", 
        		new String[]{"Fenster aktualisieren","Vollbildansicht", "Hilfe", "Das Netzwerk innerhalb einer Stadt"}, 
        		"Vollbildansicht"));

        questions1.add(new Question("Welche URL-Adresse ist richtig?", 
        		new String[]{"http:www.trainy.de", "http://www.bfw-training.de", "http://www.t.com", "http:\\www.pct.de"}, 
        		"http://www.bfw-training.de"));
        
        questions1.add(new Question("Was bedeutet folgende URL: http://192.168.176.1/cobol:6018?", 
        		new String[]{"Numersche Adresse des Internet Service Provider (ISP)","Der Zugang zu einer der 6018 Internet-Bank Filialen", "Webspace auf einem numerisch dezidierten Ger�t mit Port 6018", "Zahlenkombination einer gesch�tzten Seite mit Hashtag 6018"}, 
        		"Numersche Adresse des Internet Service Provider (ISP)"));
        
        questions1.add(new Question("Welche M�glichkeiten stehen Ihnen f�r die Navigation zwischen den Webseiten zur Verf�gung?", 
        		new String[]{"Browser-Objekte, CSI-Objekte, URL-Zeichenketten", "Hyperlinks, Cursortasten, Arrowshares", "Hyperlinks, Browser-Schaltfl�chen, URL-Bezeichner", "Shareordner, Browser-Objekte, URI-Info"}, 
        		"Hyperlinks, Browser-Schaltfl�chen, URL-Bezeichner"));
        
        questions1.add(new Question("Wie drucken Sie den markierten Text aus, wenn die Webseite selbst kein Drucksymbol bietet \"Firefox\"?", 
        		new String[]{"�ber die Tasten [Alt]+[F4]","�ber die Tasten [Strg]+[D]", "�ber die Tasten [AltGr]+[Druck]", "�ber das Drucksymbol des Browsers"}, 
        		"�ber das Drucksymbol des Browsers"));

        questions1.add(new Question("Wie werden auf Internetseiten markierte Links ohne Maus angesteuert?", 
        		new String[]{"�ber die [ Leer ]-Taste", "�ber die [ TAB ]-Taste", "�ber die [ Bild ]-Taste", "�ber die [ Cursor ]-Tasten"}, 
        		"�ber die [ TAB ]-Taste"));
        
        questions1.add(new Question("Wie wird dem Browserverlauf der Link einer Webseite hinzugef�gt?", 
        		new String[]{"Zuletzt besuchte Seite wird automatisch hinzugef�gt","<addsth> am Kopf in den HTML-Code der Seite einf�gen", "Men� od. Symbol Verlauf anklicken und hinzuf�gen", "Autoverlauf tr�gt nach 20ter Seitenbenutzung den Link ein"}, 
        		"Zuletzt besuchte Seite wird automatisch hinzugef�gt"));
        
        questions1.add(new Question("Welche Erkl�rung beschreibt den Begriff RSS richtig?", 
        		new String[]{"Sicherer Dienst zum Online-Shopping", "Sicherer Online-Bezahldienst", "Service um �ber Aktualisierungen den �berblick zu behalten", "Nachrichtenverwaltungvon Outlook"}, 
        		"Service um �ber Aktualisierungen den �berblick zu behalten"));
        
        questions1.add(new Question("Was sind Newsgroups?", 
        		new String[]{"Klatsch- und Tratsch- Seiten im Internet", "Netzwerke f�r Medienvertreter", "Interessengruppen im Internet", "Nachrichten-Bezahldienst im Internet"}, 
        		"Interessengruppen im Internet"));

        questions1.add(new Question("In welchem Zustand �bermittelt Ihr Browser beispielsweise Kreditkartendaten sicher?", 
        		new String[]{"Nur Daten die gesichert u. verschl�sselt �bermittelt werden", "Wenn die Web-Seite ein Sicherheitslogo hat", "Wenn ich mich vorher telefonisch absichere", "ber Methoden die nicht der 2FA oder MFA entsprechen"}, 
        		"Nur Daten die gesichert u. verschl�sselt �bermittelt werden"));
        
        questions1.add(new Question("Welche eMail hat f�r die D�m�ne bfw-clumpuz.de die richtige Syntax?", 
        		new String[]{"josef@gelder.bfw-clumpuz.de","josef.gelder@bfw-clumpuz.de", "josef.gelder�bfw-clumpuz.de", "bfw-clumpuz@josefgelder.de"}, 
        		"josef.gelder@bfw-clumpuz.de"));
        
        questions1.add(new Question("Welche Erkl�rung des Begriffs: HTML ist richtig?", 
        		new String[]{"Hyper Text Markup Link", "Hypen Typ Markup Link ersetzt die offizielle Sprache lt. W3C", "Sprache um Informationen im Browser lesbar darzustellen", "Abk�rzung f�r die Daten�bertragung via HTM-Line laut W3C"}, 
        		"Sprache um Informationen im Browser lesbar darzustellen"));
        
        questions1.add(new Question("Welche Erkl�rung �ber die allgemeine Bedeutung von Software-Viren ist richtig?", 
        		new String[]{"Viren sind die Gegenst�cke von Bakterien", "Viren sind elektronische Schadprogramme", "Viren �ndern ausschlie�lich PC-Hardware", "Viren infinzieren haupts�chlich Internet-Benutzer"}, 
        		"Viren sind elektronische Schadprogramme"));
        
        questions1.add(new Question("Nennen Sie die Bedeutung des Begriffs: Protokoll im Zusammenhang mit dem Internet?", 
        		new String[]{"Zusammenfassung aller erhobenen Daten einer IT-Sitzung", "�bersicht �ber das Datenvolumen des Datentransfer", "Zusammenfassung der Daten�bertragungsinfo nach dem Download", "Regeln f�r die Daten�bertragung im Internet"}, 
        		"Regeln f�r die Daten�bertragung im Internet"));
        
        questions1.add(new Question("Was findet Google, wenn Sie den Suchalgoritmus allinurl:psychologie anwenden?", 
        		new String[]{"Alle Seiten mit dem Begriff psychologie in der Kopfzeile", "Alle Seiten die den Begriff psychologie im Text enthalten", "Alle Seiten die den Begriff psychologie im Titel haben", "Alle Seiten mit dem Begriff psychologie in der Webadresse"}, 
        		"Alle Seiten mit dem Begriff psychologie in der Webadresse"));

        questions1.add(new Question("Wie nennt sich die Datei des Webservers Apache, in der Sie Konfigurationen �ndern k�nnen??", 
        		new String[]{"httpd.conf", ".htaccess", "html.conf", "apache.conf"}, 
        		"httpd.conf"));
        
        questions1.add(new Question("Wie nennt man ein webbasiertes System, welches RDBMS gest�tzt, Waren im Internet anbietet?", 
        		new String[]{"Learning-Management-System", "E-Commerce-Shop-Systeme","Enterprise-Collaboration-System", "Content-Management-System"}, 
        		"E-Commerce-Shop-Systeme"));
        
        questions1.add(new Question("Wie hei�t ein webbasierte System, das RDBMS gest�tzt, multimediale Inhalte im Web darstellt?", 
        		new String[]{"Enterprise-Collaboration-System", "E-Commerce-Shop-Systeme", "Content-Management-System", "Learning-Management-System"}, 
        		"Content-Management-System"));
        
        questions1.add(new Question("Zeigen Sie die richtigen Grundanforderungen an ein Trouble Ticket System auf?", 
        		new String[]{"Polarisierung, Colloboration, Dokumentation", "Priorisierung, �quinoktiumation, Korrelation", "Priorisierung, Dokumentation, Korrelation", "Priorisierung, Dokumentation, Subsomarit�t"}, 
        		"Priorisierung, Dokumentation, Korrelation"));
        
        questions1.add(new Question("Zeigen Sie die richtigen Arten der Anforderung an ein Content-Management-System auf?", 
        		new String[]{"Statische- , Hybride-, Halbstatische- und Volldynamische Systeme", "Alle Prozess nach der ZAMUK-Methode sind g�ltig", "Analytisch, Operativ, Kommunikativ, Kollaborativ", "Analytisch Operative Systeme, Kommunikativ, Korporations Systeme"}, 
        		"Statische- , Hybride-, Halbstatische- und Volldynamische Systeme"));

        questions1.add(new Question("Was versteht man unter einem volldynamischen CMS?", 
        		new String[]{"Jeder Webseitenaufruf �ber W3C erzeugt dynamisch Dokumente", "Jedes CM-System hat zwingend volldynamische Web-Dokumente", "Jeder Webseitenaufruf erzeugt dynamisch die Web-Dokumente", "Volldynamische Dokumente k�nnen im Web nicht erzeugt werden"}, 
        		"Jeder Webseitenaufruf erzeugt dynamisch die Web-Dokumente"));
        
        questions1.add(new Question("Wie hei�en webbasierte Systeme, die Erfahrungen u. gemeinschafts Wissen sammeln u. archivieren?", 
        		new String[]{"HTM - Software", "WIKI - Software", "CRM - Software", "ERP - Software"}, 
        		"WIKI - Software"));
        
        questions1.add(new Question("Wie hei�en webbasierte Systeme, die Kundenbeziehung in den Focus r�cken?", 
        		new String[]{"WIKI - Software", "HRM- Software", "ERP - Software", "CRM - Software"}, 
        		"CRM - Software"));

        questions1.add(new Question("Was versteht man unter einem webbasierten CRM- System f�r Unternehmen?", 
        		new String[]{"Gemeinschaftlich Erstellen, Bearbeiten u. org. von Infos", "Aufgaben rechtzeitig u. bedarfsgerecht planen u. steuern", "Ein Fallbearbeitungssystemf�r eingehende Kundenanfragen", "Systematische Gestaltung von Kundenbeziehungsprozessen"}, 
        		"Systematische Gestaltung von Kundenbeziehungsprozessen"));
        
        questions1.add(new Question("Wie hei�t der Ordner des Apache-Standardverzeichnisses f�r darzustellende Webseiten/Systeme?", 
        		new String[]{"/htmldocs", "/apachedocs","/httpdocs", "/htdocs"}, 
        		"/htdocs"));
        
        questions1.add(new Question("Wie muss die Apache-Standarddatei hei�en, damit die Homepage der Website aufgerufen wird?", 
        		new String[]{"index.html", "homepage.html", "index.xml", "default.asp"}, 
        		"index.html"));
        
        questions1.add(new Question("Welcher Kategorie kann ein CRM System angeh�ren?", 
        		new String[]{"Analytisch, Kollaborativ, Operativ, Kommunikativ", "Kollaborativ, Obstruktiv, Synergistisch, Analytisch", "Jedes Customer Relationship Management ist kollaborative", "Diese Einteilung gibt es nicht"}, 
        		"Analytisch, Kollaborativ, Operativ, Kommunikativ"));
        
        questions1.add(new Question("Was koordiniert die ICANN in Verbindung mit Dom�nen?", 
        		new String[]{"Eintragung von Protokollnummern", "Standort des Information Awareness Office", "Die Vergabe von einmaligen Namen und Adressen im Internet", "Schafft den Rechtsrahmen f�r Betriebe mit deutscher TLD"}, 
        		"Die Vergabe von einmaligen Namen und Adressen im Internet"));
        
        
        questions1.add(new Question("Welche Vergaberichtlinien sind bei ccTLD�s unter anderem zu ber�cksichtigen?", 
        		new String[]{"Interessen des MILNET", "Rechte der ICANN und IANA", "Grundlagen der ARPA Richtlinien", "Internetcommunity u. staatliche Interessen, nationales Recht"}, 
        		"Internetcommunity u. staatliche Interessen, nationales Recht"));

        questions1.add(new Question("Zeigen Sie die Verwaltungsstellen welche neben dem Eigener selbst vorhanden sein m�ssen?", 
        		new String[]{"Admin-C; Tech-C; Zone-C -Verwalter", "Die Verwaltungsstellen werden nur von ARPA festgelegt", "Es gibt nur die Verwaltungsstele des Eigners", "Admin-A; Tech-B; Zone-C -Verwalter"}, 
        		"Admin-C; Tech-C; Zone-C -Verwalter"));
        
        questions1.add(new Question("Welche Aufgabe hat ein Root-Server (Root-Zone) im Namensraum des Internets?", 
        		new String[]{"Zur Verwaltung der Namenr�ume ist kein zentral System n�tig", "Die Root-Zone markiert die h�chte Ebene im Namensraum (DNS)", "Verifiziert alle DNS-Server aller Provider im Internet", "Zur Verwaltung der Namenr�ume ist kein zentral System n�tig"}, 
        		"Die Root-Zone markiert die h�chte Ebene im Namensraum (DNS)"));
        
        questions1.add(new Question("Wie nennt man die h�chste Instanz welche Registrare f�r Internet-Dom�nen akkreditieren kann?", 
        		new String[]{"American Registry for Internet Numbers", "Internet Engineering Steering Group", "Public Interest Registry", "Internet Corporation for Assigned Names and Numbers"}, 
        		"Internet Corporation for Assigned Names and Numbers"));
        
        questions1.add(new Question("Internet Corporation for Assigned Names and Numbers?", 
        		new String[]{"pgpDBAdmin", "MyPhpAdmin", "sqlMyAdmin", "phpMyAdmin"}, 
        		"phpMyAdmin"));
        
        questions1.add(new Question("Wie heisst die bevorzugte Sprache zur Abfrage und Manipulation von RDBMS?", 
        		new String[]{"hadoop", "XML Query Language","Query by Example", "Structured Query Language"}, 
        		"Structured Query Language"));
        
        questions1.add(new Question("Wie nennt sich die Org. die einen OSS Webserver anbieten, der mehr als 60% eingesetzt wird?", 
        		new String[]{"Apache Software Foundation", "Zope Corporation", "Nginx Inc", "Sun Microsystems"}, 
        		"Apache Software Foundation"));
    }

    public int startQuiz(){
        int score=0;
        for (Question quizM : questions1){
            displayQuestion(quizM);
            while (group.isSelected(null))
                
            {	
            	JOptionPane.showMessageDialog(null, "Es muss eine Antwort ausgew�hlt werden!", "Halt halt halt!!!!", JOptionPane.ERROR_MESSAGE);	           	
            	group.clearSelection();
            	displayQuestion(quizM);
            
            
            }
            
            if (group.getSelection().getActionCommand().equals(quizM.getCorrectAnswer())){
                          
            	 JOptionPane.showMessageDialog(null,"Richtige Antwort, weiter so","Volltreffer",JOptionPane.INFORMATION_MESSAGE);  	
                 score++;
                
            } 
            
            else JOptionPane.showMessageDialog(null, quizM.getCorrectAnswer(), "Leider Falsch, die richtige Antwort w�hre...", JOptionPane.ERROR_MESSAGE);
            
        
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

        ImageIcon icon = new ImageIcon("Fragezeichen.jpg");    
        icon = new ImageIcon(icon.getImage().getScaledInstance(150, 100, BufferedImage.SCALE_SMOOTH));
        questionText.setIcon(icon);
        Font font = new Font("Arial Rounded MT Bold", Font.BOLD, 32);
        Font font1 = new Font("Arial", Font.BOLD, 20);
        questionText.setFont(font);
        questionText.setForeground(Color.BLACK);
        questionText.setAlignmentX(CENTER_ALIGNMENT);



        
        
        getContentPane().setBackground(Color.black);
        getContentPane().add(questionText);
        for (String answer : quizM.getAnswers()){
        	
        	
      
            JRadioButton radio = new JRadioButton(answer);
            radio.setActionCommand(answer);
            radio.setFont(font1);
            radio.setForeground(Color.black);
            radio.setBackground(Color.white);
            radio.setAlignmentX(CENTER_ALIGNMENT);
   
            
            group.add(radio);
            getContentPane().setBackground(Color.white);
           
         
            getContentPane().add(radio);
        }
        getContentPane().add(btnOk);
        btnOk.setOpaque(false);
        btnOk.setBackground(Color.white);
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
        exit.setBackground(Color.white);
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
