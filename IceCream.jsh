import java.util.Scanner;
static void main(String[] args) {
    String studentNumberLast6Digits = "804061";
    int vanillaPricePence = Integer.parseInt(studentNumberLast6Digits.substring(4, 6));
    int chocolatePricePence = Integer.parseInt(studentNumberLast6Digits.substring(2, 4));
    int strawberryPricePence = Integer.parseInt(studentNumberLast6Digits.substring(0, 2));
    int coneCostPence = 100;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Would you like (v)anilla, (c)hocolate or (s)trawberry?\n");
    char flavourChoice = scanner.next().charAt(0);

    String flavour = "";
    int pricePerScoopPence = 0;
    switch (flavourChoice) {
        case 'v':
            flavour = "Vanilla";
            pricePerScoopPence = vanillaPricePence;
            break;
        case 'c':
            flavour = "Chocolate";
            pricePerScoopPence = chocolatePricePence;
            break;
        case 's':
            flavour = "Strawberry";
            pricePerScoopPence = strawberryPricePence;
            break;
        default:
            System.out.println("We don't have that flavour.");
            return;
    }
    System.out.print("How many scoops would you like?\n");
    int numScoops = scanner.nextInt();
    if (numScoops < 1 || numScoops > 3) {
        if (numScoops == 0) {
            System.out.println("We don't sell just a cone.");
        } else {
            System.out.println("That's too many scoops to fit in a cone.");
        }
        return;
    }
    int totalCostPence = coneCostPence + (pricePerScoopPence * numScoops);
    double totalCostPounds = totalCostPence / 100.0;
    int remainingPence = totalCostPence % 100;
    if (remainingPence < 10) {
        System.out.printf("That will be %.1f please.\n", totalCostPounds + (remainingPence / 10.0));
    } else {
        System.out.printf("That will be %.2f please.\n", totalCostPounds + remainingPence / 100.0);
    }
    scanner.close();
    }            