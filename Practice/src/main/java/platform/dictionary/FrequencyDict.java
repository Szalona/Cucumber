package platform.dictionary;

import lombok.Getter;

@Getter
public enum FrequencyDict {
    MONTHLY("Monthly", "MONTHLY"),
    BIMONTHLY("Bimonthly", "BIMONTHLY"),
    QUARTERLY("Quarterly", "QUARTERLY"),
    ANNUAL("Annual", "ANNUAL");

    private String name;
    private String data;

    FrequencyDict(String name, String data) {
        this.name = name;
        this.data = data;
    }
}
