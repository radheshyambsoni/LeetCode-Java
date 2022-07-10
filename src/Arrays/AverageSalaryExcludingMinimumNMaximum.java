package Arrays;

// 1491. Average Salary Excluding the Minimum and Maximum Salary
// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
// Related Topics - Array, Sorting

public class AverageSalaryExcludingMinimumNMaximum {
    public double average(int[] salary) {
        double avg=0;
        int min=1000001;
        int max=999;
        for(int i=0;i<salary.length;i++){
            avg+=salary[i];
            if(min>salary[i]){min=salary[i];}
            if(max<salary[i]){max=salary[i];}
        }
        
        avg=(avg-(min+max))/(salary.length-2);
        
        return avg;
    }
}