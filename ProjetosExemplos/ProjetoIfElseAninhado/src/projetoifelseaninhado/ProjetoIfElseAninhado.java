package projetoifelseaninhado;

public class ProjetoIfElseAninhado {

	public static void main(String[] args) {
		
		// if e else aninhados
		double score = 85.0;
		char graduacao = ' ';
		
		if (score >= 90.0) {
			graduacao = 'A';
		}
		else 
			if(score >= 80) {
			graduacao = 'B';
		}
			else 
				if(score >= 70){
				graduacao = 'C';
			}
				else 
					if(score >= 60){
					graduacao = 'D';
				}
					else 
						if(score < 60) {
							graduacao = 'E';
						}
		System.out.println("O score é: " + score + " e sua graduação é: " + graduacao);
	}

}
