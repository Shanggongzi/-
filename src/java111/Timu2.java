package java111;
//int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5} ;

import java.util.ArrayList;

//Ҫ������������ֵΪ0����ȥ��������Ϊ0��ֵ����һ���µ����飬���ɵ�������Ϊ��
//int newArr[]={1,3,4,5,6,6,5,4,7,6,7,5} ;
//˼·�������е������� = �����еĽ����
// 1�� ȷ������Ϊ0�ĸ������������Կ��������飻
//2�� �Ӿɵ�����֮�У�ȡ�����ݣ������丳���¿��ٵ����飻

public class Timu2 {
	public static void main(String[] args) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		int oldArr[] = { 1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5 };
		int k = 0;
		for (int i = 0; i < oldArr.length; i++) {
			if (oldArr[i] != 0) {
				k++;
				temp.add(oldArr[i]);

			}
		}

		int[] newarray = new int[k];
		for (int j = 0; j < k; j++) {
			newarray[j] = temp.get(j);
			System.out.print(newarray[j] + " ");

		}

	}
}
