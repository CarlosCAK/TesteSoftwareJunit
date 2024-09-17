import org.junit.jupiter.api.*;

public class DataBaseUtilsTest {

    private DataBaseUtils database;

    @BeforeEach
    public  void instancing(){
           database = new DataBaseUtils();
    }
    @AfterEach
    public  void deallocate(){
        database.disconect();
        database=  null;
    }

    @Test
    public void connectTest(){
        database.connect();
        Assertions.assertTrue(database.isConnected());
    }
    @Test
    public void disconectTest(){
        database.connect();
        Assertions.assertTrue(database.isConnected());
        database.disconect();
        Assertions.assertFalse(database.isConnected());
    }


}
