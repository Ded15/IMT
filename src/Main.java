public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double imt = service.calculate(60, 1.7);
        System.out.println(imt);

    }


}