public class Car extends Transport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Changing a tire.");
    }

    public void checkEngine() {
        System.out.println("Check the engine.");
    }

    @Override
    public void allTransportService(){
        updateTyre();
        checkEngine();
    }
}
