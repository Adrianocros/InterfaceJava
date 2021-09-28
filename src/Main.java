import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        IDb db;

        String acao = JOptionPane.showInputDialog("Digite o banco M - MySql / O - Oracle");

        if(acao.equals("M")){
            db = new MySql();
        }else {
            db = new Oracle();
        }

        db.conectar();
        db.desconectar();

    }
}
