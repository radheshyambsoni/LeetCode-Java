package Arrays;

// https://leetcode.com/problems/maximum-population-year/ - Easy
// Runtime: 1 ms, faster than 81.05% of Java online submissions for Maximum Population Year.
// Memory Usage: 42.5 MB, less than 33.65% of Java online submissions for Maximum Population Year.

public class MaxPopulationYear {
    public static int maximumPopulation(int[][] logs) {
        // HashMap<Integer,Integer> years=new HashMap<>();
        // HashSet<Integer> checkedYears=new HashSet<>();
        // for(int i=0;i<logs.length;i++){
        //     int year=logs[i][0];
        //     if(checkedYears.contains(year)){continue;}          
        //     for(int j=0;j<logs.length;j++){
        //         if(year>=logs[j][0] && year<logs[j][1]){
        //             years.put(year,years.getOrDefault(year,0)+1);
        //         }
        //     }
        //     checkedYears.add(year);        
        // }

        // // max population year which is minimum as well
        // int ans=0;
        // int max=0;
        // for(int i:years.keySet()){
        //     if(years.get(i)>=max){
        //         if(years.get(i)==max){
        //             ans=Integer.min(ans,i);
        //         }else{
        //             ans=i;
        //         }
        //         max=years.get(i);
        //     }
        // }
        // System.out.println(years);
        // return ans;

        // the above commented code is fine and smart, but for speed and space saving we can afford the array count
        // the array count - size will be 101 i.e equal to range of years given
        // i-th index will have count for the year 1950+i
        // again solution is from submission for the question
        int[] count=new int[101];
        // in the loop we are initialising the count for existing years in logs
        for(int i=0;i<logs.length;i++){
            count[logs[i][0]-1950]++;
            count[logs[i][1]-1950]--;
        }        
        int ans=1950,max=count[0];
        for(int i=1;i<101;i++){
            // prefix sum approach            
            count[i]+=count[i-1];
            if(count[i]>max){
                max=count[i];
                ans=i+1950;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(maximumPopulation(new int[][]{{2008,2026},{2004,2008},{2034,2035},{1999,2050},{2049,2050},{2011,2035},{1966,2033},{2044,2049},{2008,2009}}));
    }
}
// 2008 - 4, 2004 - 3, 2034 - 3, 1999 - 2, 2049 - 2, 2011 - 3, 1966 - 1, 2044 - 2