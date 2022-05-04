package extras;


import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import sun.org.mozilla.javascript.internal.GeneratedClassLoader;

public class JOptionPane1 {
	
	
	
	    /*public mensaje()
	     {
		  mag();		
	      }*/ 
	     
		  public static void main(String[] a) {
		
			  //Icon = new ImageIcon(GeneratedClassLoader);
		    String[] choices = { "Reporte Donativos", "Reporte Donaciones", "Reporte Consumo"};
		    String input = (String) JOptionPane.showInputDialog(null, "Seleccione",
		        "Elige el Reporte a Imprimir", JOptionPane.QUESTION_MESSAGE, null, // Use
		                                                                           // default
		                                                                           // icon
		        choices, // Array of choices
		        choices[1]); // Initial choice
		    System.out.println(input);
		  }
		  
		  
		  public void mag()
		  {
			  
				
		  }
			
		}



//JOptionPaneT

//Input Pop-Ups : JOptionPane Dialog « Swing « Java Tutorial


//http://www.java2s.com/Tutorial/Java/0240__Swing/UsingJOptionPanewithapredefinedselections.htm