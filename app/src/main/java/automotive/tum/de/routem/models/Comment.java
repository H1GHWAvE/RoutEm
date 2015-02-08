package automotive.tum.de.routem.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Ch0PPeR on 20.01.2015.
 */
public class Comment {
    @SerializedName("class")
    String clazz;
    int id;
    Coordinate coordinate;
    String pic;
    String text;

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
