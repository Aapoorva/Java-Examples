class Producer extends Thread{
	private HoldInteger pHold;

	public Producer(HoldInteger h){
		pHold = h;
	}

	public void run(){
		for (int i=0;i<=10;i++) {
			pHold.setSharedInt(i);
			System.out.println("Producer assigned -> "+i);
			try{
				sleep(500);
			}
			catch(InterruptedException e){
				System.out.println("Error : "+e.getMessage());
			}
		}
	}
} 