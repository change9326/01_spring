package design_pattern.adapter;
/**
 * 适配器模式
 * 
 * 		主要作用：将一个类的接口转换成另外一个客户希望的接口
 * 
 * 这个类就相当于实际案例中的电源转换头
 * 
 * @author 怡吾宇
 *
 */
//DBSocket 适配的目标接口
public class DBSocketAdapter implements DBSocket{

	//被适配的接口
	private GBSocket gbSocket;
	
	public DBSocketAdapter(GBSocket gbSocket) {
		this.gbSocket = gbSocket;
	}
	
	
	@Override
	public void method() {
		gbSocket.method();
	}

	
}
