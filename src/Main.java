public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var peper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(peper);

        dog = dog + 4;
        cat = cat + 4;
        peper = peper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(peper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        peper = peper -7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(peper);

        var friend = 19;
        System.out.println(friend);
        friend = friend +2;
        System.out.println(friend);
        friend = friend/7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog*10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog +4;
        System.out.println(frog);

        var massBoxer1 = 78.2;
        var massBoxer2 = 82.7;
        var totalMass = massBoxer1 + massBoxer2;
        System.out.println("Общая масса двух бойцов " + totalMass + "кг.");
        var differenceBetweenMass = massBoxer1 - massBoxer2;

        System.out.println("Разница между массаи бойцов " + differenceBetweenMass + "кг.");
        totalMass = massBoxer2 - massBoxer1;
        System.out.println("Разница масс спортсменов " + totalMass + "кг.");
        totalMass = massBoxer2 % massBoxer1;
        System.out.println("Разница масс спортсменов " + totalMass + "кг.");

        var totalHours = 640;
        var eachEmployee = 8;
        var totalEmployees = totalHours / eachEmployee;
        System.out.println("Всего работников в компании " + totalEmployees + " человек");
        totalEmployees = totalEmployees + 94;
        var totalHours2 = totalEmployees * eachEmployee;
        System.out.println("Если в компании работает "+ totalEmployees + " человек, то всего " + totalHours2 + " часов работы может быть поделено между сотрудниками.");



    }
}