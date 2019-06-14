package date_time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;


public class Program {

	public static void main(String[] args)
	{
		//instantiate
		LocalDate d1=LocalDate.of(2019,3, 7);
		System.out.println(d1);
		
		//current date
		LocalDate date=LocalDate.now();
		System.out.println("Todays date :"+date);
		
		//current time
		LocalTime time=LocalTime.now();
		System.out.println("Current time :"+time);
		
		//current date and time
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println("Current date and time: "+dateTime);
		
		
		//date time formatter
		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String format=dateTime.format(dateTimeFormatter);
		System.out.println(format);
		
		//zoned date time
		ZonedDateTime zonedDateTime=ZonedDateTime.now();
		System.out.println("Zoned date :"+zonedDateTime);
		
		//zone id
		ZoneId id=ZoneId.of("Asia/Tokyo");
		System.out.println(id);
		ZonedDateTime tokiyoTime=zonedDateTime.withZoneSameInstant(id);
		System.out.println(" "+tokiyoTime);
		
		//period
		LocalDate date1=LocalDate.now();
		LocalDate date2=LocalDate.of(2018,07, 03);
		Period difference=Period.between(date1, date2);
		System.out.println(difference);
		
		//Duration
		Duration hours=Duration.ofHours(5);
		LocalTime time1=LocalTime.now();
		time1.plus(hours);
		System.out.println(time1);
		
		//ChronoUnit enum
		LocalDate dateAdd=LocalDate.now().plus(2,ChronoUnit.YEARS);
		System.out.println(dateAdd);
		
		
		//TemporalAdjuster
		LocalDate date3=LocalDate.now();
		LocalDate firstDayOfNextMonth=date3.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println(firstDayOfNextMonth);
	}

}
