// By Elthon Ferreira
public class RNA {

	public static void main(String[] args) {
		String dna = "GATGGAACTTGACTACGTAAATT";
		transcribing_dna_to_rna(dna);
	}
	
	public static void transcribing_dna_to_rna (String dna) {
		// Condição sequência tamanho 1000
		if (dna.length() > 1000) {
			System.out.println("Tamanho máximo da sequência permitido = 1000 nt.");
		}
		// Substituição de T por U
		String rna = null;
		for (int i = 0; i < dna.length(); i++) {
			rna = dna.replace('T', 'U');
		}	
		System.out.println(rna);
	}
}
