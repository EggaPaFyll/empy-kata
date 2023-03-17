package de.egga;

import java.util.Objects;

public class Coordinates {
    private final Integer x;
    private final Integer y;

    public Coordinates(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Coordinates north() {
        return new Coordinates(x, y+1);
    }

    public Coordinates south() {
        return new Coordinates(x, y-1);
    }

    public Coordinates west() {
        return new Coordinates(x-1, y);
    }

    public Coordinates east() {
        return new Coordinates(x+1, y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinates that = (Coordinates) o;
        return Objects.equals(x, that.x) && Objects.equals(y, that.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
