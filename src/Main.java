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

        System.out.println("Задача 3");

        byte totalSeatsOnTheTrain = 102;
        byte seatsOnTheTrain = 60;
        int standingPlacesOnTheTrain = totalSeatsOnTheTrain - seatsOnTheTrain;
        byte passengers = 101;
        if (passengers >= seatsOnTheTrain && passengers < totalSeatsOnTheTrain) {
            System.out.println("В вагоне есть ещё стоячие места.");
        }
        if (passengers >= standingPlacesOnTheTrain && passengers < totalSeatsOnTheTrain) {
            System.out.println("В вагоне есть ещё сидячие места.");
        }
        if (passengers >= totalSeatsOnTheTrain) {
            System.out.println("Вагон уже полностью забит.");
        }
        if (passengers < seatsOnTheTrain && passengers < standingPlacesOnTheTrain) {
            System.out.println("В вагоне есть свободные и сидячие и стоячие места.");
        }

        System.out.println("Задача 4");

        byte old5 = 17;
        byte ageLimit1 = 18;
        if (old5 >= ageLimit1) {
            System.out.println( "Поздравляем вас с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать.");
        }

        System.out.println("Задача 5");

        byte old6 = 24;
        byte ageLimitSchool1 = 7;
        byte ageLimitStudent1 = 18;
        byte ageLimitWorker1 = 24;
        if (old6 >= ageLimitSchool1 && old6 < ageLimitStudent1) {
            System.out.println("Ребенок ходит в школу.");
        }else if (old6 >= ageLimitStudent1 && old6 < ageLimitWorker1) {
            System.out.println("Человек уже закончил школу и может отправляться в университет.");
        }else {
            System.out.println("Человек уже закончил университет и ему пора искать первую работу.");
        }

        System.out.println("Задача 6");

        byte totalSeatsOnTheTrain1 = 102;
        byte seatsOnTheTrain1 = 60;
        int standingPlacesOnTheTrain1 = totalSeatsOnTheTrain1 - seatsOnTheTrain1;
        byte passengers1 = 102;
        if (passengers1 < seatsOnTheTrain1 && passengers1 < standingPlacesOnTheTrain1) {
            System.out.println("В вагоне есть свободные и сидячие и стоячие места.");
        }else if (passengers1 >= standingPlacesOnTheTrain1 && passengers1 < seatsOnTheTrain1 && passengers1 < totalSeatsOnTheTrain1) {
            System.out.println("В вагоне есть ещё сидячие места.");
        }else if (passengers1 >= seatsOnTheTrain1 && passengers1 < totalSeatsOnTheTrain1) {
            System.out.println("В вагоне есть ещё стоячие места.");
        }else if (passengers1 >= totalSeatsOnTheTrain1) {
            System.out.println("Вагон уже полностью забит.");
        }

        System.out.println("Задача 7");

        byte childIsAge = 2;
        byte childIsAge1 = 6;
        byte childIsAge2 = 7;
        byte childIsAge3 = 18;
        byte personIsAge = 24;
        int currentAge = 25;
        if (currentAge >= childIsAge && currentAge <= childIsAge1) {
            System.out.println("Если возраст человека равен " + currentAge + " , то ему нужно ходить детский сад.");
        } else if (currentAge >= childIsAge2 && currentAge <= childIsAge3) {
            System.out.println("Если возраст человека равен " + currentAge + " , то ему нужно ходить в школу.");
        } else if (currentAge > childIsAge3 && currentAge <= personIsAge) {
            System.out.println("Если возраст человека равен " + currentAge + " , то ему нужно ходить в институт.");
        } else {
            System.out.println("Если возраст человека равен " + currentAge + " , то ему нужно ходить на работу.");
        }

        System.out.println("Задача 8");

        byte childAge4 = 5;
        byte childAge5 = 14;
        byte childAge6 = 14;

        if (childAge6 < childAge4) {
            System.out.println("Если ребенку " + childAge6 + " лет, то он не может кататься на аттракционе.");
        } else if (childAge6 > childAge4 && childAge6 < childAge5) {
            System.out.println("Если ребенку " + childAge6 + " лет, то ребенок может кататься на атракционе, только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else {
            System.out.println("Если ребенку " + childAge6 + " лет, то он может кататься без сопровождения взрослого.");
        }

        System.out.println("Задача 9");

        int one = 5;
        int two = 10;
        int free = 15;

        if (one > two && one > free) {
            System.out.println("Число " + one + " больше всех.");
        } else if (two > one && two > free) {
            System.out.println("Число " + two + " больше всех.");
        } else  if (free > one && free > two) {
            System.out.println("Число " + free + " больше всех.");
        }

    }
}