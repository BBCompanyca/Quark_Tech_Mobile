package validateIp;

public class Ip {
    
    private String ip, status;

    public Ip(String ip, String status) {
        this.ip = ip;
        this.status = status;
    }

    public String getIp() {
        return ip;
    }   

    public String getStatus() {
        return status;
    }
    
}
