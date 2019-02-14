package model;

public class NewClientModel {
    private String fullName;
    private String shortName;
    private String taxID;
    private String accountManager;
    private String generalRemarks;

    public NewClientModel() {}

    public NewClientModel(String fullName, String shortName, String taxId, String accountManager, String generalRemarks) {
        this.fullName = fullName;
        this.shortName = shortName;
        this.taxID = taxId;
        this.accountManager = accountManager;
        this.generalRemarks = generalRemarks;
    }

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getShortName() {
        return shortName;
    }
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getTaxID() {
        return this.taxID;
    }
    public void setTaxID(String taxID) {
        this.taxID = taxID;
    }

    public String getAccountManager() {
        return this.accountManager;
    }
    public void setAccountManager(String accountManager) {
        this.accountManager = accountManager;
    }

    public String getGeneralRemarks() {
        return this.generalRemarks;
    }
    public void setGeneralRemarks(String generalRemarks) {
        this.generalRemarks = generalRemarks;
    }
}
