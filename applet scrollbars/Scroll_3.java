import java.awt.*;
import java.awt.event.*;
class Scroll_3 implements AdjustmentListener{

		Frame f;
		Scrollbar sb_red,sb_blue,sb_green;
		Label l,l1,l_red,l_green,l_blue;
		TextField tf_red,tf_blue,tf_green;
		Color backColour;
		int red,green,blue;

	public Scroll_3(){
		f = new Frame();
		f.setSize(400,400);
		f.setLayout(new GridBagLayout());

		GridBagConstraints gbc = new GridBagConstraints();
		Insets i = new Insets(2,2,2,2);
		gbc.gridwidth = 5;
		gbc.gridheight = 5;
		gbc.insets = i;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.BOTH;
		l = new Label();
		l.setBackground(new Color(0,0,0));
		f.add(l,gbc);
		
		gbc.gridx = 5;
		gbc.gridwidth = 1; 
		sb_red = new Scrollbar(Scrollbar.VERTICAL,0,5,0,260);	
		sb_red.setBackground(Color.red);
		sb_red.addAdjustmentListener(this);
		f.add(sb_red,gbc);

		gbc.gridx = 6;
		sb_green = new Scrollbar(Scrollbar.VERTICAL,0,5,0,260);
		sb_green.setBackground(Color.green);
		sb_green.addAdjustmentListener(this);
		f.add(sb_green,gbc);

		gbc.gridx = 7;
		sb_blue = new Scrollbar(Scrollbar.VERTICAL,0,5,0,260);
		sb_blue.setBackground(Color.blue);
		sb_blue.addAdjustmentListener(this);
		f.add(sb_blue,gbc);

		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.gridheight = 2;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		l_red = new Label("Red",Label.CENTER);
		f.add(l_red,gbc);
		gbc.gridx = 1;
		tf_red = new TextField("0");
		f.add(tf_red,gbc);
		gbc.gridx = 2;
		l_green = new Label("Green",Label.CENTER);
		f.add(l_green,gbc);
		gbc.gridx = 3;
		tf_green = new TextField("0");
		f.add(tf_green,gbc);
		gbc.gridx = 4;
		l_blue = new Label("Blue",Label.CENTER);
		f.add(l_blue,gbc);
		gbc.gridx = 5;
		tf_blue = new TextField("0");
		f.add(tf_blue,gbc);

		f.setVisible(true);
	}


	public void adjustmentValueChanged(AdjustmentEvent e){
		if(e.getSource()==sb_red){
			red = sb_red.getValue();
			tf_red.setText(red+"");
		}
		if(e.getSource()==sb_green){
			green = sb_green.getValue();
			tf_green.setText(green+"");
		}
		if(e.getSource()==sb_blue){
			blue = sb_blue.getValue();
			tf_blue.setText(blue+"");
		}

		backColour = new Color(red,green,blue);
		l.setBackground(backColour);
	}
	public static void main(String[] args) {
		
		Scroll_3 scroll = new Scroll_3();
	}
}