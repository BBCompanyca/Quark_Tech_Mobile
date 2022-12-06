package client;

public class Client {
    
    private int clientID;
    private String identity;

    public Client(int clientID, String identity) {
        this.clientID = clientID;
        this.identity = identity;
    }

    public int getClientID() {
        return clientID;
    }
    
    public String getIdentity() {
        return identity;
    }
    
}
