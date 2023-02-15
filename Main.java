package bosch;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
                          Scanner s = new Scanner(System.in);

                double parte1 = 3 * (Math.pow(-3 / 4d, -2)) + 6 * (Math.pow(3, -1) / 4) - 4;
                double parte2 = 7 * (Math.pow(-3 / 4d, -1)) + 2;

                double parte3 = parte1 / parte2;
                double parte4 = ((Math.pow(parte3, -1) + 4));

                System.out.println(parte4);


            }
        }



