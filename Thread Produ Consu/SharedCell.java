class SharedCell{
	public static void main(String[] args) {
		HoldInteger Hold = new HoldInteger();
		Producer p = new Producer(Hold);
		Consumer c = new Consumer(Hold);
		p.start();
		c.start();
	}
}