package vista;

import java.awt.AlphaComposite;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

public class LabelsHover extends JLabel{

	
	private float opacidad = 1f;  //Default
	
	public LabelsHover ()
	{
		super();
		addMouseListener(new EventLabels());
	}
	
	public LabelsHover (String texto)
	{
		super(texto) ;
		addMouseListener(new EventLabels());
	}
	
	public void setOpacidad (float opacidad)
	{
		this.opacidad= opacidad;
		repaint();//para que se actualice mi control en cada opacidad
	}
	
	public float getOpacidad (float opacidad)
	{
		return this.opacidad;
	}
	
	//<--Son metodos  de acceso para poder poner el valor de opacidad
	
	@Override
	public void paintComponent (Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, opacidad));
		super.paintComponent(g2);
	}
	
	
	public class EventLabels extends MouseAdapter // Clase anidada // Representa cada evento del label
	{//SHIFT ALT S
		  
	

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		//efectHover(1f, 0.5f, 0.008f, 10,false);
		efectHover(0.3f,0.6f, 0.008f, 10,true);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		//efectHover(0.5f, 1f, 0.03f, 10,true); //(index, range, cont, sleep, event)
		//efectHover(0.5f, 1f, 0.008f, 10,true);
		efectHover(1f, 0.9f, 0.002f, 2,false);
	}
/**/
	@Override
	public void mouseExited(MouseEvent e) {//Cuando ya se hi
		// TODO Auto-generated method stub
		//efectHover(1f, 0.5f, 0.008f, 10,false);
		//efectHover(1f, 0.3f, 0.008f, 10,false);
		//efectHover(0.5f, 0.8f, 0.008f, 10,true);
	}
	
  }
	
	private void efectHover (float index, float range ,float cont,int sleep,boolean event)
	{
		new Thread(new  Runnable() {
			public void run() {
				for (float i= index;(event)?i>=range:i>=range; i = (event)?i + cont : i - cont){
					setOpacidad(i);
					try {
						Thread.sleep(sleep);
						
					} catch (InterruptedException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}	
			}
		}).start();;
	}
	
	
}

