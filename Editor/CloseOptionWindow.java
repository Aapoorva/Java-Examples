import java.awt.*;
import java.awt.event.*;
class CloseOptionWindow extends WindowAdapter{

	public void windowClosing(WindowEvent e){
		Window w = e.getWindow();
		w.setVisible(false);
		w.dispose();
	}
}