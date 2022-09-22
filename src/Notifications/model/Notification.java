package Notifications.model;


public class Notification {
    
    private int ID;
    private String username_technical, brand, model, color, serial, falla, status_notification, message;

    public Notification(int ID, String username_technical, String message, String brand, String model, String color, String serial, String falla, String status_notification) {
        this.ID = ID;
        this.username_technical = username_technical;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.serial = serial;
        this.falla = falla;
        this.status_notification = status_notification;
        this.message = message;
    }

    public int getID() {
        return ID;
    }

    public String getUsername_technical() {
        return username_technical;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getSerial() {
        return serial;
    }

    public String getFalla() {
        return falla;
    }

    public String getStatus_notification() {
        return status_notification;
    }

    public String getMessage() {
        return message;
    }
    
}
