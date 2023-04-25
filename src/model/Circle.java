package model;
import model.base.*;

public class Circle extends Figure implements CurvedLen {
    /**
     * Инициализация класса "Окружность"
     * @param radius Радиус
     */
    public Circle(Double radius) throws Exception {
        if (radius > 0.0)
            this.radius = radius;
        else
            throw new Exception("Неверное значение радуиса!");
    }

    public Double getRadius() {
        return radius;
    }

    /**
     * Радиус окружности
     */
    private Double radius;

    @Override
    public Double getLen() {
        return 2.0 * Math.PI * radius;
    }

    @Override
    public Double getArea() {
        return Math.PI * Math.pow(radius, 2.0);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        return this.radius == ((Circle) obj).getRadius();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "Радиус=" + radius +
                ", Длина окружности=" + getLen() +
                ", Площадь=" + getArea() +
                '}';
    }
}
