package typeconversion;

public class Conversion {

	public double convertDoubleToDouble(double num) {
		return (int) num;
	}

	public byte[] convertIntArrayToByteArray(int[] nums) {
		byte[] res = new byte[nums.length];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 127 || nums[i] < -127) {
				res[i] = -1;
			} else {
				res[i] = (byte) nums[i];
			}
		}
		return res;
	}

	public int getFirstDecimal(double num) {
		return (int) ((num - (int) num) * 10);
	}
}
