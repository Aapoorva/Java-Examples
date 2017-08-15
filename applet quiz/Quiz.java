import java.awt.*;
class Quiz{
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setSize(400,300);

		Panel p1 = new Panel(new BorderLayout());
		Label l_ques = new Label("Q. Capital of Rajasthan ?");
		p1.add(BorderLayout.SOUTH,l_ques);

		Panel p2 = new Panel(new GridLayout(4,1));

		Panel p_a = new Panel(new FlowLayout(FlowLayout.LEFT));
		Label l_a = new Label("A");
		p_a.add(l_a);
		Checkbox a = new Checkbox(" Jodhpur");
		p_a.add(a);
		p2.add(p_a);

		Panel p_b = new Panel(new FlowLayout(FlowLayout.LEFT));
		Label l_b = new Label("B");
		p_b.add(l_b);
		Checkbox b = new Checkbox(" Ajmer");
		p_b.add(b);
		p2.add(p_b);

		Panel p_c = new Panel(new FlowLayout(FlowLayout.LEFT));
		Label l_c = new Label("C");
		p_c.add(l_c);
		Checkbox c = new Checkbox(" Jaipur");
		p_c.add(c);
		p2.add(p_c);

		Panel p_d = new Panel(new FlowLayout(FlowLayout.LEFT));
		Label l_d = new Label("D");
		p_d.add(l_d);
		Checkbox d = new Checkbox(" Kota");
		p_d.add(d);
		p2.add(p_d);

		Panel p3 = new Panel(new GridLayout(1,5));
		p3.add(new Label());
		Button b_prev = new Button("Previous");
		p3.add(b_prev);
		p3.add(new Label());
		Button b_next = new Button("Next");
		p3.add(b_next);
		p3.add(new Label());


		f.add(BorderLayout.NORTH,p1);
		f.add(BorderLayout.WEST,new Label());
		f.add(BorderLayout.CENTER,p2);
		f.add(BorderLayout.SOUTH,p3);
		f.setVisible(true);
	}
}