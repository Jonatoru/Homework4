public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        byte old = 19;
        byte ageLimit = 18;
        if (old >= ageLimit) {
            System.out.println( "Поздравляем вас с совершеннолетием!");
        }
        byte old1 = 17;
        if (old1 < ageLimit) {
            System.out.println( "Возраст совереннолетия ещё не наструпил, нужно немного подождать.");
        }

        System.out.println("Задача 2");

        byte old2 = 7;
        byte ageLimitSchool = 7;
        if (old2 >= ageLimitSchool) {
            System.out.println("Ребенок ходит в школу.");
        }
        byte old3 = 18;
        byte ageLimitStudent = 18;
        if (old3 >= ageLimitStudent) {
            System.out.println("Человек уже закончил школу и может отправляться в университет.");
        }
        byte old4 = 24;
        byte ageLimitWorker = 24;
        if (old4 >= ageLimitWorker) {
            System.out.println("Человек уже закончил университет и ему пора искать первую работу.");
        }


    }
}