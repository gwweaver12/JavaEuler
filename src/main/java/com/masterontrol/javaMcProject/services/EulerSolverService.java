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
        long fib1 = 1;
        long fib2 = 2;
        //set totalProblem2 to begin at 2 when adding sum
        long totalP2 = fib2;
        // Is it better to set the limit in the longs outside of the for loop? sets i to 0 then limits to 4million and adds increament of 1
        for (int i = 0; i < 4000000; i++) {
            //Sum of fib numbers is sum
            long sum = fib1 + fib2;
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
    void problem3(){
        long limit = 600851475143L; //Without L it didnt mark the number Long, also tried setting limit above loop
        long sumP3 = 0;
        //Sets i to 2 then sets a limit of when i is less than the limit divided by i, increament i by 1
        for (long i = 2; i < limit / i; i++){
            //divided liit by i for remainer until its equal to 0
            while (limit % i == 0){
                //sumP3 = i;
                //divides limit by i then sets limit
                limit /= i;
            }
        }
        //if statement of the limit is greater than 1 then set limit equal to sumProblem3 to display
        if (limit>1){
            sumP3 = limit;
        }
        //prints out answer
        System.out.println(sumP3);
    }
}
