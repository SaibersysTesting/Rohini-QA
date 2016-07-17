public class MyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] input1 = { 'a', 'a', 'b', 'b', 'c', 'c', 'd' };

		char[] output = whatAmIdoing(input1);

		for (int p = 0; p < output.length; p++) {
			System.out.println(output[p]);
		}
	}

	public static char[] whatAmIdoing(char[] input1) {

		int j = 0;
		int i = 1;

		if (input1.length < 2) {
			return input1;
		}
		while (i < input1.length) {
			if (input1[i] == input1[j]) {
				i++;
			} else {
				input1[++j] = input1[i++];
			}
		}
		char[] output = new char[j + 1];
		for (int k = 0; k < output.length; k++) {
			output[k] = input1[k];
		}

		return output;
	}

}
