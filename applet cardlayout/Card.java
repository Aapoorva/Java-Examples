import java.awt.*;
import java.awt.event.*;

class Card implements ActionListener{

	Frame f;
	Panel p1,p2,p3,p4,p5,p6;
	Button b_pre,b_next;
	CardLayout cl;
	
	public Card(){
		f = new Frame();
		f.setSize(400,500);
		
		p1 = new Panel(new GridLayout(1,5));
		b_pre = new Button("Previous");
		b_next = new Button("Next");
		b_pre.addActionListener(this);
		b_next.addActionListener(this);
		p1.add(new Label());
		p1.add(b_pre);
		p1.add(new Label());
		p1.add(b_next);
		p1.add(new Label());
		
		f.add(BorderLayout.SOUTH,p1);
		cl = new CardLayout();
		p2 = new Panel(cl);
		
		p3 = new Panel(new GridLayout(4,2));
		p3.add(new Label("Name",Label.CENTER));
		p3.add(new TextField());
		p3.add(new Label("Surname",Label.CENTER));
		p3.add(new TextField());
		p3.add(new Label("Age",Label.CENTER));
		p3.add(new TextField());
		p3.add(new Label("Qualification",Label.CENTER));
		p3.add(new TextField());
		
		p4 = new Panel(new GridLayout(4,2));
		p4.add(new Label("H.no.",Label.CENTER));
		p4.add(new TextField());
		p4.add(new Label("Colony",Label.CENTER));
		p4.add(new TextField());
		p4.add(new Label("City",Label.CENTER));
		p4.add(new TextField());
		p4.add(new Label("Address",Label.CENTER));
		p4.add(new TextField());
		
		p5 = new Panel(new GridLayout(4,2));
		p5.add(new Label("Phone",Label.CENTER));
		p5.add(new TextField());
		p5.add(new Label("Mobile",Label.CENTER));
		p5.add(new TextField());
		p5.add(new Label("E Mail",Label.CENTER));
		p5.add(new TextField());
		p5.add(new Label("Fax",Label.CENTER));
		p5.add(new TextField());
		
		p6 = new Panel(new GridLayout(4,2));
		p6.add(new Label("Salary",Label.CENTER));
		p6.add(new TextField());
		p6.add(new Label("H.R.A.",Label.CENTER));
		p6.add(new TextField());
		p6.add(new Label("T.A.",Label.CENTER));
		p6.add(new TextField());
		p6.add(new Label("D.A.",Label.CENTER));
		p6.add(new TextField());
		
		p2.add(p3,"personal");
		p2.add(p4,"address");
		p2.add(p5,"contact");
		p2.add(p6,"salary");
		
		f.add(p2);
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e){
		String s = e.getActionCommand();
		if(s.equals("Next")){
			cl.next(p2);
		}
		if(s.equals("Previous"))
				cl.previous(p2);
	}
	
	public static void main(String args[]){
		Card c = new Card();	
	
	}
}