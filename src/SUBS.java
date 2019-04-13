// By Elthon Ferreira 
public class SUBS {

	public static void main(String[] args) {
		String string = "GATATATGCATATACTT";
		String substring = "ATAT";
		finding_a_motif_in_dna(string, substring);
	}

	public static void finding_a_motif_in_dna(String string, String substring) {
		String stringaux = "";
		int inicio = 0;
		int i = 0;
		int fim = substring.length();
		while (fim <= string.length()) {			// Percorre toda string
			for (i = inicio; i < fim; i++) {		// Percorre a subtring
				stringaux += string.charAt(i);	    // Concatena string				
			}
			if (stringaux.equals(substring)) {		// Condição se a substring é igual a string
				System.out.print(" " + (i - substring.length() + 1));
			}
			stringaux = "";							// Zera string para iniciar na posição + 1
			inicio++;
			fim++;
		}
	}
}
