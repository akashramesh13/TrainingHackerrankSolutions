package algo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PerfectSubstring {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String in = sc.next();
		int k = sc.nextInt();
		int output = perfectSubstr(in, k);
		System.out.println(output);
	}

	private static int perfectSubstr(String in, int k) {

		int count = 0;

		for (int i = 0; i < in.length(); i++) {

			int[] freq = new int[10];

			for (int j = i; j < in.length(); j++) {

				int ind = in.charAt(j) - '0';
				freq[ind]++;

				if (freq[ind] > k) {
					break;
				} else if (freq[ind] == k && checkFreq(freq, k) == true) {
					count++;
				}
			}
		}

		return count;
	}

	private static boolean checkFreq(int[] freq, int k) {

		for (int i = 0; i < 10; i++) {
			if (freq[i] != k && freq[i] != 0)
				return false;
		}
		return true;
	}

}
