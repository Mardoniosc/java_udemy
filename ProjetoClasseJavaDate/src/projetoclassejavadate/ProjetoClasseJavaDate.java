package projetoclassejavadate;

import java.sql.Date;
import java.sql.Time;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;

public class ProjetoClasseJavaDate {

	public static void main(String[] args) {

		//Pegar data atual
		Date d = Date.valueOf(LocalDate.now());
		System.out.println(d);
		
		//Pegar a hora atual
		Time t = Time.valueOf(LocalTime.now());
		System.out.println(t);
		
		Date f = Date.valueOf(LocalDate.MAX);
		System.out.println(f);
		
		Date e = Date.valueOf(LocalDate.MIN);
		System.out.println(e);

		String data = d.toString();
		String hora = t.toString();
		
		System.out.println("Mostrando a data atual como string: " + data +
				"\nMostrando a hora atual como string: " + hora);

	}

}
