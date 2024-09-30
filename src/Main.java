import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        System.out.print("Enter bill total: $");  //collects bill before tip, tip percentage, and # of people
        String bill = s.nextLine();
        System.out.print("Enter intended tip: ");
        String tip = s.nextLine();
        System.out.print("Enter number of people: ");
        String party = s.nextLine();
        System.out.println();


        double billTotal = Double.parseDouble(bill); //converts user string responses into doubles & ints for calculations
        double tipPercent = Double.parseDouble(tip);
        int people = Integer.parseInt(party);

        //calculations
        tipPercent *= 0.01;
        double tipTotal = (tipPercent*billTotal);
        billTotal += tipTotal;
        double soloTip = tipTotal/people;
        double soloTotal = billTotal/people;

        //calculator results
        System.out.printf("Tip total: $" + "%.2f", tipTotal);
        System.out.println();
        System.out.printf("Bill total (tip included): $" + "%.2f",billTotal);
        System.out.println();
        System.out.printf("Tip per person: $" + "%.2f", soloTip);
        System.out.println();
        System.out.printf("Total per person (tip included): $" + "%.2f",soloTotal);
        System.out.println();

    }
}
