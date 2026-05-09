package com.exercise1.rojina.saberi;

public class Exercise1 {

    public static void main(String[] args) {

        // Student Number: 301533334
        // Full Name: Rojina Saberi

        int[] arr = {5, 12, 3, 19, 25, 7, 30, 1, 50, 9, 11, 8, 60};

        int[] topTen = findTenLargest(arr);

        System.out.println("Ten largest elements:");
        for (int num : topTen) {
            System.out.print(num + " ");
        }
    }

    public static int[] findTenLargest(int[] arr) {

        int n = arr.length;
        int[] result = new int[10];
        boolean[] used = new boolean[n]; //to remember numbers already picked 

        for (int k = 0; k < 10; k++) {

            int maxIndex = -1; //location of biggest number

            for (int i = 0; i < n; i++) {
                if (!used[i] && (maxIndex == -1 || arr[i] > arr[maxIndex])) {
                    maxIndex = i;
                }
            }

            result[k] = arr[maxIndex];
            used[maxIndex] = true;
        }

        return result;
    }
}