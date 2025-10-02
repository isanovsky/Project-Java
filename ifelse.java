import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

          System.out.print("Masukkan username: ");
          String user = scanner.nextLine();

          System.out.print("Masukkan password: ");
          String pass = scanner.nextLine();

          if (user.equals("admin") && pass.equals("1234")) {
              System.out.println("Login berhasil, selamat datang " + user + "!");
          } else {
              System.out.println("Login gagal, coba lagi.");
          }
    }
}
