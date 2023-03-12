public class Main {
    public static void main(String[] args) {
        BmiService person = new BmiService();
        int personalData = person.calculate(60, 1.7);
        System.out.println(personalData);
    }
}
