package servlets;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Game;

/**
 * Servlet implementation class GameServlet
 */
@WebServlet("/GuessGame")
public class GameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GameServlet() {
		super();
	}

	Game game = new Game();
	Random rand = new Random();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if(game.getNumDicaMenor() == 0 || game.getNumDicaMaior() == 100) {
			int numeroRandom = rand.nextInt(99)+1;
			game.setNumRandom(numeroRandom);
		}

		request.setAttribute("game", game);
		RequestDispatcher dispatcher = request.getRequestDispatcher("GameServlet.jsp");
		dispatcher.forward(request, response);
		//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int numEscolhido = Integer.parseInt(request.getParameter("numero"));

		if(game.getNumRandom() == numEscolhido) {
			System.out.println("Parabéns");
			response.sendRedirect("Parabens.jsp");
		}
		else {
			if(numEscolhido < game.getNumRandom()) {
				game.setNumDicaMenor(numEscolhido);
			}
			else {
				game.setNumDicaMaior(numEscolhido);
			}
			response.sendRedirect("GameServlet");
		}
	}

}
