package com.masterontrol.javaMcProject.services;

import org.springframework.stereotype.Service;

@Service
public class EulerSolverService {
    public EulerSolverService(){
        problem1();
        problem2();
    }
    void problem1(){
        long total = 0;
        for(int i=3; i<1000;i++){
            if(i % 3==0 || i % 5==0){
                total += i;
            }
        }
        System.out.println(total);
    }
    void problem2() {
        long fib1 = 1;
        long fib2 = 2;
        long total2 = fib2;
        for (int i = 0; i < 4000000; i++) {
            long sum = fib1 + fib2;
            if (sum < 4000000) {
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

    }
}
