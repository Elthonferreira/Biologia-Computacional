
public class SUBS {

	public static void main(String[] args) {
		String string = "GATATATGCATATACTT";
		String substring = "ATAT";
		finding_a_motif_in_dna(string, substring);
	}
	
	public static void finding_a_motif_in_dna (String string, String substring) {
		char vetor1[] = new char[string.length()];
		String stringaux = "";
		int count = 0;
	
		for (int i = 0; i < string.length(); i++) {
			vetor1[i] = string.charAt(i); 			// Coloca caracteres no vetor
			stringaux += vetor1[i];					// Concatena elementos do vetor na string
			System.out.println(stringaux);
			if(stringaux.contains(substring)) {
				count++;
				System.out.println(count);
				stringaux = "";
			}
		}
		System.out.println(stringaux);
	}

}
