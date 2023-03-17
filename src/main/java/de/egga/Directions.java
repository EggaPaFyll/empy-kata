package de.egga;

public enum Directions {
    SOUTH, WEST, EAST, NORTH;

    Directions right() {
        return switch (this) {
            case WEST -> NORTH;
            case SOUTH -> WEST;
            case EAST -> SOUTH;
            case NORTH -> EAST;
        };
    }

    Directions left() {
        return switch (this) {
            case WEST ->  SOUTH;
            case SOUTH ->  EAST;
            case EAST ->  NORTH;
            case NORTH ->  WEST;
        };
    }
}
