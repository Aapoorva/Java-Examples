class HoldInteger{
	private int sharedInt;
	private boolean empty;

	public HoldInteger(){
		sharedInt = 0;
		empty = true;
	}

	synchronized public void setSharedInt(int i){
		while(!empty){
			try{
				wait();
			}
			catch(InterruptedException e){
				System.out.println("Error in setSharedInt : "+e.getMessage());
			}
		}
		sharedInt = i;
		empty = false;
		notify();
	}

	synchronized public int getSharedInt(){
		while (empty) {
			try{
				wait();
			}
			catch(InterruptedException e){
				System.out.println("Error in setSharedInt : "+e.getMessage());
			}
		}
		empty = true;
		notify();
		return sharedInt;
	}
}