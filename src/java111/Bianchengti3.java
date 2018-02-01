package java111;

//给出一组学生的成绩int[] score={80,45,60,100,89,92,93,...}
//请求出这组成绩中，100分，90-99，80-89的学生人数
public class Bianchengti3 {
	public static void main(String[] args) {
		int[] score = { 80, 45, 60, 100, 89, 92, 93, 88, 77 };
		int q = 0;
		int w = 0;
		int e = 0;
		int r = 0;
		for (int i = 0; i < score.length; i++) {
			if (score[i] == 100) {

				q++;

			} else if (score[i] >= 90 && score[i] < 100) {

				w++;
			} else if (score[i] >= 80 && score[i] < 90) {
				e++;

			} else {
				r++;
			}

		}
		System.out.println("100分的人数为" + q);
		System.out.println("90-90分的人数为" + w);
		System.out.println("80-89分的人数为" + e);
		System.out.println("低于80分的人数为" + r);

	}

}
