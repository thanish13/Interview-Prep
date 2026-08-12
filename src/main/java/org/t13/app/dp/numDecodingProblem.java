package org.t13.app.dp;

import java.util.Arrays;

public class numDecodingProblem {

    static void main() {
        System.out.println(numDecoding("123"));
    }

    public static int numDecoding(String s) {

        int sLength = s.length();

        int[] code = new int[sLength];;

        Arrays.fill(code, 0);

        for(int i = 0; i <= sLength - 1; i++ ){
            System.out.println(s.charAt(i));
            code[i] = s.charAt(i) - '0';
        }

        System.out.println(Arrays.toString(code));

        int[] dp = new int[sLength + 1];
        dp[0] = 1;
        dp[1] = 0;
        if (code[0] >= 1){
            dp[1] = 1;
        }

        for(int i = 2; i <= sLength; i++){
            if(code[i - 1] >=1){
                dp[i] += dp[i - 1] ;
            }
            if(code[i - 2] == 1 && code[i - 1] < 10){
                dp[i] += dp[i - 2];
            }
            if(code[i - 2] == 2 && code[i - 1] < 7){
                dp[i] += dp[i - 2];
            }
            System.out.println(Arrays.toString(dp));

        }
        return dp[sLength];
        
    }
}