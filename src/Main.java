// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        var age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " , то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + " , то он не достиг совершеннолетия," +
                    " нужно немного подождать.");
        }

        System.out.println();
        System.out.println("Задача 2");
        var temp = 6;
        if (temp < 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку.");}
        else if (temp >= 5) {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки.");
        }

        System.out.println();
        System.out.println("Задача 3");
        var speed = 40;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");
        }
        else if (speed <= 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
        }

        System.out.println();
        System.out.println("Задача 4");
        var agePeople = 17;
        if (agePeople >= 2 && agePeople  <= 6) {
            System.out.println("Если возраст человека " + agePeople + ", то ему нужно ходить" +
                    " в детский сад");}
        else if (agePeople >=7 && agePeople <= 17) {
            System.out.println("Если возраст человека " + agePeople + ", то ему нужно ходить" +
                    " в школу");}
        else if (agePeople >= 18 && agePeople <= 24) {
            System.out.println("Если возраст человека " + agePeople + ", то ему нужно ходить" +
                    " в университет");}
        else if (agePeople > 24) {
            System.out.println("Если возраст человека " + agePeople + ", то ему нужно ходить" +
                    " на работу");}

        System.out.println();
        System.out.println("Задача 5");
        var attract = 14;
        if (attract < 5) {
            System.out.println("Если возраст ребенка равен " + attract + " лет, то ему нельзя " +
                    "кататься на аттракционе.");}
        else if (attract >5 && attract <14) {
            System.out.println("Если возраст ребенка равен " + attract + " лет, то ему" +
                    " можно кататься в сопровождении взрослого.");}
        else if (attract >= 14) {
            System.out.println("Если возраст ребенка равен " + attract + " лет, то " +
                    "ему можно кататься без сопровождения взрослого." );}

        System.out.println();
        System.out.println("Задача 6");
        var pointTotal = 102;
        var pointSit = 60;
        var pointStay = 102-60;
        var pointNow = 75;
        if (pointNow < pointSit) {
            System.out.println("В вагоне осталось " + (pointSit - pointNow) + " сидячих мест," +
                    " а стоячих мест осталось " + (pointTotal - pointSit));}
        else if (pointNow >= pointSit && pointNow < pointTotal) {
            System.out.println("В вагоне не осталось сидячих мест, " +
                    "но осталось " + (pointTotal - pointNow) + " стоячих мест");}
        else if (pointNow == pointTotal) {
            System.out.println("Вагон уже полностью забит");}

        System.out.println();
        System.out.println("Задача 7");
        int one = 40;
        int two = 20;
        int three = 10;
        if ((one > two && one > three) || (one > two && two == three)) {
            System.out.println("Первое число больше всех.");}
        else if ((two > one && two > three) || (two > one && one == three)) {
            System.out.println("Второе число больше всех.");}
        else if ((three > two && three > one) || (three > one && one == two)){
            System.out.println("Третье число больше всех.");}
        }
        }

