public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightMeter = 1.87;
        int weightKilo = 98;
        int index = (int)service.calculate(heightMeter,weightKilo);
        System.out.println("Индекс массы тела: " + index);
    }
}