import java.awt.*;

class DivideFrame{
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setLayout(new GridLayout(2,2));
		f.setSize(600,600);

		GridLayout gl_r2 = new GridLayout(2,1);
		GridLayout gl_r3 = new GridLayout(3,1);
		GridLayout gl_c2 = new GridLayout(1,2);
		GridLayout gl_c3 = new GridLayout(1,3);

		Panel p1 = new Panel(gl_r2);
		p1.add(new Button("1"));
		p1.add(new Button("2"));
		f.add(p1);

		Panel p2 = new Panel(gl_c3);
		p2.add(new Button("3"));
		p2.add(new Button("4"));
		p2.add(new Button("5"));
		f.add(p2);

		Panel p3 = new Panel(gl_c2);
		Panel p3_1 = new Panel(gl_r2);
		p3_1.add(new Button("6"));
		p3_1.add(new Button("7"));
		Panel p3_2 = new Panel(gl_r3);
		p3_2.add(new Button("8"));
		p3_2.add(new Button("9"));
		p3_2.add(new Button("10"));
		p3.add(p3_1);
		p3.add(p3_2);
		f.add(p3);

		Panel p4 = new Panel(gl_r2);
		Panel p4_1 = new Panel(gl_c2);
		p4_1.add(new Button("11"));
		p4_1.add(new Button("12"));
		Panel p4_2 = new Panel(gl_c3);
		p4_2.add(new Button("13"));
		p4_2.add(new Button("14"));
		p4_2.add(new Button("15"));
		p4.add(p4_1);
		p4.add(p4_2);
		f.add(p4);

		f.setVisible(true);
	}
}