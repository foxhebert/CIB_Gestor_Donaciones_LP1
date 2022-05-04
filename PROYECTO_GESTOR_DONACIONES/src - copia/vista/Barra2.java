package vista;


import javax.swing.*; 

public class Barra2 extends JFrame {
	
	


	JProgressBar current;
	  int num = 0;
	public Barra2() {
	  super("Progress");
	  
	  //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  JPanel pane = new JPanel();
	  setBounds(300, 300, 1029, 316);
	  //pane.setLayout();
	  //pane.setLayout(null);
	  current = new JProgressBar(0, 10000);
	  //this.add(current);
	  this.setSize(450, 90);
	  current.setBounds(804, 458, 375, 157);
	  current.setValue(0);
	  current.setStringPainted(true);
	  pane.add(current);
	  setContentPane(pane);
	  
	  //this.setUndecorated(true);//Quita Borde
	  }

	public void iterate() {
	  while (num < 10000) {
	  current.setValue(num);
	  try {
	  Thread.sleep(100);
	  } catch (InterruptedException e) { 
	    }
	  num += 95;
	  }
	  }
	public static void main(String[] arguments) {
	  Barra2 frame = new Barra2();
	  frame.pack();
	  frame.setVisible(true);
	  frame.iterate();
	  }
	  }


