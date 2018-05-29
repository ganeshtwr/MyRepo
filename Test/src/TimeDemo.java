import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
public class TimeDemo {
	
    static public void main(String args[]) {
        final ZoneId zoneId = ZoneId.of("Europe/Zurich");

    
        final ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(Instant.now(), zoneId);
        System.out.println("Europe/Zurich "+zonedDateTime.format(DateTimeFormatter.RFC_1123_DATE_TIME));

        final ZoneId zoneId2 = ZoneId.of("Asia/Calcutta");
        final ZonedDateTime zonedDateTime2 = ZonedDateTime.ofInstant(Instant.now(), zoneId2);
        System.out.println("Asia/Kolkata Format-RFC_1123_DATE_TIME  : "+zonedDateTime2.format(DateTimeFormatter.RFC_1123_DATE_TIME));
        System.out.println("Asia/Kolkata Format-LocalizedDateTime : "+zonedDateTime2.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL)));
        
        final ZoneId zoneId3 = ZoneId.of("Singapore");
        final ZonedDateTime zonedDateTime3 = ZonedDateTime.ofInstant(Instant.now(), zoneId3);
        System.out.println("Singapore : "+zonedDateTime3.format(DateTimeFormatter.RFC_1123_DATE_TIME));
        
        final ZoneId zoneId4 = ZoneId.of("Africa/Nairobi");
        final ZonedDateTime zonedDateTime4 = ZonedDateTime.ofInstant(Instant.now(), zoneId4);
        System.out.println("Kenya : "+zonedDateTime4.format(DateTimeFormatter.RFC_1123_DATE_TIME));
        

        
        
        
    }
}