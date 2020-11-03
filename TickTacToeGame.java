public class TickTacToeGame{
    char array[]=new char[10];
     public void createBoard(){
       System.out.println("Welcome to Tictactoe game");
	for(int i=1;i<=9;i++){
	    array[i]=' ';
	}

     }
    public static void main (String args[]){
        TickTacToeGame t1=new TickTacToeGame();
        t1.createBoard();
    }
}
