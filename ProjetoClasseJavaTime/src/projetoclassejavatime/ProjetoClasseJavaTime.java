package projetoclassejavatime;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;

public class ProjetoClasseJavaTime {

	public static void main(String[] args) {

		Time t = Time.valueOf(LocalTime.now());
		System.out.println(t);
		Year y = Year.now();
		System.out.println(y);
		YearMonth ym = YearMonth.now();
		System.out.println(ym);
		MonthDay md = MonthDay.now();
		System.out.println(md);
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		OffsetDateTime dt = OffsetDateTime.now();
		System.out.println(dt);
		ZoneId z = ZoneId.systemDefault();
		System.out.println(z);
		Period p = Period.ofYears(2019);
		System.out.println(p);//ISO-8601
		
		Time horaAtual = Time.valueOf(LocalTime.now());
		System.out.println("Hora atual - " + horaAtual);

	}

}
