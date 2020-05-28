<%-- 
    Document   : index
    Created on : 28-may-2020, 17:25:28
    Author     : Víctor Gabriel Carvajal Aróstegui
--%>

<%@page import="javax.persistence.EntityTransaction"%>
<%@page import="com.mycompany.basesdedatosconmavenultimo.Casas"%>
<%@page import="java.util.List"%>
<%@page import="com.mycompany.basesdedatosconmavenultimo.Propietarios"%>
<%@page import="javax.persistence.EntityManager"%>
<%@page import="com.mycompany.basesdedatosconmavenultimo.EMHelper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            EMHelper emh = EMHelper.getInstance();
            EntityManager em = emh.getEntityManager();

            List<Propietarios> props
                    = em.createNamedQuery("Propietarios.findAll", Propietarios.class)
                            .getResultList();

            out.print("<ul>");

            for (Propietarios p : props) {
                out.print("<li>");
                out.print("nombre: " + p.getApodo());
                out.print(" " + p.getApellidos());
                out.print(" casas: <br>");
                for (Casas c : p.getCasasCollection()) {
                    out.print("casa: " + c.getCasaid());
                    out.print(" metros: " + c.getCasaid() + "<br>");
                }
                out.print("</li>");
            }

            out.print("</ul>");

            em.close();
            //buscar a las personas llamadas Luis y buscarlas
            //buscar la casa que tiene el id 3

            
            //Crear casa
            Casas casa = new Casas();

            casa.setMetros(230);

            em = emh.getEntityManager();
            EntityTransaction tr = em.getTransaction();

            tr.begin();
            em.persist(casa);
            tr.commit();
        %>
    </body>
</html>
