package java111;
// "abkkcdkkefkkskk";     "kk"

public class Zifuzhuan {
	public static int getSubCount(String str, String key) {
		int i = 0;
		int beignindex = 0;
		for (beignindex = 0; beignindex < str.length() - 1; beignindex++) {

			if (str.indexOf(key, beignindex) != -1) {

				i++;
				beignindex = str.indexOf(key, beignindex) + 1;

			}
		}
		return i;
	}

	public static void main(String[] args) {
		String str = "abkkcdkkefkkskk";
		String key = "kk";
		System.out.println(Zifuzhuan.getSubCount(str, key));

	}

}
