import java.io.*;
class Space{
	public static void main(String args[]){
		int count_s,i,j,length_s;
		char c[];
		String s1;
		
		Console con = System.console();
		
		System.out.println("Input a sentence");
		s1 = con.readLine();
		s1 = s1.trim();
		c = s1.toCharArray();
		length_s = s1.length();
		count_s = 0;
		for(i = 0 ; i < s1.length() ; i++){
			if(Character.isWhitespace(c[i]))
				count_s++;
			else{
				if(count_s>1)
				{
					count_s = count_s - 1;
					for(j=i;j<length_s;j++)
						c[j-count_s] = c[j];
					length_s = length_s - count_s;
					s1 = String.copyValueOf(c,0,length_s);
					i = i-count_s;
				}
				
				count_s = 0;
			}		
		}
		System.out.print(s1);
	}
}