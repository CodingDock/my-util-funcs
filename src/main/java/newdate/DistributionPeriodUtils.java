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
    
    //根据某年某月第几周算出实际时间段，尤其是周数是有逻辑的
    public static void getActualWeeks(int year,int month,int week){
        //根据业务划分week为第1,2,3,4周 ,但实际月份可能有3-5周不全完整的自然周，因此要算出实际对应的自然周
        LocalDate ld=LocalDate.of(year,month,1);//当月第一天
//        //算出实际周
//        DayOfWeek dw=ld.getDayOfWeek();
//        if(dw.compareTo(DayOfWeek.THURSDAY)<0){
//            System.out.println(1234);
//        }
        // 取本月最后一天，再也不用计算是28，29，30还是31：
//        LocalDate lastDayOfThisMonth = today.with(TemporalAdjusters.lastDayOfMonth()); // 2014-12-31
        week=week;//获取相应的月自然周数
        
        ld=ld.with(TemporalAdjusters.dayOfWeekInMonth(week,DayOfWeek.FRIDAY));
        
        ld=ld.plusDays(13);
        System.out.println(ld);
        ld=ld.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
        System.out.println(ld);

        //tag 2.0
        

    }
    
//    public static int getActualWeekNum(LocalDate ld,){
//        
//        
//    }

    public static void main(String[] args) {
        getActualWeeks(2016,11,1);
        
        
        
    }
    
    
    
}
