public class BmiService {
    public double calculate(double height, double weight) {
        double bmi;
        if (height >= 0.4 && weight >= 1 && height <= 3 && weight <= 500) {
            bmi = Math.round((weight / (height * height)) * 10) ;
            bmi = bmi/10;
        }
        else {
            bmi = 0;
        }
        return (bmi);
    }
}
