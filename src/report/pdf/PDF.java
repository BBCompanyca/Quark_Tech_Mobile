package report.pdf;

public class PDF {
    
    private String brand, model, color, serial, received, falla, commentsTechnical, statusTechnical, 
            nameClient, identityClient, directionClient, telephoneClient, datePurchase, dayWarranty; 

    public PDF(String brand, String model, String color, String serial, String received, String falla, String commentsTechnical, String statusTechnical, String nameClient, String identityClient, String directionClient, String telephoneClient, String datePurchase, String dayWarranty) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.serial = serial;
        this.received = received;
        this.falla = falla;
        this.commentsTechnical = commentsTechnical;
        this.statusTechnical = statusTechnical;
        this.nameClient = nameClient;
        this.identityClient = identityClient;
        this.directionClient = directionClient;
        this.telephoneClient = telephoneClient;
        this.datePurchase = datePurchase;
        this.dayWarranty = dayWarranty;
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

    public String getReceived() {
        return received;
    }

    public String getFalla() {
        return falla;
    }

    public String getCommentsTechnical() {
        return commentsTechnical;
    }

    public String getStatusTechnical() {
        return statusTechnical;
    }

    public String getNameClient() {
        return nameClient;
    }

    public String getIdentityClient() {
        return identityClient;
    }

    public String getDirectionClient() {
        return directionClient;
    }

    public String getDatePurchase() {
        return datePurchase;
    }

    public String getDayWarranty() {
        return dayWarranty;
    }

    public String getTelephoneClient() {
        return telephoneClient;
    }

    
}
