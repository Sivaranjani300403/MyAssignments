package student;

public class Students {
	
		public void getStudentInfo(int id) {
			System.out.println(id);
		}
		public void getStudentInfo(int id, String name) {
			System.out.println(id);
			System.out.println(name);
		}
		public void getStudentInfo(String email,int phone_number) {
			System.out.println(email);
			System.out.println(phone_number);
		}

		public static void main(String[] args) {
			
			Students std=new Students();
			std.getStudentInfo(001);
			std.getStudentInfo(002, "sowmi");
			std.getStudentInfo("sowmi@gmail.com", 999880006);
		}

	}