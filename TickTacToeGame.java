import java.util.Scanner;
public class TickTacToeGame{
    char board[]=new char[10];
    Scanner sc=new Scanner(System.in);
    char word = ' ';
	char requiredX = 'X';
	char requiredO = 'O';
	char comValueO = 'O';
	char comValueX = 'X';

     public void createBoard(){
       System.out.println("Welcome to Tictactoe game");
	for(int i=1;i<=9;i++){
	    board[i]=' ';
	}

     }
     public void userInputX() {
       System.out.println("Enter X or O character ");
       word = sc.next().charAt(0);
       if (word == requiredX) {
           comValueO='O';
	} else {
	   System.out.println("Enter Valid character");
	}
	if (word == requiredO) {
	 } else {
	     System.out.println("Enter Valid character");
	
	  }
       }
       public void showBoard() {
    	System.out.println("|__|__|__|");
	System.out.println("| "+board[0]+"| "+board[1]+"| "+board[3]+"|");
	System.out.println("|__|__|__|");
	System.out.println("| "+board[4]+"| "+board[5]+"| "+board[6]+"|");
	System.out.println("|__|__|__|");
	System.out.println("| "+board[7]+"| "+board[8]+"| "+board[9]+"|");
	}
    public static void main (String args[]){
        TickTacToeGame t1=new TickTacToeGame();
        t1.createBoard();
	t1.userInputX();
	t1.showBoard();
    }
}
	
