abstract class Vehicle {
    public abstract String startEngine();
    public abstract String stopEngine();
}

class Car extends Vehicle {
    @Override
    public String startEngine(){
        return "The Car is starting";
    }

    //method for stop Engine
    public String stopEngine(){
        return "The Car has stopped";
    }
}

class Mortocycle extends Vehicle {
    @Override
    public String startEngine() {
        return "The Mortocycle engine is starting";
    }

    //method for the stoping of the Motorcycle's Engine 
    public String stopEngine() {
        return "The Motorcycle has stopped";
    }

    
}