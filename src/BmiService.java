public class BmiService {

    public double calculate(double weight, double height) {
        double result;
        if (height < 2) {
            result = weight / (height * height);
        } else {
            result = weight / ((height / 100) * (height / 100));
        }
        return result;
    }

}
