package com.woowa.coordinate.utils;

import com.woowa.coordinate.domain.Point;
import com.woowa.coordinate.domain.Points;

import java.util.ArrayList;
import java.util.List;

public class InputParser {
    public static List<Point> point(String input) {
        validStyle(input);
        return getPoints(input);
    }

    private static void validStyle(String input) {
        if(!input.matches("(\\([0-9]+,[0-9]+\\))+(\\-\\([0-9]+,[0-9]+\\)+)*")) {
            throw new IllegalArgumentException("입력 형식이 올바르지 않습니다.");
        }
    }

    private static List<Point> getPoints(String input) {
        String[] splitInput = input.split("-");
        List<Point> points = new ArrayList<>();
        for (String point : splitInput) {
            points.add(Point.of(removeBraces(point)));
        }
        return points;
    }

    private static String removeBraces(String point) {
        return point.replace("(", "")
                .replace(")", "");
    }

    public static Points parsePoint(List<Point> points) {
        return new Points(points);
    }
}
