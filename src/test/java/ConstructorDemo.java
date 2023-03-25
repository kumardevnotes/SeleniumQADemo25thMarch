
public class ConstructorDemo {
	
	//Creating method whose name is same as classname
	//The name of the java method below is same as its class name that is why we call it as a constructor
	ConstructorDemo(){
		System.out.println("I am a default constructor");
	}
	
	//Param constructor
	ConstructorDemo(String message){
		System.out.println(message);
	}

	public static void main(String[] args) {
		//Creating an object of the given class
		ConstructorDemo obj = new ConstructorDemo();
		
		//calling below non-static methods using the object created above
		obj.displayEmpName();
		obj.displayEmpId();
		
		//Creating an object of the given class
		ConstructorDemo obj2 = new ConstructorDemo("I am a param constructor");
		
		//calling below non-static methods using the object created above
		obj2.displayEmpName();
		obj2.displayEmpId();
	}
	
	//non-static method
	public void displayEmpName() {
		System.out.println("John Doe");
	}
	
	//non-static method
	public void displayEmpId() {
		System.out.println(1122);
	}

}
