package design_pattern.proxy;

public class UserDaoImpl2 implements UserDao {

	@Override
	public void add() {
		System.out.println("权限校验");
		System.out.println("添加方法");
		System.out.println("记录日志");
	}

	@Override
	public void delete() {
		System.out.println("权限校验");
		System.out.println("删除方法");
		System.out.println("记录日志");
	}

	@Override
	public void update() {
		System.out.println("权限校验");
		System.out.println("修改方法");
		System.out.println("记录日志");
	}

	@Override
	public void find() {
		System.out.println("权限校验");
		System.out.println("查询方法");
		System.out.println("记录日志");
	}

}
