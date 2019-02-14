package platform.lead;

import org.openqa.selenium.By;
import platform.navigation.NavigationPage;
import setup.Base;
import setup.Wait;

import static platform.dictionary.StatusDict.*;
import static platform.dictionary.LeadSourceDict.*;
import static platform.dictionary.OpportunityTypeDict.*;
import static platform.dictionary.CurrencyDict.*;
import static platform.dictionary.FrequencyDict.*;

public class NewLeadPage extends Base {
    private By leadNameInput = By.name("leadName");
    private By statusDrp = By.name("leadStatus");
    private By leadSourceDrp = By.name("source");
    private By expectedSignDateDrp = By.xpath("//button[@ng-click=\"ctrl.openCalendarPane($event)\"]");
    private By signDateDay = By.xpath("//table[@class='md-calendar']/tbody[4]/tr[4]/td[2]");
    private By timeMaterialBox = By.xpath("//md-checkbox[@ng-model=\"vm.lead.leadServicesTypes['TIME_MATERIAL']\"]");
    private By hardwareBox = By.xpath("//md-checkbox[@ng-model=\"vm.lead.leadAssetsTypes['HARDWARE']\"]");
    private By deliveryManagerDrp = By.name("deliveryManager");
    private By opportunityTypeDrp = By.name("opportunityType");
    private By responsibleOfferDrp = By.name("responsibleForOffer");
    private By expectedProjectStartDrp = By.xpath("//input[@aria-label='Expected project start']");
    private By currencyDrp = By.name("ccy");
    private By periodBox = By.xpath("//md-checkbox[@ng-model='payment.paymentPeriodic.hasPeriodicPayment']");
    private By scheduleBox = By.xpath("");
    private By frequencyDrp = By.name("periodicPeriodDuration");
    private By firstInvoiceDrp = By.xpath("//input[@aria-label='First invoice *']");
    private By periodicPaymentInput = By.name("periodicPaymentValue");
    private By lastInvoiceDrp = By.xpath("//input[@aria-label='Last invoice *']");
    private By periodicDaysOfPaymentInput = By.name("periodicPaymentDelayInDays");

    NewLeadModel newLeadModel = new NewLeadModel();
    NavigationPage navigationPage = new NavigationPage();

    public void setLeadName(String leadNameData) {
        visible(leadNameInput);
        waitSendkeys(Wait.VISIBLE, leadNameInput, newLeadModel.getLeadName(), leadNameData);
    }

    public void setStatus() {
        expandDropDownAndClickOption(Wait.VISIBLE, statusDrp, NEW.getData());
    }

    public void setLeadSource() {
        expandDropDownAndClickOption(Wait.VISIBLE, leadSourceDrp, CONFERENCE.getData());
    }

    public void setExpectedSignDate(String expectedSignDateData) {
        waitClick(Wait.VISIBLE, expectedSignDateDrp, newLeadModel.getExpectedSignDate());
        waitClick(Wait.VISIBLE, signDateDay, expectedSignDateData);
    }

    public void completeBasicForm(String leadNameData, String expectedSignDateData) {
        setLeadName(leadNameData);
        setStatus();
        setLeadSource();
        setExpectedSignDate(expectedSignDateData);
        navigationPage.clickOnNext();
    }

    public void setServiceAndAssets() {
        waitClick(Wait.VISIBLE, timeMaterialBox, newLeadModel.getTimeMaterial());
        waitClick(Wait.VISIBLE, hardwareBox, newLeadModel.getHardware());
    }

    public void setDM(String deliveryManagerData) {
        navigationPage.addMore();
        waitSendkeys(Wait.VISIBLE, deliveryManagerDrp, newLeadModel.getDeliveryManager(), deliveryManagerData);
    }

    public void setOpportunity() {
        expandDropDownAndClickOption(Wait.VISIBLE, opportunityTypeDrp, NET.getData());
    }

    public void completeOpportunityForm(String deliveryManagerData) {
        setServiceAndAssets();
        setDM(deliveryManagerData);
        setOpportunity();
        navigationPage.clickOnNext();
    }

    public void setExpectedProjectStart(String expectedProjectStartData) {
        waitSendkeys(Wait.VISIBLE, expectedProjectStartDrp, newLeadModel.getExpectedProjectStart(), expectedProjectStartData);
    }

    public void setCurrency() {
        expandDropDownAndClickOption(Wait.VISIBLE, currencyDrp, PLN.getData());
    }

    public void setPeriodicPayment(String firstInvoiceData, String periodicPaymentsData, String lastInvoiceData) {
        waitClick(Wait.VISIBLE, periodBox, newLeadModel.getPeriodicPayment());
        expandDropDownAndClickOption(Wait.VISIBLE, frequencyDrp, MONTHLY.getData());
        visible(firstInvoiceDrp);
        waitSendkeys(Wait.VISIBLE, firstInvoiceDrp, newLeadModel.getFirstInvoice(), firstInvoiceData);
        waitSendkeys(Wait.VISIBLE, periodicPaymentInput, newLeadModel.getPeriodicPayment(), periodicPaymentsData);
        waitSendkeys(Wait.VISIBLE, lastInvoiceDrp, newLeadModel.getLastInvoice(), lastInvoiceData);
    }

    public void completeFinanceForm(String expectedProjectStartData, String firstInvoiceData, String periodicPaymentsData, String lastInvoiceData) {
        setExpectedProjectStart(expectedProjectStartData);
        setCurrency();
        setPeriodicPayment(firstInvoiceData, periodicPaymentsData, lastInvoiceData);
        navigationPage.clickOnSave();
    }
}