
public class REVC {

	public static void main(String[] args) {
		String dna = "AAAACCCGGT";
		complementing_a_strand_of_dna(dna);
	}
	
	public static void complementing_a_strand_of_dna (String dna) {
		// Condi��o sequ�ncia tamanho 1000
		if (dna.length() > 1000) {
			System.out.println("Tamanho m�ximo da sequ�ncia permitido = 1000 nt.");
			System.exit(0);
		}
		System.out.println("String original:   " + dna);
		// Substitui��o das letras
		String rna = "";
		
		//for (int i = 0; i < dna.length(); i++) {
			rna = dna.replace('A', 'T');
			rna = dna.replace('T', 'A');
			
		
		System.out.println("String modificada: " + rna);
		
		// String ao contr�rio
		String reverso = "";
		for (int j = dna.length() - 1; j >= 0; j--) {
			reverso = reverso + dna.charAt(j);
		}
		System.out.println("String reversa:    " + reverso);
	}
}
