// User.java - Abstract base class demonstrating ABSTRACTION and ENCAPSULATION
public abstract class User {
    // ENCAPSULATION: Private fields with controlled access
    private String userId;
    private String name;
    private String email;
    private String password;
    private String phoneNumber;
    
    // Constructor
    public User(String userId, String name, String email, String password, String phoneNumber) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }
    
    // ABSTRACTION: Abstract methods that subclasses must implement
    public abstract void requestTransport(String destination);
    public abstract String getUserType();
    public abstract boolean canAccessAdminFeatures();
    
    // Concrete method available to all subclasses
    public void displayUserInfo() {
        System.out.println("User Type: " + getUserType());
        System.out.println("ID: " + userId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
    }
    
    // ENCAPSULATION: Getters and Setters
    public String getUserId() {
        return userId;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        }
    }
    
    // Protected method for password verification
    protected boolean verifyPassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
