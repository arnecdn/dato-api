package ske.sits.alaget;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void skalHaandterSommerTidMedZonedDateTime() {
        System.out.println("Vintertid -> sommertid");
        LocalDateTime localWinterDateTime = LocalDateTime.parse("2017-03-26T01:00:00");
        String BEFORE_INCREMENT = "%s: %s. Before incremeting 1 hour.";
        String AFTER_INCREMENT = "%s: %s. After incremeting 1 hour.\n";

        System.out.println(String.format(BEFORE_INCREMENT, "localWinterDateTime", localWinterDateTime));
        System.out.println(String.format(AFTER_INCREMENT, "localWinterDateTime", localWinterDateTime.plusHours(1)));

        OffsetDateTime offsetWinterDateTime = OffsetDateTime.of(localWinterDateTime, ZoneOffset.UTC);
        System.out.println(String.format(BEFORE_INCREMENT, "offsetWinterDateTime", offsetWinterDateTime));
        System.out.println(String.format(AFTER_INCREMENT, "offsetWinterDateTime", offsetWinterDateTime.plusHours(1)));

        ZonedDateTime zonedWinterDateTime = ZonedDateTime.of(localWinterDateTime, ZoneId.systemDefault());
        System.out.println(String.format(BEFORE_INCREMENT, "zonedWinterDateTime", zonedWinterDateTime));
        System.out.println(String.format(AFTER_INCREMENT, "zonedWinterDateTime", zonedWinterDateTime.plusHours(1)));

        System.out.println("Sommertid -> vintertid");
        LocalDateTime localSummerDateTime = LocalDateTime.parse("2017-10-29T02:00:00");

        System.out.println(String.format(BEFORE_INCREMENT, "localSummerDateTime", localSummerDateTime));
        System.out.println(String.format(AFTER_INCREMENT, "localSummerDateTime", localSummerDateTime.plusHours(1)));

        OffsetDateTime offsetSummerDateTime = OffsetDateTime.of(localSummerDateTime, ZoneOffset.UTC);
        System.out.println(String.format(BEFORE_INCREMENT, "offsetSummerDateTime", offsetSummerDateTime));
        System.out.println(String.format(AFTER_INCREMENT, "offsetSummerDateTime", offsetSummerDateTime.plusHours(1)));

        ZonedDateTime zonedSummerDateTime = ZonedDateTime.of(localSummerDateTime, ZoneId.systemDefault());
        System.out.println(String.format(BEFORE_INCREMENT, "zonedSummerDateTime", zonedSummerDateTime));
        System.out.println(String.format(AFTER_INCREMENT, "zonedSummerDateTime", zonedSummerDateTime.plusHours(1)));
    }

    @Test
    public void skalHaandterForskjelligeTidssoner() {
        System.out.println("Vintertid -> sommertid");
        LocalDateTime localWinterDateTime = LocalDateTime.parse("2017-03-26T01:00:00");
        String BEFORE_INCREMENT = "%s: %s. Before incremeting 1 hour.";
        String AFTER_INCREMENT = "%s: %s. After incremeting 1 hour.\n";

        System.out.println(String.format(BEFORE_INCREMENT, "localWinterDateTime", localWinterDateTime));
        System.out.println(String.format(AFTER_INCREMENT, "localWinterDateTime", localWinterDateTime.plusHours(1)));

        OffsetDateTime offsetWinterDateTime = OffsetDateTime.of(localWinterDateTime, ZoneOffset.UTC);
        OffsetDateTime offsetWinterDateTime = OffsetDateTime.of(localWinterDateTime, ZoneOffset.);
        System.out.println(String.format(BEFORE_INCREMENT, "offsetWinterDateTime", offsetWinterDateTime));
        System.out.println(String.format(AFTER_INCREMENT, "offsetWinterDateTime", offsetWinterDateTime.plusHours(1)));

        ZonedDateTime zonedWinterDateTime = ZonedDateTime.of(localWinterDateTime, ZoneId.systemDefault());
        System.out.println(String.format(BEFORE_INCREMENT, "zonedWinterDateTime", zonedWinterDateTime));
        System.out.println(String.format(AFTER_INCREMENT, "zonedWinterDateTime", zonedWinterDateTime.plusHours(1)));

    }

}
