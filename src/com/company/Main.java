package com.company;

import java.util.*;

import static com.sun.tools.javac.jvm.ByteCodes.swap;
import static java.util.stream.Collectors.toList;

public class Main {
    static final Scanner in = new Scanner ( System.in );

    public static void main(String[] args) {
        boolean run = true;
        List<Integer> list;

        while (run) {
            int menu = menuProgram ();

            switch (menu) {
                case 1:
                    list = randomData();
                    String output = list.toString().replaceAll("(^\\[|\\]$)", "");
                    System.out.print(output +"\n");
                    break;
                case 2:
                    bubbleAscending ();
                    break;
                case 3 :
                    selectionAscending ();
                    break;
                case 4 :
                    bubbleDescending ();
                    break;
                case 5 :
                    selectionDescending ();
                    break;
                case 6 :
                    run = false;
                    break;
            }
        }

        System.out.println ( "\n-------------------------Terima Kasih-------------------------" );
    }

    private static int menuProgram() {
        System.out.println ( "\n----------------------------------------" );
        System.out.println("Selamat Datang di Program Simulasi\n" +
                "Menu\n" +
                "1. Random Data\n" +
                "2. Simulasi Bubble Sort - Ascending\n" +
                "3. Simulasi Selection Sort - Ascending\n" +
                "4. Simulasi Bubble Sort - Descending\n" +
                "5. Simulasi Selection Sort - Descending\n" +
                "6. Keluar");

        int dataMenu = 0;

        while (dataMenu < 1 || dataMenu > 6) {
            try{
                System.out.print("Inputkan menu: ");
                dataMenu = in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Mohon maaf menu yang anda inputkan salah");
            }
            in.nextLine();
        }

        return dataMenu;
    }

    private static List<Integer> randomData() {
        int batasBawah = 0, batasAtas = 0;

        System.out.print("Batas Bawah \t: ");
        batasBawah = in.nextInt();

        System.out.print("Batas Atas  \t: ");
        batasAtas = in.nextInt();

        List<Integer> randomInteger = new ArrayList<> ();

        if (batasBawah<batasAtas){
            randomInteger = new Random().ints(5, batasBawah, batasAtas).boxed().collect(toList());
        } else {
            System.out.print("Batas bawah harus lebih kecil \t: ");
        }

        return randomInteger;

    }

    private static void bubbleAscending() {
    }

    private static void selectionAscending() {
    }

    private static void bubbleDescending() {
    }

    private static void selectionDescending() {
        int[] num = new int[]{ 5, 6, 1, -2, 3, 2};

        int i, j, first, temp;
        for ( i = num.length - 1; i > 0; i -- )
        {
            first = 0;
            for(j = 1; j <= i; j ++)
            {
                if( num[ j ] < num[ first ] )
                    first = j;

                System.out.println(Arrays.toString(num));
            }
            temp = num[ first ];
            num[ first ] = num[ i ];
            num[ i ] = temp;
        }

        System.out.println(Arrays.toString(num));
    }

}
