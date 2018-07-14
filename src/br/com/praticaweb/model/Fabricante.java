package br.com.praticaweb.model;

/**
 * 
 * @author juliane.bazilewitz
 *
 */
public class Fabricante {

    private Integer codigo;
    private String nome;
    
    /**
     * padr�o EJB
     */
    public Fabricante() {
        
    }
    
    public Fabricante(Integer codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
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
}
