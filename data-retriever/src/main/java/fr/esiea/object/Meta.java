package fr.esiea.object;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Meta {
    private String next_token;

    Meta() {}

    Meta(String next_token) {
        this.next_token = next_token;
    }

    public String next_token() {
        return next_token;
    }

    public void setNext_token(String next_token) {
        this.next_token = next_token;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Meta that = (Meta) obj;
        return Objects.equals(this.next_token, that.next_token);
    }

    @Override
    public int hashCode() {
        return Objects.hash(next_token);
    }

    @Override
    public String toString() {
        return "Meta[" +
                "next_token=" + next_token + ']';
    }

}
