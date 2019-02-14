package page;

import org.openqa.selenium.By;

public class NewClientPage {
    private By newClientBtn = By.xpath("//*[@id=\"new-client\"]/md-icon");
    private By fullNameInput = By.name("name");
    private By shortNameInput = By.name("shortName");
    private By regionDrp = By.name("region");
    private By taxIDInput = By.name("taxId");
    private By industryDrp = By.name("industry");
    private By industryScroll = By.xpath("//md-select-menu[@class=\"_md md-default-theme md-overflow\"]");
    private By partnerDrp = By.name("partner");
    private By ndaTypeDrp = By.name("ndaType");
    private By accountManagerInput = By.cssSelector("[ng-model='vm.model.accountManager'] input");
    private By chipInput = By.cssSelector("span[class='highlight']");
    private By generalRemarksInput = By.name("description");
    private By newClientWindow = By.xpath("//md-dialog[@class=\"oo-dialog _md flex-gt-sm-90 flex-100 md-default-theme md-transition-in\"]");

    public By getNewClientBtn() {
        return this.newClientBtn;
    }
    public By getFullNameInput() {
        return this.fullNameInput;
    }
    public By getShortNameInput() {
        return this.shortNameInput;
    }
    public By getRegionDrp() {
        return this.regionDrp;
    }
    public By getTaxIDInput() {
        return this.taxIDInput;
    }
    public By getIndustryDrp() {
        return this.industryDrp;
    }
    public By getIndustryScroll() {
        return this.industryScroll;
    }
    public By getPartnerDrp() {
        return this.partnerDrp;
    }
    public By getNdaTypeDrp() {
        return this.ndaTypeDrp;
    }
    public By getAccountManagerInput() {
        return this.accountManagerInput;
    }
    public By getChipInput() {
        return this.chipInput;
    }
    public By getGeneralRemarksInput() {
        return this.generalRemarksInput;
    }
}
