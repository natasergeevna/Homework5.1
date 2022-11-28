public class Main {
    public static void main(String[] args) {
        //task 1
        int [] mas = new int[3];
        mas[0] = 1;
        mas[1] = 2;
        mas[2] = 3;

        double [] mas2 = {1.57, 7.654, 9.986};

        int [] seasons = {1, 2, 3, 4};

        //task 2
        int i;
        for (i = 0; i < mas.length - 1; i++) {
            System.out.print(mas[i] + ", ");
        }
        System.out.println(mas[i]);
        for (i = 0; i < mas2.length - 1; i++) {
            System.out.print(mas2[i] + ", ");
        }
        System.out.println(mas2[i]);
        for (i = 0; i < seasons.length - 1; i++) {
            System.out.print(seasons[i] + ", ");
        }
        System.out.println(seasons[i]);
        System.out.println();

        //task 3
        for ( i = mas.length - 1; i >= 1; i--) {
            System.out.print(mas[i] + ", ");
        }
        System.out.println(mas[i]);
        for ( i = mas2.length - 1; i >= 1; i--) {
            System.out.print(mas2[i] + ", ");
        }
        System.out.println(mas2[i]);
        for ( i = seasons.length - 1; i >= 1; i--) {
            System.out.print(seasons[i] + ", ");
        }
        System.out.println(seasons[i]);
        System.out.println();

        //task 4
        System.out.print("{");
        for (i = 0; i < mas.length; i++){
            if (mas[i] % 2 != 0) mas[i]++;
            if (i < mas.length - 1) System.out.print(mas[i] + ", ");
        }
        System.out.println(mas[mas.length - 1] + "}");
    }
}