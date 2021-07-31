package com.masterontrol.javaMcProject.services;

import org.springframework.stereotype.Service;

@Service
public class EulerSolverService {
    public EulerSolverService(){
        problem1();
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
    void problem2(){

    }
}
