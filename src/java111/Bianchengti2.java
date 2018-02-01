package java111;

//编写一个方法求s=a+aa+aaa+a...a，其中a是一个数，比如a=2；
//那么求s=2+22+222+2222...的值。该方法需要两个参数
//，第一个参数控制a，第二个参数控制有多少个数。（5分）
public class Bianchengti2 {
	public static int fangfa(int a, int num) {
		int s = 0;
		int k = 0;
		for (int j = 0; j < num; j++) {
			k = k * 10 + a;
			System.out.println("k的大小为" + k);
			s += k;
		}

		return s;
	}

	public static void main(String[] args) {
		System.out.println(Bianchengti2.fangfa(2, 4));
	}

}
