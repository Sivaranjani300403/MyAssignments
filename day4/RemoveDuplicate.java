package day4;

public class RemoveDuplicate {
	
		public static void main(String[] args) {
			String text = "We learn java basics as part of java sessions in java week1";
			int count = 0;
			String[] split = text.split(" ");
			for(int i=0;i<split.length;i++) {
				for(int k=i+1;k<split.length;k++) {
					if(split[i].equals(split[k])) {
						count++;
						//System.out.println(count);
				}
				}
			}
			System.out.println(count);
			if(count>1) {
				System.out.println(text.replaceAll("java", ""));
			}else {
				System.out.println(text);
			}
		}

	}


