public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        byte old = 19;
        byte ageLimit = 18;
        if (old >= ageLimit) {
            System.out.println( "Поздравляем вас с совершеннолетием!");
        }
        byte old2 = 17;
        if (old2 < ageLimit) {
            System.out.println( "Возраст совереннолетия ещё не наструпил, нужно немного подождать.");
        }



    }
}