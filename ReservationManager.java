/**
 * ReservationManager.java
 * This class includes the cancelReservation(int) method.
 */

import java.util.HashMap;

public class ReservationManager {
    private HashMap<Integer, String> reservations = new HashMap<>();

    public ReservationManager() {
        // Sample data
        reservations.put(1, "John Doe");
        reservations.put(2, "Jane Smith");
    }

    /**
     * Cancels a reservation based on the reservation ID.
     * Defensive programming is applied by checking input and state.
     */
    public boolean cancelReservation(int reservationId) {
        // Defensive check: ensure reservation ID is valid
        if (reservationId <= 0) {
            System.out.println("Invalid reservation ID: must be positive.");
            return false;
        }

        // Check if reservation exists in the system
        if (!reservations.containsKey(reservationId)) {
            System.out.println("Reservation not found for ID: " + reservationId);
            return false;
        }

        // Proceed to cancel the reservation
        reservations.remove(reservationId);
        System.out.println("Reservation with ID " + reservationId + " has been successfully cancelled.");
        return true;
    }

    public static void main(String[] args) {
        ReservationManager manager = new ReservationManager();
        manager.cancelReservation(1);  // Example usage
        manager.cancelReservation(-5); // Invalid case
        manager.cancelReservation(99); // Non-existent case
    }
}
