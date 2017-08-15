import java.io.Console;
class One extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("in ONE");
			if(i==5)
				yield();
		}
	}
}

class Two extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("in Two");
			try{
			if(i==5)
				sleep(1000);
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}

		}
	}
}
class Three extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("in Three");
			Console con = System.console();
			if(i==5){
				System.out.println("Choose y/s");
				String s = con.readLine();
				if(s.equals("y"))
					yield();
				if(s.equals("s"))
					try{
						sleep(3000);
					}
					catch(Exception e){
						System.out.println(e.getMessage());
					}
			}

		}
	}
}

class Four extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("in Four");
			if(i==5){
				setName("Thread Four1");
				System.out.println("Current Thread is : " + currentThread());
			}
		}

		Thread.currentThread().setName("Thread Four2");
		System.out.println("Current Thread is : " + Thread.currentThread());
	}
}
class Five extends Thread{
	public void run(){
		One o = new One();
		o.start();
		for(int i=0;i<10;i++)
			System.out.println("in Five");
	}
}