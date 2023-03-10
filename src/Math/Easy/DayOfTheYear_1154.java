package Math.Easy;

// 1154. Day of the Year
// https://leetcode.com/problems/day-of-the-year/
// Runtime 14 ms Beats 42.54%
// Memory 43.2 MB Beats 42.94%

public class DayOfTheYear_1154 {
    public int dayOfYear(String date) {
        int[] days=new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        for(int i=1;i<days.length;i++) days[i]+=days[i-1];
        String[] d = date.split("-");
        int y=Integer.parseInt(d[0]), m=Integer.parseInt(d[1])-1,day=Integer.parseInt(d[2]);
        day+=days[m];
        if(m>1 && (y%400==0 || (y%4==0 && y%100!=0))){
            day+=1;
        }
        return day;
    }
}