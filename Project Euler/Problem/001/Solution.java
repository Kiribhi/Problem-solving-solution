// https://euler.synap.co.kr/problem=1
// https://projecteuler.net/problem=1

public class Solution {
 
    public static void main(String[] args) {
        int sum = 0 ;
        
        for(int i = 1; i < 1000; ++i) {
            if((i%3 == 0)||(i%5 == 0)) {
                sum += i;
            }
        }
        
        System.out.println("Sum:" + sum);
    }
}
