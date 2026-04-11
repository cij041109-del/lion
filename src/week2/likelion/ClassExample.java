package week2.likelion;

public class ClassExample {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        /*System.out.println(account);
        System.out.println(account.bankCode);
        System.out.println(account.isDormant);
*/

        //private 접근 불가 오류 발생
        BankAccount bankAccount = new BankAccount();
       // bankAccount.password = 123456;
        //System.out.println(bankAccount.passwod);

        bankAccount.changePassword(123456);

    }
}
