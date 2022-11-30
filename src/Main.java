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

            byte dog = 15;
            short rabbit = 345;
            int cat = 123156;
            long orange = 94228324125215529l;
            float money = 84283.5f;
            double dollar = 38495.2;

            System.out.println("Значение переменной dog с типом byte равно " + dog);
            System.out.println("Значение переменной rabbit с типом short равно " + rabbit);
            System.out.println("Значение переменной cat с типом int равно " + cat);
            System.out.println("Значение переменной orange с типом long равно " + orange);
            System.out.println("Значение переменной money с типом float равно " + money);
            System.out.println("Значение переменной dollar с типом double равно " + dollar);
        }
        public static void task2() {
            System.out.println("Задача 2");

            float pig = 27.12f;
            long people = 987678965234549l;
            double banana = 2.786;
            short meat = 569;
            short time = -159;
            int euro = 27897;
            byte day = 67;
        }
        public static void task3() {
            System.out.println("Задача 3");

            byte studentLP = 23;
            byte studentAS = 27;
            byte studentEA = 30;
            short paper = 480;
            int allStudent = studentAS + studentEA + studentLP;
            int paperForStudent = paper / allStudent;

            System.out.println("На каждого ученика рассчитано " + paperForStudent + " листов бумаги");
        }
        public static void task4() {
            System.out.println("Задача 4");

            byte performance = 16;
            int performancePerMinute = performance / 2;
            int minute20 = performancePerMinute * 20;
            int day = performancePerMinute * 24 * 60;
            int day3 = day * 3;
            int month = day * 30;

            System.out.println("За 20 минут машина произвела " + minute20);
            System.out.println("За сутки машина произвела " + day);
            System.out.println("За 3 дня машина произвела " + day3);
            System.out.println("За месяц машина произвела " + month);
        }
        public static void task5() {
            System.out.println("Задача 5");

            byte canOfPaint = 120;
            byte whitePaint = 1;
            int whitePaintForClass = whitePaint * 2;
            byte brownPaint = 1;
            int brownPaintForClass = brownPaint * 4;
            int oneClassRoom = brownPaintForClass + whitePaintForClass;
            int totalClasses = canOfPaint / oneClassRoom;
            int totalWhitePaint = totalClasses * whitePaintForClass;
            int totalBrownPaint = totalClasses * brownPaintForClass;

            System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhitePaint + " банок белой краски и " +
                    totalBrownPaint + " банок коричневой краски");
        }
        public static void task6() {
            System.out.println("Задача 6");

            byte banana = 5;
            short gramsPerKilo = 1000;
            byte oneBananaGrams = 80;
            short milk = 2;
            byte gramsPerMl = 105;
            byte gramsOneIceCream = 100;
            byte iceCream = 2;
            byte agg = 4;
            int oneAgg = 70;
            int allWeightGrams = oneBananaGrams * banana + gramsPerMl * milk  + iceCream * gramsOneIceCream + agg * oneAgg;
            float allWeightKg = (float)allWeightGrams / gramsPerKilo;

            System.out.println("Вес спортзавтрака в граммах равен " + allWeightGrams);
            System.out.println("Вес спортзавтрака в килограммах равен " + allWeightKg);
        }
        public static void task7() {
            System.out.println("Задача 7");

            byte weightKg = 7;
            short grPerKg = 1000;
            int weightGr = weightKg * grPerKg;
            short diet250 = 250;
            short diet500 = 500;
            int dayPerDiet250 = weightGr / diet250;
            int dayPerDiet500 = weightGr / diet500;

            System.out.println(dayPerDiet250 + " дней потребуется для похудения при рационе питания для похудения на 250 грамм.");
            System.out.println(dayPerDiet500 + " дней потребуется для похудения при рационе питания для похудения на 500 грамм");
            int meanDaysDiet = (dayPerDiet250 + dayPerDiet500) / 2;
            System.out.println("Среднее время для похудения на 7 килограмм = " + meanDaysDiet);

        }
        public static void task8() {
            System.out.println("Задаа 8");

            int maria = 67760;
            int denis = 83690;
            int kristina = 76230;
            byte year = 12;
            byte increase110 = 110;
            byte base = 100;
            int mariaYear = maria * year;
            int denisYear = denis * year;
            int kristinaYear = kristina * year;
            double mariaIncrease = (double)maria / base * increase110;
            double denisIncrease = (double)denis / base * increase110;
            double kristinaIncrease = (double)kristina / base * increase110;
            double mariaInYear = mariaIncrease * year;
            double denisInYear = denisIncrease * year;
            double kristinaInYear = kristinaIncrease * year;
            double diffMaria = mariaInYear - mariaYear;
            double diffDenis = denisInYear - denisYear;
            double diffKristina = kristinaInYear - kristinaYear;

            System.out.println("Маша теперь получает " + mariaInYear + " рублей. Годовой доход вырос на " + diffMaria + " рублей");
            System.out.println("Денис теперь получает " + denisInYear + " рублей. Годовой доход вырос на " + diffDenis + " рублей");
            System.out.println("Кристина теперь получает " + kristinaInYear + " рублей. Годовой доход вырос на " + diffKristina + " рублей");

        }




}