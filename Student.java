package javapractise1;

public class Student {
	int SID;
	String Sname;
	int Sub1;
	int Sub2;
	int Sub3;
	void getStuData(int ID,String name)
	{
		SID=ID;
		Sname=name;
	}
	void getStuMarks(int S1,int S2,int S3)
	{
		Sub1=S1;
		Sub2=S2;
		Sub3=S3;
	}
	/*void totalMarks(int Sub1,int Sub2,int Sub3)
	{
		System.out.println(Sub1+Sub2+Sub3);
	}*/
  void display(){

			System.out.println(SID+"  "+Sname);
			System.out.println(Sub1+" "+Sub1+" "+Sub3);
		}
  void totalMarks(int Sub1,int Sub2,int Sub3)
	{
		System.out.println(Sub1+Sub2+Sub3);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student std1=new Student();
		std1.getStuData(319,"raja");
		std1.getStuMarks(100,200,300);
		std1.totalMarks(100, 200, 300);
		std1.display();
		Student std2=new Student();
		std2.getStuData(518,"goverdhan");
		std2.getStuMarks(40,50,60);
		std2.totalMarks(40,50,60);
		std2.display();
		
	}

}
