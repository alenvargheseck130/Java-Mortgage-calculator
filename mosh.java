import java.text.NumberFormat;
import java.util.Scanner;

import javax.naming.InitialContext;

public class mosh {
    public static void main(String[] args){
        Integer percentage = 100;
        Integer months = 12;
        Scanner user_input = new Scanner(System.in);
        System.out.print("Principal : ");
        Integer principal = user_input.nextInt();
        System.out.print("Annual Interest Rate : ");
        Double interest_rate = user_input.nextDouble();
        interest_rate = (interest_rate / percentage)/months;
        System.out.print("Period (Years) : ");
        Integer period = user_input.nextInt();
        period = period * months; 
        double base = (1+interest_rate);
        double exponent = period;
        double Mortgage = (principal* interest_rate * (Math.pow(base,exponent)))/(Math.pow(base,exponent)-1);
        //and now the using the NumberFormat class to convert mortgage to currency format
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String currency = formatter.format(Mortgage);
        //printing the final Mortgage
        System.out.println("Mortgage : " + currency);
    }
}