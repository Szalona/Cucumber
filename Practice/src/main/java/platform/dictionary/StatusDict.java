package platform.dictionary;

import lombok.Getter;

@Getter
public enum StatusDict {
    NEW("New", "NEW"),
    ACTIVE("Active", "ACTIVE"),
    PROPOSAL_SENT("Proposal sent", "PROPOSAL"),
    SHORT_LISTED("Short Listed", "SHORT_LISTED"),
    NEGOTIATIONS("Negotiations", "NEGOTIATION"),
    PENDING_WON("Pending/Won", "PENDING/WON"),
    CONTRACT_SIGNED("Contract singed", "SIGNED"),
    DROPPED("Dropped", "DROPPED"),
    LOST("Lost", "LOST");

    private String name;
    private String data;

    StatusDict(String name, String data) {
        this.name = name;
        this.data = data;
    }
}
