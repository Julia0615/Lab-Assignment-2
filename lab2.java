/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author bahatizhuliduosi
 */

import java.util.Scanner;

public class lab2 {

    public class Solution {
        public static void main(String[] args) {   
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            int[] A = new int[N]; 
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();  
            }
            scanner.close();
            int result = NumsofNegativesubarray(N,A);
            System.out.println(result);
        }

        public static int NumsofNegativesubarray(int N, int[] A) {
            int count = 0;
            int[] sum = new int[A.length + 1];

            for (int i = 0; i < A.length; i++) {
                sum[i + 1] = sum[i] + A[i];
            }

            for (int i = 0; i < A.length; i++) {
                for (int j = i; j < A.length; j++) {
                    if (sum[j + 1] - sum[i] < 0) {
                        count++;
                    }
                }
            }   
            return count;
        }
    }

}
