package platform.dictionary;

import lombok.Getter;

@Getter
public enum OpportunityTypeDict {
    JAVA("Java", "Java Competence Center"),
    NET(".NET", ".NET Competence Center"),
    INTEGRACJA_ARCHITEKTURA("Integracja i Architektura", "Integracja i Architektura");

    private String name;
    private String data;

    OpportunityTypeDict(String name, String data) {
        this.name = name;
        this.data = data;
    }
}
