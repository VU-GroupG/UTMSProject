

public abstract class User {
   
    private String userId;
    private String name;
    private String email;
    private String password;
    private String phoneNumber;
    
    public User(String userId, String name, String email, String password, String phoneNumber) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }
    
    public User(String userId, String name){
        this.userId = userId;
        this.name   = name;
    }
    
    public abstract void requestTransport(String destination);
    public abstract String getUserType();
    public abstract boolean canAccessAdminFeatures();
    
    public void displayUserInfo() {
        System.out.println("User Type: " + getUserType());
        System.out.println("ID: " + userId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
    }
    
   
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
    
    
    protected boolean verifyPassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}