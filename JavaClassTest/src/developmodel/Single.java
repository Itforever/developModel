package developmodel;

public class Single {
	
	public Single() {
		System.out.println("创建了一个类-----"+Thread.currentThread().getId());
	}
	
	public void test() {
		System.out.println("方法调用。。。。。。。。。。。。耗时===="+System.currentTimeMillis());
	}

}
