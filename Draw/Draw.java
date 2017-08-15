import java.awt.*;
import java.awt.event.*;

class Draw implements MouseMotionListener {

	Frame f;
	int x,y,prex,prey,i;

	public Draw(){
		f = new Frame();
		f.setSize(500,500);
		f.addMouseMotionListener(this);
		f.setVisible(true);
	}

	public void mouseDragged(MouseEvent e){
		Graphics g = f.getGraphics();
		x = e.getX();
		y = e.getY();
		if(i==0){
			prex = x-1;
			prey = y-1;
			i = 1;
		}
		g.setColor(Color.black);
		g.drawLine(prex,prey,x,y);
		prex = x;
		prey = y;
	}

	public void mouseMoved(MouseEvent e){
		i = 0;
	}

	public static void main(String[] args){
		Draw draw = new Draw();
	}
}