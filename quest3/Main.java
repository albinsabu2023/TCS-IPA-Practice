import java.uitl.*;

class Hotel {
    private int hotelId;
    private String hotelName;
    private String dateBooked;
    private int numOfRooms;
    private String wifi;
    private double bill;

    public Hotel(int hotelId, String hotelName, String dateBooked, int numOfRooms, String wifi, double bill) {
        // super();
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.dateBooked = dateBooked;
        this.numOfRooms = numOfRooms;
        this.wifi = wifi;
        this.bill = bill;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getDateBooked() {
        return dateBooked;
    }

    public void setDateBooked(String dateBooked) {
        this.dateBooked = dateBooked;
    }

    public int getNumOfRooms() {
        return numOfRooms;
    }

    public void setNumOfRooms(int numOfRooms) {
        this.numOfRooms = numOfRooms;
    }

    public String getWifi() {
        return wifi;
    }

    public void setWifi(String wifi) {
        this.wifi = wifi;
    }

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

}

public class Main {
    public static void main(String[] args) {
        Hotel h1 = new Hotel(101, "BestStay", "01-jan-2022", 10, "yes", 20000);
        Hotel h2 = new Hotel(102, "Applestay", "12-feb-2022", 3, "yes", 4000);
        Hotel h3 = new Hotel(103, "Accord", "11-may-2022", 5, "yes", 15000);
        Hotel h4 = new Hotel(104, "Royalpark", "22-dec-2021", 7, "yes", 12000);

        List<Hotel> hotels = new ArrayList<>(Arrays.asList(h1, h2, h3, h4));

        int ans1 = findNumOfRooms(hotels, "may");
        System.out.println(ans1);
        Hotel h = searchByWifi(hotels, "yes");
        System.out.println(h.getHotelId());
    }

    public static int findNumOfRooms(List<Hotel> hotels, String month) {
        int ans = 0;
        for (Hotel h : hotels) {
            if (h.getDateBooked().contains(month)) {
                ans = h.getNumOfRooms();
            }
        }
        return ans;
    }

    public static Hotel searchByWifi(List<Hotel> hotels, String wifi) {

        List<Hotel> wifiusers = new ArrayList<>();
        for (Hotel h : hotels) {
            if (h.getWifi().equalsIgnoreCase(wifi)) {
                wifiusers.add(h);
            }
        }
        double highest = wifiusers.get(0).getBill();
        double secondHighest = 0;
        Hotel highestHot = null;
        Hotel secondHighestHot = null;

        for (Hotel h : wifiusers) {
            if (h.getBill() > highest) {
                highest = h.getBill();
                highestHot = h;
                secondHighest = h.getBill();
                secondHighestHot = h;
            } else if (h.getBill() > secondHighest && h.getBill() < highest) {
                secondHighest = h.getBill();
                secondHighestHot = h;
            }
        }
        return secondHighestHot;
    }
}
