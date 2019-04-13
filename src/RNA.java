// By Elthon Ferreira
public class RNA {

	public static void main(String[] args) {
		String dna = "GATGGAACTTGACTACGTAAATT";
		transcribing_dna_to_rna(dna);
	}
	
	public static void transcribing_dna_to_rna (String dna) {
		// Condi��o sequ�ncia tamanho 1000
		if (dna.length() > 1000) {
			System.out.println("Tamanho m�ximo da sequ�ncia permitido = 1000 nt.");
		}
		// Substitui��o de T por U
		String rna = null;
		for (int i = 0; i < dna.length(); i++) {
			rna = dna.replace('T', 'U');
		}	
		System.out.println(rna);
	}
}
