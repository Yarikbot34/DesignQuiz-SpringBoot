package main.sbdesignquiz.models;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Order {
    @JsonProperty("room_type")
    private String roomType;

    @JsonProperty("dispatch_date")
    private String dispatchDate;

    private String[] zones;
    private int area;
    private String style;
    private String budget;
    private String name;
    private String phone;
    private String email;
    private String comment;

    // room_type
    public void setRoomType(String room_type) {
        this.roomType = room_type;
    }
    @JsonProperty("room_type")
    public String getRoomType() {
        return roomType;
    }

    // zones
    public void setZones(String[] zones) {
        this.zones = zones;
    }
    public String[] getZones() {
        return zones.clone();
    }

    // area
    public void setArea(int area) {
        this.area = area;
    }
    public int getArea() {
        return area;
    }

    // style
    public void setStyle(String style) {
        this.style = style;
    }
    public String getStyle() {
        return style;
    }

    // budget
    public void setBudget(String budget) {
        this.budget = budget;
    }
    public String getBudget() {
        return budget;
    }

    // name
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    // phone
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPhone() {
        return phone;
    }

    // email
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    // comment
    public void setComment(String comment) {
        this.comment = comment;
    }
    public String getComment() {
        return comment;
    }

    // dispatch_date
    public void setDispatch_date(String dispatchDate) {
        this.dispatchDate = dispatchDate;
    }
    @JsonProperty("dispatch_date")
    public String getDispatch_date() {
        return dispatchDate;
    }
}
