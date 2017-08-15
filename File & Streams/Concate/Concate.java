import java.io.*;
class Concate{
	public static void main(String args[]){
		if(args.length<2){
			System.out.print("File Parameters missing");
			System.exit(0);
		}
		File f[] = new File[args.length-1];
		for(int i=0;i<args.length-1;i++){
			f[i] = new File(args[i]);
			if(!f[i].exists()){
				System.out.print("Source file \""+args[i]+"\" does not exist");
				System.exit(0);
			}
		}
		try{
			FileInputStream fis[] = new FileInputStream[args.length-1];
			for(int i=0;i<args.length-1;i++)
				fis[i] = new FileInputStream(f[i]);
			File des = new File(args[args.length-1]);
			FileOutputStream fos = new FileOutputStream(des);
			int ch;
			char c;
			for(int i=0;i<args.length-1;i++){
				while((ch=fis[i].read())!=-1){
					c = (char)ch;
					fos.write(c);
				}
				fis[i].close();
			}
			fos.close();
		}
		catch(Exception e){
			System.out.println("Error - "+e.getMessage());
		}

	}
}