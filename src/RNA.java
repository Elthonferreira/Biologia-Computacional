
public class RNA {

	public static void main(String[] args) {
		String dna = "GATGGAACTTGACTACGTAAATT";
		transcribing_dna_to_rna(dna);
	}
	
	public static void transcribing_dna_to_rna (String dna) {
		
		if (dna.length() > 1000) {
			System.out.println("Tamanho máximo da sequência permitido = 1000 nt.");
		}
		String rna = null;
		for (int i = 0; i < dna.length(); i++) {
			rna = dna.replace('T', 'U');
		}	
		System.out.println(rna);
	}
}
