package example_question_tcs_ipa;

import java.util.Comparator;

public class SortDesc implements Comparator<Sim> {
	public int compare(Sim s1, Sim s2) {
		if (s1.getRatePerSec() > s2.getRatePerSec())
			return -1;
		else if (s1.getRatePerSec() < s2.getRatePerSec())
			return 1;
		else
			return 0;
	}
}
