package warranty;

import warranty.Request_Client_List;

public class Client {

    private int ID;
    private String name, telephone, unformat_telephone, indentity, unformat_indentity, direction_client;

    public Client(int ID, String name, String telephone, String unformat_telephone, String indentity, String unformat_indentity, String direction_client) {
        this.ID = ID;
        this.name = name;
        this.telephone = telephone;
        this.unformat_telephone = unformat_telephone;
        this.indentity = indentity;
        this.unformat_indentity = unformat_indentity;
        this.direction_client = direction_client;
    }

    public Client() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getIndentity() {
        return indentity;
    }

    public void setIndentity(String indentity) {
        this.indentity = indentity;
    }

    public String getUnformat_telephone_client() {
        return unformat_telephone;
    }

    public void setUnformat_telephone_client(String unformat_telephone) {
        this.unformat_telephone = unformat_telephone;
    }

    public String getUnformat_indentity() {
        return unformat_indentity;
    }

    public void setUnformat_indentity(String unformat_indentity) {
        this.unformat_indentity = unformat_indentity;
    }

    public String getDirection_client() {
        return direction_client;
    }

    public void setDirection_client(String direction_client) {
        this.direction_client = direction_client;
    }

    public Client searchClient(String identity2) throws InterruptedException {

        int index = 0, count = 0;
        Client clientEncontrado = null;

        do {

            if (!Request_Client_List.client_List.isEmpty()) {

                for (int i = 0; i < Request_Client_List.client_List.size(); i++) {

                    if (Request_Client_List.client_List.get(i).getUnformat_indentity().equalsIgnoreCase(identity2)) {

                        return clientEncontrado = Request_Client_List.client_List.get(i);

                    }

                }

            } else {

                if (count < 3) {

                    count =+ 1;

                    Thread.sleep(1000);

                } else {

                    return clientEncontrado;

                }

            }

        } while (index != 0);

        return null;

    }

}
