public class BmiService {
    public int calculate(int weightInKilograms, double heightInMeters) {
        int bmi= (int) (weightInKilograms / (heightInMeters * heightInMeters));
        return bmi;
    }
}
