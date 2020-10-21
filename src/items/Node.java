package items;

import java.util.List;

public class Node {

    private int horizontalRow;
    private int verticalRow;
    private boolean emp;
    private List<Node> neighbour;

    public Node (int horizontalRow, int verticalRow, boolean emp){
        this.horizontalRow = horizontalRow;
        this.verticalRow = verticalRow;
        this.emp = emp;
    }

    public Node (int horizontalRow, int verticalRow, boolean emp, List<Node> neig){
        this.horizontalRow = horizontalRow;
        this.verticalRow = verticalRow;
        this.emp = emp;
        this.neighbour = neig;
    }

    public int getHorizontalRow(){
        return horizontalRow;
    }

    public int getVerticalRow(){
        return verticalRow;
    }

    public boolean getEmp(){
        return emp;
    }

    public List<Node> getNeighbour(){
        return neighbour;
    }

    public void addNeig(List<Node> field){

    }
}
