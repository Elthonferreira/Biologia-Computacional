// By Eder Lucena
public class GC {

	public static void main(String[] args) {
		String s = ">Rosalind_6404 CCTGCGGAAGATCGGCACTAGAATAGCCAGAACCGTTTCTCTGAGGCTTCCGGCCTTCCCTCCCACTAATAATTCTGAGG"
				+ ">Rosalind_5959 CCATCGGTAGCGCATCCTTAGTCCAATTAAGTCCCTATCCAGGCGCTCCGCCGAAGGTCTATATCCATTTGTCAGCAGACACGC"
				+ ">Rosalind_0808 CCACCCTCGTGGTATGGCTAGGCATTCAGGAACCGGAGAACGCTTCAGACCAGCCCGGACTGGGAACCTGCGGGCAGTAGGTGGAAT";
		System.out.println(computingGC(s));
	}

	public static String computingGC(String s) {
		ReadFasta reader = new ReadFasta();
		String aux = "";
		StringBuffer nome = new StringBuffer();
		String resultado = "";
		float percent = 0;
		float rPercent = 0;
		float tam = 0;

		do {
			aux = reader.Fasta(s);
			for (int j = 14; j < aux.length(); j++) {
				if (aux.charAt(j) == 'C' | aux.charAt(j) == 'G')  tam++;
			}
			percent = ((tam * 100) / (aux.length() - 15));

			tam = 0;
			if (percent > rPercent) {
				rPercent = percent;
				percent = 0;
				for (int h = 0; h < 14; h++) {
					nome.append(aux.charAt(h));
				}
				resultado = nome.toString();
				nome.setLength(0);
				;
			} else percent = 0;

			if ((s.length() - aux.length()) == 0) {
				s = null;}
			else {
				nome.setLength(0);
				for (int a = aux.length(); a < s.length(); a++) {
					nome.append(s.charAt(a));
				}
				s = nome.toString();
				nome.setLength(0);
			}

		} while (s != null);
		return ("" + resultado + "\n" + rPercent);
	}
}