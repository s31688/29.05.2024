import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();

        Car car1 = new Car("A", 2024);
        Car car2 = new Car("B", 2023);
        Car car3 = new Car("C", 2022);
        Car car4 = new Car("D", 2021);
        Car car5 = new Car("E", 2020);
        Car car6 = new Car("F", 2019);
        Car car7 = new Car("G", 2018);
        Car car8 = new Car("H", 2017);
        Car car9 = new Car("I", 2016);
        Car car10 = new Car("J", 2015);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
        cars.add(car9);
        cars.add(car10);

        boolean sorted;
        do {
            sorted = true;
            int index = 0;
            for (Car carN : cars) {
                if (index < cars.size() - 1) {
                    Car carNext = cars.get(index + 1);
                    if (carN.compareTo(carNext) > 0) {
                        cars.set(index, carNext);
                        cars.set(index + 1, carN);
                        sorted = false;
                    }
                }
                index++;
            }
        } while (!sorted);

        for(Car car : cars) {
            System.out.println(car.getProductionYear());
        }
    }
}