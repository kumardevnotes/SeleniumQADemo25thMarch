
public class ArraysInJava {

	public static void main(String[] args) {
		//Java variable stores only new value
		//if you assign new value to a var, old value is vanished
		int empId = 9000;
		System.out.println(empId);
		empId = 9001;
		System.out.println(empId);
		//Using Arrays we can store mutliple values into a single variable
		int empIds[] = {1000, 1001, 1002, 1003};
		System.out.println(empIds[0]);
		System.out.println(empIds[1]);
		System.out.println(empIds[2]);
		System.out.println(empIds[3]); 
		//length-1 = 4-1 = 3 --> is the position of the last value in an array
	}

}
