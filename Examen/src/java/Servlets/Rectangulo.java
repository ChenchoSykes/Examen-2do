/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.Date;

public class Rectangulo extends HttpServlet {

    int Base;
    int Altura;
    String opc;
    float Resultado;

    public void doPost(HttpServletRequest peticion, HttpServletResponse respuesta)
            throws ServletException, IOException {
        Base = Integer.parseInt(peticion.getParameter("Base"));
        Altura = Integer.parseInt(peticion.getParameter("Altura"));
        opc = peticion.getParameter("opc");

        switch (opc) {
            case "A":
                Resultado = Base * Altura;
                break;
            case "P":
                Resultado = Base + Base + Altura + Altura;
                break;
            

        }

        PrintWriter out = new PrintWriter(respuesta.getOutputStream());
        out.println("<html>");
        out.println("<head><title>Resultado</title>"
              
                + "</head>");
        out.println("<body>"
                + "<div class=\"container\">\n" +
"            <div class=\"panel panel-default\">\n" +
"                <div class=\"panel-body\">\n" +
"                    <div class=\"form-group\">\n" +
"                        <div class=\"text-center\">"+ Resultado+"</div>\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>\n" +
"        </div>\n" + "");
        out.close();
    }
}
