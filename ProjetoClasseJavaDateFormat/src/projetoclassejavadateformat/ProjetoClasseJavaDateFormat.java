package projetoclassejavadateformat;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class ProjetoClasseJavaDateFormat {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		
		Date data1 = c.getTime();
		System.out.println(data1);
		
		// formatar a data
		DateFormat data = DateFormat.getDateInstance();
		System.out.println(data.format(data1));
		
		//formatar a hora
		DateFormat hora = DateFormat.getTimeInstance();
		System.out.println(hora.format(data1));
		
		//formatar data e hora
		DateFormat dataHora = DateFormat.getDateTimeInstance();
		System.out.println(dataHora.format(data1));
		
	}

}
