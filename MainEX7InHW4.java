import java.util.InputMismatchException;
import java.util.Scanner;


public class MainEX7InHW4 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        try {
            int  choose_number;
            System.out.println("enter array size");
            int array_size = input.nextInt();
            int element_numbers=array_size;
            int [] array = new int[array_size];
            int count=0;
            int element_of_array;
            int element_to_search;
            boolean isfound =true;

            do {
                System.out.println("enter\n 1.Accept elements of an array\n" +
                        "\n" +
                        "2.Display elements of an array\n" +
                        "\n" +
                        "3.Search the element within array\n" +
                        "\n" +
                        "4.Sort the array\n" +
                        "\n" +
                        "5.To Stop ");
                choose_number=input.nextInt();
                if (choose_number==1){
                    System.out.println("you can entre "+element_numbers + " element to array");
                    if(element_numbers==0){
                        System.out.println("you can not add more element to array");
                        continue;
                    }
                    else {

                        for (int i = count; i <= count; i++) {

                            System.out.println("enter element to add to array");
                            array[count] = element_of_array = input.nextInt();
                            System.out.println("your element is in the array ");
                            count++;

                        }
                        element_numbers--;
                    }

                }
                else if(choose_number==2){
                    System.out.print("the elements of array is: ");
                    for (int item:array){
                        System.out.print(item+" ");
                    }
                }
                else if(choose_number==3){
                    System.out.println("enter the element to serch in the array");
                    element_to_search=input.nextInt();
                    for(int outer =0; outer<array.length;outer++){
                        for (int inner=outer;inner<array.length;inner++){
                            if(array[inner]==element_to_search){
                                isfound = true;
                                break;
                            }
                            else {
                                isfound=false;
                            }
                        }
                        if (isfound==true){
                            System.out.println(element_to_search+ " is in the array");
                            break;
                        }
                        else {
                            System.out.println(element_to_search+ " is not in the array");
                            break;
                        }
                    }

                }
                else if(choose_number==4){
                    int temp =0;
                    for(int outer =0; outer<array.length;outer++){
                        for (int inner=outer;inner<array.length;inner++){
                            if (array[outer]>array[inner]){
                                temp=array[outer];
                                array[outer]= array[inner];
                                array[inner]=temp;
                            }
                        }
                    }
                    System.out.println("array is sorted");


                }
                else if(choose_number <1||choose_number>5){
                    System.out.println("you can not add less than 1 or more than 5");
                }
                System.out.println("\nnext enter");


            }while (choose_number!=5);
        }catch (InputMismatchException e1){
            System.out.println("you should enter number");
        }catch (NegativeArraySizeException e2){
            System.out.println("you put the array size by negative number");
        }catch (ArrayIndexOutOfBoundsException e3){
            System.out.println("you adding more than array size");
        }

        System.out.println("the program is end");
    }
}