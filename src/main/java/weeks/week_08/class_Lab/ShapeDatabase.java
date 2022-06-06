package weeks.week_08.class_Lab;

public class ShapeDatabase {

    Shape[] myShapes = new Shape[100];

    public void saveShape(Shape shape){
        myShapes[shape.id] = shape;
    }

    public void deleteShapeById(int id){
        myShapes[id].isDeleted = true;
    }

    public Shape getShapeById(int id){
        return myShapes[id].isDeleted ? null : myShapes[id];
    }


}
