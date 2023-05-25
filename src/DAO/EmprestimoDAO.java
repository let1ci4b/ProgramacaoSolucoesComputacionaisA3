
package DAO;

import Model.Amigo;
import Model.Emprestimo;
import Model.Ferramenta;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class EmprestimoDAO {
    
    public static ArrayList<Emprestimo> MinhaLista = new ArrayList<>();
        public Connection getConexao() {

        Connection connection = null;  //instância da conexão

        try {

            // Carregamento do JDBC Driver
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);

            // Configurar a conex�o
            String server = "localhost"; //caminho do MySQL
            String database = "ToolHost";
            String url = "jdbc:mysql://" + server + ":3306/" + database + "?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = "banco";

            connection = DriverManager.getConnection(url, user, password);

            // Testando..
            if (connection != null) {
                System.out.println("Status: Conectado!");
            } else {
                System.out.println("Status: NAO CONECTADO!");
            }

            return connection;

        } catch (ClassNotFoundException e) {  //Driver nao encontrado
            System.out.println("O driver nao foi encontrado. " + e.getMessage() );
            return null;

        } catch (SQLException e) {
            System.out.println("Nao foi possivel conectar..." + e.getMessage());
            return null;
        }
    }
        
    public ArrayList getMinhaLista() {
        AmigoDAO amigoDAO = new AmigoDAO(); // dao para transformar o id em objeto
        FerramentaDAO ferramentaDAO = new FerramentaDAO();
        
        MinhaLista.clear();
        
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_emprestimos");
            while (res.next()) {
                
                int id = res.getInt("id_emprestimo");
                Amigo amigo = amigoDAO.carregaAmigo(res.getInt("fk_amigo"));
                Ferramenta ferramenta = ferramentaDAO.carregaFerramenta(res.getInt("fk_ferramenta"));
                java.sql.Date dataEmprestimo = res.getDate("data_emprestimo");
                java.sql.Date dataDevolucao = res.getDate("data_devolucao");
                boolean status = res.getBoolean("status");
                
                Emprestimo objeto = new Emprestimo(id, amigo, ferramenta, dataEmprestimo, dataDevolucao, status);
                
                MinhaLista.add(objeto);
            }
            
            stmt.close();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
        return MinhaLista;
    }
    
    // Cadastra novo amigo
    public boolean InsertEmprestimoBD(Emprestimo objeto) throws SQLException {
        String sql = "INSERT INTO tb_emprestimos(fk_amigo,fk_ferramenta,data_emprestimo,data_devolucao) VALUES(?,?,?,?)";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setInt(1, objeto.getAmigo().getId());
            stmt.setInt(2, objeto.getFerramenta().getId());
            stmt.setDate(3, objeto.getDataEmprestimo());
            stmt.setDate(4, objeto.getDataDevolucao());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

}


