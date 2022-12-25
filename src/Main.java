public class Main {
    public static void main(String[] args) {

        boolean succes = Data.validate("test", "test!", "test11");
        if (succes) {
            System.out.println("Данные валидны");
        } else {
            System.out.println("Данные не валидны");
        }
    }
}