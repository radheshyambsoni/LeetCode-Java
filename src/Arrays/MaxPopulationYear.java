package Arrays;

import java.util.HashMap;
import java.util.HashSet;

public class MaxPopulationYear {
    public static int maximumPopulation(int[][] logs) {
        HashMap<Integer,Integer> years=new HashMap<>();
        HashSet<Integer> checkedYears=new HashSet<>();
        for(int i=0;i<logs.length;i++){
            years.put(logs[i][0],years.getOrDefault(logs[i][0],0)+1);
            for(int j=0;j<logs.length;j++){
                if(i==j){continue;}
                if(logs[i][0]>=logs[j][0] && logs[i][0]<logs[j][1] && !checkedYears.contains(logs[i][0])){
                    years.put(logs[i][0],years.getOrDefault(logs[i][0],0)+1);
                }
                checkedYears.add(logs[i][0]);
                if(logs[i][1]>logs[j][0] && logs[i][1]<logs[j][1] && !checkedYears.contains(logs[i][0])){
                    years.put(logs[i][1],years.getOrDefault(logs[i][1],0)+1);
                }
                checkedYears.add(logs[i][1]);
            }
        }
        System.out.println(years);
        int year=logs[0][0];
        for(int i:years.keySet()){
            if(years.get(i)>years.get(year)){year=i;}
            else if(years.get(i)==years.get(year) && year>i){year=i;}
        }
        return year;
    }
    public static void main(String[] args) {
        System.out.println(maximumPopulation(new int[][]{{2008,2026},{2004,2008},{2034,2035},{1999,2050},{2049,2050},{2011,2035},{1966,2033},{2044,2049},{2008,2009}}));
    }
}
