package Model;

import java.sql.Date;

public class Emprestimo {
    
    private int id;
    private Amigo amigo;
    private Ferramenta ferramenta;
    private Date dataEmprestimo;
    private Date dataDevolucao;
    private boolean status;

    public Emprestimo() {
    }

    public Emprestimo(int id, Amigo amigo, Ferramenta ferramenta, Date dataEmprestimo, Date dataDevolucao) {
        this.id = id;
        this.amigo = amigo;
        this.ferramenta = ferramenta;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.status = (dataDevolucao != null);
    }

    public Emprestimo(Amigo amigo, Ferramenta ferramenta, Date dataEmprestimo, Date dataDevolucao) { // constructor para cadastro
        this.amigo = amigo;
        this.ferramenta = ferramenta;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.status = (dataDevolucao != null);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Amigo getAmigo() {
        return amigo;
    }

    public void setAmigo(Amigo amigo) {
        this.amigo = amigo;
    }

    public Ferramenta getFerramenta() {
        return ferramenta;
    }

    public void setFerramenta(Ferramenta ferramenta) {
        this.ferramenta = ferramenta;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        String pendencia;
        if(this.isStatus()){
            pendencia = "CONCLUIDO";
        } else {
            pendencia = "PENDENTE";
        }
        return "\n ID do empréstimo: " + this.getId()
                + "\n Nome do amigo: " + this.getAmigo().getNome()
                + "\n Nome da ferramenta: " + this.getFerramenta().getNome()
                + "\n Data do empréstimo: " + this.getDataEmprestimo()
                + "\n Data de devolução: " + this.getDataDevolucao()
                + "\n Status: " + pendencia
                + "\n -----------";
    }    
    
}
