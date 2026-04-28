package main.sbdesignquiz.models;

public class Order {
    private String roomType;
    private String[] zones;
    private int area;
    private String style;
    private String budget;
    private String name;
    private String phone;
    private String email;
    private String comment;
    private String dispatchDate;

    // room_type
    public void setRoomType(String room_type) {
        this.roomType = room_type;
    }
    public String getRoom_type() {
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
    public String getDispatch_date() {
        return dispatchDate;
    }
}
