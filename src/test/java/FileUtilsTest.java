import org.junit.jupiter.api.*;

public class FileUtilsTest {

    private FileUtils fileUtils;

    @BeforeEach
    public void setUp(){
        fileUtils = new FileUtils();
        fileUtils.openConnection();
    }
    @AfterEach
    public void deallocate(){
        fileUtils.closeConnection();
        fileUtils = null;
    }
    @Test
    public void createFileTest(){
        Assertions.assertEquals("teste", fileUtils.createFile("teste"));
    }
    @Test
    public void deleteFileTest(){
        Assertions.assertTrue(fileUtils.deleteFile("teste"));
    }

}
