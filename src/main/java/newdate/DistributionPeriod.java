package newdate;

import java.time.LocalDate;

/**
 * 配货周期实体类
 * Created by 肖明明 on 2016/11/23.
 */
public class DistributionPeriod {
    
    private LocalDate startDate;
    private LocalDate endDate;
    private int year;
    private int month;
    private int salesWeek;//业务周。取值范围1,2,3,4
    private int naturalWeek;//自然周，取值范围1,2,3,4,5
    
    
    public DistributionPeriod nextSalesDistributionPeriod(){
        return null;
    }

    
    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getNaturalWeek() {
        return naturalWeek;
    }

    public void setNaturalWeek(int naturalWeek) {
        this.naturalWeek = naturalWeek;
    }

    public int getSalesWeek() {
        return salesWeek;
    }

    public void setSalesWeek(int salesWeek) {
        this.salesWeek = salesWeek;
    }
    
    
    
}
