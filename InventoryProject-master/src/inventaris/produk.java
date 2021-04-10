package inventaris;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class produk {
    Scanner in = new Scanner(System.in);
    int aku;

    int[] numbers = new int[100];
    String[] names = new String[100];
    int[] prices = new int[100];
    int[] stocks = new int[100];
    int[] values = new int[100];

    public Product() {

    }

    private void inputData() {
        try {
            for (int i = 0; i < aku; i++) {
                System.out.println("No produk -" + (i + 1));
                System.out.print("tekan 0 untuk hentikan : ");

                in.nextLine();
                numbers[i] = i + 1;
                names[i] = in.nextLine();

                if (names[i].equals("0")) {
                    break;
                }

                System.out.print("harga : ");
                prices[i] = in.nextInt();
                System.out.print("produk tersedia : ");
                stocks[i] = in.nextInt();
                values[i] = stocks[i] * prices[i];
            }
        } catch (InputMismatchException e) {
            System.out.println("masukan angka");
            in.nextLine();
            menu();
        }
    }

    public void menu() {
        do {
            System.out.print("masukan no produk : ");
            aku = in.nextInt();

            if (aku <= 0) {
                System.out.println("Input lebih dari 0");
            } else {
                inputData();
            }
        } while (aku <= 0);
    }

    public void getDataValue() {
        for (int i = 0; i < aku; i++) {
            System.out.println("No item : " + numbers[i]);
            System.out.println("nama produk : " + names[i]);
            System.out.println("haraga produk : " + prices[i]);
            System.out.println("sisa produk : " + stocks[i]);
            System.out.println("jumlah produk : " + values[i]);
        }
    }


}

}
