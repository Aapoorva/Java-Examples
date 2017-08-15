import java.io.*;
class FileFunctions{

	public static void main(String args[]){
		File f1 = new File("C:\\Users\\USER\\Desktop\\New folder\\A.txt");
		File f2 = new File("C:\\Users\\USER\\Desktop\\New folder\\New");
		File f3 = new File("C:\\Users\\USER\\Desktop\\New folder\\New\\C.txt");
		if(f1.exists() && f1.isFile()){
			System.out.println(f1.length());
			System.out.println(f1.getName());
			System.out.println(f1.getParent());
			System.out.println(f1.getPath());
		}
		else
			try{
				f1.createNewFile();
			}
			catch(IOException e){
				System.out.println(e.getMessage());
			}
		
		if(f2.exists() & f2.isDirectory()){
			System.out.println(f2.length()); // returns ZERO in case of folder or empty file
			System.out.println(f2.getName());
			System.out.println(f2.getParent());
			System.out.println(f2.getPath());

			String []file;
			file = f2.list();		// returns NULL in case of file or empty folder
			for(int i=0;i<file.length;i++)
				System.out.println(file[i]);

			File []files;
			files = f2.listFiles();
			System.out.println("\n");
			for(int i=0;i<file.length;i++){
					// System.out.println(files[i]);   // returns PATHNAME of file or folder
				if(files[i].isFile())
					System.out.println(files[i].getName()+"\t"+files[i].length());
				if(files[i].isDirectory())
					System.out.println(files[i].getName()+"\t<Folder>");
			}
			
		//	files[4].renameTo(f3);
		//	files[5].renameTo(f3);
		}
		else
			f2.mkdir();
	}
}