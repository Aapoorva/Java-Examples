import java.util.*;
class NewStack {
	private Vector v;

	public NewStack(){
		v = new Vector();
	}
	public void push(Object o){
		v.add(o);
	}
	public Object pop() throws UnderFlowException{
		if(v.size()<=0){
			throw new UnderFlowException("Empty Stack");
		}

		Object o = v.lastElement();
		v.remove(v.size()-1);

	//.....alternative...................

		//Object o = v.get(v.size()-1);
		//v.setSize(v.size()-1);

		return o;
	}
	public boolean empty(){
		if(v.size()==0)
			return true;
		return false;
	}
}