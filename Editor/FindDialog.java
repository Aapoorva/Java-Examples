import java.awt.*;
import java.awt.event.*;
class FindDialog extends Dialog implements ActionListener{

	Panel p,p1;
	CloseOptionWindow cow;
	TextField tf_find,tf_replace;
	Button b_close,b_findNext;
	public FindDialog(Frame parent,String title){
		super(parent,title,true);
		if(title.equals("Find")){
			p = new Panel(new GridLayout(5,1));
			// p.addWindowListener(cow);

			p.add(new Label("Find"));

			tf_find = new TextField();
			p.add(tf_find);
			p.add(new Label());

			p1 = new Panel(new GridLayout(1,5));
			p1.add(new Label());
		
			b_findNext = new Button("Find Next");
			b_findNext.addActionListener(this);
			p1.add(b_findNext);
			p1.add(new Label());
			b_close = new Button("Close");
			b_close.addActionListener(this);
			p1.add(b_close);
			p1.add(new Label());

			p.add(p1);
			add(p);
			setSize(400,250);
			setVisible(true);
		}
	}

	public void actionPerformed(ActionEvent e){

	}
}