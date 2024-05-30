package br.iyisakuma.contabancaria.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/saudacao")
public class SaudacaoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("nome");
        String agencia = req.getParameter("agencia");
        String conta = req.getParameter("numero");
        String saldo = req.getParameter("saldo");

        PrintWriter writer = resp.getWriter();
        writer.println("<h1>");
        writer.print("Olá ");
        writer.print(nome);
        writer.print(", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + conta + " e seu saldo "
                + saldo + " já está disponível para saque."
                );
        writer.print("</h1>");
    }
}
