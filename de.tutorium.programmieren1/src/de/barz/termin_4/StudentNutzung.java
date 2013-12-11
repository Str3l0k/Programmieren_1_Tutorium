package de.barz.termin_4;

public class StudentNutzung {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student s1 = new Student("Mustermann", "Max", "Informatik", 123455);
		Student s2 = new Student("Meier", "Paul", "Informatik", 223459);
		Student s3 = new Student("Schmidt", "Stefan", "Informatik", 323455);
		
		Student s4 = vergleiche(s1, s2, s3);
		
		System.out.println(s4);
	}
	
	public static Student vergleiche(Student st1, Student st2, Student st3) {
		int a = st1.getMatrikelnummer();
		int b = st2.getMatrikelnummer();
		int c = st3.getMatrikelnummer();
		
		if(a > b && a > c)
			return st1;
		else if(b > a && b > c)
			return st2;
		else 
			return st3;
	}

}
