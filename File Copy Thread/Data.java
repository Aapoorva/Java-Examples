import java.util.*;
class Data{
	private Vector v;
	private boolean empty;
	private boolean emptyFile;

	public Data(){
		v = new Vector();
		empty = true;
		emptyFile = false;
	}

	synchronized public void storeData(int ch){
			v.add(ch+"");
			empty = false;
			notify();     //there might be case that other file thread is also waiting
	}
	synchronized public int getData(){
		int ch;

		while(empty){
			try{
				wait();
			}
			catch(Exception e){
				System.out.println("ERROR in Data : "+e.getMessage());
			}
		}
		ch = Integer.parseInt(v.firstElement().toString());
		v.remove(v.indexOf(v.firstElement()));
		return ch;
	}
}