package com.masterontrol.javaMcProject.services;

import org.springframework.stereotype.Service;

@Service
public class EulerSolverService {
    public EulerSolverService(){
        //Sets the problems in the constructor to display
        problem1();
        problem2();
        problem3();
        problem4();
        problem5();
    }
    void problem1(){
        //set total as type long to 0
        long total = 0;
        //sets i to 3 and under 1000 and increament by one
        for(int i=3; i<1000;i++){
            //|| marks and or statement. Divides i and finds remained of either 3 or 5, increase the total by i
            if(i % 3==0 || i % 5==0){
                total += i;
            }
        }
        //prints out answer
        System.out.println(total);
    }
    void problem2() {
        //Starting at 1 and 2 instead of 0,1 to skip initial numbers, set as type long integar
        int fib1 = 1;
        int fib2 = 2;
        //set totalProblem2 to begin at 2 when adding sum
        int totalP2 = fib2;
        // Is it better to set the limit in the longs outside of the for loop? sets i to 0 then limits to 4million and adds increament of 1
        for (int i = 0; i < 4000000; i++) {
            //Sum of fib numbers is sum
            int sum = fib1 + fib2;
            //Is there a better format than 2 ifs?
            if (sum < 4000000) {
                //Limits under 4 million then divides sum by 2 for fibonacci sequence for remained if its equal to 0 ad sum to total
                if (sum % 2 == 0) {
                    totalP2 += sum;
                }
                //outside of above if statement, if sum<4million set fib1=fib2 fib2=sum to keep the progress of the script
                fib1 = fib2;
                fib2 = sum;
            }
        }
        //prints answer
        System.out.println(totalP2);
    }
    void problem3() {
        long limit = 600851475143L; //Without L it didnt mark the number Long, also tried setting limit above loop
        long totalP3 = 0;
        //Sets i to 2 then sets a limit of when i is less than the limit divided by i, increament i by 1
        for (long i = 2; i < limit; i++) {
            //divided limit by i for remainer until its equal to 0
            while (limit % i == 0) {
                //sumP3 = i;
                //divides limit by i then sets limit
                limit /= i;
            }
        }
        //if statement of the limit is greater than 1 then set limit equal to sumProblem3 to display
        if (limit > 1) {
            totalP3 = limit;
            //prints out answer
            System.out.println(totalP3);
        }
    }
    void problem4() {
        int highestPalindrome = 0;
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                if (isPalindrome(String.valueOf(i * j)) && i * j > highestPalindrome) {
                    highestPalindrome = i * j;
                }
            }
        }
        System.out.println(highestPalindrome);
    }
    boolean isPalindrome (String num){
        StringBuilder reversed = new StringBuilder("");
        for (int i = num.length() - 1; i >= 0; i--){
            reversed.append(num.charAt(i));
        }
        return num.equals(reversed.toString());
    }
    //tried breaking this up into two scripts. Tried a bunch with a boolean but could not get it out of a infinite loop
     void problem5() {
        int smallestFactor = 1;
        for (int i = 11; i <= 20; i++){
            smallestFactor = multiple(i, smallestFactor);
        }
        System.out.println(smallestFactor);
    }
    int multiple(int i, int j){
        for(int count =1; count <= i && count <= j; count++)
            // checks for remainder for both variables and if theyre mutiples then divides by count and sets back to i then returns product
            if(i % count == 0 && j % count == 0){
                i /= count;
            }
        return i*j;
    }
}

