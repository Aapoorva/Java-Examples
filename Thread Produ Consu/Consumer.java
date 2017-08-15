class Consumer extends Thread{
	private HoldInteger cHold;

	public Consumer(HoldInteger h){
		cHold = h;
	}

	public void run(){
		int a = cHold.getSharedInt();
		System.out.println("Consumer got <- " + a);
		while (a!=10) {
			try{
				sleep(500);
			}
			catch(InterruptedException e){
				System.out.println("Error : "+e.getMessage());
			}
			a = cHold.getSharedInt();
			System.out.println("Consumer got <- " + a);
		}
	}
}