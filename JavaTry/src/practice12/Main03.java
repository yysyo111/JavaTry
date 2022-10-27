package practice12;

import java.util.HashMap;
import java.util.Map;

public class Main03 {
	public static void main(String[] args) {
		Map<String, Integer> prefs = new HashMap<String, Integer>();
		prefs.put("京都府", 255);
		prefs.put("東京都", 1261);
		prefs.put("熊本県", 181);
		prefs.put("兵庫県", 1929);
		prefs.put("大阪府", 109);
		
		for (String key : prefs.keySet()) {
			int value = prefs.get(key);
			System.out.println(key + "の人口は、" + value);
		}
	}
}
