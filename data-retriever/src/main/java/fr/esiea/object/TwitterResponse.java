package fr.esiea.object;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TwitterResponse {
    private List<Data> data;
    private Meta meta;

    TwitterResponse() {}

    TwitterResponse(List<Data> data, Meta meta) {
        this.data = data;
        this.meta = meta;
    }

    public List<Data> data() {
        return data;
    }

    public Meta meta() {
        return meta;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        TwitterResponse that = (TwitterResponse) obj;
        return Objects.equals(this.data, that.data) &&
                Objects.equals(this.meta, that.meta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, meta);
    }

    @Override
    public String toString() {
        return "TwitterResponse[" +
                "data=" + data + ", " +
                "meta=" + meta + ']';
    }

}
