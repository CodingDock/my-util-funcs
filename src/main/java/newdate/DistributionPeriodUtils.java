package newdate;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * 配货期时间计算工具类
 * Created by 肖明明 on 2016/11/23.
 */
public class DistributionPeriodUtils {
    
    public static void getActualWeeks(int year,int month,int week){
        LocalDate ld=LocalDate.of(year,month,1);//当月第一天
        
        ld=ld.with(TemporalAdjusters.dayOfWeekInMonth(week,DayOfWeek.FRIDAY));
        
        ld=ld.plusDays(13);
        System.out.println(ld);
        ld=ld.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
        System.out.println(ld);

        //tag 4.0
        

    }
    
//    public static int getActualWeekNum(LocalDate ld,){
//        
//        
//    }

    public static void main(String[] args) {
        getActualWeeks(2016,11,1);
        
        
        
    }
    
    
    
}
