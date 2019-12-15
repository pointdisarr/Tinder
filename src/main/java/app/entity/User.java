package app.entity;

public class User {
    public boolean valid;
    private String userId;
    private String email;
    private String password;

    public User(String email, String pass) {
        this.email = email;
        this.password = pass;
    }

    public String getUserId() {
        return userId;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean newValid) {
        valid = newValid;
    }
}
