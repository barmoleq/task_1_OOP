package items;

public class Sheep extends Figure {

    private boolean block;
    private int life;

    public Sheep(int horizontalRow, int verticalRow, int step, boolean block, int life) {
        super(horizontalRow, verticalRow, step);

        this.block = block;
        this.life = life;
    }

    public int killSheep(){
        life =-1;
        return life;
    }
}

