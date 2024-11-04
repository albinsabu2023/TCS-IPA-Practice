import java.util.*;

class Hotel {
    private int hotelId;
    private String hotelName;
    private String dob;
    private int nor;
    private String wifi;
    private double bill;

    public Hotel(int a, String b, String c, int d, String e, double f) {
        hotelId = a;
        hotelName = b;
        dob = c;
        nor = d;
        wifi = e;
        bill = f;
    }

    public void setHotelId(int hId) {
        this.hotelId = hId;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelName(String name) {
        this.hotelName = name;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDob() {
        return dob;
    }

    public void setNor(int n) {
        this.nor = n;
    }

    public int getNor() {
        return nor;
    }

    public void setWifi(String wifi) {
        this.wifi = wifi;
    }

    public String getWifi() {
        return wifi;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public double getBill() {
        return bill;
    }
}

public class MyClass {
    public static void main(String[] args) {
        List<Hotel> hotels = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for hotel " + (i + 1) + ":");
            System.out.print("Hotel ID: ");
            int hotelId = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Hotel Name: ");
            String hotelName = sc.nextLine();
            System.out.print("DOB (Date of Booking): ");
            String dob = sc.nextLine();
            System.out.print("Number of Rooms (NOR): ");
            int nor = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("WiFi (yes/no): ");
            String wifi = sc.nextLine();
            System.out.print("Bill Amount: ");
            double bill = sc.nextDouble();
            sc.nextLine(); // consume newline

            hotels.add(new Hotel(hotelId, hotelName, dob, nor, wifi, bill));
        }

        System.out.print("Enter DOB to find NOR: ");
        String input1 = sc.nextLine();
        int norResult = fun1(hotels, input1);
        System.out.println("Number of Rooms: " + norResult);

        System.out.print("Enter WiFi preference to find hotel: ");
        String input2 = sc.nextLine();
        Hotel hotelResult = fun2(hotels, input2);

        if (hotelResult != null) {
            System.out.println("Second highest bill for WiFi users:");
            System.out.println("Hotel ID: " + hotelResult.getHotelId());
            System.out.println("Hotel Name: " + hotelResult.getHotelName());
            System.out.println("Bill Amount: " + hotelResult.getBill());
        } else {
            System.out.println("No hotel found with the specified WiFi preference.");
        }

        sc.close();
    }

    // Method 1
    public static int fun1(List<Hotel> hotels, String input1) {
        int ans = 0;
        for (Hotel h : hotels) {
            if (h.getDob().contains(input1)) {
                ans = h.getNor();
            }
        }
        return ans;
    }

    // Method 2
    public static Hotel fun2(List<Hotel> hotels, String input2) {
        List<Hotel> wifiUsers = new ArrayList<>();
        for (Hotel h : hotels) {
            if (h.getWifi().equalsIgnoreCase(input2)) {
                wifiUsers.add(h);
            }
        }

        if (wifiUsers.size() < 2) {
            return null;
        }

        Hotel[] sortedList = wifiUsers.toArray(new Hotel[0]);
        Arrays.sort(sortedList, (h1, h2) -> Double.compare(h2.getBill(), h1.getBill()));

        return sortedList[1]; // Second highest bill
    }
}
