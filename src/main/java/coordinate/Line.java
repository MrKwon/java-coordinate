package coordinate;

import java.util.List;

public class Line extends AbstractFigure implements FigureCreator {
    public Line(List<Point> points) {
        super(points);
    }

    @Override
    public int size() {
        return 2;
    }

    @Override
    public String getName() {
        return "선";
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public Figure create(List<Point> points) {
        return new Line(points);
    }
}
