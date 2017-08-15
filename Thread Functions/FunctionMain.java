class FunctionMain{
	public static void main(String[] args) {

		Two t = new Two();
		//t.setPriority();
		t.start();

		System.out.println("In Main - One");

		Three th = new Three();
		th.setPriority(10);
		th.start();

		One o = new One();
		System.out.println(o.getPriority());
		o.setPriority(8);
		o.start();
		if(o.isAlive())
			System.out.println("One is Alive");

		Four f = new Four();
		f.setPriority(6);
		f.start();

		System.out.println("Current Thread is : "+Thread.currentThread());

		Five fi = new Five();
		fi.setPriority(6);
		System.out.println("in Five setting to Daemon");
		fi.setDaemon(true);
		fi.start();

		try{
			th.join(2000);	//wait for three to be dead for 500 milisec

			//th.join();	//stop main's further execution until three is dead
		}
		catch(InterruptedException e){
			System.out.println("Error in join : "+e.getMessage());
		}

		System.out.println("Number of active threads : " + Thread.activeCount());

		for(int i=0;i<10;i++)
			System.out.println("In Main");
	}
}