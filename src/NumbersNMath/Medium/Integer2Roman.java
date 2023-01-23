package NumbersNMath.Medium;

// https://leetcode.com/problems/integer-to-roman/ - Medium

public class Integer2Roman {
    public static String intToRoman(int num) {
        // Runtime 9 ms Beats 70.38%
        // Memory 45 MB Beats 73.32%
        // StringBuilder roman=new StringBuilder();
        // int i=1;        
        // while(num>0){
        //     int digit=num%10;
        //     switch(i){
        //         case 1:
        //             switch(digit){
        //                 case 1: roman.insert(0,"I");break;
        //                 case 2: roman.insert(0,"II");break;
        //                 case 3: roman.insert(0,"III");break;
        //                 case 4: roman.insert(0,"IV");break;
        //                 case 5: roman.insert(0,"V");break;
        //                 case 6: roman.insert(0,"VI");break;
        //                 case 7: roman.insert(0,"VII");break;
        //                 case 8: roman.insert(0,"VIII");break;
        //                 case 9: roman.insert(0,"IX");break;
        //             }break;
        //             case 2:
        //             switch(digit){
        //                 case 1: roman.insert(0,"X");break;
        //                 case 2: roman.insert(0,"XX");break;
        //                 case 3: roman.insert(0,"
        
        
        //                 case 4: roman.insert(0,"XL");break;
        //                 case 5: roman.insert(0,"L");break;
        //                 case 6: roman.insert(0,"LX");break;
        //                 case 7: roman.insert(0,"LXX");break;
        //                 case 8: roman.insert(0,"LXXX");break;
        //                 case 9: roman.insert(0,"XC");break;
        //             }break;
        //             case 3:
        //             switch(digit){
        //                 case 1: roman.insert(0,"C");break;
        //                 case 2: roman.insert(0,"CC");break;
        //                 case 3: roman.insert(0,"CCC");break;
        //                 case 4: roman.insert(0,"CD");break;
        //                 case 5: roman.insert(0,"D");break;
        //                 case 6: roman.insert(0,"DC");break;
        //                 case 7: roman.insert(0,"DCC");break;
        //                 case 8: roman.insert(0,"DCCC");break;
        //                 case 9: roman.insert(0,"CM");break;
        //             }break;
        //             case 4:
        //             switch(digit){
        //                 case 1: roman.insert(0,"M");break;
        //                 case 2: roman.insert(0,"MM");break;
        //                 case 3: roman.insert(0,"MMM");break;                        
        //             }break;
        //     }
        //     num/=10;
        //     i++;
        // }        
        // return roman.toString();

        // Runtime 7 ms Beats 86.31%
        // Memory 45.1 MB Beats 70.73%
        StringBuilder roman=new StringBuilder();
        int temp=num/1000;
        num%=1000;
        while(temp-->0){roman.append('M');}

        if(num>=900){
            roman.append("CM");
            num-=900;
        }else if(num>=500){
            roman.append('D');
            num-=500;
        }else if(num>=400){
            roman.append("CD");
            num-=400;
        }

        temp=num/100;
        num%=100;
        while(temp-->0){roman.append('C');}

        if(num>=90){
            roman.append("XC");
            num-=90;
        }else if(num>=50){
            roman.append('L');
            num-=50;
        }else if(num>=40){
            roman.append("XL");
            num-=40;
        }

        temp=num/10;
        num%=10;
        while(temp-->0){roman.append('X');}

        if(num==9){
            roman.append("IX");
            num-=9;
        }else if(num>=5){
            roman.append('V');
            num-=5;
        }else if(num==4){
            roman.append("IV");
            num-=4;
        }

        while(num-->0){
            roman.append('I');
        }

        return roman.toString();
    }
}