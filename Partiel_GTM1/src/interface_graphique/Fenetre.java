package interface_graphique;


import java.awt.*;       
import java.awt.event.*;

import javax.swing.JFrame;  
 

public class Fenetre extends JFrame implements ActionListener {
   private TextField user,pssw; 
   private Button btnCnx;   
   private Fenetre2 fen;
 
   public Fenetre () {
      setLayout(new FlowLayout());
      
      user = new TextField("bevalet", 20); 
      user.setEditable(true);      
      add(user);                    
      
      pssw = new TextField("bevalet", 20);
      pssw.setBackground(Color.WHITE);
      pssw.setEditable(true);      	
      add(pssw);                    
 
      btnCnx = new Button("Connexion");   
      btnCnx.setForeground(Color.BLACK);
      add(btnCnx);                    
 
      btnCnx.addActionListener(this);
 
      setTitle("ENSUP Identification");  		
      this.setSize(600,100);
      this.setLocationRelativeTo(null);
      setVisible(true);         
 
   }

public void titreFenetre(IFenetre f) {
	System.out.println("");
} 
   
@Override
public void actionPerformed(ActionEvent e) { 
	this.dispose();
    fen = new Fenetre2();
    
}
}