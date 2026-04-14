import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	
	// Global lists to hold Dog and Monkey objects
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	String selection;
    	
    	// Sample dogs/monkeys for testing
    	initializeDogList();
    	initializeMonkeyList();
    	
    	// Menu loop
    	do {
    		displayMenu();
    		selection = scanner.nextLine().trim().toLowerCase();
    				
    		switch (selection) {
    			case "1":
    				intakeNewDog(scanner);
    				break;
    			case "2":
    				intakeNewMonkey(scanner);
    				break;
    			case "3":
    				reserveAnimal(scanner);
    				break;
    			case "4":
    				printAllDogs();
    				break;
    			case "5":
    				printAllMonkeys();
    				break;
    			case "6":
    				printAvailableAnimals();
    				break;
    			case "q":
    				System.out.println("Exiting program.");
    				break;
    			default:
    				System.out.println("Invalid selection. Try again.");
    		}
    	} while (!selection.equals("q"));
    	
    	scanner.close();
    }
    // Display menu options
    public static void displayMenu() {
        System.out.println("\nRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are in service and available");
        System.out.println("[q] Quit application");
        System.out.print("Enter a menu selection: ");
    }
    
    public static void printAllDogs() {
    	System.out.println("\nAll Dogs:");
    	for (Dog dog: dogList) {
    		System.out.println("Name: " + dog.getName()
    			+ ", Breed: " + dog.getBreed()
    			+ ", Gender: " + dog.getGender()
    			+ ", Age: " + dog.getAge()
    			+ ", Weight: " + dog.getWeight()
    			+ ", Acquisition Date: " + dog.getAcquisitionDate()
    			+ ", Acquisition Country: " + dog.getAcquisitionCountry()
    			+ ", Training Status: " + dog.getTrainingStatus()
    			+ ", Reserved: " + dog.getReserved()
    			+ ", In Service Country: " + dog.getInServiceCountry());
    	}
    }
    
    public static void printAllMonkeys() {
    	System.out.println("\nAll Monkeys:");
    	for (Monkey monkey : monkeyList) {
    		System.out.println(monkey.toString());
    	}
    }
    
    public static void printAvailableAnimals() {
    	System.out.println("\nAvailable Animals in Service: ");
    	
    	for (Dog dog : dogList) {
    		if (dog.getTrainingStatus().equalsIgnoreCase("in service") && !dog.getReserved()) {
    			System.out.println(dog.getName() + ", " + dog.getAcquisitionCountry());
    		}
    	}
    	
    	for (Monkey monkey : monkeyList) {
    		if (monkey.getTrainingStatus().equalsIgnoreCase("in service") && !monkey.getReserved()) {
    			System.out.println(monkey.getName() + ", " + monkey.getAcquisitionCountry());
    		}
    	}
    }

    // Adds sample dogs to a list for testing
    public static void initializeDogList() {
        dogList.add(new Dog("Loki", "Staffordshire Bull Terrier", "male", 11, 80.0f, "08-07-2018", "USA", "in service", false, "USA"));
        dogList.add(new Dog("Brock", "American Bully", "male", 3, 40.0f, "07-26-2023", "Canada", "Phase IV", true, "Canada"));
        dogList.add(new Dog("Freyja", "Rottweiler", "female", 4, 92.0f, "02-06-2021", "Germany", "in service", false, "Germany"));
    }
    
    // Adds sample monkeys to a list for testing
    public static void initializeMonkeyList() {
    	monkeyList.add(new Monkey("Maria", "Capuchin", "female", 5, 18.5f, "06-12-2022", "Brazil", "Phase II", false, "USA", 15.3f, 18.4f, 20.4f));
    	monkeyList.add(new Monkey("Carlos", "Marmoset", "male", 4, 12.0f, "08-25-2021", "Peru", "in service", false, "Peru", 11.2f, 14.2f, 15.3f));
    	monkeyList.add(new Monkey("Toro", "Squirrel monkey", "male", 6, 14.6f, "03-14-2020", "Columbia", "in service", true, "Columbia", 10.6f, 16.1f, 17.0f));
    }
    
    // Intake a new dog and add to list
    public static void intakeNewDog(Scanner scanner) {
    	System.out.print("Enter dog's name: ");
    	String name = scanner.nextLine();
    	
    	for (Dog dog : dogList) {
    		if (dog.getName().equalsIgnoreCase(name)) {
    			System.out.println("This dog is already in our system.");
    			return;
    		}
    	}

    	// Basic dog info
    	System.out.print("Breed: ");
    	String breed = scanner.nextLine();
    	
    	System.out.print("Gender: ");
    	String gender = scanner.nextLine();
    	
    	System.out.print("Age: ");
    	int age = Integer.parseInt(scanner.nextLine());
    	
    	System.out.print("Weight: ");
    	float weight = Float.parseFloat(scanner.nextLine());
    	
    	// Dog acquisition info
    	System.out.print("Acquisition date: ");
    	String acquisitionDate = scanner.nextLine();
    	
    	System.out.print("Acquisition country: ");
    	String acquisitionCountry = scanner.nextLine();
    	
    	System.out.print("Training status: ");
    	String trainingStatus = scanner.nextLine();
    	
    	System.out.print("Is the dog reserved? (true/false): ");
    	boolean reserved = Boolean.parseBoolean(scanner.nextLine());
    	
    	System.out.print("In-service country: ");
    	String inServiceCountry = scanner.nextLine();
    	
    	dogList.add(new Dog(name, breed, gender, age, weight, 
    			acquisitionDate, acquisitionCountry,
    			trainingStatus, reserved, inServiceCountry));
    	
    	System.out.println("Dog successfully added.");
    }
    	
    // Intake a new monkey and add to list
    public static void intakeNewMonkey(Scanner scanner) {
    	
    	// Monkey first name to validate
    	System.out.print("Monkey's name: ");
    	String name = scanner.nextLine();
    	
    	//Validate monkey is not already in the system
    	for (Monkey monkey : monkeyList) {
    		if (monkey.getName().equalsIgnoreCase(name)) {
    			System.out.println("This monkey is already in the system.");
    			return;
    		}
    	}
    	
    	// Continue collecting basic monkey info
    	System.out.print("Species (Capuchin, Guenon, Macaque, Marmoset, Squirrel monkey, Tamarin): ");
    	String species = scanner.nextLine();
    	
    	System.out.print("Gender: ");
    	String gender = scanner.nextLine();
    	
    	System.out.print("Age: ");
    	int age = Integer.parseInt(scanner.nextLine());
    	
    	System.out.print("Weight: ");
    	float weight = Float.parseFloat(scanner.nextLine());
    	
    	System.out.print("Tail length: ");
    	float tailLength = Float.parseFloat(scanner.nextLine());
    	
    	System.out.print("Height: ");
    	float height = Float.parseFloat(scanner.nextLine());
    	
    	System.out.print("Body length: ");
    	float bodyLength = Float.parseFloat(scanner.nextLine());
    	
    	// Monkey acquisition info
    	System.out.print("Acquisition date: ");
    	String acquisitionDate = scanner.nextLine();
    	
    	System.out.print("Acquisition country: ");
    	String acquisitionCountry = scanner.nextLine();
    	
    	System.out.print("Training status: ");
    	String trainingStatus = scanner.nextLine();
    	
    	System.out.print("Is the monkey reserved? (true/false): ");
    	boolean reserved = Boolean.parseBoolean(scanner.nextLine());
    	
    	System.out.print("In-service country: ");
    	String inServiceCountry = scanner.nextLine();
    	
    	// Create and add monkey
    	monkeyList.add(new Monkey(name, species, gender, age, weight,
    			acquisitionDate, acquisitionCountry, trainingStatus, reserved,
    			inServiceCountry, tailLength, height, bodyLength));
    	
    	System.out.println("Monkey successfully added.");
    }

    // Reserve an animal
    public static void reserveAnimal(Scanner scanner) {
    	System.out.print("Enter animal type (dog or monkey): ");
    	String type = scanner.nextLine().toLowerCase();
    	
    	System.out.print("Enter country of acquisition: ");
    	String country = scanner.nextLine();
    	
    	boolean found = false;
    	
    	if (type.equalsIgnoreCase("dog")) {
    		for (Dog dog : dogList) {
    			// Debug output
    			System.out.println("Checking Dog - Name: " + dog.getName() +
    					", Country: " + dog.getAcquisitionCountry() +
    					", Reserved: " + dog.getReserved() +
    					", Training Status: " + dog.getTrainingStatus());
    			if (dog.getAcquisitionCountry().equalsIgnoreCase(country) &&
    				!dog.getReserved() &&
    				dog.getTrainingStatus().equalsIgnoreCase("in service")) {
    				dog.setReserved(true);
    				System.out.println(dog.getName() + " has been reserved.");
    				found = true;
    				break;
    			}
    		}
    	} else if (type.equalsIgnoreCase("monkey")) {
    		for (Monkey monkey : monkeyList) {
    			// Debug output
    			System.out.println("Checking Monkey - Name: " + monkey.getName() +
    					", Country: " + monkey.getAcquisitionCountry() +
    					", Reserved: " + monkey.getReserved() +
    					", Training Status: " + monkey.getTrainingStatus());
    			
    			if (monkey.getAcquisitionCountry().equalsIgnoreCase(country) &&
    				!monkey.getReserved() && 
    				monkey.getTrainingStatus().equalsIgnoreCase("in service")) {
    				monkey.setReserved(true);
    				System.out.println(monkey.getName() + " has been reserved.");
    				found = true;
    				break;
    			}
    		}
    	} else {
    		System.out.println("Invalid animal type.");
    		return;
    	}
    	
    	if (!found) {
    		System.out.println("No available " + type + " found in " + country + ".");
    	}
    }
    
    //Print animals
    public static void printAnimals(String type) {
    	if (type.equalsIgnoreCase("dog")) {
    		for (Dog dog : dogList) {
    			System.out.println(dog.getName() + ", " + dog.getTrainingStatus() + ", " + dog.getAcquisitionCountry() + ", Reserved: " + dog.getReserved());
    		}
    	} else if (type.equalsIgnoreCase("monkey")) {
    		for (Monkey monkey : monkeyList) {
    			System.out.println(monkey.getName() + ", " + monkey.getTrainingStatus() + ", " + monkey.getAcquisitionCountry() + ", Reserved: " + monkey.getReserved());
    		}
    	} else if (type.equalsIgnoreCase("available")) {
    		for (Dog dog : dogList) {
    			if (!dog.getReserved() && dog.getTrainingStatus().equalsIgnoreCase("in service")) {
    				System.out.println(dog.getName() + ", " + dog.getAcquisitionCountry());
    			}
    		}
    		for (Monkey monkey : monkeyList) {
    			if (!monkey.getReserved() && monkey.getTrainingStatus().equalsIgnoreCase("in service")) {
    				System.out.println(monkey.getName() + ", Monkey, " + monkey.getAcquisitionCountry());
    			}
    		}
    	}
    }
}