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
	} else if (word == requiredO) {
		comValueX='X';
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
      public void moveToDesiredLocation() {
	int indexPosition=0;
	System.out.println("Enter The Index Position only in 0 to 9 ");
	indexPosition=sc.nextInt();
	if(indexPosition<10) {
	if(board[indexPosition]==' ') {
	
	 }
	 }else {
	      System.out.println("Enter Digit only 0 to 9 ");
	 }
      }
     public static void main (String args[]){
        TickTacToeGame t1=new TickTacToeGame();
        t1.createBoard();
	t1.userInputX();
	t1.showBoard();
	t1.moveToDesiredLocation();
	t1.showBoard();
    }
}

