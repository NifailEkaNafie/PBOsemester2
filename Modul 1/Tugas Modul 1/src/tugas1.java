import java.util.Scanner;
public class praktikum1 {
    public static void main(String[] args) {
        int login;

        String nim, username, password;
        Scanner objInput = new Scanner(System.in);

        System.out.print("=== Library ===\n1. Student\n2. Admin\n3. Exit\n   ");
        System.out.print("Masukkan Pilihan: ");

        login = objInput.nextInt();
        if (login == 1){
            System.out.print("Masukkan NIM : ");
            nim = objInput.next();
            if (nim.length() == 15 && nim.equals("202310370311344")){
                System.out.print("Berhasil Login");
            } else {
                System.out.print("User tidak ditemukan");
            }
        }
        if (login == 2) {
            System.out.print("Masukkan user : ");
            username = objInput.next();
            System.out.print("Masukkan pass : ");
            password = objInput.next();
            if (username.equals("admin") && password.equals("admin2")) {
                System.out.print("Berhasil login sebagai admin");
            } else {
                System.out.print("User admin tidak ditemukan");
            }
        }
        if (login == 3){
            System.out.print("Bye Bye");
        }
    }
}
