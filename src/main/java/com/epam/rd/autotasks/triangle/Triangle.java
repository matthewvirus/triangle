package com.epam.rd.autotasks.triangle;

class Triangle {
    private final double x1;
    private final double x2;
    private final double x3;
    private final double y1;
    private final double y2;
    private final double y3;

    public Triangle(Point a, Point b, Point c) {
        x1 = a.getX();
        x2 = b.getX();
        x3 = c.getX();
        y1 = a.getY();
        y2 = b.getY();
        y3 = c.getY();
        if ((x1/y1 == x2/y2 && x2/y2 == x3/y3) || (x1 == x2 && x2 == x3) || (y1 == y2 && y2 == y3)) {
            throw new IllegalArgumentException();
        }
    }

    public double area() {
        return (Math.abs((x1 - x3)*(y2 - y1)-(x1 - x2)*(y3 - y1)))/2;
    }

    public Point centroid(){
        double x, y;
        x = (x1 + x2 + x3)/3;
        y = (y1 + y2 + y3)/3;
        return new Point(x, y);
    }

}
