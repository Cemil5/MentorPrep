package weeks.week_08.class_Lab;

public class Shape {

    public int id;
    public String kind;
    public int width;
    public int height;
    public int radius;
    public int positionX;
    public int positionY;
    public boolean isDeleted;

    ShapeDatabase database = new ShapeDatabase();
    public int count = 0;

    public void setSquareInfo(int width, int positionX, int positionY, boolean isDeleted) {
        this.id = idGenerator();
        this.kind = "Square";
        this.width = width;
        this.positionX = positionX;
        this.positionY = positionY;
        this.isDeleted = isDeleted;
    }

    public void setDotInfo(int positionX, int positionY, boolean isDeleted){
        this.id = idGenerator();
        this.kind = "Dot";
        this.positionX = positionX;
        this.positionY = positionY;
        this.isDeleted = isDeleted;
    }

    public void setCircleInfo(int radius, int positionX, int positionY, boolean isDeleted){
        this.id = idGenerator();
        this.kind = "Circle";
        this.radius = radius;
        this.positionX = positionX;
        this.positionY = positionY;
        this.isDeleted = isDeleted;
    }

    public void deleteShape(){
        database.deleteShapeById(this.id);
    }

    public void saveShape(){
        database.saveShape(this);
    }

    public Shape getShapeById(){
        return database.getShapeById(this.id);
    }

    public int idGenerator(){
        return count++;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "kind='" + kind + '\'' +
                ", positionX=" + positionX +
                ", positionY=" + positionY +
                '}';
    }
}
