import java.awt.*;
import java.awt.event.*;
import java.util.*;
class Calculator implements ActionListener{

	Frame f;
	TextField tf;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
	Button b_plus,b_minus,b_mul,b_clear,b_divide,b_equal;
	Panel p;
	String s,n;
	int temp;
	boolean first_click = true;
	boolean first_digit = true;
	char sign;

	public Calculator(){
		f = new Frame();
		f.setSize(400,450);
		tf = new TextField();
		f.add(BorderLayout.NORTH,tf);
		p = new Panel(new GridLayout(4,4));

		b1 = new Button("1");
		b1.addActionListener(this);
		p.add(b1);
		b2 = new Button("2");
		b2.addActionListener(this);
		p.add(b2);
		b3 = new Button("3");
		b3.addActionListener(this);
		p.add(b3);
		b_plus = new Button("+");
		b_plus.addActionListener(this);
		p.add(b_plus);

		b4 = new Button("4");
		b4.addActionListener(this);
		p.add(b4);
		b5 = new Button("5");
		b5.addActionListener(this);
		p.add(b5);
		b6 = new Button("6");
		b6.addActionListener(this);
		p.add(b6);
		b_minus = new Button("-");
		b_minus.addActionListener(this);
		p.add(b_minus);

		b7 = new Button("7");
		b7.addActionListener(this);
		p.add(b7);
		b8 = new Button("8");
		b8.addActionListener(this);
		p.add(b8);
		b9 = new Button("9");
		b9.addActionListener(this);
		p.add(b9);
		b_mul = new Button("*");
		b_mul.addActionListener(this);
		p.add(b_mul);

		b_clear = new Button("C");
		b_clear.addActionListener(this);
		p.add(b_clear);
		b0 = new Button("0");
		b0.addActionListener(this);
		p.add(b0);
		b_divide = new Button("/");
		b_divide.addActionListener(this);
		p.add(b_divide);
		b_equal = new Button("=");
		b_equal.addActionListener(this);
		p.add(b_equal);

		f.add(p);
		f.setVisible(true);
	}



































	public void actionPerformed(ActionEvent e){

		s = e.getActionCommand();
		n = tf.getText().toString().trim();

		char c = s.charAt(0);

		if(Character.isDigit(c)){

			if(first_digit){
				n = "0";
				first_digit = false;
			}
			if(n.equals("0"));

			else
				s = n+s;
		}

		else if(s.equals("=")){

			if(first_click){//not used sign yet
				s = n;
			}
			if(!first_click){

				if(sign=='+')
					temp+=Integer.parseInt(n);
				if(sign=='*')
					temp*=Integer.parseInt(n);
				if(sign=='-')
					temp-=Integer.parseInt(n);
				try{
					if(sign=='/')
						temp/=Integer.parseInt(n);
				}
				catch(Exception e1){
					temp = 0;
				}
				sign = '\0';
				s = temp + "";
				first_click = true;		//because no sign is present
				first_digit = true;
			}

		}

		else if(s.equals("C")){

			first_digit = true;
			first_click = true;
			temp = 0;
			s = temp+"";

		}

		else{

			if(n.equals(""))
				n = "0";

			if(first_click){		//not used sign yet

				temp = Integer.parseInt(n);
				sign = c;
				first_click = false;
			}

			else if(!first_click){

				if(sign=='+')
					temp+=Integer.parseInt(n);
				if(sign=='*')
					temp*=Integer.parseInt(n);
				if(sign=='-')
					temp-=Integer.parseInt(n);
				try{
					if(sign=='/'){
						temp/=Integer.parseInt(n);
					}
				}
				catch(Exception e1){
					temp = 0;
				}
				sign = c ;
			}
				first_digit = true;

				s = temp+"";
		}

			System.out.println("temp = "+temp);
			System.out.println("sign = "+sign);
			System.out.println("first click = "+first_click);
			System.out.println("first digit = "+first_digit);
			
			tf.setText(s);
	}

































	public static void main(String[] args)  {
		
		Calculator calc = new Calculator();

	}
}