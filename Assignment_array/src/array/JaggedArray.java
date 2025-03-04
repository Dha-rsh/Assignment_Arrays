package array;
import java.util.ArrayList;
import java.util.Scanner;
public class JaggedArray {
	
	    static ArrayList<ArrayList<Integer>> weights = new ArrayList<>();
	    static Scanner scanner = new Scanner(System.in);

	
	    public static void initialize(int N) {
	        for (int i = 0; i < N; i++) {
	            weights.add(new ArrayList<>());  
	        }
	    }

	    // (a) Function to enter weight for any person
	    public static void enterWeight(int personIndex, int weight) {
	        if (personIndex >= 0 && personIndex < weights.size()) {
	            weights.get(personIndex).add(weight);
	            System.out.println("Weight added successfully!");
	        } else {
	            System.out.println("Invalid person index.");
	        }
	    }

	    // (b) Function to calculate the minimum weight of nth person
	    public static int getMinWeight(int personIndex) {
	        if (personIndex >= 0 && personIndex < weights.size() && !weights.get(personIndex).isEmpty()) {
	            return weights.get(personIndex).stream().min(Integer::compare).orElse(-1);
	        } else {
	            System.out.println("Invalid person index or no weights recorded.");
	            return -1;
	        }
	    }

	   
	    public static void main(String[] args) {
	        System.out.print("Enter number of persons (N): ");
	        int N = scanner.nextInt();
	        initialize(N);

	        while (true) {
	            System.out.println("\nMenu:");
	            System.out.println("1. Enter weight");
	            System.out.println("2. Get minimum weight of a person");
	            System.out.println("3. Exit");
	            System.out.print("Choose an option: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter person index (0 to " + (N - 1) + "): ");
	                    int person = scanner.nextInt();
	                    System.out.print("Enter weight: ");
	                    int weight = scanner.nextInt();
	                    enterWeight(person, weight);
	                    break;
	                case 2:
	                    System.out.print("Enter person index to get minimum weight: ");
	                    int pIndex = scanner.nextInt();
	                    int minWeight = getMinWeight(pIndex);
	                    if (minWeight != -1)
	                        System.out.println("Minimum weight of person " + pIndex + ": " + minWeight);
	                    break;
	                case 3:
	                    System.out.println("Exiting...");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid choice! Try again.");
	            }
	        }
	    }
	}


