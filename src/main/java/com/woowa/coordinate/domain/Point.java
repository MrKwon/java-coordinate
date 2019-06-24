package com.woowa.coordinate.domain;

import java.util.Objects;

public class Point {
    private final Coordinate x;
    private final Coordinate y;

    public Point(int x, int y) {
        this.x = new Coordinate(x);
        this.y = new Coordinate(y);
    }

    public Point(String x, String y) {
        this(Integer.parseInt(x), Integer.parseInt(y));
    }

    public static Point of(String commaSeparated) {
        String[] separated = commaSeparated.split(",");
        return new Point(separated[0], separated[1]);
    }

    int subtractX(Point point) {
        return x.subtract(point.x);
    }

    int subtractY(Point point) {
        return y.subtract(point.y);
    }

    public double distance(Point point) {
        double xDistance = x.subtract(point.x);
        double yDistance = y.subtract(point.y);
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Objects.equals(x, point.x) &&
                Objects.equals(y, point.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
