import java.io.*;
class ReadFile implements Runnable{

	private FileInputStream fis;
	private StreamTokenizer st;
	private double sum;

	public ReadFile(FileInputStream f){
		fis = f;
		st = new StreamTokenizer(fis);
	}

	public void run(){
		
		try{
			while(st.nextToken() != StreamTokenizer.TT_EOF){
				if(st.ttype != StreamTokenizer.TT_NUMBER)
					continue;
				sum+=st.nval;
			}
		}
		catch(Exception e){
			System.out.println("ERROR in ReadFile: "+e.getMessage());
		}
	}
	
	public double getSum(){
		return sum;
	}
}