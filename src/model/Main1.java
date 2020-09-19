package model;

import java.util.*;

public class Main1 {
	public static void main(String args[]) {

		Scanner r = new Scanner(System.in);

		int cases = Integer.valueOf(r.nextLine());
		r.nextLine();

		for (int i = 0; i < cases; i++) {

			String theTree;
			Hashtable<String, Integer> myDictionary = new Hashtable<String, Integer>();
			List<String> trees = new ArrayList<String>();

			float acum = 0;

			while (r.hasNext()) {

				theTree = r.nextLine();

				if (theTree.length() == 0) {
					break;
				}
				acum = acum + 1;

				if (myDictionary.containsKey(theTree)) {
					myDictionary.put(theTree, myDictionary.get(theTree) + 1);

				} else {
					trees.add(theTree);
					myDictionary.put(theTree, 1);
				}

			}

			Collections.sort(trees);

			for (String theTreeString : trees)
				System.out.printf("%s %.4f\n", theTreeString, (float) (myDictionary.get(theTreeString) * 100 / acum));

			if (cases - 1 != i)
				System.out.println();
		}
		r.close();
	}
}
