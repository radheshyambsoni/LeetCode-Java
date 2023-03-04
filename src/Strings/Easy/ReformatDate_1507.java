package Strings.Easy;

// 1507. Reformat Date
// https://leetcode.com/problems/reformat-date/
// Runtime 0 ms Beats 100%
// Memory 40.6 MB Beats 71.63%
// Mar 04, 2023

public class ReformatDate_1507 {
    public static  String reformatDate(String date) {
        int n=date.length();
        StringBuilder ans=new StringBuilder(date.substring(n-4));
        ans.append('-');
        String m=date.substring(n-8,n-5);
        if(m.equals("Jan")) ans.append("01-");
        else if(m.equals("Feb")) ans.append("02-");
        else if(m.equals("Mar")) ans.append("03-");
        else if(m.equals("Apr")) ans.append("04-");
        else if(m.equals("May")) ans.append("05-");
        else if(m.equals("Jun")) ans.append("06-");
        else if(m.equals("Jul")) ans.append("07-");
        else if(m.equals("Aug")) ans.append("08-");
        else if(m.equals("Sep")) ans.append("09-");
        else if(m.equals("Oct")) ans.append("10-");
        else if(m.equals("Nov")) ans.append("11-");
        else ans.append("12-");
        char d0=date.charAt(0),d1=date.charAt(1);
        if(d0=='1' || d0=='2' || d0=='3'){
            if(d1>='0' && d1<='9'){
                ans.append(d0);
                ans.append(d1);
            }else{
                ans.append('0');
                ans.append(d0);
            }
        }else{
            ans.append('0');
            ans.append(d0);
        }
        return ans.toString();
    }
}