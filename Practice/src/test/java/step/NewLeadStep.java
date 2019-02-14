package step;

import cucumber.api.java.en.And;
import platform.lead.NewLeadPage;

public class NewLeadStep {

    NewLeadPage newLeadPage = new NewLeadPage();

    @And("^complete basic \"([^\"]*)\", \"([^\"]*)\"$")
    public void completeBasicInformation(String leadName, String expectedSignDate) {
        newLeadPage.completeBasicForm(leadName, expectedSignDate);
    }

    @And("^complete opportunity \"([^\"]*)\"$")
    public void completeOpportunityInformation(String deliveryManager) {
        newLeadPage.completeOpportunityForm(deliveryManager);
    }

    @And("^complete finance \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void completeFinanceInformation(String expectedProjectStartData, String firstInvoiceData, String periodicPaymentsData, String lastInvoiceData) {
        newLeadPage.completeFinanceForm(expectedProjectStartData, firstInvoiceData, periodicPaymentsData, lastInvoiceData);
    }
}
