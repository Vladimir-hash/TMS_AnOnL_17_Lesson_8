package figures;

/*
  1.Написать иерархию классов «Фигуры».
  Фигура -> Треугольник -> Прямоугольник -> Круг.
  Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет периметра.
  Создать массив из 5 фигур.
  Вывести на экран сумму периметра всех фигур в массиве.
*/

abstract public class Figures {
    protected int firsSide;
    protected int secondSide;
    protected int thirdSide;
    protected int radius;

    public Figures(int firstSide, int secondSide, int thirdSide, int radius){
        this.firsSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
        this.radius = radius;
    }
    public Figures(int firsSide, int secondSide,int thirdSide){
        this.firsSide = firsSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }
    public Figures(int radius){
        this.radius = radius;
    }
    public Figures(int firsSide, int secondSide){
        this.firsSide = firsSide;
        this.secondSide = secondSide;
    }
    public double perimentr(){
        return 0;
    }
    public double square(){
        return 0;
    }
}
