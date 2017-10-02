package io.robusta.java.classic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nicorama on 21/06/2017.
 */
public class ListApp {

	List<Integer> buildList(int a, int b, int c) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(a);
		list.add(b);
		list.add(c);

		return list;

	}

	ArrayList<Integer> buildList(int... numbers) { // int[numbres]

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < numbers.length; i++) { // int number : numbers
			Integer n = numbers[i];

			list.add(n);
		}

		return list;
	}

	boolean equality(List<Integer> list1, List<Integer> list2) {

		if (list1.size() != list2.size()) {

			return false;
		}

		int length = list1.size();

		for (int i = 0; i < length; i++) {

			if (!list1.get(i).equals(list2.get(i))) {
				return false;
			}

		}
		return true;

	}

	String asString(List<Integer> numbers) {
		return null;

	}

	int first(List<Integer> ints) {

		return 0;
	}

	int last(List<Integer> ints) {
		return 0;
	}

	int medium(List<Integer> ints) {
		return 0;
	}
}
