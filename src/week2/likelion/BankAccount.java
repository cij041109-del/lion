package week2.likelion;

public class BankAccount {

    //멤버 변수

    private int bankCode;
    private int accountNo;
    private String owner;
    private int balance;
    private boolean isDormant;
    private int password;

    //메서드

    public void inquiry() {}

    public void deposit() {}
    public void withdraw() {}

    public void heldIsDormant() {}

    public void changePassword(int password) {
        this.password = password;
        System.out.println(password);
    }
    //생성자
    //클래스 내부에 정의, 생성자 메서드명은 클래스명과 일치!

    BankAccount() {


    }

    BankAccount(
            int bankCode,
            int accountNo,
            String owner,
            int balance,
            boolean isDormant

    ) {

        this.bankCode = bankCode;
        this.accountNo = accountNo;
        this.owner = owner;
        this.balance = balance;
        this.isDormant = isDormant;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public boolean isDormant() {
        return isDormant;
    }

    public int getBalance() {
        return balance;
    }

    public int getBankCode() {
        return bankCode;
    }

    public int getPassword() {
        return password;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public void setBankCode(int bankCode) {
        this.bankCode = bankCode;
    }

    public String getOwner() {
        return owner;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setDormant(boolean dormant) {
        isDormant = dormant;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
