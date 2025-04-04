public class Bicycle extends Transport {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Changing a tire.");
    }

    @Override
    public void allTransportService(){
        updateTyre();
    }
}
