package java111;

import java.util.ArrayList;

/*在System类中有静态方法public static void arraycopy(
		Object src,  
		int srcPos,  
		Object dest, 
		int destPos,
		int length):
可以用于数组src从第srcPos项元素开始的length个元素拷贝到目标数组dest从destPos开始的length个元素。请自己实现这个方法*/
public class Bianchengti5 {
	public static void arraycopy() {
		Object[] src = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int srcPos = 3;// 默认第几项就是数组的下标
		Object[] dest = { 2, 7, 9, 11, 14, 19, 70, 90 };
		int destPos = 2;
		int length = 4;
		ArrayList<Object> list = new ArrayList<Object>();
		if (srcPos + length >= src.length) {
			System.out.println("输入错误");
		} else {

			for (int i = srcPos; i <= srcPos + length; i++) {
				list.add(src[i]);
			}
		}
		if (destPos + length >= dest.length) {
			System.out.println("输入错误");
		} else {

			for (int j = destPos; j <= destPos + length; j++) {
				dest[j] = list.get(j - destPos);
			}
		}
		for (Object object : dest) {
			System.out.println(object);
		}

	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Bianchengti5 bianchengti5 = new Bianchengti5();
		bianchengti5.arraycopy();
	}
}
