public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87; //Рост метр
        int weight = 98; //Вес кг
        int bmi = service.calculate (height, weight);

        System.out.println(bmi);
    }
}
