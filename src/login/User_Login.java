package login;

public class User_Login {

    private int ID;
    private String username, password, permission, status, direction, name;

    public User_Login(int ID, String username, String password, String name, String direction, String permission, String status) {
        this.ID = ID;
        this.username = username;
        this.password = password;
        this.permission = permission;
        this.status = status;
        this.direction = direction;
        this.name = name;
    }

    public User_Login() {
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public String getDirection() {
        return direction;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getPermission() {
        return permission;
    }

    public String getStatus() {
        return status;
    }

    public User_Login Compare_Login(String user, String pass) throws InterruptedException {

        User_Login user_Login = null;
        int index = 0, count = 0;

        do {

            if (!Request_User_Login.user_Login_List.isEmpty()) {

                for (int i = 0; i < Request_User_Login.user_Login_List.size(); i++) {

                    if (Request_User_Login.user_Login_List.get(i).getUsername().equalsIgnoreCase(user)
                            && Request_User_Login.user_Login_List.get(i).getPassword().equalsIgnoreCase(pass)) {

                        return user_Login = Request_User_Login.user_Login_List.get(i);

                    }

                }

            } else {

                if (count < 3) {

                    count = +1;

                    Thread.sleep(1000);

                } else {

                    return user_Login;

                }

            }

        } while (index != 0);

        return null;
    }

}
