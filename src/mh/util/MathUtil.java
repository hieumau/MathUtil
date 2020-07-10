/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mh.util;

/**
 *
 * @author saost
 */
public class MathUtil {
    public static long computeFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++){
            result *= i;
        }            
        
        return result;
    }
}
