package Arrays;

import java.util.HashMap;

public class MaxPopulationYear {
    public static int maximumPopulation(int[][] logs) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int i=0;i<logs.length;i++){
            h1.put(logs[i][0], h1.getOrDefault(logs[i][0],0)+1);
            for(int j=i+1;j<logs.length;j++){
                if(logs[i][1]>logs[j][0]){
                    h1.put(logs[j][0],h1.getOrDefault(logs[j][0],0)+1);
                }
                if(logs[i][1]>logs[j][1]){
                    h1.put(logs[j][1],h1.getOrDefault(logs[j][1],0)+1);
                }
            }
        }
        System.out.println(h1);
        int year=logs[0][0];
        for(int i:h1.keySet()){
            if(h1.get(i)>=h1.get(year)){year=i;}
        }

        return year;
    }
    public static void main(String[] args) {
        System.out.println(maximumPopulation(new int[][]{{1950,1961},{1960,1971},{1970,1981}}));
    }
}
