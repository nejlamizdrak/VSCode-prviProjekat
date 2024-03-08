import java.util.Scanner;
public class drugiZadatak {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Unesite string: ");
        String unos=scanner.nextLine();
        int brojKaraktera=prebrojiKaraktere(unos);
        System.out.println("Broj karaktera u unesenom stringu je: "+brojKaraktera);
        scanner.close();
    }
    private static int prebrojiKaraktere(String tekst) {
        return tekst.length();
    }
}