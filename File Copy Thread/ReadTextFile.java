import java.io.*;
class ReadTextFile{
	public static void main(String args[]){

		Console con = System.console();
		System.out.println("Enter directory name");
		String filename = con.readLine();
		File d = new File(filename);
		if(!d.exists()){
			System.out.println("Directory does not exists");
			System.exit(0);
		}
		File file[];
		file = d.listFiles();
		if(file.length==0){
			System.out.println("Directory is empty");
			System.exit(0);
		}

		File OutputDirectory = new File("Output");

		if(!OutputDirectory.exists())
			OutputDirectory.mkdir();

		FileInputStream fis;
		FileOutputStream fos;
		File f;
		Data data;
		ReadFile rf;
		WriteFile wf;
		try{
			for(int i=0;i<file.length;i++){
				data = new Data();
				fis = new FileInputStream(file[i]);
				f = new File(OutputDirectory.getPath() +"\\"+ file[i].getName());
				fos = new FileOutputStream(f);
				rf = new ReadFile(data,fis);
				wf = new WriteFile(data,fos);
				rf.start();
				wf.start();
			}
		}
		catch(Exception e){
			System.out.println("ERROR in main: "+e.getMessage());
		}
	}
}