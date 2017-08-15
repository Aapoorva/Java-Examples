import java.io.*;
class SortNames{
	public static void main(String args[]){
		int i,j;
		String temp;
		for(i=0;i<args.length;i++){
			for(j=1;j<args.length-i;j++){

				if(args[j-1].compareTo(args[j])>0){

					temp = args[j-1];
					args[j-1] = args[j];
					args[j] = temp;
				}
			}
		}
		for(String x : args)
			System.out.print(x+" ");
	}
}