import items.Node;

import java.util.ArrayList;
import java.util.List;

public class Field {
    public void madeField(){
        List<Node> field = new ArrayList<>();
        for(int x = 1; x < 10; x++){
            for(int y = 1; y < 10; y++){
                Node node = new Node(x, y, false);
                if(x < 4 && y < 4)break;
                if(x < 4 && y > 6)break;
                if(x > 6 && y < 4)break;
                if(x > 6 && y > 6)break;
                field.add(node);
            }
        }
        for(int i = 0; i < field.size(); i++){
            field.get(i).addNeig();
        }

    }
}
