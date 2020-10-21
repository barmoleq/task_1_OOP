package items;

public class Wolf extends Figure {

    private boolean kill;

    public Wolf(int horizontalRow, int verticalRow, int step, boolean kill) {
        super(horizontalRow, verticalRow, step);

        this.kill = kill;
    }
}
