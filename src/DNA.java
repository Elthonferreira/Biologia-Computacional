
public class DNA {

	public static void main (String args[]) {
		String dna = "AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC\r\n";
		counting_dna_nucleotides(dna);
	}
	public static void counting_dna_nucleotides(String dna) {
		// Condição sequência tamanho 1000
		if (dna.length() > 1000) {
			System.out.println("Tamanho máximo da sequência permitido = 1000 nt.");
		}
		// Incremento nas letras achadas
		int a = 0, c = 0, t = 0, g = 0;
		for (int i = 0; i < dna.length(); i++) {
			if (dna.charAt(i) == 'A') {
				a++;
			}
			else if (dna.charAt(i) == 'C') {
				c++;
			}
			else if (dna.charAt(i) == 'G') {
				g++;
			}
			else if (dna.charAt(i) == 'T') {
				t++;
			}
			else {
				continue;
			}
		}
		System.out.println("\n" + a + " " + c + " " + g + " " + t); // Impressão formatada
	}
}
