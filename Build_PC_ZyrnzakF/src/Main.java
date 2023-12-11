import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create components
        // CPU Components
        Component intelI9 = new Component("Intel Core i9-10900K", 500, "10 cores, 3.7 GHz");
        Component amdRyzen9 = new Component("AMD Ryzen 9 5950X", 600, "16 cores, 3.4 GHz");
        Component intelI7 = new Component("Intel Core i7-11700K", 400, "8 cores, 3.6 GHz");
        Component amdRyzen7 = new Component("AMD Ryzen 7 5800X", 450, "8 cores, 3.8 GHz");
        Component intelI5 = new Component("Intel Core i5-10600K", 300, "6 cores, 4.1 GHz");

        // GPU Components
        Component nvidiaRTX3090 = new Component("NVIDIA GeForce RTX 3090", 1500, "24GB GDDR6X");
        Component amdRX6900XT = new Component("AMD Radeon RX 6900 XT", 1200, "16GB GDDR6");
        Component nvidiaRTX3080 = new Component("NVIDIA GeForce RTX 3080", 1000, "10GB GDDR6X");
        Component amdRX6800XT = new Component("AMD Radeon RX 6800 XT", 900, "16GB GDDR6");
        Component nvidiaRTX3070 = new Component("NVIDIA GeForce RTX 3070", 700, "8GB GDDR6");

        // RAM Components
        Component corsairVengeance = new Component("Corsair Vengeance LPX 16GB", 80, "DDR4, 3200 MHz");
        Component gSkillRipjaws = new Component("G.Skill Ripjaws V 32GB", 120, "DDR4, 3600 MHz");
        Component kingstonHyperX = new Component("Kingston HyperX Fury 8GB", 50, "DDR4, 2666 MHz");
        Component crucialBallistix = new Component("Crucial Ballistix 64GB", 200, "DDR4, 3200 MHz");
        Component teamGroupTForce = new Component("Team Group T-Force Delta RGB 16GB", 90, "DDR4, 3000 MHz");

        // Storage Components
        Component samsung970EVO = new Component("Samsung 970 EVO 500GB", 120, "NVMe SSD");
        Component wdBlackSN750 = new Component("WD Black SN750 1TB", 150, "NVMe SSD");
        Component seagateBarracuda = new Component("Seagate Barracuda 2TB", 80, "HDD, 7200 RPM");
        Component crucialMX500 = new Component("Crucial MX500 250GB", 60, "SATA SSD");
        Component adataXPGSX8200Pro = new Component("ADATA XPG SX8200 Pro 1TB", 130, "NVMe SSD");

        // Monitor Components
        Component asusROGSwift = new Component("ASUS ROG Swift PG279Q", 600, "27-inch, 1440p, 165Hz");
        Component acerPredatorX34 = new Component("Acer Predator X34", 800, "34-inch, 3440x1440, 120Hz");
        Component dellS2719DGF = new Component("Dell S2719DGF", 350, "27-inch, 1440p, 155Hz");
        Component lg27GL83A = new Component("LG 27GL83A-B", 450, "27-inch, 1440p, 144Hz");
        Component aocCQ32G1 = new Component("AOC CQ32G1", 300, "32-inch, 1440p, 144Hz");

        // Create categories and add components
        Category cpuCategory = new Category("CPU");
        cpuCategory.addComponent(intelI9);
        cpuCategory.addComponent(amdRyzen9);
        cpuCategory.addComponent(intelI7);
        cpuCategory.addComponent(amdRyzen7);
        cpuCategory.addComponent(intelI5);

        Category gpuCategory = new Category("GPU");
        gpuCategory.addComponent(nvidiaRTX3090);
        gpuCategory.addComponent(amdRX6900XT);
        gpuCategory.addComponent(nvidiaRTX3080);
        gpuCategory.addComponent(amdRX6800XT);
        gpuCategory.addComponent(nvidiaRTX3070);

        Category ramCategory = new Category("RAM");
        ramCategory.addComponent(corsairVengeance);
        ramCategory.addComponent(gSkillRipjaws);
        ramCategory.addComponent(kingstonHyperX);
        ramCategory.addComponent(crucialBallistix);
        ramCategory.addComponent(teamGroupTForce);

        Category storageCategory = new Category("Storage");
        storageCategory.addComponent(samsung970EVO);
        storageCategory.addComponent(wdBlackSN750);
        storageCategory.addComponent(seagateBarracuda);
        storageCategory.addComponent(crucialMX500);
        storageCategory.addComponent(adataXPGSX8200Pro);

        Category monitorCategory = new Category("Monitor");
        monitorCategory.addComponent(asusROGSwift);
        monitorCategory.addComponent(acerPredatorX34);
        monitorCategory.addComponent(dellS2719DGF);
        monitorCategory.addComponent(lg27GL83A);
        monitorCategory.addComponent(aocCQ32G1);

        // Create ComputerBuilder
        List<Category> categories = new ArrayList<>();
        categories.add(cpuCategory);
        categories.add(gpuCategory);
        categories.add(ramCategory);
        categories.add(storageCategory);
        categories.add(monitorCategory);

        ComputerBuilder computerBuilder = new ComputerBuilder(categories);

        // Build computer
        computerBuilder.buildComputer();

        // Display selected components and total cost
        computerBuilder.displayComputerSpecs();
    }
}