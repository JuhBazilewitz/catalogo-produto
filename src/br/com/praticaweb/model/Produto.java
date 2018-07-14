package br.com.praticaweb.model;

/**
 * 
 * @author juliane.bazilewitz
 *
 */
public class Produto {

    private Integer codigo;
    private String nome;
    private double valor;
    private Fabricante fabricante;
    
    /**
     * padrão EJB
     */
    public Produto() {
        
    }
    
    public Produto(Integer codigo, String nome, double valor, Fabricante fabricante) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.fabricante = fabricante;
    }
    
    public Integer getCodigo() {
        return codigo;
    }
    
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getValor() {
        return valor;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
}
