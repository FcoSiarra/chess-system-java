
package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

/**
 * @author francisco
 */
public class Queen extends ChessPiece {

    public Queen(Board board, Color color) {
        super(board, color);
    }

    @Override
    public boolean[][] possibleMoves() {
        
       boolean [][] mat = new boolean [getBoard().getRows()][getBoard().getColumns()];
        
        Position p = new Position(0,0);
        
                                                                    //      ARRIBA
        p.setValues(position.getRow() - 1, position.getColumn());
        while (getBoard().positionExist(p) && !getBoard().ThereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()]  = true;
            p.setRow(p.getRow() - 1);
        }
        
        if (getBoard().positionExist(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()]  = true;  
        }
                                                                     //      IZQUIERDA
        p.setValues(position.getRow(), position.getColumn() - 1);
        while (getBoard().positionExist(p) && !getBoard().ThereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()]  = true;
            p.setColumn(p.getColumn() - 1);
        }
        
        if (getBoard().positionExist(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()]  = true;  
        }
                                                                      //      DERECHA
        p.setValues(position.getRow(), position.getColumn() + 1);
        while (getBoard().positionExist(p) && !getBoard().ThereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()]  = true;
            p.setColumn(p.getColumn() + 1);
        }
        
        if (getBoard().positionExist(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()]  = true;  
        }
                                                                            //      ABAJO
        p.setValues(position.getRow() + 1, position.getColumn());
        while (getBoard().positionExist(p) && !getBoard().ThereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()]  = true;
            p.setRow(p.getRow() + 1);
        }
                                                                            //      NOROESTE NW
        p.setValues(position.getRow() - 1, position.getColumn() - 1);
        while (getBoard().positionExist(p) && !getBoard().ThereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()]  = true;
            p.setValues(p.getRow() - 1, p.getColumn() - 1);
        }
        
        if (getBoard().positionExist(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()]  = true;  
        }
                                                                     //      NORESTE NE
        p.setValues(position.getRow() - 1, position.getColumn() + 1);
        while (getBoard().positionExist(p) && !getBoard().ThereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()]  = true;
            p.setValues(p.getRow() - 1, p.getColumn() + 1);
        }
        
        if (getBoard().positionExist(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()]  = true;  
        }
                                                                      //      SURESTE SE
        p.setValues(position.getRow() + 1, position.getColumn() + 1);
        while (getBoard().positionExist(p) && !getBoard().ThereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()]  = true;
            p.setValues(p.getRow() + 1, p.getColumn() + 1);
        }
        
        if (getBoard().positionExist(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()]  = true;  
        }
                                                                            //      SUROESTE SW
        p.setValues(position.getRow() + 1, position.getColumn() - 1);
        while (getBoard().positionExist(p) && !getBoard().ThereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()]  = true;
            p.setValues(p.getRow() + 1, p.getColumn() - 1);
        }
        
        if (getBoard().positionExist(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()]  = true;  
        }
        return mat; 
    }
    
    @Override
    public String toString(){
        return "Q";
    }
    
}
