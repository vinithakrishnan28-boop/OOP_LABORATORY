import java.util.Scanner; 
 
public class LibrarySeatReservation { 
 
    public static void main(String[] args) { 
 
        Scanner sc = new Scanner(System.in); 
 
        int totalSeats = 10; 
        boolean[] seats = new boolean[totalSeats]; 
 
        int choice; 
 
        do { 
            System.out.println("\n===== LIBRARY SEAT RESERVATION ====="); 
            System.out.println("1. View Seats"); 
            System.out.println("2. Reserve Seat"); 
            System.out.println("3. Cancel Reservation"); 
            System.out.println("4. Exit"); 
            System.out.print("Enter your choice: "); 
 
            choice = sc.nextInt(); 
 
            switch (choice) { 
 
                case 1: 
                    System.out.println("\nSeat Status:"); 
 
                    for (int i = 0; i < totalSeats; i++) { 
                        if (seats[i] == false) 
                            System.out.println("Seat " + (i + 1) + " - Available"); 
                        else 
                            System.out.println("Seat " + (i + 1) + " - Reserved"); 
                    } 
                    break; 
 
                case 2: 
                    System.out.print("Enter seat number to reserve: "); 
                    int reserve = sc.nextInt(); 
 
 
                    if (reserve < 1 || reserve > totalSeats) { 
                        System.out.println("Invalid seat number!"); 
                    } 
                    else if (seats[reserve - 1]) { 
                        System.out.println("Seat already reserved!"); 
                    } 
                    else { 
                        seats[reserve - 1] = true; 
                        System.out.println("Seat " + reserve + " reserved successfully!"); 
                    } 
                    break; 
 
                case 3: 
                    System.out.print("Enter seat number to cancel: "); 
                    int cancel = sc.nextInt(); 
 
                    if (cancel < 1 || cancel > totalSeats) { 
                        System.out.println("Invalid seat number!"); 
                    } 
                    else if (!seats[cancel - 1]) { 
                        System.out.println("Seat is not reserved!"); 
                    } 
                    else { 
                        seats[cancel - 1] = false; 
                        System.out.println("Reservation cancelled successfully!"); 
                    } 
                    break; 
 
                case 4: 
                    System.out.println("Thank you!"); 
                    break; 
 
                default: 
                    System.out.println("Invalid choice!"); 
            } 
 
        } while (choice != 4); 
 
        sc.close(); 
    } 
} 
 
 
