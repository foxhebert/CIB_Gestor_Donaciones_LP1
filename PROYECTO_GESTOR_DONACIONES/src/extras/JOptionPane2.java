package extras;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class JOptionPane2{

  public static void main(String[] a) {

    String msg = "<html>this is a really long message<br>this is a really long message this is a really long message this is a really long message this is a really long message this is a really long message this is a really long message";

    JOptionPane optionPane = new NarrowOptionPane();
    optionPane.setMessage(msg);
    //optionPane.setBorder(null);
    optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
    JDialog dialog = optionPane.createDialog(null, "Width 100");
    dialog.setVisible(true);
  }
}

class NarrowOptionPane extends JOptionPane {

  NarrowOptionPane() {
  }

  public int getMaxCharactersPerLineCount() {
    return 100;
  }
}

//http://www.java2s.com/Tutorial/Java/0240__Swing/UsingJOptionPanewithapredefinedselections.htm