package vista;



import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class BarraCargando extends JFrame implements ActionListener {

	
  JProgressBar pb;
  private JButton btnCancelar;

    public  BarraCargando() //Se aumento void
    {
    	
		  pb = new JProgressBar(0, 10000);
		  pb.setForeground(new Color(34, 139, 34));
		  pb.setBorderPainted(false);
		  setBounds(300, 300, 1300, 316);
		  pb.setBounds(10, 24, 799, 32);
		  pb.setValue(0);
		  pb.setStringPainted(true);
		  getContentPane().add(pb);
		  this.setSize(831, 147);
		  getContentPane().setLayout(null);
		  
		  btnCancelar = new JButton("Cancelar");
		  btnCancelar.addActionListener(this);
		  btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		  btnCancelar.setBounds(318, 67, 148, 31);
		  getContentPane().add(btnCancelar);
		  
		  this.setUndecorated(true);//Quita Borde
			
		  
		
    }
    
	public void update()
	{
		  int num=0;
			  
		  while   (num < 10000) {
		  pb.setValue(num);
		  try 
		  {
		  Thread.sleep(40);
		  } 
		  catch (InterruptedException e) 
		  { 
			  e.printStackTrace();
		  }
		  num += 95;
		  }
	}

	
	public static void main(String[] arguments) {
		  BarraCargando pb = new BarraCargando();
		  //frame.pack();
		  pb.setVisible(true);
		  pb.update();
		  }
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnCancelar) {
			actionPerformedBtnCancelarOperacion(arg0);
		}
	}
	protected void actionPerformedBtnCancelarOperacion(ActionEvent arg0) {
		this.dispose();
	}
	}




		

