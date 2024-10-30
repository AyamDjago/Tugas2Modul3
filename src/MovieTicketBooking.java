/**
 * Kelas ini mewakili sistem pemesanan tiket film sederhana.
 * Kelas ini menghitung total harga berdasarkan jumlah tiket yang dibeli dan mencetak struknya.
 */
public class MovieTicketBooking {

    /**
     * Metode utama yang menjalankan proses pemesanan tiket film.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam program ini)
     */
    public static void main(String[] args) {
        String movieTitle = "Avengers: Endgame";
        int numberOfTickets = 2;
        double pricePerTicket = 50.0;
        double totalPrice = calculateTotalPrice(numberOfTickets, pricePerTicket);

        printReceipt(movieTitle, numberOfTickets, totalPrice);
    }

    /**
     * Menghitung total harga tiket.
     *
     * @param numberOfTickets Jumlah tiket yang akan dibeli
     * @param pricePerTicket Harga per tiket
     * @return Total harga dari tiket
     */
    public static double calculateTotalPrice(int numberOfTickets, double pricePerTicket) {
        return numberOfTickets * pricePerTicket;
    }

    /**
     * Mencetak struk untuk pembelian tiket film.
     *
     * @param movieTitle Judul film
     * @param numberOfTickets Jumlah tiket yang dibeli
     * @param totalPrice Total harga tiket
     */
    public static void printReceipt(String movieTitle, int numberOfTickets, double totalPrice) {
        System.out.println("Judul Film: " + movieTitle);
        System.out.println("Jumlah Tiket: " + numberOfTickets);
        System.out.println("Total Harga: $" + totalPrice);
    }
}
