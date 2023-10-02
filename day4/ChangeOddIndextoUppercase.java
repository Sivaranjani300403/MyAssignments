package day4;

public class ChangeOddIndextoUppercase {
	
		public static void main(String[] args) {
			String test = "changeme";
			String L= "";
			char[] a = test.toCharArray();
			for(int i=0;i<a.length;i++) {
				if(i%2!=0) {
					L=L+a[i];
					//System.out.println(test.toUpperCase());
				}
			}
			//System.out.println(count);
			System.out.println(L.toUpperCase());
		}

	}


