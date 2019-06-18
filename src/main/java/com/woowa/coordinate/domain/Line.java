package com.woowa.coordinate.domain;

public class Line extends AbstractFigure {
    public Line(Points points) {
        super(points);
    }

    @Override
    public int size() {
        return 2;
    }

    @Override
    public String name() {
        return "선";
    }

    @Override
    public double area() {
        return super.getPoints().get(0).distance(super.getPoints().get(1));
    }
}
