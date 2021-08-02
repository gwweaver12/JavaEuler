package com.masterontrol.javaMcProject.services;

import org.springframework.stereotype.Service;

@Service
public class EulerSolverService {
    public EulerSolverService(){
        //Sets the problems in the constructor to display
        problem1();
        problem2();
        problem3();
    }
    void problem1(){
        long total = 0;
        //sets i to 3 and under 1000
        for(int i=3; i<1000;i++){
            //|| marks an or statement, either 3 or 5 increase the total by i
            if(i % 3==0 || i % 5==0){
                total += i;
            }
        }
        //prints out answer
        System.out.println(total);
    }
    void problem2() {
        //Starting at 1 and 2 instead of 0,1 to skip initial numbers
        long fib1 = 1;
        long fib2 = 2;
        long total2 = fib2;
        // Is it better to set the limit in the longs outside of the for loop?
        for (int i = 0; i < 4000000; i++) {
            long sum = fib1 + fib2;
            //Is there a better format than 2 ifs?
            if (sum < 4000000) {
                //Limits under 4million then divides sum by 2 for fibonacci sequence
                if (sum % 2 == 0) {
                    total2 += sum;
                }
                fib1 = fib2;
                fib2 = sum;
            }
        }
        System.out.println(total2);
    }
    void problem3(){
        long limit = 600851475143L; //Without L it didnt mark the number Long, also tried setting limit above loop
        long sumP3 = 0;
        for (long i = 2; i < limit / i; i++){
            while (limit % i == 0){
                sumP3 = i;
                //divides limit by i then sets limit
                limit /= i;
            }
        }
        //if statement if the limit is greater than 1
        if (limit>1){
            sumP3 = limit;
        }
        System.out.println(sumP3);
    }
}
