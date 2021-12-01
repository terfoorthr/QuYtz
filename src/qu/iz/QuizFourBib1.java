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
        		new String[]{"Metabefehl des CM-Model Objects des Browsers", "Infodatei einer Website wird auf der HDD gespeichert", "Anderer Begriff für Popup-Fenster auf einer Internetseite", "Virtueller Abfall durch fehlerhafte Links."}, 
        		"Infodatei einer Website wird auf der HDD gespeichert"));
       
        questions1.add(new Question("Was ist der Unterschied zwischen WWW und dem Inet", 
        		new String[]{"WWW ist ein Dienst des Internets","WWW und Internet ist das Gleiche nur andere Bezeichnung", "Internet ist Global und WWW ist nur ein Provider-Netzwerk", "WWW wird vom W3C bevorzugt"}, 
        		"WWW ist ein Dienst des Internets"));
       
        questions1.add(new Question("Welche Informationen bieten die sogenannten Favoriten??", 
        		new String[]{"Einstellungen des Internet Service Providers", "Links zu häufig besuchten Webseiten", "Webseiten, welche mehr als 6 x in der Woche besucht werden", "Die Top-Ten Ihrer bisher aufgerufenen Webseiten"}, 
        		"Links zu häufig besuchten Webseiten"));
      
        questions1.add(new Question("Was benötigen Sie um einen Internetdienst grundsätzlich zu nutzen?", 
        		new String[]{"Eine eigene Webseite, Domäne, Root-Server", "Zugelassener Internet-Editor, Browser,Zertifizierte Software", "Gerät mit Voice over Internet Protocol, DFÜ, Browser", "Modem, DSL, ISP"}, 
        		"Modem, DSL, ISP"));

        questions1.add(new Question("Was bedeutet der Begriff: Homepage?", 
        		new String[]{"Die Webseiten, welche man nur Zuhause öffnen kann", "Wird verwendet, wenn die HTML-Seite zuhause erstellt wurde", "Die erste Seite eines Internetangebots", "Die zentrale Hauptseite eines Internet Providers"}, 
        		"Die erste Seite eines Internetangebots"));
       
        questions1.add(new Question("Erklären Sie ein Intranet, wie es heutzutage vom Verwender anwendungstechnisch benutzt wird?", 
        		new String[]{"Netzwerke die in permanenter Verbindung stehen", "Das Netzwerk innerhalb einer Stadt", "Das Netzwerk innerhalb eines Landes", "Die Webstrukturen eines firmeninternen Netzwerkes"}, 
        		"Die Webstrukturen eines firmeninternen Netzwerkes"));
        
        questions1.add(new Question("Welche Software wird umgangssprachlich als Web-Software bezeichnet?", 
        		new String[]{"Software, welche nur einen Browser benötigt", "Das Netzwerk innerhalb einer Stadt", "Software, die mit Programmiersprache PHP geschrieben ist", "Software, welche nur Microsoft Silverlight benötigt"}, 
        		"Software, welche nur einen Browser benötigt"));
       
        questions1.add(new Question("Was bewirkt die Taste [ F11 ] beim Browser Firefox?", 
        		new String[]{"Fenster aktualisieren","Vollbildansicht", "Hilfe", "Das Netzwerk innerhalb einer Stadt"}, 
        		"Vollbildansicht"));

        questions1.add(new Question("Welche URL-Adresse ist richtig?", 
        		new String[]{"http:www.trainy.de", "http://www.bfw-training.de", "http://www.t.com", "http:\\www.pct.de"}, 
        		"http://www.bfw-training.de"));
        
        questions1.add(new Question("Was bedeutet folgende URL: http://192.168.176.1/cobol:6018?", 
        		new String[]{"Numersche Adresse des Internet Service Provider (ISP)","Der Zugang zu einer der 6018 Internet-Bank Filialen", "Webspace auf einem numerisch dezidierten Gerät mit Port 6018", "Zahlenkombination einer geschützten Seite mit Hashtag 6018"}, 
        		"Numersche Adresse des Internet Service Provider (ISP)"));
        
        questions1.add(new Question("Welche Möglichkeiten stehen Ihnen für die Navigation zwischen den Webseiten zur Verfügung?", 
        		new String[]{"Browser-Objekte, CSI-Objekte, URL-Zeichenketten", "Hyperlinks, Cursortasten, Arrowshares", "Hyperlinks, Browser-Schaltflächen, URL-Bezeichner", "Shareordner, Browser-Objekte, URI-Info"}, 
        		"Hyperlinks, Browser-Schaltflächen, URL-Bezeichner"));
        
        questions1.add(new Question("Wie drucken Sie den markierten Text aus, wenn die Webseite selbst kein Drucksymbol bietet \"Firefox\"?", 
        		new String[]{"Über die Tasten [Alt]+[F4]","Über die Tasten [Strg]+[D]", "Über die Tasten [AltGr]+[Druck]", "Über das Drucksymbol des Browsers"}, 
        		"Über das Drucksymbol des Browsers"));

        questions1.add(new Question("Wie werden auf Internetseiten markierte Links ohne Maus angesteuert?", 
        		new String[]{"über die [ Leer ]-Taste", "über die [ TAB ]-Taste", "über die [ Bild ]-Taste", "über die [ Cursor ]-Tasten"}, 
        		"über die [ TAB ]-Taste"));
        
        questions1.add(new Question("Wie wird dem Browserverlauf der Link einer Webseite hinzugefügt?", 
        		new String[]{"Zuletzt besuchte Seite wird automatisch hinzugefügt","<addsth> am Kopf in den HTML-Code der Seite einfügen", "Menü od. Symbol Verlauf anklicken und hinzufügen", "Autoverlauf trägt nach 20ter Seitenbenutzung den Link ein"}, 
        		"Zuletzt besuchte Seite wird automatisch hinzugefügt"));
        
        questions1.add(new Question("Welche Erklärung beschreibt den Begriff RSS richtig?", 
        		new String[]{"Sicherer Dienst zum Online-Shopping", "Sicherer Online-Bezahldienst", "Service um über Aktualisierungen den Überblick zu behalten", "Nachrichtenverwaltungvon Outlook"}, 
        		"Service um über Aktualisierungen den Überblick zu behalten"));
        
        questions1.add(new Question("Was sind Newsgroups?", 
        		new String[]{"Klatsch- und Tratsch- Seiten im Internet", "Netzwerke für Medienvertreter", "Interessengruppen im Internet", "Nachrichten-Bezahldienst im Internet"}, 
        		"Interessengruppen im Internet"));

        questions1.add(new Question("In welchem Zustand übermittelt Ihr Browser beispielsweise Kreditkartendaten sicher?", 
        		new String[]{"Nur Daten die gesichert u. verschlüsselt Übermittelt werden", "Wenn die Web-Seite ein Sicherheitslogo hat", "Wenn ich mich vorher telefonisch absichere", "ber Methoden die nicht der 2FA oder MFA entsprechen"}, 
        		"Nur Daten die gesichert u. verschlüsselt Übermittelt werden"));
        
        questions1.add(new Question("Welche eMail hat für die Dömäne bfw-clumpuz.de die richtige Syntax?", 
        		new String[]{"josef@gelder.bfw-clumpuz.de","josef.gelder@bfw-clumpuz.de", "josef.gelder§bfw-clumpuz.de", "bfw-clumpuz@josefgelder.de"}, 
        		"josef.gelder@bfw-clumpuz.de"));
        
        questions1.add(new Question("Welche Erklärung des Begriffs: HTML ist richtig?", 
        		new String[]{"Hyper Text Markup Link", "Hypen Typ Markup Link ersetzt die offizielle Sprache lt. W3C", "Sprache um Informationen im Browser lesbar darzustellen", "Abkürzung für die Datenübertragung via HTM-Line laut W3C"}, 
        		"Sprache um Informationen im Browser lesbar darzustellen"));
        
        questions1.add(new Question("Welche Erklärung über die allgemeine Bedeutung von Software-Viren ist richtig?", 
        		new String[]{"Viren sind die Gegenstücke von Bakterien", "Viren sind elektronische Schadprogramme", "Viren ändern ausschließlich PC-Hardware", "Viren infinzieren hauptsächlich Internet-Benutzer"}, 
        		"Viren sind elektronische Schadprogramme"));
        
        questions1.add(new Question("Nennen Sie die Bedeutung des Begriffs: Protokoll im Zusammenhang mit dem Internet?", 
        		new String[]{"Zusammenfassung aller erhobenen Daten einer IT-Sitzung", "Übersicht über das Datenvolumen des Datentransfer", "Zusammenfassung der Datenübertragungsinfo nach dem Download", "Regeln für die Datenübertragung im Internet"}, 
        		"Regeln für die Datenübertragung im Internet"));
        
        questions1.add(new Question("Was findet Google, wenn Sie den Suchalgoritmus allinurl:psychologie anwenden?", 
        		new String[]{"Alle Seiten mit dem Begriff psychologie in der Kopfzeile", "Alle Seiten die den Begriff psychologie im Text enthalten", "Alle Seiten die den Begriff psychologie im Titel haben", "Alle Seiten mit dem Begriff psychologie in der Webadresse"}, 
        		"Alle Seiten mit dem Begriff psychologie in der Webadresse"));

        questions1.add(new Question("Wie nennt sich die Datei des Webservers Apache, in der Sie Konfigurationen ändern können??", 
        		new String[]{"httpd.conf", ".htaccess", "html.conf", "apache.conf"}, 
        		"httpd.conf"));
        
        questions1.add(new Question("Wie nennt man ein webbasiertes System, welches RDBMS gestützt, Waren im Internet anbietet?", 
        		new String[]{"Learning-Management-System", "E-Commerce-Shop-Systeme","Enterprise-Collaboration-System", "Content-Management-System"}, 
        		"E-Commerce-Shop-Systeme"));
        
        questions1.add(new Question("Wie heißt ein webbasierte System, das RDBMS gestützt, multimediale Inhalte im Web darstellt?", 
        		new String[]{"Enterprise-Collaboration-System", "E-Commerce-Shop-Systeme", "Content-Management-System", "Learning-Management-System"}, 
        		"Content-Management-System"));
        
        questions1.add(new Question("Zeigen Sie die richtigen Grundanforderungen an ein Trouble Ticket System auf?", 
        		new String[]{"Polarisierung, Colloboration, Dokumentation", "Priorisierung, Äquinoktiumation, Korrelation", "Priorisierung, Dokumentation, Korrelation", "Priorisierung, Dokumentation, Subsomarität"}, 
        		"Priorisierung, Dokumentation, Korrelation"));
        
        questions1.add(new Question("Zeigen Sie die richtigen Arten der Anforderung an ein Content-Management-System auf?", 
        		new String[]{"Statische- , Hybride-, Halbstatische- und Volldynamische Systeme", "Alle Prozess nach der ZAMUK-Methode sind gültig", "Analytisch, Operativ, Kommunikativ, Kollaborativ", "Analytisch Operative Systeme, Kommunikativ, Korporations Systeme"}, 
        		"Statische- , Hybride-, Halbstatische- und Volldynamische Systeme"));

        questions1.add(new Question("Was versteht man unter einem volldynamischen CMS?", 
        		new String[]{"Jeder Webseitenaufruf über W3C erzeugt dynamisch Dokumente", "Jedes CM-System hat zwingend volldynamische Web-Dokumente", "Jeder Webseitenaufruf erzeugt dynamisch die Web-Dokumente", "Volldynamische Dokumente können im Web nicht erzeugt werden"}, 
        		"Jeder Webseitenaufruf erzeugt dynamisch die Web-Dokumente"));
        
        questions1.add(new Question("Wie heißen webbasierte Systeme, die Erfahrungen u. gemeinschafts Wissen sammeln u. archivieren?", 
        		new String[]{"HTM - Software", "WIKI - Software", "CRM - Software", "ERP - Software"}, 
        		"WIKI - Software"));
        
        questions1.add(new Question("Wie heißen webbasierte Systeme, die Kundenbeziehung in den Focus rücken?", 
        		new String[]{"WIKI - Software", "HRM- Software", "ERP - Software", "CRM - Software"}, 
        		"CRM - Software"));

        questions1.add(new Question("Was versteht man unter einem webbasierten CRM- System für Unternehmen?", 
        		new String[]{"Gemeinschaftlich Erstellen, Bearbeiten u. org. von Infos", "Aufgaben rechtzeitig u. bedarfsgerecht planen u. steuern", "Ein Fallbearbeitungssystemfür eingehende Kundenanfragen", "Systematische Gestaltung von Kundenbeziehungsprozessen"}, 
        		"Systematische Gestaltung von Kundenbeziehungsprozessen"));
        
        questions1.add(new Question("Wie heißt der Ordner des Apache-Standardverzeichnisses für darzustellende Webseiten/Systeme?", 
        		new String[]{"/htmldocs", "/apachedocs","/httpdocs", "/htdocs"}, 
        		"/htdocs"));
        
        questions1.add(new Question("Wie muss die Apache-Standarddatei heißen, damit die Homepage der Website aufgerufen wird?", 
        		new String[]{"index.html", "homepage.html", "index.xml", "default.asp"}, 
        		"index.html"));
        
        questions1.add(new Question("Welcher Kategorie kann ein CRM System angehören?", 
        		new String[]{"Analytisch, Kollaborativ, Operativ, Kommunikativ", "Kollaborativ, Obstruktiv, Synergistisch, Analytisch", "Jedes Customer Relationship Management ist kollaborative", "Diese Einteilung gibt es nicht"}, 
        		"Analytisch, Kollaborativ, Operativ, Kommunikativ"));
        
        questions1.add(new Question("Was koordiniert die ICANN in Verbindung mit Domänen?", 
        		new String[]{"Eintragung von Protokollnummern", "Standort des Information Awareness Office", "Die Vergabe von einmaligen Namen und Adressen im Internet", "Schafft den Rechtsrahmen für Betriebe mit deutscher TLD"}, 
        		"Die Vergabe von einmaligen Namen und Adressen im Internet"));
        
        
        questions1.add(new Question("Welche Vergaberichtlinien sind bei ccTLD’s unter anderem zu berücksichtigen?", 
        		new String[]{"Interessen des MILNET", "Rechte der ICANN und IANA", "Grundlagen der ARPA Richtlinien", "Internetcommunity u. staatliche Interessen, nationales Recht"}, 
        		"Internetcommunity u. staatliche Interessen, nationales Recht"));

        questions1.add(new Question("Zeigen Sie die Verwaltungsstellen welche neben dem Eigener selbst vorhanden sein müssen?", 
        		new String[]{"Admin-C; Tech-C; Zone-C -Verwalter", "Die Verwaltungsstellen werden nur von ARPA festgelegt", "Es gibt nur die Verwaltungsstele des Eigners", "Admin-A; Tech-B; Zone-C -Verwalter"}, 
        		"Admin-C; Tech-C; Zone-C -Verwalter"));
        
        questions1.add(new Question("Welche Aufgabe hat ein Root-Server (Root-Zone) im Namensraum des Internets?", 
        		new String[]{"Zur Verwaltung der Namenräume ist kein zentral System nötig", "Die Root-Zone markiert die höchte Ebene im Namensraum (DNS)", "Verifiziert alle DNS-Server aller Provider im Internet", "Zur Verwaltung der Namenräume ist kein zentral System nötig"}, 
        		"Die Root-Zone markiert die höchte Ebene im Namensraum (DNS)"));
        
        questions1.add(new Question("Wie nennt man die höchste Instanz welche Registrare für Internet-Domänen akkreditieren kann?", 
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
