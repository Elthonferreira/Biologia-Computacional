
public class FIB {

	public static void main(String[] args) {
		int fib = 12;
		System.out.println(rabbits_and_recurrence_relations(fib));
	}
	
	public static int rabbits_and_recurrence_relations (int fib) {
		if (fib < 2) {
			return fib;
		}
		else {
			return rabbits_and_recurrence_relations(fib - 1) + rabbits_and_recurrence_relations(fib - 2);
		}
	}
}
