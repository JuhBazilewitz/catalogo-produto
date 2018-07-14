package br.com.praticaweb.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.praticaweb.model.Fabricante;
import br.com.praticaweb.model.Produto;

/**
 * 
 * @author juliane.bazilewitz
 *
 */
public class HomeServlet extends HttpServlet{

    /**
     * id
     */
    private static final long serialVersionUID = 7424350946644245437L;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getParameter("produtos") == null || request.getParameter("produtos").isEmpty()) {
            List<Produto> produtos = new ArrayList<>();
            produtos.add(getProduto(100, "caneta azul", 1.25));
            produtos.add(getProduto(105, "caneta preta", 1.25));
            produtos.add(getProduto(200, "lápis nro 2", 0.80));
            produtos.add(getProduto(202, "lápis B", 3.50));
            
            request.setAttribute("produtos", produtos);
        }
        
        RequestDispatcher view = request.getRequestDispatcher("home.jsp");
        
        view.forward(request, response);
    }
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        
    }
    
    /**
     * 
     * @return
     */
    private Produto getProduto(Integer codigo, String nome, double valor){
        return new Produto(codigo, nome, valor, getFabricante());
    }
    
    private Fabricante getFabricante() {
        return new Fabricante(50, "Bic");
    }
}
