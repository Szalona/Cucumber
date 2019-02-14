package page;

import org.openqa.selenium.By;

public class NavigatePage {
    private By platformLogo = By.xpath("//div[@class='logo']");
    private By ontalentLogo = By.xpath("//*[@id=\"vertical-navigation\"]/md-toolbar");
    private By saleBtn = By.xpath("//span[text()='Sales']");
    private By recentlyClientsBtn = By.xpath("//span[text()='Recently visited clients']");
    private By nextBtn = By.xpath("//span[text()='Next']");
    private By backBtn = By.xpath("//span[text()='Back']");
    private By saveBtn = By.xpath("//span[text()='Save']");
    private By clientNameBtn = By.xpath("//tbody[@class='md-body']/tr[4]/td[6]");
    private By addMoreBtn = By.xpath("//button[@ng-click=\"addNewManagerRow()\"]");

    public By getPlatformLogo() {
        return this.platformLogo;
    }
    public By getOntalentLogo() {
        return this.ontalentLogo;
    }
    public By getSaleBtn() {
        return this.saleBtn;
    }
    public By getRecentlyClientsBtn() {
        return this.recentlyClientsBtn;
    }
    public By getNextBtn() {
        return this.nextBtn;
    }
    public By getBackBtn() {
        return this.backBtn;
    }
    public By getSaveBtn(){
        return this.saveBtn;
    }
    public By getClientNameBtn(){
        return this.clientNameBtn;
    }
    public By getAddMoreBtn() {
        return this.addMoreBtn;
    }
}
