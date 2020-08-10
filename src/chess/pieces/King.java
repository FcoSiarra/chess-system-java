
package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

/**
 * @author francisco
 */
public class King extends ChessPiece {
    
    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "K";
    }

    @Override
    public boolean[][] possibleMoves() {
        
        boolean [][] mat = new boolean [getBoard().getRows()][getBoard().getColumns()];
        
        return mat;
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
