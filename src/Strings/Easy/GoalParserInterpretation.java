package Strings.Easy;

// https://leetcode.com/problems/goal-parser-interpretation/
// Runtime 1 ms Beats 93.56%
// Memory 42.1 MB Beats 55.55%

public class GoalParserInterpretation {
    public static String interpret(String command){
        StringBuilder sb=new StringBuilder();        
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='G'){
                sb.append('G');
            }else if(command.charAt(i)=='('){
                if(command.charAt(i+1)==')'){
                    sb.append('o');
                    i++;
                }else{
                    sb.append("al");
                    i+=2;
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(interpret("G()"));
    }
}
