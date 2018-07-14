package br.com.praticaweb.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.praticaweb.model.Produto;

/**
 * 
 * @author juliane.bazilewitz
 *
 */
public class ListagemProdutosServlet extends HttpServlet{

    /**
     * id
     */
    private static final long serialVersionUID = 348031191748558924L;

    @SuppressWarnings("unchecked")
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Produto> list = (List<Produto>) request.getAttribute("produtos");
        
        request.setAttribute("produtos", list);
        
        RequestDispatcher view = request.getRequestDispatcher("listaProduto.jsp");
        
        view.forward(request, response);
    }
}
