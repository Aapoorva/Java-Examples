package finance;
public class Money{
	private int rs,paisa;
	public Money(){
	}
	public Money(int rs,int paisa){
		this.rs = rs;
		this.paisa = paisa;
	}
	public Money(Money m){
		rs = m.rs;
		paisa = m.paisa;
	}
	public void show(){
		System.out.println("Money = Rs."+rs+"."+paisa);
	}
}