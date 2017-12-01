package java111;

public class Yichang {

	public int yichan(int num1, int num2) {
		int result = 0;
		try {
			result = num1 / num2;
		} catch (Exception e) {
			System.out.println("----");
			System.out.println(e);
			// TODO: handle exception
		} finally {
			System.out.println("Ò»¶¨Ö´ÐÐ");
		}

		return result;
	}

	public static void main(String[] args) {
		Yichang sYichang = new Yichang();
		System.out.println(sYichang.yichan(3, 0));
		System.out.println("ssssssssssssss");
	}

}
