// By Elthon Ferreira
public class PROT {
	//https://www.sobiologia.com.br/conteudos/Citologia2/AcNucleico6.php
	//http://bioinformatica.uab.es/genetica/pr7/codi%20aa_sp.htm
	// Adicionar código se necessário

	public static void main(String[] args) {
		String cadeia = "AUGGCCAUGGCGCCCAGAACUGAGAUCAAUAGUACCCGUAUUAACGGGUGA";
		translating_rna_into_protein(cadeia); // Questão 6
	}

	public static void translating_rna_into_protein(String cadeia) {
		// Colocando a string no vetor
		char vetor1[] = new char[cadeia.length()];
		char vetor2[] = new char[cadeia.length()];
		for (int i = 0; i < cadeia.length(); i++) {
			vetor1[i] = cadeia.charAt(i);
		}

		// Substituição das letras
		for (int i = 0, j = 0; i < cadeia.length(); i += 3, j++) {
			if (vetor1[i] == 'A' && vetor1[i + 1] == 'U' && vetor1[i + 2] == 'G') {vetor2[j] = 'M';}
			else if (vetor1[i] == 'G' && vetor1[i + 1] == 'C' && vetor1[i + 2] == 'C') {vetor2[j] = 'A';}
			else if (vetor1[i] == 'G' && vetor1[i + 1] == 'C' && vetor1[i + 2] == 'G') {vetor2[j] = 'A';}
			else if (vetor1[i] == 'C' && vetor1[i + 1] == 'C' && vetor1[i + 2] == 'C') {vetor2[j] = 'P';}
			else if (vetor1[i] == 'A' && vetor1[i + 1] == 'G' && vetor1[i + 2] == 'A') {vetor2[j] = 'R';}
			else if (vetor1[i] == 'A' && vetor1[i + 1] == 'C' && vetor1[i + 2] == 'U') {vetor2[j] = 'T';}
			else if (vetor1[i] == 'G' && vetor1[i + 1] == 'A' && vetor1[i + 2] == 'G') {vetor2[j] = 'E';}
			else if (vetor1[i] == 'A' && vetor1[i + 1] == 'U' && vetor1[i + 2] == 'C') {vetor2[j] = 'I';}
			else if (vetor1[i] == 'A' && vetor1[i + 1] == 'A' && vetor1[i + 2] == 'U') {vetor2[j] = 'N';}
			else if (vetor1[i] == 'A' && vetor1[i + 1] == 'G' && vetor1[i + 2] == 'U') {vetor2[j] = 'S';}
			else if (vetor1[i] == 'A' && vetor1[i + 1] == 'C' && vetor1[i + 2] == 'C') {vetor2[j] = 'T';}
			else if (vetor1[i] == 'C' && vetor1[i + 1] == 'G' && vetor1[i + 2] == 'U') {vetor2[j] = 'R';}
			else if (vetor1[i] == 'A' && vetor1[i + 1] == 'U' && vetor1[i + 2] == 'U') {vetor2[j] = 'I';}
			else if (vetor1[i] == 'A' && vetor1[i + 1] == 'A' && vetor1[i + 2] == 'C') {vetor2[j] = 'N';}
			else if (vetor1[i] == 'G' && vetor1[i + 1] == 'G' && vetor1[i + 2] == 'G') {vetor2[j] = 'G';}
			else if (vetor1[i] == 'U' && vetor1[i + 1] == 'G' && vetor1[i + 2] == 'A') {vetor2[j] = ' ';}
			else {continue;}
		}
		// Impressão
		for (int i = 0; i < cadeia.length(); i++) {
			System.out.print(vetor2[i]);
		}
	}

}
