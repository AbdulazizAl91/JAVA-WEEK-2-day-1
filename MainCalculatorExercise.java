import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class MainCalculatorExercise {
    public static void main (String[] args) {
        try {
            int condition;
            int number1;
            int number2;
            int result_int =0;
            double result_double=0.0;


            ArrayList arrayList= new ArrayList();
            Scanner input = new Scanner(System.in);
            do{
                System.out.println("Enter 1 to addition the numbers\n" +
                        "\n" +
                        "Enter 2 to subtraction the numbers\n" +
                        "\n" +
                        "Enter 3 to multiplication the numbers\n" +
                        "\n" +
                        "Enter 4 to division the numbers\n" +
                        "\n" +
                        "Enter 5 to modulus the numbers\n" +
                        "\n" +
                        "Enter 6 to find minimum number\n" +
                        "\n" +
                        "Enter 7 to find maximum number\n" +
                        "\n" +
                        "Enter 8 to find the average of numbers\n" +
                        "\n" +
                        "Enter 9 to print the last result in calculator\n" +
                        "\n" +
                        "Enter 10 to print the list of all results in calculator ");
                condition=input.nextInt();
                switch (condition){
                    case 0:
                        condition=0;
                        break;
                    case 1:
                        System.out.println("enter two numbers ");
                        number1=input.nextInt();
                        number2=input.nextInt();
                        result_int=addition(number1,number2);
                        arrayList.add(result_int);
                        System.out.println(addition(number1,number2));

                        break;
                    case 2:
                        System.out.println("enter two numbers ");
                        number1=input.nextInt();
                        number2=input.nextInt();
                        result_int=subtraction(number1,number2);
                        arrayList.add(result_int);
                        System.out.println(subtraction(number1,number2));

                        break;

                    case 3:
                        System.out.println("enter two numbers ");
                        number1=input.nextInt();
                        number2=input.nextInt();
                        result_int=multiplication(number1,number2);
                        arrayList.add(result_int);
                        System.out.println(multiplication(number1,number2));

                        break;
                    case 4:
                        System.out.println("enter two numbers ");
                        number1=input.nextInt();
                        number2=input.nextInt();
                        result_double=division(number1,number2);
                        arrayList.add(result_double);
                        System.out.println(division(number1,number2));

                        break;
                    case 5:
                        System.out.println("enter two numbers ");
                        number1=input.nextInt();
                        number2=input.nextInt();
                        result_double=modulus(number1,number2);
                        arrayList.add(result_double);
                        System.out.println(modulus(number1,number2));

                        break;
                    case 6:
                        System.out.println("enter two numbers ");
                        number1=input.nextInt();
                        number2=input.nextInt();
                        result_int=minimum(number1,number2);
                        arrayList.add(result_int);
                        System.out.println(minimum(number1,number2));

                        break;
                    case 7:
                        System.out.println("enter two numbers ");
                        number1=input.nextInt();
                        number2=input.nextInt();
                        result_int=maximum(number1,number2);
                        arrayList.add(result_int);
                        System.out.println(maximum(number1,number2));

                        break;
                    case 8:
                        System.out.println("enter two numbers ");
                        number1=input.nextInt();
                        number2=input.nextInt();
                        result_double=average(number1,number2);
                        arrayList.add(result_double);
                        System.out.println(average(number1,number2));

                        break;
                    case 9:

                        System.out.println(arrayList.get(arrayList.size()));
                        break;
                    case 10:
                        System.out.println(arrayList);
                        break;
                    default:
                        System.out.println("you can not enter more than 10 or less -1");

                }

            }while (condition!=0);
            System.out.println("the end");
        }catch (InputMismatchException e1){
            System.out.println("you can use only numbers");
        }catch (ArithmeticException e2){
            System.out.println("you can't divide by 0");
        }catch (IndexOutOfBoundsException e3){
            System.out.println("this index out of Arraylist");
        }catch (Exception e4){
            System.out.println(e4.getMessage());
        }



    }
    public static int addition(int number1, int number2){
        return number1+number2;
    }
    public static int subtraction (int number1, int number2){
        return number1-number2;
    }
    public static int multiplication  (int number1, int number2){
        return number1*number2;
    }
    public static double division   (int number1, int number2){
        return number1/number2;
    }
    public static double modulus    (int number1, int number2){
        return number1/number2;
    }
    public static int minimum   (int number1, int number2){
        if(number1>number2){
            return number2;
        }
        else if (number2>number1){
            return number1;
        }
        else return number1;
    }
    public static int  maximum    (int number1, int number2){
        if(number1<number2){
            return number2;
        }
        else if (number2<number1){
            return number1;
        }
        else return number1;
    }
    public static double average(int number1,int number2){
        return (number1+number2)/2;
    }




}