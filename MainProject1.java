import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class MainProject1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random= new Random();
        int user;
        int computer;
        int count=0;
        char [][] tic_tac = new char[5][5];
        for(int i=0;i< tic_tac.length;i++){
            for (int j =0;j< tic_tac.length;j++){
                if((i==0 && j==1)||(i==0 && j==3)||(i==2 && j==1)||(i==2 && j==3)
                    || (i==4 && j==1)||(i==4 && j==3)){
                    tic_tac[i][j]='|';
                }
                else if((i==1 && j==0)||(i==1 && j==2)||(i==1 && j==4)||(i==3 && j==0)
                        || (i==3 && j==2)||(i==3 && j==4)){
                    tic_tac[i][j]='-';
                }
                else if((i==1 && j==1)||(i==1 && j==3)||(i==3 && j==1)||(i==3 && j==3)){
                    tic_tac[i][j]='+';
                }
                else {
                    tic_tac[i][j]=' ';
                }

            }
        }
        try {

            ArrayList userChoose=new ArrayList();
            ArrayList computerChoose=new ArrayList();


            printArray(tic_tac);
            while (true) {
                System.out.println("where would you like to play? (1-9)");
                user = input.nextInt();



                    while (userChoose.contains(user) || computerChoose.contains(user)) {
                        System.out.println(user+" is not valid move");
                        user = input.nextInt();
                    }
                    gameValue(tic_tac, "player", user);
                    userChoose.add(user);
                    count++;
                    printArray(tic_tac);
                    System.out.println(" ");
                    computer = random.nextInt(9) + 1;
                    if (count==9){
                        System.out.println("Draw");
                        break;
                    }
                    while (userChoose.contains(computer) || computerChoose.contains(computer)) {

                        computer = random.nextInt(9) + 1;
                    }

                    gameValue(tic_tac, "computer", computer);
                    computerChoose.add(computer);
                    count++;
                    System.out.println("computer chose "+computer);
                    printArray(tic_tac);


                if((computerChoose.contains(1)&& computerChoose.contains(2)&& computerChoose.contains(3))||
                        (computerChoose.contains(4)&& computerChoose.contains(5)&& computerChoose.contains(6))||
                        (computerChoose.contains(7)&& computerChoose.contains(8)&& computerChoose.contains(9))||
                        (computerChoose.contains(1)&& computerChoose.contains(5)&& computerChoose.contains(9))||
                        (computerChoose.contains(3)&& computerChoose.contains(5)&& computerChoose.contains(7))||
                        (computerChoose.contains(1)&& computerChoose.contains(3)&& computerChoose.contains(7))||
                        (computerChoose.contains(2)&& computerChoose.contains(5)&& computerChoose.contains(8))||
                        (computerChoose.contains(3)&& computerChoose.contains(6)&& computerChoose.contains(9))){
                    System.out.println("computer win!");
                    break;
                }
                else if((userChoose.contains(1)&& userChoose.contains(2)&& userChoose.contains(3))||
                        (userChoose.contains(4)&& userChoose.contains(5)&& userChoose.contains(6))||
                        (userChoose.contains(7)&& userChoose.contains(8)&& userChoose.contains(9))||
                        (userChoose.contains(1)&& userChoose.contains(5)&& userChoose.contains(9))||
                        (userChoose.contains(3)&& userChoose.contains(5)&& userChoose.contains(7))||
                        (userChoose.contains(1)&& userChoose.contains(3)&& userChoose.contains(7))||
                        (userChoose.contains(2)&& userChoose.contains(5)&& userChoose.contains(8))||
                        (userChoose.contains(3)&& userChoose.contains(6)&& userChoose.contains(9))){
                    System.out.println("you win !");
                    break;
                }
                else if(count==9){
                    System.out.println("Draw");
                    break;
                }
            }

        }catch (InputMismatchException e1){
            System.out.println("add only numbers");
        }catch (Exception e2){
            System.out.println(e2.getMessage());
        }




    }
    public static void printArray(char [][] tic_tac){
            for (char[] outer:tic_tac) {
                for (char inner : outer) {
                    System.out.print(inner);
                }
                System.out.println();
            }

    }
    public static void gameValue(char [][] tic_tac,String turn,int Square) throws Exception {
        char ch=' ';
        int cheek =Square;



        if (turn.equalsIgnoreCase("player")){
            ch='X';
        }
        else{
            ch='O';
        }
        switch (Square){
            case 1:

               tic_tac[0][0]=ch;
                break;

            case 2:
                tic_tac[0][2] = ch;
                break;

            case 3:
                tic_tac[0][4] = ch;
                break;
            case 4:
                tic_tac[2][0] = ch;
                break;
            case 5:
                tic_tac[2][2] = ch;
                break;
            case 6:
                tic_tac[2][4] = ch;
                break;
            case 7:
                tic_tac[4][0] = ch;
                break;
            case 8:
                tic_tac[4][2] = ch;
                break;
            case 9:
                tic_tac[4][4] = ch;
                break;
        }
        if (cheek<1||cheek>9) {
            throw new Exception("error number should between 1 and9");
        }



    }

}