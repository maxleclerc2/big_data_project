package fr.esiea.object;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {
    private String text;
    private String id;
    private PublicMetrics public_metrics;

    Data() {}

    Data(String text, String id, PublicMetrics public_metrics) {
        this.text = text;
        this.id = id;
        this.public_metrics = public_metrics;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPublic_metrics(PublicMetrics public_metrics) {
        this.public_metrics = public_metrics;
    }

    public String text() {
        return text;
    }

    public String id() {
        return id;
    }

    public PublicMetrics public_metrics() {
        return public_metrics;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Data that = (Data) obj;
        return Objects.equals(this.text, that.text) &&
                Objects.equals(this.id, that.id) &&
                Objects.equals(this.public_metrics, that.public_metrics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, id, public_metrics);
    }

    @Override
    public String toString() {
        return "Data[" +
                "text=" + text + ", " +
                "id=" + id + ", " +
                "public_metrics=" + public_metrics + ']';
    }

}
