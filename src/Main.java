import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Aukeratu eragiketa bat:");
        System.out.println("1. batuketa \t 2.Kenketa");
        System.out.println("3. Biderketa \t 4.Zatiketa");

        int zenb1 = sc.nextInt();

        if (zenb1 < 1 || zenb1 > 4 ) {
            System.out.println("Sartu duzun aukera ez da egokia.");
        }
        else {
            System.out.println("Sartu lehen zenbakia (hamartarra izan daiteke):");
            float zenb2 = sc.nextFloat();
            System.out.println("Sartu bigarren zenbakia (hamartarra izan daiteke):");
            float zenb3 = sc.nextFloat();

            if (zenb3 == 0 && (zenb1 == 4 || zenb1 == 4)){

                System.out.println("Ariketa hau ezin da zati zero egin.");

            }
            else {
                double emaitza = 0;
                switch (zenb1){
                    case 1:
                        emaitza = zenb2 + zenb3;
                        break;
                    case 2:
                        emaitza = zenb2 - zenb3;
                        break;
                    case 3:
                        emaitza = zenb2 * zenb3;
                        break;
                    case 4:
                        emaitza = zenb2 / zenb3;
                        break;
                }
                System.out.println("Eragiketaren emaitza " + emaitza + " da.");
            }
        }
        sc.close();
    }
}