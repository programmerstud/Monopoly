package squares.privacy;

import squares.square.Type;
import squares.square.Square;

public class Privacy extends Square{

    public Privacy(String name, int price, int positionOnABoard) {
        super(name, positionOnABoard, price, Type.PRIVACY);
    }
}
