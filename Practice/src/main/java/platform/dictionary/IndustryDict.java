package platform.dictionary;

import lombok.*;

@Getter
public enum IndustryDict {
    FINANCIAL_SERVICES("Financial Services", "FSE"),
    WEALTH_MANAGEMENT("Wealth Management", "WEM"),
    TELCO_MEDIA_UWILITIES("Telco, Media, Utilities", "TEL"),
    PHARMA("Pharma", "PHA"),
    MANUFACTURING("Manufacturing", "MAN"),
    IT_SERVICES("IT Services", "SRV"),
    SAP("SAP", "SAP");

    private String name;
    private String data;

    IndustryDict(String name, String data) {
        this.name = name;
        this.data = data;
    }
}
