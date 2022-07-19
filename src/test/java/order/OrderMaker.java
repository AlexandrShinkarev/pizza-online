package order;

import page.Locators;
import util.WebDriverUtil;

public class OrderMaker {

    WebDriverUtil webDriverUtil;

    public OrderMaker() {
        webDriverUtil = new WebDriverUtil();
    }

    public String orderPizza() throws InterruptedException {

        webDriverUtil.openPage(Locators.URL);
        //Thread.sleep(5000);
        webDriverUtil.clickButton(Locators.SALE_ALERT_CLOSE);
        //Thread.sleep(1000);
        webDriverUtil.clickButton(Locators.PIZZA_CATEGORY);
        //Thread.sleep(1000);
        webDriverUtil.clickButton(Locators.PIZZA_MARGARITA);
        //Thread.sleep(1000);
        webDriverUtil.clickButton(Locators.CART);
        //Thread.sleep(1000);
        String text = webDriverUtil.getText(Locators.MARGARITA_IN_CART);
        //Thread.sleep(3000);
        closePage();
        return text;
    }

    public void orderPizzaAndDrink() throws InterruptedException {
        webDriverUtil.openPage(Locators.URL);
        //Thread.sleep(5000);
        webDriverUtil.clickButtonWithWait(Locators.SALE_ALERT_CLOSE);
        webDriverUtil.clickButton(Locators.PIZZA_CATEGORY);
        webDriverUtil.clickButton(Locators.PIZZA_MARGARITA);
        webDriverUtil.clickButton(Locators.DRINK_CATEGORY);
        webDriverUtil.clickButton(Locators.DRINK_PEPSI);
        webDriverUtil.clickButtonWithWait(Locators.CART);


    }

    public String checkPizza() {
        String text = webDriverUtil.getText(Locators.MARGARITA_IN_CART);
        return text;
    }

    public String checkDrink() {
        String text = webDriverUtil.getText(Locators.PEPSI_IN_CART);
        return text;
    }

    public void closePage() {
        webDriverUtil.close();
    }


}
