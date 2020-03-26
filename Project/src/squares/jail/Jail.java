package squares.jail;

import squares.square.Type;
import squares.square.Square;

public class Jail extends  Square{
    public Jail(String name, int fine, int positionOnABoard) {
        super(name, positionOnABoard, fine, Type.JAIL);
    }
}
