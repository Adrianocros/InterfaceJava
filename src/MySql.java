public class MySql implements IDb{


    @Override
    public void conectar() {
        System.out.println("Conectado ao MySql");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectado do MySql");
    }
}
