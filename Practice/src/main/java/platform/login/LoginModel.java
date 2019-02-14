package platform.login;

public class LoginModel {
    private String userName = "UserName";
    private String password = "Password";
    private String submit = "Submit";
    private String loginError = "Login Error";

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getSubmit() {
        return submit;
    }

    public String getLoginError() {
        return loginError;
    }
}
