package java.com.panish;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.*;

public class GeneralClass {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime: " + localDateTime);

        //LocalDateTime utcDateTime = localDateTime.atOffset(ZoneOffset.UTC).toLocalDateTime();
        LocalDateTime utcDateTime = LocalDateTime.ofInstant(Instant.now(), ZoneOffset.UTC);
        System.out.println("Current UTC time: " + utcDateTime);

        LocalDateTime utcDateTime1 = LocalDateTime.ofInstant(new Date().toInstant(), ZoneOffset.UTC);
        System.out.println("Current UTC time: " + utcDateTime1);

       /* System.out.println(TimeZone.getDefault().getDisplayName());
        System.out.println(TimeZone.getDefault().getID());*/
    }

}
