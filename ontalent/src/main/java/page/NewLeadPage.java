package page;

import org.openqa.selenium.By;

public class NewLeadPage {
    private By newLeadBtn = By.xpath("//button[@ng-click=\"toolbar.newLead()\"]");
    private By leadNameInput = By.name("leadName");
    private By statusDrp = By.name("leadStatus");
    private By statusScroll = By.xpath("//div[@class=\"md-select-menu-container md-default-theme md-active md-clickable\"]");
    private By leadSourceDrp = By.name("source");
    private By leadSourceScroll = By.xpath("//div[@class=\"md-select-menu-container md-default-theme md-active md-clickable\"]");
    private By expectedSignDateDrp = By.xpath("//button[@ng-click=\"ctrl.openCalendarPane($event)\"]");
    private By signDateDay = By.xpath("//table[@class='md-calendar']/tbody[4]/tr[4]/td[2]");
    private By broughtByInput = By.xpath("");
    private By generalRemarksInput = By.name("");
    private By fixedPriceBox = By.xpath("");
    private By timeMaterialBox = By.xpath("//md-checkbox[@ng-model=\"vm.lead.leadServicesTypes['TIME_MATERIAL']\"]");
    private By hardwareBox = By.xpath("//md-checkbox[@ng-model=\"vm.lead.leadAssetsTypes['HARDWARE']\"]");
    private By licenceBox = By.xpath("");
    private By deliveryManagerDrp = By.name("deliveryManager");
    private By deliveryManagerScroll = By.xpath("//div[@class=\"md-select-menu-container md-default-theme md-active md-clickable\"]");
    private By percentageInput = By.xpath("//input[@ng-model=\"manager.percentage\"]");
    private By opportunityTypeDrp = By.name("opportunityType");
    private By responsibleOfferDrp = By.name("responsibleForOffer");
    private By expectedProjectStartDrp = By.xpath("//input[@aria-label='Expected project start']");
    private By projectCodeDrp = By.xpath("");
    private By currencyDrp = By.name("ccy");
    private By periodBox = By.xpath("//md-checkbox[@ng-model='payment.paymentPeriodic.hasPeriodicPayment']");
    private By scheduleBox = By.xpath("");
    private By frequencyDrp = By.name("periodicPeriodDuration");
    private By firstInvoiceDrp = By.xpath("//input[@aria-label='First invoice *']");
    private By periodicPaymentInput = By.name("periodicPaymentValue");
    private By lastInvoiceDrp = By.xpath("//input[@aria-label='Last invoice *']");
    private By periodicDaysOfPaymentInput = By.name("periodicPaymentDelayInDays");
    private By dateOfInvoiceInput = By.xpath("");
    private By schedulePaymentInput = By.xpath("");
    private By scheduleDaysOfPaymentInput = By.xpath("");
    private By projectDurationBox = By.xpath("//input[@name='monthDuration']");

    public By getNewLeadBtn() {
        return this.newLeadBtn;
    }
    public By getLeadNameInput() {
        return this.leadNameInput;
    }
    public By getStatusDrp() {
        return this.statusDrp;
    }
    public By getStatusScroll() {
        return this.statusScroll;
    }
    public By getLeadSourceDrp() {
        return this.leadSourceDrp;
    }
    public By getLeadSourceScroll() {
        return this.leadSourceScroll;
    }
    public By getExpectedSignDateDrp() {
        return this.expectedSignDateDrp;
    }
    public By getSignDateDay() {
        return this.signDateDay;
    }
    public By getBroughtByInput() {
        return this.broughtByInput;
    }
    public By getGeneralRemarksInput() {
        return this.generalRemarksInput;
    }
    public By getFixedPriceBox() {
        return this.fixedPriceBox;
    }
    public By getTimeMaterialBox() {
        return this.timeMaterialBox;
    }
    public By getHardwareBox() {
        return this.hardwareBox;
    }
    public By getLicenceBox() {
        return this.licenceBox;
    }
    public By getDeliveryManagerDrp() {
        return this.deliveryManagerDrp;
    }
    public By getDeliveryManagerScroll() {
        return this.deliveryManagerScroll;
    }
    public By getPercentageInput() {
        return this.percentageInput;
    }
    public By getOpportunityTypeDrp() {
        return this.opportunityTypeDrp;
    }
    public By getResponsibleOfferDrp() {
        return this.responsibleOfferDrp;
    }
    public By getExpectedProjectStartDrp() {
        return this.expectedProjectStartDrp;
    }
    public By getProjectCodeDrp() {
        return this.projectCodeDrp;
    }
    public By getCurrencyDrp() {
        return this.currencyDrp;
    }
    public By getPeriodBox() {
        return this.periodBox;
    }
    public By getScheduleBox() {
        return this.scheduleBox;
    }
    public By getFrequencyDrp() {
        return this.frequencyDrp;
    }
    public By getFirstInvoiceDrp() {
        return this.firstInvoiceDrp;
    }
    public By getPeriodicPaymentInput() {
        return this.periodicPaymentInput;
    }
    public By getLastInvoiceDrp() {
        return this.lastInvoiceDrp;
    }
    public By getPeriodicDaysOfPaymentInput() {
        return this.periodicDaysOfPaymentInput;
    }
    public By getDateOfInvoiceInput() {
        return this.dateOfInvoiceInput;
    }
    public By getSchedulePaymentInput() {
        return this.schedulePaymentInput;
    }
    public By getScheduleDaysOfPaymentInput() {
        return this.scheduleDaysOfPaymentInput;
    }
    public By getProjectDurationBox() {
        return this.projectDurationBox;
    }
}
