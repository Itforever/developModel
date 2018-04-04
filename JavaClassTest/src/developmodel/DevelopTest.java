package developmodel;

/***
 * 单线程测试单例模式
 * @author 积金汽车
 *
 */
public class DevelopTest {
	public static boolean flag=false;
	public static void main(String[] args) {
		Single single=null;
		for(int i=0;i<10;i++) {
			if(!flag) {
				single=new Single();
				flag=true;
			}
			single.test();
		}
		System.out.println("总共耗时======"+System.currentTimeMillis());
	}
}
