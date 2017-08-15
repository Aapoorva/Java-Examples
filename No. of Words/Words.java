import java.io.*;
class Words{
	public static void main(String args[]){
		int count_a,i,count_w;
		String s1;
		char c;
		Console con = System.console();
		System.out.println("Input a sentence");
		s1 = con.readLine();
		count_a=0;
		count_w=0;
		for(i=0;i<s1.length();i++){
			c = s1.charAt(i);
			if(Character.isAlphabetic(c) || Character.isDigit(c))
				count_a++;
			if(Character.isWhitespace(c) && count_a>0){
				count_w++;
				count_a=0;
			}
		}
		if(count_a>0)
			count_w++;
		System.out.print("Words = "+count_w);
	}
}