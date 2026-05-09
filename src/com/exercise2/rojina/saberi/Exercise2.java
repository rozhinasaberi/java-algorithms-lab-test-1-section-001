package com.exercise2.rojina.saberi;

public class Exercise2 {

    public static void main(String[] args) {

    	 // Student Number: 301533334
        // Full Name: Rojina Saberi


        String test1 = "racecar";
        String test2 = "hello";
        String test3 = "madam";
        String test4 = ""; 

        System.out.println(test1 + " -> " + isPalindrome(test1, 0, test1.length() - 1));
        System.out.println(test2 + " -> " + isPalindrome(test2, 0, test2.length() - 1));
        System.out.println(test3 + " -> " + isPalindrome(test3, 0, test3.length() - 1));
        System.out.println("empty string -> " + isPalindrome(test4, 0, test4.length() - 1));
    }

    public static boolean isPalindrome(String s, int left, int right) {

      
        if (left >= right)
            return true; //reaching middle of string

       
        if (s.charAt(left) != s.charAt(right))
            return false;

       
        return isPalindrome(s, left + 1, right - 1); //move inward in string
    }
}