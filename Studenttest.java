
public class Studenttest {
	
	public static void main (String [] args) {
		Student s1 = new Student();
		//System.out.println(s1);
		s1.setId(200);
		s1.setName("Arafat");
		s1.setCourse("java");
		System.out.println(s1);
		
		Student s2 = new Student();
		s2.setId(300);
		s2.setName("Hasan");
		s2.setCourse("Math");
		System.out.println(s2);
	}

}
