/*
 * Project and Training 1 - Computer Science, Berner Fachhochschule
 */
package math;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RationalCalculator{


        public static RationalNumber convert(String str){
                Scanner scan = new Scanner(str).useDelimiter("/");
                int num = scan.nextInt();
                int dom = (scan.hasNextInt()) ? scan.nextInt() : 1;
                scan.close();
                return new RationalNumber(num,dom);
        }


        public static RationalNumber evaluate (String rNumber) {
                Scanner scanner = new Scanner(rNumber);
                Pattern number = Pattern.compile("-?[0-9]+(/-?[0-9]+)?");
                Pattern operator = Pattern.compile("[+\\-*:]");
                Matcher numberMatch1 = number.matcher(scanner.next());
                RationalNumber r = null;
                if (numberMatch1.find()) {
                        r = convert(numberMatch1.group(0));
                } else {
                        scanner.close();
                        throw new IllegalArgumentException();
                }
                while(scanner.hasNext()) {
                        Matcher operatorMatch = operator.matcher(scanner.next());
                        Matcher numberMatch2 = number.matcher(scanner.next());
                        if(!operatorMatch.find() || !numberMatch2.find()) {
                                scanner.close();
                                throw new IllegalArgumentException();
                        }
                        switch(operatorMatch.group()) {
                                case "+": r.add(convert(numberMatch2.group(0)));
                                        break;
                                case "-": r.subtract(convert(numberMatch2.group(0)));
                                        break;
                                case "*": r.multiply(convert(numberMatch2.group(0)));
                                        break;
                                case ":": r.divide(convert(numberMatch2.group(0)));
                                        break;
                        }
                }
                scanner.close();
                return r;
        }

        public static void main(String[] args) {
                System.out.println("please enter a rational expression -> something like this 1/2 + 1 ");
                System.out.println("> ");
                Scanner scanner = new Scanner(System.in);
                System.out.println(evaluate(scanner.nextLine()));
                scanner.close();
        }
}