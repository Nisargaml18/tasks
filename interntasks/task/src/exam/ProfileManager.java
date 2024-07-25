package exam;
import java.util.*;
public class ProfileManager {
	public void updateProfile(User user) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new profile information: ");
        String newProfile = scanner.nextLine();
        user.setProfile(newProfile);
        System.out.println("Profile updated successfully.");
    }

    public void changePassword(User user) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new password: ");
        String newPassword = scanner.nextLine();
        user.setPassword(newPassword);
        System.out.println("Password changed successfully.");
    }
}
