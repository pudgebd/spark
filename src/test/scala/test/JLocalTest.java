package test;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

/**
 */
public class JLocalTest {

    @Test
    public void Test7() {
        String str = "insert into cq_table_05 (rowkey, a, b, '";
        System.out.println(str.length());
    }


    public void Test6() {
        String line = "This order was placed for QT3000! OK? default '1123'";
        String pattern = "default\\s+'\\d+'";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(line);
        System.out.println(m.find());
    }

    public void Test5() {
        byte[] byteArray = "abcdefg".getBytes(StandardCharsets.UTF_8);
        String str = new String(byteArray, 1, 3, StandardCharsets.ISO_8859_1);
        int offset = 2;
//        int bt = byteArray[offset] & 0xFF;
        System.out.println(byteArray[offset] & 0xFF);
    }

    public void Test4() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, 84);
//        System.out.println(DateUtils.formatToFullF(cal.getTime()));
    }

    public void Test3() {
        byte bytes[] = new byte[]{126};
        String str = new String(bytes);
        System.err.println(str);
    }


    public void Test2() {
//        URL url = new URL("https://www.google.com");
//        System.err.println(IOUtils.toString(url.openStream(), "utf8"));

        long yesterdayMs = System.currentTimeMillis() - 24 * 60 * 60 * 1000;
        long oneHourMs = 60 * 60 * 1000;
        System.out.println(yesterdayMs);
        System.out.println(yesterdayMs + oneHourMs);
        System.out.println(yesterdayMs + oneHourMs * 2);
        System.out.println(yesterdayMs + oneHourMs * 3);
        System.out.println(yesterdayMs + oneHourMs * 4);
        System.out.println(yesterdayMs + oneHourMs * 5);
//        System.out.println(yesterdayMs + oneHourMs * 6);

//        System.err.println(
//                DateUtils.formatToFullF(
//                        CalendarUtils.getCalendarBy(yesterdayMs + oneHourMs * 5).getTime()));
    }


}
