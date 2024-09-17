import org.junit.jupiter.api.*;

import java.util.ArrayList;

public class OrderServiceTest {

    private static OrderService orderService;

    @BeforeAll
    public static void setUp(){
        orderService = new OrderService();
    }

    @BeforeEach
    public void cleaning(){
        orderService.clearAllOrders();
    }
    @AfterEach
    public void tearDown(){
        System.out.println("Finalizando teste...");
    }

    @AfterAll
    public static void deallocate(){
        orderService = null;
    }
    @Test
    public void constructorTest(){
        Assertions.assertEquals(new ArrayList<>().getClass(),orderService.getAllOrders().getClass());
    }

    @Test
    public void addOrderTest(){
        orderService.addOrder("teste");
        Assertions.assertEquals(1,orderService.getAllOrders().size());
        Assertions.assertTrue(orderService.getAllOrders().contains("teste"));
    }

    @Test
    public void removeOrderTest(){
        orderService.addOrder("teste");
        Assertions.assertTrue(orderService.getAllOrders().contains("teste"));
        Assertions.assertEquals(1,orderService.getAllOrders().size());
        orderService.removeOrder("teste");
        Assertions.assertFalse(orderService.getAllOrders().contains("teste"));
        Assertions.assertEquals(0,orderService.getAllOrders().size());

    }
    @Test
    public void getAllOrdersTest(){
        Assertions.assertEquals("java.util.ArrayList",orderService.getAllOrders().getClass().getName());
    }
    @Test
    public void clearAllOrdersTest(){
        orderService.clearAllOrders();
        Assertions.assertEquals(new ArrayList<>(), orderService.getAllOrders());
    }


}
