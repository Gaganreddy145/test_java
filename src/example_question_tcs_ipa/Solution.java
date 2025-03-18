package example_question_tcs_ipa;

import java.util.*;

class SortByBalance implements Comparator<Sim> {
	public int compare(Sim s1, Sim s2) {
		if (s1.getBalance() > s2.getBalance())
			return -1;
		else if (s1.getBalance() < s2.getBalance())
			return 1;
		else
			return 0;
	}
}

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Sim[] arr = new Sim[4];
		for (int i = 0; i < 4; i++) {
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			double balance = sc.nextDouble();
			double ratePer = sc.nextDouble();
			sc.nextLine();
			String circle = sc.nextLine();
			arr[i] = new Sim(id, name, circle, balance, ratePer);
		}

//        List<Sim> l = transferCircle(arr, "ahd", "kol");
//        for(Sim s:l) {
//        	System.out.println(s.getCustomerName() + " " + s.getCircle() + " " + s.getRatePerSec());
//        }
		List<Sim> l = matchAndSort(arr, sc.nextLine(), sc.nextDouble());
		for (Sim s : l) {
			System.out.println(s.getSimId() + " " + s.getCustomerName() + " " + s.getCircle() + " " + s.getBalance());
		}
	}

	public static List<Sim> transferCircle(Sim[] arr, String circle1, String circle2) {
		List<Sim> l = new ArrayList<>();
		for (Sim s : arr) {
			if (s.getCircle().equalsIgnoreCase(circle1)) {
				s.setCircle(circle2);
				l.add(s);
			}
		}
		Collections.sort(l, new SortDesc());
		return l;
	}

	public static List<Sim> matchAndSort(Sim[] arr, String searchCircle, double rate) {
		List<Sim> l = new ArrayList<>();
		for (Sim s : arr) {
			if (s.getCircle().equalsIgnoreCase(searchCircle) && s.getRatePerSec() < rate)
				l.add(s);
		}
		Collections.sort(l, new SortByBalance());
		return l;
	}

}
