import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i=1;
        int zm;
        String[] rezerwacje = new String[10];
        do {
            System.out.println("\nWITAMY W BIURZE PODRÓŻY");
            String godnosc;
            System.out.println("podaj imie i nazwisko");
            godnosc = scan.nextLine();
            System.out.println(godnosc);
            System.out.println();
            System.out.println("ZAREZEWUJ LOT \n 1.Gdańsk-Warszawa\n 2.Gdańsk-Wrocław\n 3.Gdańsk-Poznań\n 4.Gdańsk-Kraków");
            String lot = null;
            int k = scan.nextInt();
            int l = 0;
            switch (k) {
                case 1 -> {
                    System.out.println("wybrałeś lot 1");
                    lot = "Gdańsk-Warszawa";
                    l = 1;
                }
                case 2 -> {
                    System.out.println("wybrałeś lot 2");
                    lot = "Gdańsk-Wrocław";
                    l = 2;
                }
                case 3 -> {
                    System.out.println("wybrałeś lot 3");
                    lot = "Gdańsk-Poznań";
                    l = 3;
                }
                case 4 -> {
                    System.out.println("wybrałeś lot 4");
                    lot = "Gdańsk-Kraków";
                    l = 4;
                }
                default -> {
                }
            }
            System.out.println("Dobra co dalej  \n1. usun rezerwacje\n2. to wszystko ");

            int k2 = scan.nextInt();

            switch (k2) {
                case 1:
                    System.out.println("USUŃ REZERWACJE \n 1.Gdańsk-Warszawa\n 2.Gdańsk-Wrocław\n 3.Gdańsk-Poznań\n 4.Gdańsk-Kraków");
                    int u = scan.nextInt();
                    if (u != l) {
                        System.out.println("nie ma takiej rezerwacji (błąd)");
                    } else
                        System.out.println("usunieta");

                    lot=null;
                    break;
                case 2:
                    System.out.print("git");
                default:

            }

            String osoba="\ngodnosc: "+godnosc +"\nlot: "+lot;
            rezerwacje[i-1]=osoba;
            i=i+1;
            System.out.println("\n1-wyłącz system rezarwacji \n2-kolejna osoba");
            zm = scan.nextInt();
            scan.nextLine();
        } while (zm != 1);
        for(int j=0;j<i-1;j++){
            System.out.print(rezerwacje[j]);
        }
    }
}