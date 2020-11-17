/**
 * 
 */
package testMonthHandling;
import java.time.*;

/**
 * @author Patrick Copeland
 * @version 10/30/2020
 */
public class TestMonthHandling 
{
    public static void main(String[] args) 
    {
        LocalDate jan31;
        LocalDate dec31;

        // Write your code here
        jan31 = LocalDate.of(LocalDate.now().getYear(), 1, 31);
        dec31 = LocalDate.of(LocalDate.now().getYear(), 12, 31);

        for(int i = 1; i < 4; i++)
        {
            System.out.println(jan31.toString() + " + " + i + " months = " + jan31.plusMonths(i));
            System.out.println(dec31.toString() + " + " + i + " months = " + dec31.plusMonths(i));
        }
    }
}