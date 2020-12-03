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
import org.eclipse.model.Vendeur;
import org.eclipse.service.UtilisateurService;





@WebServlet("/AjoutUtilisateurServlet")
public class AjoutUtilisateurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private UtilisateurService utilisateurService = new UtilisateurService();

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/utilisateur/ajoutUtilisateur.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String type = request.getParameter("type");
		if (type.contains("acheteur")) {
			String adresseEmail = request.getParameter("email");
			String motDePasse = request.getParameter("password");
			String nom = request.getParameter("nom");
			String prenom = request.getParameter("prenom");
			String rue = request.getParameter("rue");
			String codePostal = request.getParameter("codePostal");
			String ville = request.getParameter("ville");
			Adresse adresse = new Adresse(rue, codePostal, ville);
			Acheteur acheteur = new Acheteur(1, adresseEmail, motDePasse, nom, prenom, adresse);
			utilisateurService.addAcheteur(acheteur);
			HttpSession session = request.getSession();
			session.setAttribute("id", acheteur.getId());
			session.setAttribute("utilisateurService", utilisateurService);
			response.sendRedirect("home");
		}
		if (type.contains("vendeur")) {
			String adresseEmail = request.getParameter("email");
			String motDePasse = request.getParameter("password");
			String designation = request.getParameter("compagnie");
			String numSiret = request.getParameter("siret");
			Vendeur vendeur = new Vendeur(1, adresseEmail, motDePasse, designation, numSiret);
			HttpSession session = request.getSession();
			utilisateurService.addVendeur(vendeur);
			session.setAttribute("id", vendeur.getId());
			session.setAttribute("utilisateurService", utilisateurService);
			response.sendRedirect("home");
		}	

	}
}	
