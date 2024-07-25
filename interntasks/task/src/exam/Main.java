package exam;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User[] users = {
	            new User("user1", "pass1"),
	            new User("user2", "pass2")
	        };

	        // Create some questions
	        Question[] questions = {
	            new Question("What is 2 + 2?", new String[] {"3", "4", "5", "6"}, 2),
	            new Question("What is the capital of France?", new String[] {"Berlin", "Madrid", "Paris", "Rome"}, 3)
	        };

	        LoginSystem loginSystem = new LoginSystem();
	        ProfileManager profileManager = new ProfileManager();
	        Exam exam = new Exam(questions, 30); // 30 seconds duration

	        if (loginSystem.login(users)) {
	            User currentUser = loginSystem.getCurrentUser();
	            System.out.println("Login successful! Welcome, " + currentUser.getUsername());
	            
	            Scanner scanner = new Scanner(System.in);
	            boolean running = true;
	            while (running) {
	                System.out.println("1. Update Profile");
	                System.out.println("2. Change Password");
	                System.out.println("3. Start Exam");
	                System.out.println("4. Logout");
	                System.out.print("Choose an option: ");
	                int choice = scanner.nextInt();
	                
	                switch (choice) {
	                    case 1:
	                        profileManager.updateProfile(currentUser);
	                        break;
	                    case 2:
	                        profileManager.changePassword(currentUser);
	                        break;
	                    case 3:
	                        exam.startExam();
	                        break;
	                    case 4:
	                        loginSystem.logout();
	                        running = false;
	                        System.out.println("Logged out successfully.");
	                        break;
	                    default:
	                        System.out.println("Invalid choice. Please try again.");
	                }
	            }
	        } else {
	            System.out.println("Login failed. Please try again.");
	        }
	}

}
