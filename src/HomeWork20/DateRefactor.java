package HomeWork20;

import java.time.*;
import java.util.Date;

public class DateRefactor {
    public static java.util.Date asDate(LocalDate localDate){
        return java.util.Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }

    public static java.util.Date asDate(LocalDateTime localDateTime){
        return java.util.Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

    public static LocalDate asLocalDate(java.util.Date date){
        return Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public static LocalTime asLocalTime(java.util.Date date){
        return Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalTime();
    }

    public static LocalDateTime asLocalDateTime(java.util.Date date){
        return Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDateTime();
    }


}
//Date --> LocalDate.
//Date --> LocalTime,
//Date --> LocalDateTime