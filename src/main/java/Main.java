import connection.DBConnection;
import model.Car;
import service.CarService;

public class Main {
    public static void main(String[] args) {
        var carService = new CarService();


        //DBConnection.getConnection();
        //CarService.createCarTable();
        /*carService.createCar(new Car(
                3L,
                "Ferrari",
                2000,
                2020,
                6.0,
                "White"));*/

        //System.out.println(carService.getCarById(2L));

        //carService.updateCarName(1L, "Opel");
        //System.out.println(carService.getCarById(1L));
        //carService.deleteCar(1L);
        //System.out.println(carService.getCarById(1L));

         System.out.println(carService.getCars());

    }
}
