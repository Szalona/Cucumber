package platform.dictionary;
import lombok.*;

@Getter
public enum RegionDict {
    POLAND("Poland", "POL"),
    EUROPE("Europe", "ER"),
    NORTH_AMERICA("North America", "NAM"),
    MIDDLE_EAST("Middle East", "ME"),
    DACH("Dach", "DACH");

    private String name;
    private String data;

    RegionDict(String name, String data) {
        this.name = name;
        this.data = data;
    }
}
