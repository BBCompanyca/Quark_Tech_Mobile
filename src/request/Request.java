package request;

public class Request {
    
    private int warrantyID, equipoID, registeredID; 
    private String brand, model, color, serial, falla, received;

    public Request(int warrantyID, int equipoID, int registeredID, String brand, String model, String color, String serial, String falla, String received) {
        this.warrantyID = warrantyID;
        this.equipoID = equipoID;
        this.registeredID = registeredID;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.serial = serial;
        this.falla = falla;
        this.received = received;
    }

    public int getRequestID() {
        return warrantyID;
    }

    public int getBrandID() {
        return equipoID;
    }

    public int getRegisteredID() {
        return registeredID;
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

    public String getReceived() {
        return received;
    }
    
    
    
}
