import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println("\n");
        task2();
        task3();
        System.out.println("\n");
        task4();
        System.out.println("\n");
        task5();
        System.out.println("\n");
        task6();
        System.out.println("\n");
        task7();
        System.out.println("\n");
        task8();

    }


    //задание 1

    private static void task1() {

        int i = 2145865;
        byte b = 127;
        short s = 32767;
        long l = 919559854;
        float f = 3.4547f;
        double d = 1.85484;
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);


    }
    //задание 2

    private static void task2() {

        float f = 27.12f;
        long l = 987_678_965_549L;
        double d = 2.786;
        boolean bl = false;
        short s = 569;
        int i = -159;
        char c = 27897;
        byte b = 67;



    }
    //задание 3

    private static void task3() {
        int pupilsLyudmilaPavlovna = 23;
        int pupilsAnnaSergeevna = 27;
        int pupilsEkaterinaAndreevna = 30;
        int allPupils = pupilsLyudmilaPavlovna + pupilsAnnaSergeevna + pupilsEkaterinaAndreevna;
        int paperPurchased = 480;
        int papersPerPupils = paperPurchased / allPupils;
        System.out.println("На каждого ученика рассчитано " + papersPerPupils + " листов бумаги");


    }
    //задание 4

    private static void task4() {
        int performanceBottlesIn2Minutes = 16;
        int performanceBottlesIn1Minutes = performanceBottlesIn2Minutes / 2;
        int daysInOneMonth = 31;
        int hourInOneDay = 24;
        int minutesInOneHour = 60;
        int minutesInOneDay = hourInOneDay * minutesInOneHour;


        HashMap<String, Integer> performance = new HashMap<>();
        performance.put("За 20 минут", 20 * performanceBottlesIn1Minutes);
        performance.put("За сутки", minutesInOneDay * performanceBottlesIn1Minutes);
        performance.put("За 3 дня", 3 * minutesInOneDay * performanceBottlesIn1Minutes);
        performance.put("За 1 месяц", daysInOneMonth * hourInOneDay * minutesInOneDay * performanceBottlesIn1Minutes);

        performance.forEach(Main::printPerformance);
    }

    private static void printPerformance(String time, Integer performance) {
        System.out.println(time + " работы, машина произведет бутылок - " + performance + " штук.");
    }

    //задание 5

    private static void task5() {
        int totalCansPaintNeed = 120;
        int oneClassOfWhitePaint = 2;
        int oneClassOfBrownPaint = 4;
        int totalPaintForOneClass = oneClassOfWhitePaint + oneClassOfBrownPaint;
        int classesAtSchool = totalCansPaintNeed / totalPaintForOneClass;
        int needWhitePaint = oneClassOfWhitePaint * classesAtSchool;
        int needBrownPaint = oneClassOfBrownPaint * classesAtSchool;
        System.out.println("В школе, где " + classesAtSchool + " классов, нужно " + needWhitePaint + " банок белой краски и " + needBrownPaint + " банок коричневой краски.");

    }
    //Задание 6

    private static void task6() {
        int weightBananaInGram = 80;
        int weightMilk100mlInGram = 105;
        int weightIceCream = 100;
        int weightEgg = 70;
        double totalGram = (weightBananaInGram * 5) + (weightMilk100mlInGram * 2) + (weightIceCream * 2) + (weightEgg * 4);
        double totalKg = totalGram / 1000;
        System.out.println("Общий вес консистенции " + totalKg + "кг.");


    }
    //задание 7

    private static void task7() {
        int needToResetWeightGram = 7374;
        int minWeightLoseInDay = 277;
        int maxWeightLoseInDay = 533;
        float takeDays250Gr = (float) needToResetWeightGram / minWeightLoseInDay;
        float takeDays500Gr = (float) needToResetWeightGram / maxWeightLoseInDay;
        float takeDaysAverage = (takeDays250Gr + takeDays500Gr) / 2;
        System.out.printf("Максимум дней для похудения - %.0fд.\n", Math.ceil(takeDays250Gr));
        System.out.printf("Минимум дней для похудения - %.0fд.\n", Math.ceil(takeDays500Gr));
        System.out.printf("В среднем дней для похудения - %.0fд.\n", Math.ceil(takeDaysAverage));

    }


    //задание 8
    private static void task8() {
        var employees = new HashMap<String, Float>();
        employees.put("Маша", 67_760f);
        employees.put("Денис ", 83_690f);
        employees.put("Кристина", 76_230f);

        var percent = 1.1;
        employees.forEach((key, value) -> printNewSalary(key, value, percent));

    }


    private static void printNewSalary(String name, Float oldSalary, double percent) {
        var newSalary = oldSalary * percent;
        System.out.printf("Зарплата до повышения у сотрудника %s состовляла - %.2f рублей в месяц.\n", name, oldSalary);
        System.out.printf("После повышения - %.2f рублей в месяц, годовой прирост составил - %.2f рублей. \n", newSalary, (newSalary - oldSalary) * 12);
        System.out.println();
    }

}
