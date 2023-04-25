package model;

import model.base.*;

public class Triangle extends Polygon {
    /**
     * Инициализация класса "Треугольник"
     * @param a сторона A
     * @param b сторона B
     * @param c сторона C
     * @throws Exception
     */
    public Triangle(Double a, Double b, Double c) throws Exception {
        super(3, new Double[]{a, b, c});
        if (!(a + b > c && a + c > b && b + c > a))
            throw new Exception("Невозможно создать треугольник с заданными сторонами!");
    }

    /**
     * Вычисление площади треугольника
     * @return
     */
    @Override
    public Double getArea() {
        Double p = super.getPeremetr() / 2;
        // Формула Герона
        return Math.sqrt(p * (p - getlSides()[0]) * (p - getlSides()[1]) * (p - getlSides()[2]));
    }
}