/**
 * ReportGenerator.java
 * Example of code smell (long method) and refactored version.
 */

public class ReportGenerator {
    public void generateReport() {
        System.out.println("Generating report...");
        connectToDatabase();
        fetchData();
        formatAndExportData();
        notifyUser();
    }

    private void connectToDatabase() {
        System.out.println("Connecting to database...");
    }

    private void fetchData() {
        System.out.println("Fetching data...");
    }

    private void formatAndExportData() {
        formatData();
        exportToPDF();
    }

    private void formatData() {
        System.out.println("Formatting data...");
    }

    private void exportToPDF() {
        System.out.println("Exporting data to PDF...");
    }

    private void notifyUser() {
        sendEmail();
    }

    private void sendEmail() {
        System.out.println("Sending report via email...");
    }
}
