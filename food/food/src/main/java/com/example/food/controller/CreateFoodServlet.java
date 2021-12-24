package com.example.food.controller;

import com.example.food.entity.Food;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CreateFoodServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/admin/food/form.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            int id = Integer.parseInt(req.getParameter("id"));
            String name = req.getParameter("name");
            String idname = req.getParameter("idname");
            String description = req.getParameter("description");
            String thumbnail = req.getParameter("thumbnail");
            int price = Integer.parseInt(req.getParameter("price"));
            String selldate = req.getParameter("selldate");
            String editdate = req.getParameter("editdate");
            String status = req.getParameter("status");
            Food food = new Food(name, idname, description, thumbnail, price, selldate, editdate, status);
            ListFoodServlet.list.add(food);
            resp.sendRedirect("/admin/food/list");
        } catch (Exception ex) {
            resp.getWriter().println("Bad request");
        }
    }
}
