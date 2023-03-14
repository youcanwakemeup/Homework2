public class Main {
    // pull-request
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
    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);
    }
    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
    }
    public static void task6 () {
        System.out.println("Задача 6");
        var firstWeight = 78.2;
        var secondWeight = 82.7;
        System.out.println("Общий вес двух боксеров: " + (firstWeight+secondWeight));
        System.out.println("Разница веса двух боксеров: " + (secondWeight-firstWeight));

    }
    public static void task7 () {
        System.out.println("Задача 7");
        var firstWeight = 78.2;
        var secondWeight = 82.7;
        System.out.println("Разница веса двух боксеров: " + (secondWeight-firstWeight));
        System.out.println("Разница веса двух боксеров: " + ((secondWeight+firstWeight)%firstWeight));

    }
    public static void task8 () {
        System.out.println("Задача 8");
        var totalTime = 640;
        var workTime = 8;
        System.out.println("Всего работников в компании — " + totalTime/workTime + " человек");
        System.out.println("Если в компании работает " + (totalTime/workTime + 94) + " человек, то всего " + totalTime/(totalTime/workTime + 94) + " часов работы может быть поделено между сотрудниками");
    }
}