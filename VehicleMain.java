public class VehicleMain{
    public static void main(String[] args) {
        Car car = new Car();
        Mortocycle motor = new Mortocycle();
        System.out.println(car.startEngine());
        System.out.println(car.stopEngine());
        System.out.println();

        System.out.println(motor.startEngine());
        System.out.println(motor.stopEngine());

    }
}
