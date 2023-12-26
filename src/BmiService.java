public class BmiService {

    public int calculate(double heightMeter, int weightKilo) {
        int index = (int)(weightKilo / (heightMeter * heightMeter));
        return index;
    }
}
