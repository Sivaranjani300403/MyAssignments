package day3;

public class Fibonacci {
	
		public static void main(String[] args) {
			
		  int firstnum=0;
		  int secnum=1;
		  int sum=0;
		   System.out.println(firstnum + " ");
		for(int k=1;k<=11;k++) {
			sum=firstnum+secnum;
			firstnum=secnum;
			secnum=sum;
			System.out.println(sum + " ");
		}
	}
			
}


