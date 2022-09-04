package practice;

public class sample07 {
	public static void main(String[] args) {
		Employee tanaka = new Employee("田中一郎", 250000);
		Employee suzuki = new Employee("鈴木花子", 300000);
		
		tanaka.show();
		suzuki.show();
	}
}


class Employee {
	private String name;
	private int salary;
	
	public void show() {
		System.out.println("私の名前は、" + this.name + "です。");
		System.out.println("私の給与は、" + this.salary + "円です。");
	}
	
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}