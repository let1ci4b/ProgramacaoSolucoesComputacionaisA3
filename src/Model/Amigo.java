package Model;

public class Amigo {
    
    private int id;
    private String nome;
    private long telefone;
    private int quantEmprest;

    public Amigo() {
    }
    
    public Amigo(String nome, long telefone, int quantEmprest) { // construtor sem id (auto-increment)
        this.nome = nome;
        this.telefone = telefone;
        this.quantEmprest = quantEmprest;
    }

    public Amigo(int id, String nome, long telefone) { // construtor para alteraçoes
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }

    public Amigo(int id, String nome, long telefone, int quantEmprest) { // construtor para selectAll
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.quantEmprest = quantEmprest;
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
