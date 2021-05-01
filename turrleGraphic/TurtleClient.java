//package turrleGraphic;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class TurtleClient {
//    Pen pen;
//    Pen secondPen;
//    Turtle turtle;
//
//    @BeforeEach
//    void doThisBeforeEach(){
//        pen = new Pen();
//        secondPen = new Pen();
//        turtle = new Turtle(pen);
//    }
//    @Test
//    void turtleHasAPenTest(){
//
//        assertNotNull(turtle.getPen());
//        assertEquals(pen, turtle.getPen());
//        assertNotEquals(secondPen, turtle.getPen());
//    }
//    @Test
//    void turtleCanMovePenUp(){
//        turtle.movePenUp();
//        assertTrue(turtle.isPenUp());
//
//    }
//    @Test
//    void turtleCanMovePenDown(){
//        turtle.movePenDown();
//        assertFalse(turtle.isPenUp());
//    }
//    @Test
//    void turtleCanTurnRightWhileFacingEast(){
//        assertSame(Direction.EAST, turtle.getCurrentDirection());
//
//        turtle.turnRight();
//        assertSame(Direction.SOUTH,turtle.getCurrentDirection());
//    }
//    @Test
//    void turtleCanturnRightWhileFAcingSouth(){
//        turtle.turnRight();
//        assertSame(Direction.SOUTH,turtle.getCurrentDirection());
//
//        turtle.turnRight();
//        assertSame(Direction.WEST,turtle.getCurrentDirection());
//    }
//    @Test
//    void turtleCanturnRightWhileFAcingWest(){
//        turtle.turnRight();
//        turtle.turnRight();
//        assertSame(Direction.WEST,turtle.getCurrentDirection());
//
//        turtle.turnRight();
//        assertSame(Direction.NORTH,turtle.getCurrentDirection());
//    }
//    @Test
//    void turtleCanturnRightWhileFAcingNorth(){
//        turtle.turnRight();
//        turtle.turnRight();
//        turtle.turnRight();
//        assertSame(Direction.NORTH,turtle.getCurrentDirection());
//
//        turtle.turnRight();
//        assertSame(Direction.EAST,turtle.getCurrentDirection());
//    }
//    @Test
//    void turtleCanMoveForwardEast(){
//        assertSame(Direction.EAST,turtle.getCurrentDirection());
//
//        turtle.moveForwardBy(5);
//
////        assertEquals(new position());
//
//    }
//}
