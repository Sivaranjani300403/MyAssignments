package day4;

public class ReverseEvenWords {
	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] d = test.split(" ");
		//char[] c = test.toCharArray();
		//String n ="";
		//System.out.println(Arrays.toString(s));
		
		for(int i=0;i<d.length;i++) {
			if(i%2!=0) {
				char[] c = d[i].toCharArray();
				for(int k=c.length-1;k>=0;k--) {
					//n=n+c[i];
					System.out.print(c[k]);
				}
			}
			else{
					System.out.println(d[i]);
				}
				System.out.print(" ");
			}
		}
	
	

}


