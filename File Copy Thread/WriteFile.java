import java.io.*;
class WriteFile extends Thread{
	private Data wdata;
	private FileOutputStream fos;

	public WriteFile(Data d,FileOutputStream f){
		wdata = d;
		fos = f;
	}

	public void run(){
		int ch;
	//	System.out.println("Write started");
		while((ch=wdata.getData())!=-1){
			try{
	//			System.out.println("Write : "+(char)ch);
				fos.write(ch);
			}
			catch(Exception e){
				System.out.println("ERROR in WriteFile: "+e.getMessage());
			}
		}
	//	System.out.println("Write : "+ch);
	//	System.out.println("Write ended");
	}
}