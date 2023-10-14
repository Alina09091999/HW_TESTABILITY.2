public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightInKilograms = 98;
        double heightInMeters = 1.87;
        int bmi = service.calculate(weightInKilograms, heightInMeters);
        System.out.println("Индекс массы тела = " + bmi);
    }
}