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
        webDriverUtil.clickButtonWithWait(Locators.SALE_ALERT_CLOSE);
        webDriverUtil.clickButtonWithWait(Locators.PIZZA_CATEGORY);
        Thread.sleep(5000);
        webDriverUtil.clickButtonWithWait(Locators.PIZZA_MARGARITA);
        webDriverUtil.clickButtonWithWait(Locators.CART);
        String text = webDriverUtil.getText(Locators.MARGARITA_IN_CART);
        closePage();
        return text;
    }

    public void orderPizzaAndDrink() throws InterruptedException {
        webDriverUtil.openPage(Locators.URL);
        Thread.sleep(3000);
        webDriverUtil.clickButtonWithWait(Locators.SALE_ALERT_CLOSE);
        webDriverUtil.clickButton(Locators.PIZZA_CATEGORY);
        Thread.sleep(2000);
        webDriverUtil.clickButtonWithWait(Locators.PIZZA_MARGARITA);
        webDriverUtil.clickButtonWithWait(Locators.DRINK_CATEGORY);
        webDriverUtil.clickButtonWithWait(Locators.DRINK_PEPSI);
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
