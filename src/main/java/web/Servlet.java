package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
    
    @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       resp.setContentType("text/html; charset=UTF-8");

       PrintWriter out = resp.getWriter();
   
       String usuario  = req.getParameter("usuario");
       String password = req.getParameter("password");
       String[] tecnologias = req.getParameterValues("tecnologia");
       String genero = req.getParameter("genero");
       String ocupacion = req.getParameter("ocupacion");
       String[] musica = req.getParameterValues("musica");
       String comentario = req.getParameter("comentarios");
       
       out.print("<html>");
       out.print("<head>");
       out.print("<title>Resultado Servlet</title>");
       out.print("</head>");
       out.print("<body>");
       out.print("<h1>Parametros procesador por el Servlet:</h1>");
       out.print("<table border='1'>");
       
       out.print("<tr>");
       out.print("<td>");
       out.print("Usuario");
       out.print("</td>");
       out.print("<td>");
       out.print(usuario);
       out.print("</td>");
       out.print("</tr>");
       
       out.print("<tr>");
       out.print("<td>");
       out.print("Password");
       out.print("</td>");
       out.print("<td>");
       out.print(password);
       out.print("</td>");
       out.print("</tr>");
       
       out.print("<tr>");
       out.print("<td>");
       out.print("Tecnologias");
       out.print("</td>");
       out.print("<td>");
       for(String tecnologia: tecnologias){
         out.print(tecnologia);
         out.print(" - ");
       }
       out.print("</td>");
       out.print("</tr>");
                     
       out.print("<tr>");
       out.print("<td>");
       out.print("Genero");
       out.print("</td>");
       out.print("<td>");
       out.print(genero);
       out.print("</td>");
       out.print("</tr>");
       
       out.print("<tr>");
       out.print("<td>");
       out.print("Ocupacion");
       out.print("</td>");
       out.print("<td>");
       out.print(ocupacion);
       out.print("</td>");
       out.print("</tr>");
       
       out.print("<tr>");
       out.print("<td>");
       out.print("Musica Favorita");
       out.print("</td>");
       out.print("<td>");
       if(musica == null){
           out.print("Valor no Especificado");
       
       }else{
       for(String music: musica){
       out.print(music);
       out.print(" - ");    
       }
       }
       out.print("</td>");
       out.print("</tr>");
       
       out.print("<tr>");
       out.print("<td>");
       out.print("Comentarios");
       out.print("</td>");
       out.print("<td>");
       if(comentario==""){
       out.print(comentario);
       }else{
           out.print("Sin comentarios");
       }
       out.print("</td>");
       out.print("</tr>");       
       
       out.print("</table>");
       out.print("</body>");
       out.print("</html>");
       out.close();
   
   }
   
}
