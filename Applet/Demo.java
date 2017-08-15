import java.awt.*;
import java.applet.*;
import javax.swing.*;

public class Demo extends Applet{
	public void init(){
		Label l = new Label("Enter name",Label.LEFT);
		add(l);

		TextField tf = new TextField(20);
		add(tf);

		TextArea ta = new TextArea();
		add(ta);

		Label l2 = new Label("Choose",Label.LEFT);
		add(l2);
		Checkbox cb1 = new Checkbox("Large");
		add(cb1);
		Checkbox cb2 = new Checkbox("Medium");
		add(cb2);
		Checkbox cb3 = new Checkbox("Small");
		add(cb3);
		//add(l2);	//if we add same component 2 times then it is added 2nd time 

		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox rb1 = new Checkbox("1st",false,cbg);
		add(rb1);
		Checkbox rb2 = new Checkbox("2nd",false,cbg);
		add(rb2);
		Checkbox rb3 = new Checkbox("3rd",true,cbg);
		add(rb3);
		Checkbox rb4 = new Checkbox("4rd",false,cbg);
		add(rb4);

		Button b = new Button("Click");
		add(b);
	}
}