package squares.square;

public class Square
{
        private String name;
        protected int price;
        private Type type;
        private int positionOnABoard;

        public Square(String name, int positionOnABoard, int price, Type type) {
            this.positionOnABoard = positionOnABoard;
            this.name = name;
            this.price = price;
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public Type getType() { return type; }

        public void setType(Type type) {
            this.type = type;
        }

        public int getPositionOnABoard() {
            return positionOnABoard;
        }

        public void setPositionOnABoard(int positionOnABoard) {
            this.positionOnABoard = positionOnABoard;
        }
}
