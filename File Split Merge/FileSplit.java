import java.io.*;
class FileSplit{
	public static void main(String args[]) throws IOException{
		
		Console con = System.console();
		System.out.println("Enter FILE to be split");
		String s = con.readLine();
		File f = new File(s);
		if(!f.exists()){
			System.out.println("Source file \" "+s+" \"does not exist");
			System.exit(0);
		}
		System.out.println("Enter max size of file");
		int maxSize = Integer.parseInt(con.readLine());
		
		int n = (int)(Math.ceil(f.length()/(double)maxSize));

		FileInputStream fis = new FileInputStream(f);
		BufferedInputStream bis = new BufferedInputStream(fis);

		FileOutputStream fos;
		BufferedOutputStream bos;
		File file;

		int ch;
		String filename;
		for(int i=1;i<=n;i++){
			filename = i+s;
			file = new File(filename);
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos,maxSize-1);
			while((file.length()<maxSize-1)&&(ch=bis.read())!=-1){
				bos.write(ch);
			}
			bos.close();
		}
		bis.close();
		f.delete();
		System.out.print("FILE IS SPLIT");
	}
}