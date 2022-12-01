package javapractise1;

	 class TEACHER 
	 {
		 String designation="Teacher";
		 String collegeName="Beginnerbook";
		 void does()
		 {
			System.out.println("teaching") ;
		 }
	 }
	 class computerTeacher extends TEACHER
	 {
		 
	 }

public class day7_assignment {

	public static void main(String[] args) {
		computerTeacher CT1=new computerTeacher();
		CT1.does();
		System.out.println(CT1.designation);
		System.out.println(CT1.collegeName);

	}

}
