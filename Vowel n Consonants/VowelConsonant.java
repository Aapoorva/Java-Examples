import java.io.*;
class VowelConsonant{
	public static void main(String args[]){
		int i,count_v,count_c,j,t;
		String s1;
		char c,vowel[] = {'a','e','i','o','u'};

		Console con = System.console();

		System.out.println("Input a string");
		s1 = con.readLine();

		count_v=0;
		count_c=0;
		for(i=0;i<s1.length();i++){
			c = s1.charAt(i);
			c = Character.toLowerCase(c);
			if(Character.isAlphabetic(c)){
				t=0;
				for(j=0;j<vowel.length;j++)
					if(c == vowel[j]){
						t=1;
						count_v++;
						break;
					}
				if(t==0)
					count_c++;
			}
		}
		System.out.print("Vowels = "+count_v+"\nConsonants = "+count_c);
	}
}