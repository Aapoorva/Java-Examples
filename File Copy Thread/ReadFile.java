import java.io.*;
class ReadFile extends Thread{

	private FileInputStream fis;
	private Data rData;

	public ReadFile(Data d,FileInputStream f){
		fis = f;
		rData = d;
	}

	public void run(){
		int ch;
		//System.out.println("Read started");
		try{
			while((ch=fis.read())!=-1){
		//		System.out.println("Read : "+(char)ch);
				rData.storeData(ch);
			}
			rData.storeData(ch);
		//	System.out.println("Read ended");
		}
		catch(Exception e){
			System.out.println("ERROR in ReadFile: "+e.getMessage());
		}
	}
}