import java.time.LocalDate;

public class O7_dataandtime {
    public static void main(String[] args){
        //LocalDate/DateTimeFormatter 是 Java 8 引入的日期类，
        //LocalDate 用于表示不带时间的日期（年-月-日），DateTimeFormatter 用于格式化和解析日期时间对象。


        //获取当前日期
        LocalDate today = LocalDate.now();
        System.out.println("当前日期："+today);

        // 创建特定日期
        LocalDate nationalDay = LocalDate.of(2025, 10, 1);
        System.out.println("国庆节: " + nationalDay);


        //日期加减方法：plusDdays，plusMonths，minusYears
        LocalDate tomorrow = today.plusDays(1);
        LocalDate nextMonth = today.plusMonths(1);
        LocalDate lastYear = today.minusYears(1);

        System.out.println("明天: " + tomorrow);
        System.out.println("下个月: " + nextMonth);
        System.out.println("去年今天: " + lastYear);
    }
}
