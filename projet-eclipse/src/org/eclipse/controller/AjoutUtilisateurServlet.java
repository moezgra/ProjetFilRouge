package org.eclipse.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.eclipse.model.Acheteur;
import org.eclipse.model.Adresse;
import org.eclipse.model.Produit;
import org.eclipse.model.Utilisateur;
import org.eclipse.model.Vendeur;
import org.eclipse.service.ProduitService;
import org.eclipse.service.UtilisateurService;





@WebServlet("/AjoutUtilisateurServlet")
public class AjoutUtilisateurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/utilisateur/ajoutUtilisateur.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String type = request.getParameter("type");
		String adresseEmail = request.getParameter("adresseEmail");
		String motDePasse = request.getParameter("motDePasse");
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		UtilisateurService utilisateurService = new UtilisateurService();
		Utilisateur utilisateur = new Utilisateur(type, adresseEmail, motDePasse, nom, prenom );
		utilisateurService.save(utilisateur);
		doGet(request, response);
	}	
}	
