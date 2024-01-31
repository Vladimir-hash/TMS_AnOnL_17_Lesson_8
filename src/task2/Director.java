package task2;
/*
    2. Создать классы "Директор", "Рабочий", "Бухгалтер".
   Реализовать интерфейс с методом, который печатает название
   должности и имплементировать этот метод в созданные классы.
 */
public class Director implements Profession{
    public void getProfession() {
        System.out.println("I'm director");
    }
}
