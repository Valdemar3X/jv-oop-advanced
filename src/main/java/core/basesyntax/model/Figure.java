package core.basesyntax.model;

import core.basesyntax.AreaCalculator;
import core.basesyntax.DrawFigure;

public abstract class Figure implements DrawFigure, AreaCalculator {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void draw() {

    }

    public String getColor() {
        return color;
    }

}