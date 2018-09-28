package edu.jsu.mcis;

public class TicTacToeView {

    private TicTacToeModel model;
    
    /* CONSTRUCTOR */
	
    public TicTacToeView(TicTacToeModel model) {
        
        this.model = model;
        
    }
	
    public void viewModel() {
        
        /* Print the board to the console (see examples) */
        
        /* INSERT YOUR CODE HERE */
        System.out.println("----------------------------");
        for (int r=0; r < width; r++){
            System.out.print("|  ");
            for(int c=0; c<width; c++){
                System.out.print(grid[r][c] + " | ");
            }
            System.out.println();
            System.out.println("--------------------------");
        }

    }

    public void showNextMovePrompt() {

        /* Display a prompt for the player's next move (see examples) */

        /* INSERT YOUR CODE HERE */
        if(Model.xTurn = True){

        System.out.println("It is now X players turn.");}
        else
            System.out.println("it is O players turn.");

    }

    public void showInputError() {

        /* Display an error if input is invalid (see examples) */

        /* INSERT YOUR CODE HERE */
        if(grid.position[row][col]!=isSquareValid){
            System.out.print("Please select another cooridnate");
        }

    }

    public void showResult(String r) {

        /* Display final winner */

        System.out.println(r + "!");

    }
	
}