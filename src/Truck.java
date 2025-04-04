public class Truck extends Transport {

    public Truck (String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Changing a tire.");
    }

    public void checkEngine() {
        System.out.println("Check the engine.");
    }

    public void checkTrailer() {
        System.out.println("Check the trailer.");
    }

    @Override
    public void allTransportService(){
        updateTyre();
        checkEngine();
        checkTrailer();
    }
}
