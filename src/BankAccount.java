public class BankAccount {
    private String customerName, email;
    private int accountNumber;
    private int accountBalance;
    private int phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int depositFund(int depositAmount){
        this.accountBalance = this.accountBalance+depositAmount;
        return this.accountBalance;
    }

    public int withDraw(int widthDraw){
        if(this.accountBalance-widthDraw<0){
            System.out.println("Cannot return");
            return this.accountBalance;
        }
        this.accountBalance = this.accountBalance-widthDraw;
        return accountBalance;
    }
}
