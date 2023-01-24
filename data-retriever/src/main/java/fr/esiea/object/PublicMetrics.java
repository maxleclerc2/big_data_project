package fr.esiea.object;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PublicMetrics {
    private int like_count;

    PublicMetrics() {}

    PublicMetrics(int like_count) {
        this.like_count = like_count;
    }

    public void setLike_count(int like_count) {
        this.like_count = like_count;
    }

    public int like_count() {
        return like_count;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        PublicMetrics that = (PublicMetrics) obj;
        return this.like_count == that.like_count;
    }

    @Override
    public int hashCode() {
        return Objects.hash(like_count);
    }

    @Override
    public String toString() {
        return "PublicMetrics[" +
                "like_count=" + like_count + ']';
    }

}
