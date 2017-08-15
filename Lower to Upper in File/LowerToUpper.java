import java.io.*;
class LowerToUpper{
	public static void main(String args[]){
		if(args.length<1){
			System.out.print("File not known");
			System.exit(0);
		}
		if(args.length>1){
			System.out.print("Too many files");
			System.exit(0);
		}
		File f = new File(args[0]);
		if(!f.exists()){
			System.out.print("Source file \""+args[0]+"\" does not exist");
			System.exit(0);
		}
		try{
			FileInputStream fis = new FileInputStream(f);
			File temp = new File("temp.txt");
			FileOutputStream fos = new FileOutputStream(temp);
		
			int ch;
			char c;
			while((ch=fis.read())!=-1){
				c = (char)ch;
				if(Character.isLowerCase(c))
					c = Character.toUpperCase(c);
				fos.write(c);
			}
			fis.close();
			fos.close();
			f.delete();
			temp.renameTo(f);
		}
		catch(Exception e){
			System.out.println("Error - "+e.getMessage());
		}

	}
}