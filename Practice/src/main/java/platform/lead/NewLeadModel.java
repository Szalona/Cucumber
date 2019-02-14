package platform.lead;

public class NewLeadModel {
    private String leadName = "Lead Name";
    private String expectedSignDate = "Expected sign date";
    private String timeMaterial = "Time and material";
    private String hardware = "Hardware";
    private String deliveryManager = "Delivery manager";
    private String opportunityType;
    private String expectedProjectStart = "Expected project start";
    private String firstInvoice;
    private String periodicPayment;
    private String lastInvoice;
    private String periodicDaysOfPayment;
    private String dateOfInvoice;
    private String schedulePayment;
    private String scheduleDaysOfPayment;
    private String projectStart;

    public String getLeadName() {
        return leadName;
    }

    public String getExpectedSignDate() {
        return expectedSignDate;
    }

    public String getTimeMaterial() {
        return timeMaterial;
    }

    public String getHardware() {
        return hardware;
    }

    public String getDeliveryManager() {
        return deliveryManager;
    }

    public String getExpectedProjectStart() {
        return expectedProjectStart;
    }

    public String getFirstInvoice() {
        return firstInvoice;
    }

    public String getPeriodicPayment() {
        return periodicPayment;
    }

    public String getLastInvoice() {
        return lastInvoice;
    }

}