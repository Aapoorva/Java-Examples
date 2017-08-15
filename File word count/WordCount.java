import java.io.*;
import java.util.*;
class WordCount{
	public static void main(String args[]) throws Exception{

		Console con = System.console();

		System.out.println("Enter Filename");
		String file_s = con.readLine();
		File f = new File(file_s);
		if(!f.exists()){
			System.out.println("File does not exists");
			System.exit(10);		//check
		}
	
		FileInputStream fis = new FileInputStream(f);
	//	StreamTokenizer st = new StreamTokenizer(fis);		//deprecated
		BufferedInputStream bis = new BufferedInputStream(fis);
		StreamTokenizer st = new StreamTokenizer(bis);		//check	//deprecated

		HashMap map = new HashMap();
		String s = null;
		int count;
		while(st.nextToken()!=StreamTokenizer.TT_EOF){
			
			count = 0;
			switch(st.ttype){
				case StreamTokenizer.TT_WORD:
							s =  st.sval;
							break;
				case StreamTokenizer.TT_NUMBER:
							Double d = new Double(st.nval);
							s = d.toString();
							break;
				case StreamTokenizer.TT_EOL:
							continue;
				default:
					Character c = new Character((char)st.ttype);
					s = c.toString();
			}
			if(map.get(s)!=null)
				count = (Integer)map.get(s);
			count++;
			map.put(s,count);
		}
		Set set = map.keySet();
		Iterator iter = set.iterator();
		String w;
		System.out.println(".........Word list.........");
		while(iter.hasNext()){
			w = (String)iter.next();
			System.out.println(w+"\t"+map.get(w));
		}
	}
}