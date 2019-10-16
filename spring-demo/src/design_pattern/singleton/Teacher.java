package design_pattern.singleton;
/**
 * 单例实现之懒汉式实现
 * 
 * 
 * 思想：需要对象的时候，再去创建对象
 * 
 * 懒汉式设计模式，有一种叫法：延迟加载
 * 
 * 
 * 懒汉式单例模式步骤：
 * 		1：构造私有
 * 		2：定义私有静态成员变量，先不初始化
 * 		3：定义公开静态方法，获取本身对象
 * 			有对象就返回已有对象
 * 			没有对象，再去创建
 * 
 * 线程安全问题，判断依据：
 * 		1：是否存在多线程	是
 * 		2：是否有共享数据	是
 * 		3：是否存在非原子性操作	
 * 
 * 
 * 懒汉式单例实现，存在线程安全隐患
 * 
 * @author 怡吾宇
 *
 */
public class Teacher {

	//1：构造私有
	private Teacher(){}
	
	//2：定义私有静态成员变量，先不初始化
	private static Teacher teacher;
	
	//3：定义公开静态方法，获取本身对象
	public static Teacher getTeacher(){
		//没有对象，再去创建
		if (teacher == null) {
			teacher = new Teacher();
		}
		//有对象就返回已有对象
		return teacher;
	}
	
	public void method(){
		System.out.println("show teacher method");
	}
}
