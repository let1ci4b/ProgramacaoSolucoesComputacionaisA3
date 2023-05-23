
package Model;

import java.util.*;
import DAO.AmigoDAO;
import java.sql.SQLException;

public class Amigo {
    
    private int id;
    private String nome;
    private long telefone;
    private int quantEmprest;
    private final AmigoDAO dao; 

    public Amigo() {
         this.dao = new AmigoDAO(); // inicializado nao importa em qual construtor
    }
    
    public Amigo(String nome, long telefone, int quantEmprest) {
        this.nome = nome;
        this.telefone = telefone;
        this.quantEmprest = quantEmprest;
        this.dao = new AmigoDAO(); // inicializado nao importa em qual construtor
    }

    public Amigo(int id, String nome, long telefone, int quantEmprest) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.quantEmprest = quantEmprest;
        this.dao = new AmigoDAO(); // inicializado nao importa em qual construtor
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public int getQuantEmprest() {
        return quantEmprest;
    }

    public void setQuantEmprest(int quantEmprest) {
        this.quantEmprest = quantEmprest;
    }
    
    // para poder retornar os dados de amigos
    public String toString() {
        return "\n ID: " + this.getId()
                + "\n Nome: " + this.getNome()
                + "\n Idade: " + this.getTelefone()
                + "\n Curso: " + this.getQuantEmprest()
                + "\n -----------";
    }
/*
    
        ABAIXO OS M�TODOS PARA USO JUNTO COM O DAO
        SIMULANDO A ESTRUTURA EM CAMADAS PARA USAR COM BANCOS DE DADOS.
    
     */
    // Retorna a Lista de Amigos(objetos)
    public ArrayList getMinhaLista() {
        return dao.getMinhaLista();
    }

    // Cadastra novo amigo
    public boolean InsertAmigoBD(String nome, long telefone, int QuantEmprest) throws SQLException {
        Amigo objeto = new Amigo(nome, telefone, QuantEmprest);
        dao.InsertAmigoBD(objeto);
        return true;

    }

    // Deleta um amigo especifico pelo seu campo ID
    public boolean DeleteAmigoBD(int id) {
        dao.DeleteAmigoBD(id);
        return true;
    }

    // Edita um aluno espec�fico pelo seu campo ID
    public boolean UpdateAmigoBD(String nome, long telefone, int QuantEmprest) {
        Amigo objeto = new Amigo(nome, telefone, QuantEmprest);
        dao.UpdateAmigoBD(objeto);
        return true;
    }

    // carrega dados de um amigo espec�fico pelo seu ID
    public Amigo carregaAmigo(int id) {
        dao.carregaAmigo(id);
        return null;
    }
    
}
