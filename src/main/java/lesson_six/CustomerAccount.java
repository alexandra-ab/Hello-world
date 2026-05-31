package lesson_six;

public class CustomerAccount {
    private String name;
    private String email;
    private double balance;
    private int discount;
    private String accountStatus;

    public CustomerAccount(String name, String email, double balance, int discount, String accountStatus) {
        this.name = name;
        this.email = email;
        this.balance = balance;
        this.discount = discount;
        this.accountStatus = accountStatus;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getBalance() {
        return balance;
    }

    public int getDiscount() {
        return discount;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name!");
        }
    }

    public void setEmail(String email) {
        if (email.contains("@")){
            this.email = email;
        } else {
            System.out.println("Invalid email");
        }
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance!");
        }
    }

    public void setAccountStatus(String accountStatus) {
        if (accountStatus.equals("Active") || accountStatus.equals("Blocked")) {
            this.accountStatus = accountStatus;
        } else {
            System.out.println("Invalid account status!");
        }
    }

    public void setDiscount(int discount) {
        if (discount >= 0 && discount < 50) {
            this.discount = discount;
        } else {
            System.out.println("Invalid discount!");
        }
    }

    public void purchase(double amount) {
        if (accountStatus.equals("Blocked")) {
            System.out.println("Account is blocked. Purchase denied.");
        } else if (balance < amount) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount * (1 - discount / 100);
        }
    }

    public void applyDiscount(int value) {
        if (accountStatus.equals("Active") && value >= 0 && value < 50 ) {
            System.out.println("Discount applied successfully");
        } else {
            System.out.println("Cannot apply discount. Account is blocked.");
        }
    }

    @Override
    public String toString() {
        return "CustomerAccount{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", balance=" + balance +
                ", discount=" + discount +
                ", accountStatus='" + accountStatus + '\'' +
                '}';
    }
}
