package sudoku4x4;

public class Cell {
	
  int row, col;

	  public Cell(int row, int col) {
	   super();
	   this.row = row;
	   this.col = col;
	  }

	  @Override
	  public String toString() {
	   return "Cell [row=" + row + ", col=" + col + "]";
	  }
	 

}
