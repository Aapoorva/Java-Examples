class One extends Thread{
	public void run(){
		for(int i=0;i<10;i++)
			System.out.println("in ONE");
	}
}

class Two extends Thread{
	public void run(){
		for(int i=0;i<10;i++)
			System.out.println("in Two");
	}
}
class Three extends Thread{
	public void run(){
		for(int i=0;i<10;i++)
			System.out.println("in Three");
	}
}