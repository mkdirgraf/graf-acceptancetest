package ExploringObjectMapper;

import java.util.LinkedHashMap;
import java.util.Map;

public class Car {

    private String model;
    private int year;
    private String color;
    Map<String, Object> detailInfo = new LinkedHashMap<>();

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Map<String, Object> getDetailInfo() {
        return detailInfo;
    }

    public void setDetailInfo(Map<String, Object> detailInfo) {
        this.detailInfo = detailInfo;
    }
}
