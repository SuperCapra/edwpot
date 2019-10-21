package s07;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/s07/timer") //questa annotaion serve per specificare dove mettiamo il file
public class Timer extends HttpServlet {
    private static final long serialVersionUID = 1L; // questa costante deve essere inizializzata, questo è una classe serializzabile, cioè l'oggetto può essere salvato su disco
    	//diciamo che è un meccanismo per mandare via gli oggetti a qualcun'altro
    	//la cosa interessante di servlet è che ha dei metodi interessanti, ad esempio il doGet e il doPost per accettare il post e il get
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html"); //nelle prime due righe specifichiamo il testo è un testo html 
        response.setCharacterEncoding("utf-8"); // e un testo utf-8
        try (PrintWriter writer = response.getWriter()) { //avevamo lo scannere e abbiamo anche il printwriter per scrivere
            writer.println("<!DOCTYPE html><html>");
            writer.println("<head><meta charset=\"utf-8\">");
            writer.println("<title>Hello Servlet</title></head>");
            writer.println("<body>");
            writer.println("<h1>" + LocalTime.now() + "</h1>"); //stiamo creando un file html per stampare il tempo del momento
            writer.println("<a href=\"..\">" + "back home" + "</a>");
            writer.println("</body></html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
