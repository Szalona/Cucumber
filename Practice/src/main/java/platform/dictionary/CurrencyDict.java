package platform.dictionary;

import lombok.Getter;

@Getter
public enum CurrencyDict {
    PLN("Zloty", "PLN"),
    EUR("Euro", "EUR"),
    GBP("Funty", "GBP"),
    USD("Dolary", "USD");

    private String name;
    private String data;

    CurrencyDict(String name, String data) {
        this.name = name;
        this.data = data;
    }
}
