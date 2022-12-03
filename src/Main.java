public class Main {
    public static void main(String[] args) {
        double dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxerWeightOne = 78.2;
        var boxerWeightTwo = 82.7;
        var totalWeightTwoFighters = boxerWeightOne + boxerWeightTwo;
        System.out.println("Общий вес двух бойцов " + totalWeightTwoFighters + " кг!");
        var preponderance = Math.abs(boxerWeightOne - boxerWeightTwo);
        System.out.println("Разница в весе " + preponderance + " кг!");
        var weightDifference = boxerWeightTwo - boxerWeightOne;
        System.out.println("Разница в весе " + weightDifference + " кг!");
        var weightDifference2 = boxerWeightTwo % boxerWeightOne;
        System.out.println("Разница в весе " + weightDifference2 + " кг!");

        var watch = 640;
        var workingDay = 8;
        var numberEmployees = watch / workingDay;
        System.out.println("Всего работников в компании – " + numberEmployees + " человек");
        numberEmployees = numberEmployees + 94;
        var openingHours = numberEmployees * workingDay;
        System.out.println("Если в компании работает " + numberEmployees + " человек, то всего " + openingHours + " часов работы может быть поделено между сотрудниками" );



    }
}