import java.util.Scanner;

import adapter.MainAdapterTask;
import bridge.MainBridgeTask;
import composite.MainCompositeTask;
import decorator.MainDecoratorTask;
import facade.MainFacadeTask;
import flyweight.MainFlyweightTask;
import proxy.MainProxyTask;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a design pattern to run:");
        System.out.println("1. Adapter");
        System.out.println("2. Bridge");
        System.out.println("3. Composite");
        System.out.println("4. Decorator");
        System.out.println("5. Facade");
        System.out.println("6. Flyweight");
        System.out.println("7. Proxy");
        System.out.print("Enter the number of the design pattern: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Running Adapter Pattern...");
                MainAdapterTask.main(args);
                break;
            case 2:
                System.out.println("Running Bridge Pattern...");
                MainBridgeTask.main(args);
                break;
            case 3:
                System.out.println("Running Composite Pattern...");
                MainCompositeTask.main(args);
                break;
            case 4:
                System.out.println("Running Decorator Pattern...");
                MainDecoratorTask.main(args);
                break;
            case 5:
                System.out.println("Running Facade Pattern...");
                MainFacadeTask.main(args);
                break;
            case 6:
                System.out.println("Running Flyweight Pattern...");
                MainFlyweightTask.main(args);
                break;
            case 7:
                System.out.println("Running Proxy Pattern...");
                MainProxyTask.main(args);
                break;
            default:
                System.out.println("Invalid choice. Please choose a number between 1 and 7.");
                break;
        }

        scanner.close();
    }
}
