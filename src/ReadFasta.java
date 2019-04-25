// By Elthon Ferreira e Eder Lucena
public class ReadFasta {

	public static String Fasta(String s) {
		StringBuffer aux = new StringBuffer();
		String resultado = null;
		int j = 0;

		for (j = 0; j < s.length(); j++) {
			if (j == 0) 							 aux.append('>');
			else if (j > 0 && s.charAt(j) != '>')	 aux.append(s.charAt(j));
			else break;
		}

		resultado = aux.toString();
		System.out.println(resultado);
		return resultado;
	}
}
