import java.io.*;
class Count{
	public static void main(String args[]){
		if(args.length<1){
			System.out.print("FilePath not given");
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
		int sen=0,words=0,lines=0;
		try{
			FileInputStream fis = new FileInputStream(f);		
			int ch;
			char c;
			while((ch=fis.read())!=-1){
				c = (char)ch;
				if(c == '\n')
					lines++;
				if(c == '.')
					sen++;
				if(Character.isWhitespace(c))
					words++;
			}
			fis.close();
		}
		catch(Exception e){
			System.out.println("Error - "+e.getMessage());
		}
		System.out.println("No. of words = "+words);
		System.out.println("No. of sentences = "+sen);
		System.out.println("No. of lines = "+lines);
	}
}