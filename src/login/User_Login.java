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

    public int Compare_Login(String user, String pass) {

        int flag = 0;

        if (user.equals(getUsername()) && pass.equals(getPassword()) && getStatus().equals("Activo")) {

            flag = 1;

        } else if (user.equals(getUsername()) && pass.equals(getPassword()) && getStatus().equals("Inactivo")) {

            flag = 2;

        }

        return flag;
    }

}
