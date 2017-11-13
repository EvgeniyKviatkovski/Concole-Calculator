package com.kwatkowskijeniya;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String actionuser = null;
        double firstnumber = 0;
        double secondnumber = 0;

        Scanner scanner = new Scanner(System.in);
try {

    Calculator calc = new Calculator();

        do {
            
           if(calc.getResult()==0){// if this is the first run

                System.out.println("Введите первое число:");
                firstnumber = scanner.nextDouble();
                System.out.println("Введите второе число:");
            }
            else {

                firstnumber = calc.getResult();
               System.out.println("Введите второе число:");
           }

            secondnumber = scanner.nextDouble();
            System.out.println("Сделайте действие: + - * / ^");
            actionuser = scanner.next();
            calc.mathoperator(actionuser, firstnumber, secondnumber);
            System.out.println("Результат: " + calc.getResult()+" Очистить результат: введите clear Продолжить: введите save ");
            System.out.println("Выйти из программы: введите yes");
            actionuser = scanner.next();
            calc.clearResult(actionuser);

        }//

while(!actionuser.equals("!yes"));

}
catch (Exception exeption){

    System.out.println("Вы ввели недопустимые символы!");
}// end try-catch

}// end method main
}// end class

