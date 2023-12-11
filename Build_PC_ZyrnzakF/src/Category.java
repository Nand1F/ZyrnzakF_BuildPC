import java.util.List;
import java.util.ArrayList;

public class Category {
    private String categoryName;
    private List<Component> components;

    public Category(String categoryName) {
        this.categoryName = categoryName;
        this.components = new ArrayList<>();
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    public void displayComponents() {
        System.out.println("Category: " + categoryName);
        for (int i = 0; i < components.size(); i++) {
            Component component = components.get(i);
            System.out.println((i + 1) + ". " + component.getName() +
                    " - $" + component.getPrice() +
                    " - " + component.getCharacteristics());
        }
        System.out.println();
    }
 public String getCategoryName() {
     return categoryName;
 }


    public List<Component> getComponents() {
        return components;
    }


}
