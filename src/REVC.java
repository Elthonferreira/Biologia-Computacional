// By Elthon Ferreira
public class REVC {

	public static void main(String[] args) {
		String dna = "AAAACCCGGT";
		complementing_a_strand_of_dna(dna);
	}
	
	public static void complementing_a_strand_of_dna (String dna) {
		// Condição sequência tamanho 1000
		if (dna.length() > 1000) {
			System.out.println("Tamanho máximo da sequência permitido = 1000 nt.");
			System.exit(0);
		}
		
		//System.out.println("String original:   " + dna);
		
		// String ao contrário
		String reverso = "";
		for (int j = dna.length() - 1; j >= 0; j--) {
			reverso = reverso + dna.charAt(j);
		}
		
		//System.out.println("String reversa:    " + reverso);
		// Colocando a string invertida no vetor1
		char vetor1 [] = new char[dna.length()];
		char vetor2 [] = new char [dna.length()];
		for (int i = 0; i < dna.length(); i++) {
			vetor1[i] = reverso.charAt(i);
		}
		// Substituição das letras
		for (int i = 0; i < dna.length(); i++) {
			if (vetor1[i] == 'A') {vetor2[i] = 'T';}
			else if (vetor1[i] == 'T') {vetor2[i] = 'A';}
			else if (vetor1[i] == 'C') {vetor2[i] = 'G';}
			else if (vetor1[i] == 'G') {vetor2[i] = 'C';}
			else {continue;}
		}
		// Impressão
		for (int i = 0; i < dna.length(); i++) {
			System.out.print(vetor2[i]);
		}
	}
}
