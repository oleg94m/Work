package ua.kiev.prog.oauth2.loginviagoogle.dto;

import java.util.Objects;

public class AccountDTO {
    private final String email;
    private final String name;
    private final String pictureUrl;

    private AccountDTO(String email, String name, String pictureUrl) {
        this.email = email;
        this.name = name;
        this.pictureUrl = pictureUrl;
    }

    public static AccountDTO of(String email, String name, String pictureUrl) {
        return new AccountDTO(email, name, pictureUrl);
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountDTO that = (AccountDTO) o;
        return Objects.equals(email, that.email) && Objects.equals(name, that.name) && Objects.equals(pictureUrl, that.pictureUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, name, pictureUrl);
    }
}
