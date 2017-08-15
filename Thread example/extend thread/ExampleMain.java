class ExampleMain{
	public static void main(String[] args) {
		One o = new One();
		o.start();
		Two t = new Two();
		t.start();
		Three th = new Three();
		th.start();
		for(int i=0;i<10;i++)
			System.out.println("In Main");
	}
}