package org.eclipse.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.eclipse.model.Produit;
import org.eclipse.model.Vendeur;
import org.eclipse.service.ProduitService;


@WebServlet("/ajoutProduit")
public class ProduitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ProduitServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		getServletContext().getRequestDispatcher("/WEB-INF/vendeur/ajoutProduit.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
//		HttpSession session = request.getSession();
		String designation = request.getParameter("designation");
		int prixUnit = Integer.parseInt(request.getParameter("prixUnitaire"));
		int quantStockee = Integer.parseInt(request.getParameter("quantiteStock"));
		String imageURL = request.getParameter("imageUrl");
		ProduitService produitService = new ProduitService();
		Produit produit = new Produit(designation, prixUnit, quantStockee, imageURL);
		produitService.save(produit);
		doGet(request, response);
		
		
	}

}
