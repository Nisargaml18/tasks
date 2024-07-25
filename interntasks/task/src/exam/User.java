package exam;

public class User {
	private String username;
    private String password;
    private String profile;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.profile = "Default Profile";
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String newPassword) {
        this.password = newPassword;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String newProfile) {
        this.profile = newProfile;
    }
}
