import java.io.*;
class ReadFileSum{
	public static void main(String args[]) throws Exception{

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
		int n = file.length;
		FileInputStream fis;
		ReadFile rf[] = new ReadFile[n];
		Thread t;
		try{
			for(int i=0;i<file.length;i++){
				fis = new FileInputStream(file[i]);
				rf[i] = new ReadFile(fis);
				t = new Thread(rf[i]);
				t.start();
			}
		}
		catch(Exception e){
			System.out.println("ERROR in main: "+e.getMessage());
		}
		while(Thread.activeCount()!=1){
			//this is used to insure all threads are dead before we get value of sum
		}
		double sum = 0;
		for(int i=0;i<file.length;i++)
			sum+=rf[i].getSum();

		File OutputDirectory = new File("Output");
		if(!OutputDirectory.exists())
			OutputDirectory.mkdir();

		String result = sum + "";
		char ch[] = result.toCharArray();
		//File r = new File("Result.txt");
		FileOutputStream fos = new FileOutputStream(OutputDirectory.getPath()+"\\Result.txt");
		for(int i=0;i<ch.length;i++)
			fos.write((int)ch[i]);
	}
}