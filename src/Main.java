public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog + " \n" + cat + " \n" + paper);
    }
    public static void task2() {
        System.out.println("Задача 2");
        var dog = 8.0;
        dog = dog + 4;
        var cat = 3.6;
        cat = cat + 4;
        var paper = 763789;
        paper = paper + 4;
        System.out.println(dog + " \n" + cat + " \n" + paper);

    }
    public static void task3() {
        System.out.println("Задача 3");
        var dog = 8.0;
        dog = dog - 3.5;
        var cat = 3.6;
        cat = cat - 1.6;
        var paper = 763789;
        paper = paper - 7639;
        System.out.println(dog + " \n" + cat + " \n" + paper);
        boolean number = 3 < 1;

    }
    public static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

    }public static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

    }

    public static void task6() {
        System.out.println("Задача 6");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var sumMassBoxer = firstBoxer + secondBoxer;
        var weightDifference = secondBoxer - firstBoxer;
        System.out.println("Oбщий вес двух бойцов " + sumMassBoxer + "кг" );
        System.out.println("Разница между весами бойцов " + weightDifference + "кг");

    }

    public static void task7() {
        System.out.println("Задача 7");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var weightDifference1 = secondBoxer - firstBoxer;
        System.out.println("Разница в весе с помощью вычитания " + weightDifference1);
        var weightDifference2 = (secondBoxer - firstBoxer)%(firstBoxer + secondBoxer);
        System.out.println("Разница с помощью деления на остаток " + weightDifference2);
    }
    public static void task8() {
        System.out.println("Задача 8");
        var total_O_clock = 640;                        //количество часов
        var timePerWorker = 8;                          //количество часов одного сотрудника
        var totalEmployees = total_O_clock / timePerWorker; //общее количество сотрудников
        System.out.println("Всего работников в компании — " + totalEmployees + " человек");
        totalEmployees = totalEmployees + 94; //прибавилось сотрудников
        totalEmployees = totalEmployees * timePerWorker;
        System.out.println("Если в компании работает " + total_O_clock + "человек, то всего " + totalEmployees + " часов работы может быть поделено между сотрудниками");
    }
}
