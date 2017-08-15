import java.awt.*;
import java.awt.event.*;

class DrawLines extends WindowAdapter implements MouseMotionListener{

	Frame f;
	int X = 500;
	int Y = 500;
	int x1,y1;

	public DrawLines(){
		f = new Frame();
		f.setSize(X,Y);
		f.addMouseMotionListener(this);

		f.setVisible(true);
	}

	public void mouseDragged(MouseEvent e){
		x1 = e.getX();
		y1 = e.getY();

		if(f.getSize().width!=X)
			X = f.getSize().width;

		if(f.getSize().height!=Y)
			Y = f.getSize().height;

		Graphics g = f.getGraphics();

		g.setColor(Color.red);
		g.drawLine(0,0,x1,y1);

		g.setColor(Color.blue);
		g.drawLine(0,Y-1,x1,y1);

		g.setColor(Color.green);
		g.drawLine(X-1,0,x1,y1);

		g.setColor(Color.yellow);
		g.drawLine(X-1,Y-1,x1,y1);
	}

	public void mouseMoved(MouseEvent e){
		x1 = e.getX();
		y1 = e.getY();

		if(f.getSize().width!=X)
			X = f.getSize().width;

		if(f.getSize().height!=Y)
			Y = f.getSize().height;

		Graphics g = f.getGraphics();

		g.setColor(Color.red);
		g.drawLine(0,0,x1,y1);

		g.setColor(Color.blue);
		g.drawLine(0,Y-1,x1,y1);

		g.setColor(Color.green);
		g.drawLine(X-1,0,x1,y1);

		g.setColor(Color.yellow);
		g.drawLine(X-1,Y-1,x1,y1);
	}

	public static void main(String[] args) {
		DrawLines dl = new DrawLines();	
	}
}