class One implements Runnable{
	public void run(){
		for (int i=0;i<10;i++) {
			System.out.println("In ONE");
		}
	}
}

class Two implements Runnable{
	public void run(){
		for (int i=0;i<10;i++) {
			System.out.println("In TWO");
		}
	}
}

class Three implements Runnable{
	public void run(){
		for (int i=0;i<10;i++) {
			System.out.println("In Three");
		}
	}
}