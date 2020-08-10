
package chess.pieces;

import boardgame.Board;
import boardgame.Position;
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
    
    private boolean canMove(Position position){
        
        ChessPiece p = (ChessPiece)getBoard().piece(position);                    // selecciona pieza en la posicion indicada
        return p == null || p.getColor() != getColor();
    }

    @Override
    public boolean[][] possibleMoves() {
        
        boolean [][] mat = new boolean [getBoard().getRows()][getBoard().getColumns()];
        
        Position p = new Position(0,0);
                                                //    ARRIBA
        p.setValues(position.getRow() - 1, position.getColumn());
        if (getBoard().positionExist(p) && canMove(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
                                                        //    ABAJO
        p.setValues(position.getRow() + 1, position.getColumn());
        if (getBoard().positionExist(p) && canMove(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
                                                        //    IZQUIERDA
        p.setValues(position.getRow(), position.getColumn() - 1);
        if (getBoard().positionExist(p) && canMove(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
                                                        //    DERECHA
        p.setValues(position.getRow(), position.getColumn() + 1);
        if (getBoard().positionExist(p) && canMove(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
                                                        //    NORESTE
        p.setValues(position.getRow() - 1, position.getColumn() -1);
        if (getBoard().positionExist(p) && canMove(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
                                                        //    NOROESTE
        p.setValues(position.getRow() - 1, position.getColumn() + 1);
        if (getBoard().positionExist(p) && canMove(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
                                                        //    SURESTE
        p.setValues(position.getRow() + 1, position.getColumn() - 1);
        if (getBoard().positionExist(p) && canMove(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
                                                        //    SUROESTE
        p.setValues(position.getRow() + 1, position.getColumn() + 1);
        if (getBoard().positionExist(p) && canMove(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
                                                
        
        return mat;
    }
}
