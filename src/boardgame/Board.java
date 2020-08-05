
package boardgame;

/**
 * @author francisco
 */
public class Board {
    
    private int rows, columns;
    private Piece [][] pieces;

    public Board(int rows, int columns) {
        
        if (rows < 1 || columns < 1 ){
            throw new BoardException("Error Creatin Board : there must be at least 1 row and 1 column");
        }
        this.rows = rows;
        this.columns = columns;
        
        pieces = new Piece [rows][columns];
    }

    public int getRows() {
        return rows;
    }

    /*public void setRows(int rows) {
        this.rows = rows;
    }*/

    public int getColumns() {
        return columns;
    }

    /*public void setColumns(int columns) {
        this.columns = columns;
    }*/
    
    public Piece pieces (int row, int column){
        
        if (!positionExist(row, column)){
            throw new BoardException("Position not on the board");
        }
        
        return pieces[row][column];
    }
    
    public Piece piece(Position position){
        if (!positionExist(position)){
            throw new BoardException("Position not on the board");
        }
        return pieces [position.getRow()][position.getColumn()];
    }
    
    public void placePiece(Piece piece, Position position){
        
        if (ThereIsAPiece(position)){
            throw new BoardException("There is already a piece on position " +position);
        }
        pieces[position.getRow()][position.getColumn()] = piece;
            piece.position = position;
    }
    
    
    private boolean positionExist(int row, int column){
        
        return row >= 0 && row < rows && column >= 0 && column < columns;
        
    }
    
    public boolean positionExist(Position position){
        
        return positionExist(position.getRow(), position.getColumn());
        
    }
    
    public boolean ThereIsAPiece(Position position){
        
        if (!positionExist(position)){
            throw new BoardException("position not on board");
        }
        return piece(position) != null;
    }
}
