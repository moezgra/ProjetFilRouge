package org.eclipse.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.eclipse.model.Acheteur;
import org.eclipse.model.Panier;
import org.eclipse.model.Utilisateur;
import org.eclipse.model.Vendeur;
import org.eclipse.service.ProduitService;
import org.eclipse.service.UtilisateurService;



@WebServlet({ "/connexion", "/connexionAcheteur", "/connexionVendeur" })
public class ConnexionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private UtilisateurService utilisateurService = new UtilisateurService();
	private ProduitService produitService = new ProduitService();
	
	
	public ConnexionServlet() {
		super();
		
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getServletPath().contains("connexionVendeur")) {
			this.getServletContext().getRequestDispatcher("/WEB-INF/vendeur/connexion.jsp").forward(request, response);
		}
		this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String adresseEmail = request.getParameter("email");
		String motDePasse = request.getParameter("password");
		Acheteur acheteur = utilisateurService.findByLoginAcheteur(adresseEmail, motDePasse);
		Vendeur vendeur = utilisateurService.findByLoginVendeur(adresseEmail, motDePasse);
		session.setAttribute("serviceProduit", produitService);
		if (request.getServletPath().contains("connexionAcheteur") && acheteur != null) {
			Panier panier = new Panier(acheteur);
			session.setAttribute("acheteur", acheteur);
			session.setAttribute("panier", panier);
			session.setAttribute("utilisateurService", utilisateurService);
			response.sendRedirect("home");
		} else if (vendeur != null) {
			session.setAttribute("utilisateurService", utilisateurService);
			session.setAttribute("vendeur", vendeur);
			response.sendRedirect("home");
		}

		else {
			this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		}
	}	
}
