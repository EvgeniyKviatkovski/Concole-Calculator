package com.kwatkowskijeniya;

public class Calculator {


    private double result;


        public void plus(double firstnumber, double secondnumber) {

            result = firstnumber + secondnumber;
        }// end  add

    public void minus(double firstnumber, double secondnumber){

        result = firstnumber - secondnumber;
    }// end minus

    public void multiply(double firstnumber, double secondnumber){

        result = firstnumber * secondnumber;
    }// end multiply

    public void devide(double firstnumber, double secondnumber){
        result = firstnumber / secondnumber;

    }// end devide

public void degree(double firstnumber,double secondnumber){

        result = Math.pow(firstnumber,2);
}// end degree

    public void mathoperator (String actionuser,double firstnumber, double secondnumber ) {

        if (actionuser.equals("+")) {
            plus(firstnumber, secondnumber);
        }
        else if (actionuser.equals("-")){
            minus(firstnumber,secondnumber);
        }
        else if(actionuser.equals("*")){
            multiply(firstnumber,secondnumber);
        }
        else if(actionuser.equals("/")){
            devide(firstnumber,secondnumber);
        }
        if(actionuser.equals("^")){

            degree(firstnumber,secondnumber);
        }

    }// end matoperator


    public double getResult(){

        return result;
    }// end  getResult

    public void clearResult(String actionuser){

        if(actionuser.equals("clear")){

            result=0;
            System.out.println(" Результат вычислений удален!"+ result);
        }

    }// end clearResult


}// end class
