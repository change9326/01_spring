package design_pattern.proxy;

public class UserDaoImpl implements UserDao {

	@Override
	public void add() {
		System.out.println("添加方法");
	}

	@Override
	public void delete() {
		System.out.println("删除方法");
	}

	@Override
	public void update() {
		System.out.println("修改方法");
	}

	@Override
	public void find() {
		System.out.println("查询方法");
	}

}
