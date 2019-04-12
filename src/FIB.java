// Feito por Elthon Ferreira
public class FIB {

	private static long contador; // Contador global
	
	public static void main(String[] args) {	
		long mes = 5, pares = 3;
		// Condition Positive integers n <= 40 and k <= 5.
		if (mes > 40 || pares > 5) {System.out.println("Escolha valores com a quantidade de"
									+ "meses menores que 40 e pares menores que 5!");
		System.exit(0);	// Kill program
		}
		System.out.println(rabbits_and_recurrence_relations(mes, pares)); // Call and print function
	}
	public static long aux(long mes, long pares) {
			if (mes < 3) return 1;								// Caso base
			else if (mes == 3 || mes == 4) return pares;		// Caso base
			else {
				return aux(mes - 1, pares) + 					// Caso geral
					  (aux(mes - 2, pares)*pares);
			}
	}
	public static long rabbits_and_recurrence_relations(long mes, long pares) {
		for (long i = 1; i <= mes; i ++) {				
			contador += aux(i, pares);							// Contador
			//System.out.println("(" + i + "):" + aux(i, pares));	
		}
		return contador - 1;
	}
}
