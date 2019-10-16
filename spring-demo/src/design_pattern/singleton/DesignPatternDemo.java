package design_pattern.singleton;

public class DesignPatternDemo {

	public static void main(String[] args) {
		Student student = Student.getStudent();
		student.sayHello("小红");

		// 验证两次返回的是同一个对象
		Student student2 = Student.getStudent();
		System.out.println(student == student2);

		// Student student3 = new Student();
		// Student student4 = new Student();

		System.out.println("================");
		Teacher teacher = Teacher.getTeacher();
		teacher.method();

		Teacher teacher2 = Teacher.getTeacher();
		System.out.println(teacher == teacher2);
	}

}
