
import java.awt.List;
import java.time.Year;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;
import java.util.GregorianCalendar;
import static javafx.beans.binding.Bindings.and;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HP
 */
public class YearRange {

   
}

class LeapYears {

    public static void main(String[] args) {
        
        //Get all leap years.
        YearRange mySecondRange = new YearRange(1100, 3150);
        mySecondRange.setRangeType(2);

        GregorianCalendar cal = new GregorianCalendar();

        System.out.println("Leap years between 1100 and 3015:");
        for (int year = 1100; year < 3015; year++) {
            if (cal.isLeapYear(year)) {
                System.out.println(year);
            }
        }
    }

    private static class YearRange {

        public YearRange(int i, int i0) {
        }
        
        private void setRangeType(int i) {
            
        }
    }
}

class OlympicYears {

    public static void main(String args[]) {
        
        //Get all Olympic years divisible by 3
        YearRange myThirdRange = new YearRange(1500, 1890);
        myThirdRange.setRangeType(3);
        
        System.out.println("\nLeap years between 1500 and 1890: ");
        for (int i = 1500; i < 1890; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }

        System.out.println("\n");
    }

    private static class YearRange {

        public YearRange(int i, int i0) {
        }
        private void setRangeType(int i) {
            
        }
    }
}

class Divisible {

    public static void main(String args[]) {
        //Get all years divisible by 14 and 20
        YearRange myFirstRange = new YearRange(1314, 2014);
        myFirstRange.setRangeType(1);
        System.out.println("\nList of years divisible by 14: ");
        for (int i = 1314; i < 2014; i++) {
            if (i % 14 == 0) {
                System.out.print(i + ", ");
            }
        }

        System.out.println("\n\nList of years divisible by 14: ");
        for (int i = 1314; i < 2014; i++) {
            if (i % 20 == 0) {
                System.out.print(i + ", ");
            }
        }

        System.out.println("\n\nList of years divisible by 14 & 20: ");
        for (int i = 1314; i < 2014; i++) {
            if (i % 14 == 0 && i % 20 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println("\n");
    }

    private static class YearRange {

        public YearRange(int i, int i0) {
        }

        private void setRangeType(int i) {
            
        }
    }
}
