package io.robusta.java.classic;

/**
 * Created by nicorama on 21/06/2017.
 */
public class ArrayApp {

	String[] buildEmptyArray(int size) {
		String[] emptyArray = new String[size];
		return emptyArray;
	}

	int[] buildArray(int a, int b, int c) {
		int[] array = { a, b, c };
		return array;
	}

	boolean equality(int[] array1, int[] array2) {
		if (array1.length != array2.length) {
			return false;
		}
		
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i]) {
				return false;
			}
		}
		return true;
	}

	String asString(int[] numbers) {
		String str = "";
		
		for (int i = 0; i < numbers.length; i++) {
			str += numbers[i];
			str += ":";
		}
		return str;
	}

	String asStringJoin(int[] numbers) {
		String str = asString(numbers);
		str = str.substring(0, str.length() - 1);
		return str;
	}

	String asString(String[] strings) {
		String str = "";
		for (int i = 0; i < strings.length; i++) {
			str += strings[i];
			str += " ";
		}
		return str.substring(0, str.length() - 1);
	}

	String asString(Card[] cards) {
		String str = "[";
		int i = 0;
		for (i = 0; i < cards.length; i++) {
			str += cards[i];  //utilise le toString() redéfini dans la classe Card
			str += " ";
		}
		str = str.substring(0, str.length() - 1);
		str += "]";
		return str;
	}

}