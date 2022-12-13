public class Main {
    public static void main(String[] args) {
        Boolean success = Data.validate("test!", "123123_", "123123_");
        if (success){
            System.out.println("Данные валидны");
        } else {
            System.out.println("Данные не валидны");
        }
    }
}