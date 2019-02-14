package platform.dictionary;

import lombok.Getter;

@Getter
public enum LeadSourceDict {
    ONLINE_MARKETING("Online marketing", "MARKETING"),
    CONFERENCE("Conference", "CONFERENCE"),
    CONTACTS("Contacts", "CONTACTS");

    private String name;
    private String data;

    LeadSourceDict(String name, String data) {
        this.name = name;
        this.data = data;
    }
}
