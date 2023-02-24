public class Position {
    int row;
    public int getRow() {return row;}
    public void setRow(int row) {this.row = row;}

    String column;
    public String getColumn() {return column;}
    public void setColumn(String column) {this.column = column;}

    @Override
    public String toString(){
        return "Position : " + this.getRow() + "" + this.getColumn();
    }


}
