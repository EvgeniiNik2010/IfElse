public class Main {
    public static void main(String[] args){

        // зАДАНИЕ 1
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " , то он совершеннолетний");
        }else{
            System.out.println("Если возраст человека равен " + age + " , то он не достиг совершеннолетия, нужно немного подождать");
        }

        // Задание 2

        int temp = 5;
        if (temp >=5) {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }else{
                System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
            }
        // Задание 3

        int speed = 59;
        if ( speed >= 60) {
            System.out.println("Если скорость " + speed + " ,то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " ,то можно ездить спокойно");
        }
        //Задание4

        int age1 = 35;
        if (age1 >= 2 && age1 <= 6){
            System.out.println("Если возраст человека равен " + age1 + " ,то ему нужно ходить в детский сад");
        }
        if (age1 >= 7 && age1 <= 17){
            System.out.println("Если возраст человека равен " + age1 + " ,то ему нужно ходить в школу");
        }
        if (age1 >= 18 && age1 <= 24){
            System.out.println("Если возраст человека равен " + age1 + " ,то его место в университете");
        }
        if (age1 > 24){
            System.out.println("Если возраст человека равен " + age1 + " ,то ему пора ходить на работу");
        }
        //Задача 5

        int age3 = 15;
        if (age3 <= 5){
            System.out.println("Если возраст ребенка равен " + age3 + " ,то он не может кататься на аттракционе");
        }
        if (age3 > 5 && age3 < 14){
            System.out.println("Если возраст ребенка равен " + age3 + " ,то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        } else
        if (age3 >= 14){
            System.out.println("Если возраст ребенка равен " + age3 + " ,то он может кататься без сопровождения взрослого");
        }

        //Задача 6

        int total = 102;
        int sit = 60;
        int stay = total - sit;
        int ticketSit = 61;
        int ticketStay = 43;
        if (ticketSit < sit || ticketStay < stay){
            System.out.println("места в вагоне есть, сидячее или стоячее");
        } else {
            System.out.println("мест в вагоне нет");
        }

        // Задача 7

        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three){
            System.out.println("one наибольшее число");
        } else
        if (two > three && two > one){
            System.out.println("two наибольшее число");
        }else {
            System.out.println("three наибольшее число");
        }


        }
    }
