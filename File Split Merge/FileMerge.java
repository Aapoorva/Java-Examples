import java.io.*;
class FileMerge{
	public static void main(String args[])throws IOException{

		Console con = System.console();
		System.out.println("Enter FILE to be retrived");
		String s = con.readLine();
		
		FileOutputStream fos = new FileOutputStream(s);
		BufferedOutputStream bos = new BufferedOutputStream(fos);

		FileInputStream fis;
		BufferedInputStream bis;
		File f;

		String filename;
		int ch;
		for(int i=1;;i++){
			filename = i+s;
			f = new File(filename);
			if(!f.exists())
				break;
 
			fis = new FileInputStream(f);
			bis = new BufferedInputStream(fis);

			while((ch=bis.read())!=-1)
				bos.write(ch);
			bis.close();
			f.delete();
		}
		bos.close();
		System.out.print("FILE MERGED");
	}
}