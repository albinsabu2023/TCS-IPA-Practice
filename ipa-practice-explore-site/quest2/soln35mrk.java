package ipa-practice-explore-site.quest2;

import java.util.*;

class Laptop {
    private int laptopId;
    private String brand;
    private String osType;
    private double price;
    private int rating;

    public Laptop(int laptopId, String brand, String osType, double price, int rating) {
        this.laptopId = laptopId;
        this.brand = brand;
        this.osType = osType;
        this.price = price;
        this.rating = rating;
    }

    public void setLaptopId(int laptopId) {
        this.laptopId = laptopId;
    }

    public int getLaptopId() {
        return laptopId;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public String getOsType() {
        return osType;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }
}

public class MyClass {
    public static void main(String[] args) {
        List<Laptop> laps = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details for 5 laptops:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Laptop ID: ");
            int laptopId = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Enter Brand: ");
            String brand = sc.nextLine();
            System.out.print("Enter OS Type: ");
            String osType = sc.nextLine();
            System.out.print("Enter Price: ");
            double price = sc.nextDouble();
            System.out.print("Enter Rating (1-5): ");
            int rating = sc.nextInt();
            sc.nextLine(); // consume newline

            laps.add(new Laptop(laptopId, brand, osType, price, rating));
        }

        System.out.print("Enter brand to search laptops with rating > 3: ");
        String searchBrand = sc.nextLine();
        int count = countHighRatingByBrand(laps, searchBrand);
        System.out.println("Number of laptops with brand \"" + searchBrand + "\" and rating > 3: " + count);

        System.out.print("Enter OS type to search laptops: ");
        String searchOs = sc.nextLine();
        Laptop[] filteredLaptops = searchByOs(laps, searchOs);

        if (filteredLaptops.length > 0) {
            System.out.println("Laptops with OS type \"" + searchOs + "\", sorted by ID (descending):");
            for (Laptop l : filteredLaptops) {
                System.out.println("Laptop ID: " + l.getLaptopId() + ", Brand: " + l.getBrand() + ", Price: "
                        + l.getPrice() + ", Rating: " + l.getRating());
            }
        } else {
            System.out.println("No laptops found with OS type \"" + searchOs + "\".");
        }

        sc.close();
    }

    // Method 1: Count laptops by brand with rating > 3
    public static int countHighRatingByBrand(List<Laptop> laps, String searchBrand) {
        int count = 0;
        for (Laptop l : laps) {
            if (l.getBrand().equalsIgnoreCase(searchBrand) && l.getRating() > 3) {
                count++;
            }
        }
        return count;
    }

    // Method 2: Search laptops by OS and sort by ID (descending)
    public static Laptop[] searchByOs(List<Laptop> laps, String searchOs) {
        List<Laptop> newList = new ArrayList<>();
        for (Laptop l : laps) {
            if (l.getOsType().equalsIgnoreCase(searchOs)) {
                newList.add(l);
            }
        }

        Laptop[] newArr = newList.toArray(new Laptop[0]);
        Arrays.sort(newArr, (l1, l2) -> Integer.compare(l2.getLaptopId(), l1.getLaptopId())); // Sort by ID in
                                                                                              // descending order
        return newArr;
    }
}
