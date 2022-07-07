package classwork.lesson20;

import java.util.spi.LocaleNameProvider;

public enum Language {

    HY("Armenia"),
    ENG("England"),
    RU("Russia"),
    CH;

    private String country;

    Language(String country) {
        this.country = country;
    }

    Language(){}

    public String getCountry() {
        return country;
    }


}
