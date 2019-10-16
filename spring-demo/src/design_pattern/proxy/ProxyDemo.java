package design_pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 * 
 * 基于Java反射的，而且是基于接口实现的。
 * 
 * 动态代理，也就是帮我们使用反射生成一个代理对象，不是我们自己new出来的。
 * 
 * 动态代理有多种方案：
 * 		JDK提供一种：基于接口的
 * 		CgLIB：基于类的
 * 
 * 
 * JDK是如何实现根据一个接口来创建代理对象的呢？
 * Proxy类的成员方法
 * 		static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)  
 * 		第一个参数：类加载器
 * 		第二个参数：要创建的代理对象的对应接口
 * 		第三个参数：执行处理器
 * 		返回值：返回代理对象
 * 
 * InvocationHandler类的成员方法
 * 		Object invoke(Object proxy,Method method,Object[] args)
 * 		第一个参数：代理对象
 * 		第二个参数：要执行的方法
 * 		第三个参数：要执行的方法需要的参数
 * 		返回值：返回方法的返回值
 * 
 * 代理对象能干什么呢？
 * 
 * 
 * @author 怡吾宇
 *
 */
public class ProxyDemo {

	public static void main(String[] args) {
		final UserDao dao = new UserDaoImpl();
		dao.add();
		dao.delete();
		dao.update();
		dao.find();
		System.out.println("===================");
		UserDao dao2 = new UserDaoImpl2();
		dao2.add();
		dao2.delete();
		dao2.update();
		dao2.find();
		
		System.out.println("=====================");
		//通过反射对接口进行动态代理
		//反射处理时：要通过对象获取Class类对象，而不能通过静态属性获取Class类对象
		UserDao dao3 = (UserDao) Proxy.newProxyInstance(dao.getClass().getClassLoader(),dao.getClass().getInterfaces(), new InvocationHandler() {
			
			//调用方法，可以扩展该方法
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("权限校验");
				Object object2 = method.invoke(dao, args);
				System.out.println("记录日志");
				
				return object2;
			}
		});
		
		dao3.add();
		dao3.delete();
		dao3.update();
		dao3.find();
	}
}
