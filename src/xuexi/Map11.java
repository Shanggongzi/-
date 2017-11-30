package xuexi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map11 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("��", "����");
		map.put("��", "lisi");
		map.put("��", "wangwu");
		String value = map.get("��");
		System.out.println(value);
		Set<Entry<String, String>> entrySet = map.entrySet();

		for (Entry<String, String> entry : entrySet) {
			String key = entry.getKey();
			String value1 = entry.getValue();
			System.out.println(key);
			System.out.println(value1);
		}
		Set<String> keySet = map.keySet();

		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			String l = iterator.next();
			String zhi = map.get(l);
			System.out.println(l + "--" + zhi);
		}
	}

}
