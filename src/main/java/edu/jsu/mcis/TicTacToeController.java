package edu.jsu.mcis;

import java.util.Scanner;

public class TicTacToeController {

    private TicTacToeModel model;
    private TicTacToeView view;
    private Scanner keyboard;
    
    /* CONSTRUCTOR */

    public TicTacToeController(TicTacToeModel model, TicTacToeView view) {
        
        /* Initialize model and view */

        this.model = model;
        this.view = view;
        
        /* Initialize scanner (for console keyboard) */
        
        keyboard = new Scanner(System.in);

    }

    public void controlModel() {
        
        /* Prompt player for next move using view's showNextMovePrompt() */
        
        view.showNextMovePrompt();
        
        /* Receive and validate input, which should be read at the keyboard as
           two integers, the row and the column (for example, "1 1" for the
           center square of a 3 x 3 grid).  Make mark if input is valid, or show
           error message using view's showInputError() if input is invalid. */
        
        /* INSERT YOUR CODE HERE */
        System.out.println("Please input your row coordinate: " + num);
        int num = in.nextInt();
        
        System.out.println("Please input your column coordinate: " + num2);
        int num2 = in.nextInt
        if(num1 = model.grid.row.value && num2=model.grid.col.value && model.grid[row][col]=model.isValidSquare==true && model.xTurn==true){
            model.makeMark(x);
        }
        else{
            model.makeMark(o);
        }
    }

}