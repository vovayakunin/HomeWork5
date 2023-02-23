public class Main {
    public static void main(String[] args) {
        System.out.println("Условные операторы");
            System.out.println("Задание 1");

        int age = 16;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний");
        }
        else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }
            System.out.println("Задание 2");

        int temperature = 9;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        }
        else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }

        System.out.println("Задание 3");

        int speed = 100;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        else {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");

            System.out.println("Задание 4");

            int human = 50;
            if (human >= 2 && human <=6) {
                System.out.println("Если возраст человека равен " + human + ", то ему нужно ходить в детский сад.");
            } else if (human >= 7 && human <=18) {
                System.out.println("Если возраст человека равен " + human + ", то ему нужно ходить в школу.");
            } else if (human > 18 && human <=24) {
                System.out.println("Если возраст человека равен " + human + ", то его место в университете.");
            } else if (human > 24) {
                System.out.println("Если возраст человека равен " + human + ", то ему пора ходить на работу.");
            }

            System.out.println("Задание 5");

            int child = 15;
            if (child < 5) {
                System.out.println("Если возраст ребенка равен " + child + ", то ему нельзя кататься на аттракционе.");
            } else if (child >= 5 && child < 14) {
                System.out.println("Если возраст ребенка равен " + child + ", то ему можно кататься на аттракционе в сопровождении.");
            } else if (child >= 14) {
                System.out.println("Если возраст ребенка равен " + child + ", то ему без сопровождения взрослого.");
            }


            System.out.println("Задание 6");

            int van = 110;
            if (van <= 60) {
                System.out.println("В вагоне есть сидячие места.");
            } else if (van > 60 && van <= 102) {
                System.out.println("В вагоне есть стоячие места.");
            } else if (van > 102) {
                System.out.println("Вагон уже полностью забит.");
            }

            System.out.println("Задание 7");

            int one = 30;
            int two = 4;
            int three = 3;
            if (one > two) {
                if (one >= three) {
                    System.out.println("Максимальное число - " + one);
                } else {
                    System.out.println("Максимальное число - " + three);
                }
            } else if (two > one) {
                if (two >= three) {
                    System.out.println("Максимальное число - " + two);
                } else {
                    System.out.println("Максимальное число - " + three);
                }
            } else {
                if (one > three) {
                    System.out.println("Максимальное число - " + one);
            } else if (three > one) {
                    System.out.println("Максимальное число - " + three);
                } else {
                    System.out.println("Все три числа равны");

                }

            }


            }
    }
}
