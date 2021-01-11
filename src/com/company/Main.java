package com.company;

import com.company.memento.Editor;
import com.company.memento.History;
import com.company.state.Canvas;
import com.company.state.SelectionTool;
import com.company.state.abuse.Stopwatch;

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

        Editor editor = new Editor();
        History history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        editor.restore(history.pop());

        System.out.println(editor.getContent());
        editor.restore(history.pop());
        System.out.println(editor.getContent());

        Canvas canvas = new Canvas();
        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();

        Stopwatch stopwatch = new Stopwatch();
        stopwatch.click();
        stopwatch.click();
        stopwatch.click();
        stopwatch.click();
        stopwatch.click();
    }

    public static  TaxCalculator getCalculator() {
        return new TaxCalculator2019();
    }

    public static void  drawUIControl(UIControl control) {
        control.draw();
    }
}
