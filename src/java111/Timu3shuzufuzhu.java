package java111;

import java.util.Arrays;

////���ڸ����������飺
//��// ����A����1��7��9��11��13��15��17��19����
//�� ����b����2��4��6��8��10��
//��������ϲ�Ϊ����c�����������С�

public class Timu3shuzufuzhu {
	public static void main(String[] args) {
		// int[] A = { 1, 7, 9, 11, 13, 15, 17, 19 };
		// int[] B = { 2, 4, 6, 8, 10 };
		// int[] C = new int[A.length + B.length];
		// ArrayList<Integer> arrayList = new ArrayList<Integer>();
		// for (int i = 0; i < A.length; i++) {
		// arrayList.add(A[i]);
		// }
		// for (int i = 0; i < B.length; i++) {
		// arrayList.add(B[i]);
		// }
		// for (int i = 0; i < arrayList.size(); i++) {
		// C[i] = arrayList.get(i);
		// // System.out.println(C[i]);
		// }
		// for (int i = 1; i <= C.length - 1; i++) {
		// for (int j = 0; j < C.length - i; j++) {
		// if (C[j] >= C[j + 1]) {
		// C[j] = C[j] + C[j + 1];
		// C[j + 1] = C[j] - C[j + 1];
		// C[j] = C[j] - C[j + 1];
		//
		// }
		//
		// }
		//
		// }
		// for (int shuzu : C) {
		// System.out.println(shuzu);

		// }
		// ����ĸ���
		int[] A = { 1, 7, 9, 11, 13, 15, 17, 19 };
		int[] B = { 2, 4, 6, 8, 10 };
		int[] C = new int[A.length + B.length];
		System.arraycopy(A, 0, C, 0, A.length);
		System.arraycopy(B, 0, C, A.length, B.length);
		Arrays.sort(C);
		for (int i1 : C) {
			System.out.print(i1 + " ");
		}
		// ���������
		// int[] copyOf = Arrays.copyOf(A, A.length + 3);
		// for (int j : copyOf) {
		// System.out.println(j);
		// }

	}
}
