package squares.freeParking;

import squares.square.Square;
import squares.square.Type;

public class FreeParking extends Square {
    public FreeParking(String name, int positionOnABoard) {
        super(name, positionOnABoard, 0, Type.FREEPARKING);
    }
}
