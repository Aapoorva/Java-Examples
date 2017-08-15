import java.awt.*;
class Form{
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setSize(400,300);
		f.setLayout(new GridBagLayout());

		GridBagConstraints gbc = new GridBagConstraints();

		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		Label l_name = new Label("NAME");
		f.add(l_name,gbc);

		gbc.gridx = 1;
		TextField tf_name = new TextField(20);
		f.add(tf_name,gbc);

		gbc.gridx = 0;
		gbc.gridy = 1;
		Label l_password = new Label("PASSWORD");
		f.add(l_password,gbc);

		gbc.gridx = 1;
		TextField tf_password = new TextField(20);
		f.add(tf_password,gbc);

		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		gbc.ipadx = 20;
		Button b_ok = new Button("OK");
		f.add(b_ok,gbc);

		f.setVisible(true);
	}
}