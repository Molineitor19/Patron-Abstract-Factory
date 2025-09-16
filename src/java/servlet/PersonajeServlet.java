package servlet;

import modelo.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 *
 * @author Nelson Molina Ramos
 */
@WebServlet(name = "PersonajeServlet", urlPatterns = {"/PersonajeServlet"})
public class PersonajeServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String raza = request.getParameter("raza");
        FabricaAbstracta fabrica = null;

        switch (raza) {
            case "ELFO":
                fabrica = new FabricaElfos();
                break;
            case "ENANO":
                fabrica = new FabricaEnanos();
                break;
            case "HUMANO":
                fabrica = new FabricaHumanos();
                break;
            case "ORCO":
                fabrica = new FabricaOrcos();
                break;
        }

        if (fabrica != null) {
            Arma arma = fabrica.crearArma();
            Armadura armadura = fabrica.crearArmadura();
            Cuerpo cuerpo = fabrica.crearCuerpo();
            Montura montura = fabrica.crearMontura();

            // Ahora usamos directamente los métodos que devuelven String
            request.setAttribute("raza", raza);
            request.setAttribute("arma", arma.atacar());
            request.setAttribute("armadura", armadura.proteger());
            request.setAttribute("cuerpo", cuerpo.mover());
            request.setAttribute("montura", montura.mover());
            request.setAttribute("imagen", "imagenes/" + raza.toLowerCase() + ".png");
        }

        RequestDispatcher rd = request.getRequestDispatcher("resultado.jsp");
        rd.forward(request, response);
    }
}
