public class Main {
    public static void main(String[] args) {
        System.out.println("Здание1");
        // задание 1
        var dog = 8.0;
        var cat = 3.6;
        var peper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(peper);
        // задание 2
        System.out.println("Здание2");
        dog = dog + 4;
        cat = cat + 4;
        peper = peper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(peper);
        // задание 3
        System.out.println("Здание3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        peper = peper -7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(peper);
        // задание 4
        System.out.println("Здание4");
        var friend = 19;
        System.out.println(friend);
        friend = friend +2;
        System.out.println(friend);
        friend = friend/7;
        System.out.println(friend);
        // задание 5
        System.out.println("Здание5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog*10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog +4;
        System.out.println(frog);
        // задание 6
        System.out.println("Здание6");
        var massBoxer1 = 78.2;
        var massBoxer2 = 82.7;
        var totalMass = massBoxer1 + massBoxer2;
        System.out.println("Общая масса двух бойцов " + totalMass + "кг.");
        var differenceBetweenMass = massBoxer1 - massBoxer2;
        System.out.println("Разница между массаи бойцов " + differenceBetweenMass + "кг.");
        // задание 7
        System.out.println("Здание7");
        totalMass = massBoxer2 - massBoxer1;
        System.out.println("Разница масс спортсменов " + totalMass + "кг.");
        totalMass = massBoxer2 % massBoxer1;
        System.out.println("Разница масс спортсменов " + totalMass + "кг.");
        // задание 8
        System.out.println("Здание8");
        var totalHours = 640;
        var eachEmployee = 8;
        var totalEmployees = totalHours / eachEmployee;
        System.out.println("Всего работников в компании " + totalEmployees + " человек");
        totalEmployees = totalEmployees + 94;
        var totalHours2 = totalEmployees * eachEmployee;
        System.out.println("Если в компании работает "+ totalEmployees + " человек, то всего " + totalHours2 + " часов работы может быть поделено между сотрудниками.");



    }
}