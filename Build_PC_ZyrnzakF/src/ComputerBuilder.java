import java.util.List;
import java.util.Scanner;

public class ComputerBuilder {
    private List<Category> categories;
    private double totalCost;
    private StringBuilder computerSpecs;

    public ComputerBuilder(List<Category> categories) {
        this.categories = categories;
        this.totalCost = 0;
        this.computerSpecs = new StringBuilder();
    }

    public void buildComputer() {
        Scanner scanner = new Scanner(System.in);

        for (Category category : categories) {
            category.displayComponents();

            System.out.print("Select a component from " + category.getCategoryName() + " (Enter component number): ");
            int selectedComponentIndex = scanner.nextInt() - 1;
            Component selectedComponent = category.getComponents().get(selectedComponentIndex);

            totalCost += selectedComponent.getPrice();
            computerSpecs.append(category.getCategoryName()).append(": ")
                    .append(selectedComponent.getName()).append(" - $")
                    .append(selectedComponent.getPrice()).append(" - ")
                    .append(selectedComponent.getCharacteristics()).append("\n");
        }

        scanner.close();
    }

    public void displayComputerSpecs() {
        System.out.println("Selected Components:\n" + computerSpecs.toString());
        System.out.println("Total Cost: $" + totalCost);
    }
}

