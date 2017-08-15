class ExampleMain{
	public static void main(String[] args) {
		Thread t1 = new  Thread(new One());
		t1.start();
		Thread t2 = new  Thread(new Two());
		t2.start();								//check
		Thread t3 = new  Thread(new Three());
		t3.start();
		for (int i=0;i<10;i++) {
			System.out.println("In main");
		}
	}
}