public class Main {
    public static void main(String[] args) {
        double height = 2;                         //рост в метрах >=0.4 и =<3
        double weight = 65.2;                     //вес в кг. >=1 и <=500
        double bmi;
        BmiService service = new BmiService();
        bmi = service.calculate(height, weight);
        if (bmi == 0) {
            System.out.println("Введены некорректные данные");
        }
        else {
            System.out.println("Индекс массы тела = " + bmi);
        }
    }
}
