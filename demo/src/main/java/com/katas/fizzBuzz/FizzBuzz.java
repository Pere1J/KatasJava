package com.katas.fizzBuzz;

public class FizzBuzz {

     public String execute(Integer num){
         if (num%3==0 && num%5==0) {return "FizzBuzz";}
         if (num%3==0) {
             return "Fizz";
         }
         if (num%5==0) {
             return "Buzz";
         }

         return String.valueOf(num);

         ////////////REFACTOR///////////////////////////


        /* public String execute(Integer num) {
             boolean isFizz = num % 3 == 0;
             boolean isBuzz = num % 5 == 0;

             return isFizz && isBuzz ? "FizzBuzz"
                     : isFizz ? "Fizz"
                     : isBuzz ? "Buzz"
                     : String.valueOf(num);
         }*/

     }



}
