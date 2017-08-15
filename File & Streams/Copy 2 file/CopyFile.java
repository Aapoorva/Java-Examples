import java.io.*;
class CopyFile{
	public static void main(String args[]) throws IOException{
		if(args.length<3){
			System.out.print("Give 3 parameters");
			System.exit(0);
		}
		if(args.length>3){
			System.out.print("Too many files");
			System.exit(0);
		}
		File f1 = new File(args[0]);
		if(!f1.exists()){
			System.out.print("Source file \""+args[0]+"\" does not exist");
			System.exit(0);
		}
		File f2 = new File(args[1]);
		if(!f2.exists()){
			System.out.print("Source file \""+args[1]+"\" does not exist");
			System.exit(0);
		}
		FileInputStream fis1 = new FileInputStream(f1);
		FileInputStream fis2 = new FileInputStream(f2);
		FileOutputStream fos = new FileOutputStream(args[2]);
		
		int ch;
		while((ch=fis1.read())!=-1)
			fos.write(ch);

		fos = new FileOutputStream(args[2],true);

		while((ch=fis2.read())!=-1)
			fos.write(ch);

		fis1.close();
		fis2.close();
		fos.close();
	}
}