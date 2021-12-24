package com.example.food.controller;

import com.example.food.entity.Food;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class ListFoodServlet extends HttpServlet {

    public static ArrayList<Food> list = new ArrayList<>();

    {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("list", list);
        req.getRequestDispatcher("/admin/food/list.jsp").forward(req, resp);
    }
}
