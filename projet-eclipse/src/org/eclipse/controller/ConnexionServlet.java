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

@WebServlet({ "/Connexion" })
public class ConnexionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UtilisateurService utilisateurService = new UtilisateurService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/connexion.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String adresseEmail = request.getParameter("email");
		String motDePasse = request.getParameter("password");
		Utilisateur utilisateur = utilisateurService.findByAdresseEmailAndMotDePasse(adresseEmail, motDePasse);
		if (utilisateur == null) {
			response.sendRedirect("Connexion");
		} else {
			session.setAttribute("utilisateur", utilisateur);
			if (utilisateur.getType().equals("vendeur")) {
				response.sendRedirect("ajoutProduit");
			} else {
				this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
			}
		}

	}
}
