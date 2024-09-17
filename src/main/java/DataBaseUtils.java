public class DataBaseUtils {

    private boolean connected = false;

    public void connect(){
        connected = true;
        System.out.printf("Conectou ao banco de dados");
    }
    public void disconect(){
        connected = false;
        System.out.println("Desconectado do banco de dados");
    }

    public boolean isConnected() {
        return connected;
    }
}
