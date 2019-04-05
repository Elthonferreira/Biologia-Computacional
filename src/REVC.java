
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
		System.out.println("String original:   " + dna);
		// Substituição das letras
		String rna = "";
		
		//for (int i = 0; i < dna.length(); i++) {
			rna = dna.replace('A', 'T');
			rna = dna.replace('T', 'A');
			
		
		System.out.println("String modificada: " + rna);
		
		// String ao contrário
		String reverso = "";
		for (int j = dna.length() - 1; j >= 0; j--) {
			reverso = reverso + dna.charAt(j);
		}
		System.out.println("String reversa:    " + reverso);
	}
}
