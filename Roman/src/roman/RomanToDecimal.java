package roman;

import java.util.TreeMap;

public class RomanToDecimal {

	private static TreeMap<String, Integer> ROMAN_NUMS = new TreeMap<>();
	static {
		ROMAN_NUMS.put("M", 1000);
		ROMAN_NUMS.put("CM", 900);
		ROMAN_NUMS.put("D", 500);
		ROMAN_NUMS.put("CD", 400);
		ROMAN_NUMS.put("C", 100);
		ROMAN_NUMS.put("XC", 90);
		ROMAN_NUMS.put("L", 50);
		ROMAN_NUMS.put("XL", 40);
		ROMAN_NUMS.put("X", 10);
		ROMAN_NUMS.put("IX", 9);
		ROMAN_NUMS.put("V", 5);
		ROMAN_NUMS.put("IV", 4);
		ROMAN_NUMS.put("I", 1);
	}

	public static void main(String[] args) {
		System.out.println(toDecimal("CDLXXVIII"));
	}

	public static int toDecimal(String romanString) {
		romanString = romanString.toUpperCase();
		int length = romanString.length();
		Integer decimalValue = 0;

		while (length > 0) {
			length = romanString.length();
			if (length == 1 && isValid(romanString)) {
				decimalValue += ROMAN_NUMS.get(romanString);
				romanString = romanString.substring(0, length - 1);
				length = romanString.length();
			}

			String lastTwoChars = "";
			String veryLastChar = "";
			if (length >= 2) {
				lastTwoChars = romanString.substring(length - 2, length);
				if (isValid(lastTwoChars)) {
					decimalValue += ROMAN_NUMS.get(lastTwoChars);
					romanString = romanString.substring(0, length - 2);
					length = romanString.length();
				}

			}

			if (length >= 2) {
				veryLastChar = romanString.substring(length - 1, length);
				if (isValid(veryLastChar)) {
					decimalValue += ROMAN_NUMS.get(veryLastChar);
					romanString = romanString.substring(0, length - 1);
					length = romanString.length();
				}
			}

		}
		return decimalValue;
	}

	private static boolean isValid(String romanString) {
		return ROMAN_NUMS.get(romanString) != null;
	}
}
