package web.dao;

import lombok.Data;
import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.Arrays;
import java.util.List;

@Data
@Component
public class CarsDao {
    private List<Car> cars = Arrays.asList(new Car("BMW", "red", 2000),
            new Car("AUDI", "green", 2010) ,new Car("BMW", "blue", 1985),
            new Car("LADA", "grey", 2020), new Car("VOLVO", "white", 2012));


    public void addCar(Car car) {
        cars.add(car);
    }


}
