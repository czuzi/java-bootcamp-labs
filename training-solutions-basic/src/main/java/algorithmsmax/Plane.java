package algorithmsmax;

public class Plane {

	public int getLongestOcean(String map) {
		int res = 0;
		int count = 0;

		for (int i = 2; i < map.length(); i++) {
			if (map.charAt(i) == '0' && map.charAt(i-1) == '0') {
				count++;
				if (count > res) {
					res = count;
				}
			}
			if (map.charAt(i) == '0' && map.charAt(i-1) != '0') {
				count = 1;
				if (count > res) {
					res = count;
				}
			}
		}
		return res;
	}
}
