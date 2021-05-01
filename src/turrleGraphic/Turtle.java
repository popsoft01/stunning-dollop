//package turrleGraphic;
//
//import static turrleGraphic.Direction.*;
//
//public class Turtle {
//    private final Pen pen;
//    private Direction currentDirection;
//
//    public Turtle(Pen pen) {
//        this.pen = pen;
//        currentDirection = EAST;
//    }
//
//    public Pen getPen() {
//        return pen;
//    }
//
//    public void movePenUp() {
//        pen.setIsUp(true);
//
//    }
//
//    public boolean isPenUp() {
//        return pen.isUp();
//    }
//
//    public void movePenDown() {
//        pen.setIsUp(false);
//    }
//
//    public Direction getCurrentDirection() {
//        return currentDirection;
//    }
//
//    public void turnRight() {
//        switch (currentDirection){
//            case EAST -> changeCurrentDirection(SOUTH);
//            case WEST -> changeCurrentDirection(NORTH);
//            case SOUTH -> changeCurrentDirection(WEST);
//            case NORTH -> changeCurrentDirection(EAST);
//        }
//
//    }
//
//    private void changeCurrentDirection(Direction newDirection) {
//        currentDirection = newDirection;
//    }
//
//    public void moveForwardBy(int numberOfStep) {
//        numberOfStep = numberOfStep-1;
//        switch(currentDirection){
//            case EAST -> currentDirection();
//        }
//    }
//}
