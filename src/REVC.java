
public class REVC {

	public static void main(String[] args) {
		String dna = "AAAACCCGGT";
		complementing_a_strand_of_dna(preenche_vetor(dna));
	}
	public static String[] preenche_vetor(String string) {
		String vetor[] = null;
		for (int j = 0; j < string.length(); j++) {
			vetor[j] += string.charAt(j);
		}
		return vetor;
	}
	public static void complementing_a_strand_of_dna (String[] dna) {
		// Condição sequência tamanho 1000
		if (dna.length > 1000) {
			System.out.println("Tamanho máximo da sequência permitido = 1000 nt.");
			System.exit(0);
		}
		System.out.println("String original:   " + dna);
		// Substituição das letras
		String rna [] = null;		
		
		for (int i = 0; i < dna.length; i++) {
			if (dna[i] == "A") {
				rna[i] = rna[i] + "T";
			}
			else if (dna[i] == "T") {
				rna[i] = rna[i] + "A";
			}
			else if (dna[i] == "C") {
				rna[i] = rna[i] + "C";
			}
			else if (dna[i] == "G") {
				rna[i] = rna[i] + "G";
			}
			else {
				continue;
			}
		}
		System.out.println("String modificada: " + rna);
		
		// String ao contrário
		String reverso = "";
		for (int j = dna.length - 1; j >= 0; j--) {
		//	reverso = reverso + dna.charAt(j);
		}
		System.out.println("String reversa:    " + reverso);
	}
}
