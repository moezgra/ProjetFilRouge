package org.eclipse.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.eclipse.model.Utilisateur;
import org.eclipse.service.UtilisateurService;

@WebServlet("/connexion")
public class ConnexionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UtilisateurService utilisateurService = new UtilisateurService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		Utilisateur utilisateur = utilisateurService.findByLoginAndPassword(login, password);
		if (utilisateur == null) {
			response.sendRedirect("connexion");
		} else {
			HttpSession session = request.getSession();
			session.setAttribute("utilisateur", utilisateur);
			if (utilisateur.getType().equals("vendeur")) {
				response.sendRedirect("vente");
				
			} else {
				response.sendRedirect("achat");

			}
		}
	}

}