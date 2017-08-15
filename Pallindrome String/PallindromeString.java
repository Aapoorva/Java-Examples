import java.io.*;
class PallindromeString{
	public static void main(String args[]){
		String s1,s2;
		char c[],temp;	
		int i;
		Console con = System.console();
		s1 = con.readLine();
		c = s1.toCharArray();
		for(i=0;i<c.length/2;i++){
			temp = c[i];
			c[i] = c[c.length-1-i];
			c[c.length-1-i] = temp;
		}
		s2 = String.copyValueOf(c);
		if(s2.equals(s1))
			System.out.print("PALLINDROME");
		else
			System.out.print("Not a PALLINDROME");
	}
}