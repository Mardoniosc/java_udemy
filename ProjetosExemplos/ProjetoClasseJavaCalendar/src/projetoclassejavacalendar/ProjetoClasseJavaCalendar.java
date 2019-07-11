package projetoclassejavacalendar;

import java.util.Calendar;

public class ProjetoClasseJavaCalendar {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		
		System.out.println(c.getTime());// passa a hora e data atual getTime()
		System.out.println(c.get(Calendar.YEAR));//Passa o ano atual
		System.out.println(c.get(Calendar.MONTH));//Passa o mes atual
		System.out.println(c.get(Calendar.DAY_OF_YEAR));//passa o dia em relação ao ano
		System.out.println(c.get(Calendar.DAY_OF_WEEK));//passar o dia da semana
		
		if(c.get(Calendar.DAY_OF_WEEK) == 6) {
			System.out.println("Hoje é sexta feira");
		}
		
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		
		Calendar cl = Calendar.getInstance();
		int ano = 1995;
		
		cl.set(Calendar.YEAR, ano);
		System.out.println(cl.get(Calendar.YEAR));
		
		System.out.println("");
		cl.set(2019, 06, 22);
		System.out.println(cl.get(Calendar.YEAR));
		System.out.println(cl.get(Calendar.MONTH));
		System.out.println(cl.get(Calendar.DAY_OF_MONTH));
	}

}
