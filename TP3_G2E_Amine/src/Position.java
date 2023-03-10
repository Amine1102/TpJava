public class Position {
    private int row;
    public int getRow() {return row;}
    public void setRow(int row) {this.row = row;}

    private String column;
    public String getColumn() {return column;}
    public void setColumn(String column) {this.column = column;}

    public String toString(){
        return "Position : " + row + "" + column;
    }


}
