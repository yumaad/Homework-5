public class Main {
    public static void main(String[] args) {
        // task #1
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(i);
        }

        // task #2
        System.out.println();
        for (int i = 10; i >= 1; i--)
        {
            System.out.println(i);
        }

        // task #3
        System.out.println();
        for (int i = 0; i<= 17; i += 2)
        {
            System.out.println(i);
        }

        // task #4
        System.out.println();
        for (int i = 10; i >= -10; i--)
        {
            System.out.println(i);
        }

        // task #5
        System.out.println();
        for (int i = 1904; i <= 2096; i+=4)
        {
            System.out.println(i + " год является високосным");
        }

        // task #6
        System.out.println();
        for (int i = 7; i <= 98; i+=7)
        {
            System.out.println(i);
        }

        // task #7
        System.out.println();
        for (int i = 1; i <= 512; i *= 2)
        {
            System.out.println(i);
        }

        // task #8
        System.out.println();
        int capital = 0;
        for (int i = 1; i <= 12; i++)
        {
            capital += 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + capital +" рублей");
        }

        // task #9
        System.out.println();
        float capital2 = 0;
        for (int i = 1; i <= 12; i++)
        {
            capital2 = (capital2 + 29000) * 1.01f;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + capital2 +" рублей");
        }

        // task #10
        System.out.println();
        for (int i = 1; i <= 10; i++)
        {
            System.out.println("2 * " + i + " = " + 2 * i);
        }
    }
}