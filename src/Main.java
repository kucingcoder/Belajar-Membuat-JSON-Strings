import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<data> daftar_data = new ArrayList<>();

        try{
            for (int i = 0; i <= 2; i++) {
                Scanner input = new Scanner(System.in);
                BufferedReader input2 = new BufferedReader(new InputStreamReader(System.in));

                data databaru = new data();
                int id; String nama;

                System.out.println("masukan data " + (i+1));
                System.out.print("ID\t\t : ");
                id = input.nextInt();

                System.out.print("Nama\t : ");
                nama = input2.readLine();

                databaru.setId(id);
                databaru.setNama(nama);
                daftar_data.add(databaru);

                System.out.println("");
            }
        }catch (Exception error){
            System.out.println(error.getMessage());
        }

        for (data datanya:daftar_data) {
            System.out.println("ID : " + datanya.getId() + " | Nama : " + datanya.getNama());
        }

        System.out.println( "\n" + data.printjson(daftar_data).toString(2));
    }
}