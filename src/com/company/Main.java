package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        User user = new User("DELAmin", 30);
        user.sayHello();
        // user.name = "DElAmin";
        //System.out.println(user.name);

        TaxCalculator calculator = getCalculator();
        calculator.calculateTax();

        Account account = new Account();
        account.deposit(10);
        account.withdraw(5);
        System.out.println(account.getBalance());

        MailService mailService = new MailService();
        mailService.sendEmail();

        TextBox textBox = new TextBox();
        textBox.enable();

        drawUIControl(new CheckBox());
    }

    public static  TaxCalculator getCalculator() {
        return new TaxCalculator2019();
    }

    public static void  drawUIControl(UIControl control) {
        control.draw();
    }
}
