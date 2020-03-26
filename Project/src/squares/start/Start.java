package squares.start;

import squares.square.Square;
import squares.square.Type;

public class Start extends Square {
    public Start(String name, int salary, int positionOnABoard) {
        super(name, positionOnABoard, salary, Type.START);
    }
}