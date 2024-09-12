package oops_Encapsulation;

public class TestEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	LearnEncapsulation le = new LearnEncapsulation ();
		//System.out.println(le.getEmployeeTd());
		//le.setEmpoyeeId("204024");
		int salary =le.getSalary();
		System.out.println(le.getSalary());
		 le.setSalary(115000);
		 System.out.println(le.getSalary());
		System.out.println(salary);*/
		
		ReviewEncapsulation re = new ReviewEncapsulation();
		//re.setEmployeeId();
		String get2 = re.getEmployeeId();
		System.out.println(get2);
		ReviewEncapsulation obj1 = new ReviewEncapsulation();
		ReviewEncapsulation obj2 = new ReviewEncapsulation();
		ReviewEncapsulation obj3 = new ReviewEncapsulation();
		ReviewEncapsulation obj4 = new ReviewEncapsulation();
		ReviewEncapsulation obj5 = new ReviewEncapsulation();
		
		obj1.setEmployeeId("201");
		obj2.setEmployeeId("202");
		obj3.setEmployeeId("203");
		obj4.setEmployeeId("204");
		obj5.setEmployeeId("205");
		
		System.out.println(obj1.getEmployeeId());
		System.out.println(obj2.getEmployeeId());
		System.out.println(obj3.getEmployeeId());
		System.out.println(obj4.getEmployeeId());
		System.out.println(obj5.getEmployeeId());
		
		obj1.arrayLearning(0);
		obj2.arrayLearning(2);
		obj3.arrayLearning(3);
	}

}
