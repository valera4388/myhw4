public class BmiService {

    public int calculate (double height, int weight) {

        int result;
        double pow = Math.pow(height, 2);
        result = (int) (weight / pow);

        return (int) result;
    }
}
