import java.awt.*;
import java.awt.event.*;
import java.util.regex.*;
import java.io.*;

class Editor extends WindowAdapter implements ActionListener{

	Frame f;
	Dialog d;
	Panel p;
	TextArea ta;
	MenuBar menuBar;
	Menu menu_file,menu_edit;
	MenuItem menuItem_new, menuItem_open,menuItem_save,menuItem_saveAs,menuItem_exit,menuItem_find,menuItem_findReplace;

	CloseWindow cw;
	CloseOptionWindow cow;

	FileDialog fileDialog;
	FileInputStream fis;
	FileOutputStream fos;

	Button  b_findNext,b_close,b_replace,b_replaceAll;
	TextField tf_find,tf_replace;

	int search_start;

	String find_pre;

	boolean saved;

	public Editor(){
		f = new Frame();
		cw = new CloseWindow();
		f.addWindowListener(cw);
		f.setSize(800,600);

		ta = new TextArea();
		ta.setFont(new Font("Arial",Font.PLAIN,20));
		f.add("Center",ta);

		menuItem_new = new MenuItem("New");
		menuItem_open = new MenuItem("Open");
		menuItem_save = new MenuItem("Save");
		menuItem_saveAs = new MenuItem("Save As");
		menuItem_exit = new MenuItem("Exit");
		menuItem_find = new MenuItem("Find");
		menuItem_findReplace = new MenuItem("Find & Replace");

		menu_file = new Menu("File");
		menu_edit = new Menu("Edit");

		menuBar = new MenuBar();

		menuItem_new.addActionListener(this);
		menuItem_open.addActionListener(this);
		menuItem_save.addActionListener(this);
		menuItem_saveAs.addActionListener(this);
		menuItem_exit.addActionListener(this);
		menuItem_find.addActionListener(this);
		menuItem_findReplace.addActionListener(this);

		menu_file.add(menuItem_new);
		menu_file.add(menuItem_open);
		menu_file.add(menuItem_save);
		menu_file.add(menuItem_saveAs);
		menu_file.addSeparator();
		menu_file.add(menuItem_exit);
		menu_edit.add(menuItem_find);
		menu_edit.add(menuItem_findReplace);

		menuBar.add(menu_file);
		menuBar.add(menu_edit);

		f.setMenuBar(menuBar);


 
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e){
		String s = e.getActionCommand();

		if(s.equals("New")){
			save();
			ta.setText("");
		}
		if(s.equals("Open")){
			save();
			open();
		}
		if(s.equals("Save As")){
			saveAs();
		}
		if(s.equals("Exit")){

			save();
			f.setVisible(false);
			f.dispose();
			System.exit(1);
		}
		if(s.equals("Find")){
			find();
		}
		if(s.equals("Find Next")){
			findNext();
		}
		if(s.equals("Close")){
			d.setVisible(false);
			d.dispose();
		}
		if(s.equals("Find & Replace")){
			find_replace();
		}
		if(s.equals("Replace")){

		}
	}

	public void save(){

		if(!saved)
			saveAs();
		else if(saved){
			
			d = new Dialog(f,"Save",true);
			d.setSize(100,300);
			d.setLayout(new GridLayout(4,1));

			d.add(new Label());
			d.add(new Label("Do you wish to save?",Label.CENTER));
			Panel p = new Panel(new GridLayout(1,5));


			d.setVisible(true);

	}

	public void saveAs(){
		fileDialog = new FileDialog(f,"Save",FileDialog.SAVE);
		fileDialog.setVisible(true);

		if(!fileDialog.getFile().equals("")){
			try{
				String file = fileDialog.getDirectory() + fileDialog.getFile();
				fos = new FileOutputStream(file);
				int ch;
				StringBuffer data = new StringBuffer(ta.getText());
				for(int i=0;i<data.length();i++){
					fos.write((int)data.charAt(i));
				}
				//fos.close();
			}
			catch(FileNotFoundException e){
				System.out.println(e.getMessage());
			}
			catch(IOException e){
				System.out.println(e.getMessage());
			}
		}
		saved = true;
	}

	public void open(){
		fileDialog = new FileDialog(f,"Open",FileDialog.LOAD);
		fileDialog.setVisible(true);

		if(!fileDialog.getFile().equals("")){

			try{
				String file = fileDialog.getDirectory() + fileDialog.getFile();
				fis = new FileInputStream(file);
				int ch;
				ta.setText("");
				while((ch=fis.read())!=-1)
					ta.append((char)ch+"");
				fis.close();
			}
			catch(FileNotFoundException e){
				System.out.println(e.getMessage());
			}
			catch(IOException e){
				System.out.println(e.getMessage());
			}
		}
	}

	public void find(){

		d = new Dialog(f,"Find");
		d.setSize(400,250);
		d.setLayout(new GridLayout(5,1));
		cow = new CloseOptionWindow();
		d.addWindowListener(cow);

		d.add(new Label("Find"));

		tf_find = new TextField();
		d.add(tf_find);
		d.add(new Label());

		p = new Panel(new GridLayout(1,5));
		p.add(new Label());
		
		b_findNext = new Button("Find Next");
		b_findNext.addActionListener(this);
		p.add(b_findNext);
		p.add(new Label());
		b_close = new Button("Close");
		b_close.addActionListener(this);
		p.add(b_close);
		p.add(new Label());

		d.add(p);
			
		d.setVisible(true);
		

	}

	public void findNext(){

		String find = tf_find.getText();
		if(!find.equals("")){
			StringBuffer data = new StringBuffer(ta.getText());
			if(!find.equals(find_pre))
				search_start = 0;
			int start = data.indexOf(find,search_start);
			int end = find.length() + start;
			ta.select(start,end);
			search_start = ta.getSelectionEnd();
			find_pre = find;
			System.out.println("find = "+find);
			System.out.println("search_start = "+search_start);
		}
	}
	

	public void find_replace(){
	// 	f_find = new Frame();
	// 	f_find.setSize(400,250);
	// 	cow = new CloseOptionWindow();
	// 	f_find.addWindowListener(cow);
	// 	f_find.setLayout(new GridLayout(9,1));

	// 	f_find.add(new Label("Find"));
	// 	tf_find = new TextField();
	// 	f_find.add(tf_find);
	// 	f_find.add(new Label());

	// 	f_find.add(new Label("Replace"));
	// 	tf_replace = new TextField();
	// 	f_find.add(tf_replace);
	// 	f_find.add(new Label());

	// 	p = new Panel(new GridLayout(1,5));
		
	// 	b_findNext = new Button("Find Next");
	// 	b_findNext.addActionListener(this);
	// 	p.add(b_findNext);
	// 	b_replace = new Button("Replace");
	// 	b_replace.addActionListener(this);
	// 	p.add(b_replace);
	// 	b_replaceAll = new Button("Replace All");
	// 	b_replaceAll.addActionListener(this);
	// 	p.add(b_replaceAll);
	// 	p.add(new Label());
	// 	b_close = new Button("Close");
	// 	b_close.addActionListener(this);
	// 	p.add(b_close);

	// 	f_find.add(p);

	// 	f_find.setVisible(true);
	// }

	// public void

	}

	public static void main(String[] args) {
		Editor editor = new Editor();
	}

}