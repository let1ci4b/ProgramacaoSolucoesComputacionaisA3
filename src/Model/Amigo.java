
package Model;

import DAO.AmigoDAO;
import java.util.ArrayList;

public class Amigo {
    
    private int id;
    private String nome;
    private long telefone;
    private int quantEmprest;
    private final AmigoDAO dao; 

    public Amigo() {
         this.dao = new AmigoDAO(); // inicializado nao importa em qual construtor
    }
    
    public Amigo(String nome, long telefone, int quantEmprest) { // construtor sem id (auto-increment)
        this.nome = nome;
        this.telefone = telefone;
        this.quantEmprest = quantEmprest;
        this.dao = new AmigoDAO(); // inicializado nao importa em qual construtor
    }

    public Amigo(int id, String nome, long telefone, int quantEmprest) { // construtor para selectAll
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
                + "\n Telefone: " + this.getTelefone()
                + "\n Quantidade de empréstimos: " + this.getQuantEmprest()
                + "\n -----------";
    }
    
}
