/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author AT
 */
import java.util.Scanner;
public class Jalan {
    private static int pilih;
    private static int a;
    public static void main(String [] args) {
        Mobil jalan1 = new Mobil(180, 0, 0);
        Scanner in = new Scanner(System.in);
        while (!jalan1.isStarted()) {

            System.out.println("1. Start");

            System.out.println("2. Stop");

            System.out.println("3. Rem");

            System.out.println("4. Ganti Gigi");

            System.out.println("5. Gas");

            System.out.println("");

            System.out.println("Kecepatan Mobil "+ jalan1.getKecActual());

            System.out.print("Pilihan Anda ");

            pilih = in.nextInt();

            switch (pilih) {

                case 1 :

                    jalan1.start();

                    break;

                case 2 :

                    jalan1.stop();

                    break;

                case 3 :

                    jalan1.rem();

                    break;

                case 4 :

                    System.out.print("Pindah Gigi bukan Oper Gigi : ");

                    int Gigi = in.nextInt();

                    jalan1.gantiGigi(Gigi);

                    break;

                case 5 :

                    jalan1.gas();

                    break;

            }   

        }

    }

}