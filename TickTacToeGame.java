public class TickTacToeGame{
    char array[]=new char[10];
    char word = ' ';
	char requiredX = 'X';
	char requiredO = 'O';
	char comValueO = 'O';
	char comValueX = 'X';

     public void createBoard(){
       System.out.println("Welcome to Tictactoe game");
	for(int i=1;i<=9;i++){
	    array[i]=' ';
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
    public static void main (String args[]){
        TickTacToeGame t1=new TickTacToeGame();
        t1.createBoard();
	t1.userInputX();
    }
}
	
