package de.egga;

import static de.egga.Directions.*;

public class MarsRover {
    private Coordinates currentPosition;
    private Directions currentDirection;

    public MarsRover(Coordinates startingPoint, Directions startingDirection) {
        currentPosition = startingPoint;
        currentDirection = startingDirection;
    }

    public boolean isAtPosition(Coordinates coordinates) {
        return currentPosition.equals(coordinates);
    }

    public boolean isFacing(Directions direction) {
        return currentDirection.equals(direction);
    }

    public void moveForward() {
        switch (currentDirection) {
            case SOUTH -> currentPosition = currentPosition.south();
            case NORTH -> currentPosition = currentPosition.north();
            case WEST -> currentPosition = currentPosition.west();
            case EAST -> currentPosition = currentPosition.east();
        }
    }

    public void moveBackward() {
        switch (currentDirection) {
            case SOUTH -> currentPosition = currentPosition.north();
            case NORTH -> currentPosition = currentPosition.south();
            case WEST -> currentPosition = currentPosition.east();
            case EAST -> currentPosition = currentPosition.west();
        }
    }

    public void turnLeft() {
        this.currentDirection = currentDirection.left();
    }

    public void turnRight() {
        this.currentDirection = currentDirection.right();
    }

}
