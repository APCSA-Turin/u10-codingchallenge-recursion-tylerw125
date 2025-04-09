    package com.example.project;

    public class RecursionChallenge {

            public static int bunnyEars(int n){
                if (n == 0) {
                    return 0;
                }
                return 2 + bunnyEars(n -  1);
            }
        
            public static int factorial(int n){
                if (n == 1) {
                    return 1;
                }
                return n * factorial(n - 1);
            }

            public static int sumNumbers(int n){
                if (n == 1) {
                    return 1;
                }
                return n + sumNumbers(n - 1);
            }

            public static String countDown(int n){
                if (n == 0) {
                    return "Blast Off!";
                }
                countDown(n - 1);
                return n + "!";
            }

            public static int power(int x, int n){
                if (n == 0) {
                    return 1;
                }
                return x * power(x, n - 1);
            }

            public static int fib(int n){
                if (n <= 1) {
                    return n;
                }
                return fib(n - 1) + fib(n - 2);
            }

            public static int countX(String s){
                if (s.isEmpty()) {
                    return 0;
                }
                return (s.charAt(0) == 'x' ? 1 : 0)  + countX(s.substring(1));
            }

            public static String changePi(String s){
                if (s.length() < 2) {
                    return s;
                }
                if (s.startsWith("pi")) {
                    return "3.14" + changePi(s.substring(2));
                }
                return s.charAt(0) + changePi(s.substring(1));
            }


            public static String reverse(String s){
                if (s.length() <= 1) { 
                    return s;
                }
                return reverse(s.substring(1)) + s.charAt(0);
            }

            public static Boolean isPalindrome(String s){
                if (s.length() <= 1) {
                    return true;
                }
                if (s.charAt(0) != s.charAt(s.length() - 1)) { 
                    return false;
                }
                return (isPalindrome(s.substring(1, s.length() - 1)));
            }

            public static void main(String[] args) {
                // 1
                System.out.println("bunnyEars(3): " + bunnyEars(3));
            
                // 2
                System.out.println("factorial(4): " + factorial(4));
            
                // 3
                System.out.println("sumNumbers(3): " + sumNumbers(3));
            
                // 4
                System.out.print("countDown(3): ");
                countDown(3);
        
                // 5
                System.out.println("power(2, 3): " + power(2, 3));
            
                // 6
                System.out.println("fib(6): " + fib(6));
            
                // 7
                System.out.println("countX(\"axbx\"): " + countX("axbx"));
            
                // 8
                System.out.println("changePi(\"xpix\"): " + changePi("xpix"));
            
                
            
                // 10
                System.out.println("isPalindrome(\"racecar\"): " + isPalindrome("racecar"));
                System.out.println("isPalindrome(\"hello\"): " + isPalindrome("hello"));
            }
            
    }