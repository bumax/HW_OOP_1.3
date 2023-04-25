package model;
import model.base.*;

public class Rectangle extends Polygon {
    /**
     * Инициализация класса "Прямоугольник"
     * @param width Ширина
     * @param height Высота
     * @throws Exception
     */
    public Rectangle(Double width, Double height) throws Exception{
        super(4, new Double[]{width, height, width, height});
        if (width.equals(height))
            throw new Exception("Для квадрата существует отдельный класс Square!");

    }

    /**
     * Перегрузка для инициализации квадрата
     * @param width
     * @throws Exception
     */
    public Rectangle(Double width) throws Exception{
        super(4, new Double[]{width, width, width, width});
    }

    /**
     * Расчет площади прямоугольника
     * @return
     */
    @Override
    public Double getArea() {
        return getlSides()[0] * getlSides()[1];
    }
}
