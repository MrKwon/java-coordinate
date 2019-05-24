package coordinate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FigureFactory {
    private final static Map<Integer, FigureCreator> map;

    static {
        map = new HashMap<>();
        map.put(2, new LineCreator());
        map.put(3, new TriangleCreator());
        map.put(4, new RectangleCreator());
    }

    static Figure getInstance(List<Point> points) {
        try {
            return map.get(points.size()).create(points);
        } catch (RuntimeException e) {
            throw new IllegalArgumentException("유효하지 않은 도형입니다.");
        }
    }
}
