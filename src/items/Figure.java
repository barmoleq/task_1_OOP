package items;

public class Figure {

    private int horizontalRow;
    private int verticalRow;
    private int step;

    public Figure(int horizontalRow, int verticalRow, int step){

        this.horizontalRow = horizontalRow;
        this.verticalRow = verticalRow;
        this.step = step;
    }

    public int getHorizontalRow(){return horizontalRow;}
    public int getVerticalRow(){return verticalRow;}

    public Node step(Node start,Node finish){

    }
}
