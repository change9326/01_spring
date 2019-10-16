package design_pattern.template;

public class ForDemo extends GetTimeTemplate{

	@Override
	public void code() {
		//输出for循环
		for (int i = 0; i < 10000; i++) {
			System.out.println(i);
		}
	}

}
