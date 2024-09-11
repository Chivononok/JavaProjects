package datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DemoDateTime {
    public static void main(String args[]){
        LocalDateTime curDateTime = LocalDateTime.now();

        System.out.println(curDateTime.format (DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println(curDateTime.format(DateTimeFormatter.ofPattern("d MMMM yyyy',' hh':'mm':'ss a")));
        System.out.println(curDateTime.format(DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy' время' hh':'mm':'ss a")));

        LocalDateTime locDateT = LocalDateTime.parse("2023-03-19 : 10:12:24 AM", DateTimeFormatter.ofPattern("yyyy-MM-dd ':' hh':'" +
                "mm':'ss a"));
        System.out.println(locDateT);
    }
}
