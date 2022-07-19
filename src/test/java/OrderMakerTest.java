import order.OrderMaker;
import org.junit.Assert;
import org.junit.Test;
import util.WebDriverUtil;

public class OrderMakerTest {

    @Test
    public void orderPizzaTest() throws InterruptedException {
        OrderMaker orderMaker = new OrderMaker();
        String text = orderMaker.orderPizza();
        Assert.assertEquals("Маргарита",text);
    }

    @Test
    public void orderPizzaAndDrinkTest() throws InterruptedException {
       OrderMaker orderMaker = new OrderMaker();
       orderMaker.orderPizzaAndDrink();
       String margarita = orderMaker.checkPizza();
       String pepsi = orderMaker.checkDrink();
       Assert.assertEquals("Маргарита", margarita);
       Assert.assertEquals("Pepsi-cola", pepsi);
       orderMaker.closePage();

    }
}
