import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author: Lidongyang
 * @Date: 2022/01/26/13:48
 * @Description:
 */
public class test2 {


    @Test
    public void kk(){
//        StringUtils.join("新年","快乐","!");
//        System.out.println(StringUtils.join("新年","快乐","!"));

        ZoneId zoneId = ZoneId.systemDefault();
        Date date = new Date();

        LocalDate now = LocalDate.now();
        System.out.println(now);
        ZonedDateTime zonedDateTime = now.atStartOfDay(zoneId);

        Date from = Date.from(zonedDateTime.toInstant());
        System.out.println(from);


        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(dateFormat.format(from));


    }

    @Test
    public void test() throws Exception {
        SimpleDateFormat df1 = new SimpleDateFormat("YYYY-MM-dd");
        SimpleDateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");

        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 2021);
        c.set(Calendar.MONTH, 11);

        // 2021年12月25日周六
        c.set(Calendar.DATE, 25);
        System.out.println("YYYY-MM-dd = " + df1.format(c.getTime()));
        System.out.println("yyyy-MM-dd = " + df2.format(c.getTime()));

        // 分割线
        System.out.println("========================");

        // 2021年12月26日 周日
        c.set(Calendar.DATE, 26);
        System.out.println("YYYY-MM-dd = " + df1.format(c.getTime()));
        System.out.println("yyyy-MM-dd = " + df2.format(c.getTime()));

    }
}
