package com.ssm.framework.team1.controller;

import java.io.IOException;
import java.util.ArrayList;

import com.ssm.framework.team1.dao.DataManager;
import com.ssm.framework.team1.dao.ShoutDTO;
import com.ssm.framework.team1.dao.UserDTO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	// 直接アクセスがあった場合は index.jsp に処理を転送

	protected void doGet(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("indexx.html");

		dispatcher.forward(request, response);

	}

	// index.jsp の「ログイン」ボタンから呼び出される

	protected void doPost(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {

		// 送信情報の取得

		String loginId = request.getParameter("loginId");

		String password = request.getParameter("password");

		RequestDispatcher dispatcher = null;

		String message = null;

		if (loginId.equals("") || password.equals("")) {

			// ログインID かパスワードどちらか、もしくは双方未入力なら

			message = "ログインIDとパスワードは必須入力です";

			// エラーメッセージをリクエストオブジェクトに保存

			request.setAttribute("alert", message);

			// index.jsp に処理を転送

			dispatcher = request.getRequestDispatcher("indexx.jsp");

			dispatcher.forward(request, response);

		} else {

			// ログイン認証を行い、ユーザ情報を取得

			DataManager dbm = new DataManager();

			UserDTO user = dbm.getLoginUser(loginId, password);

			if (user != null) {

				// ユーザ情報を取得できたら、書き込み内容リストを取得

				ArrayList<ShoutDTO> list = dbm.getShoutList();

				HttpSession session = request.getSession();

				// ログインユーザ情報、書き込み内容リストとしてセッションに保存

				session.setAttribute("user", user);

				session.setAttribute("shouts", list);

				// 処理の転送先を top.jsp に指定

				dispatcher = request.getRequestDispatcher("top.jsp");

			} else {

				// ユーザ情報が取得できない場合

				// エラーメッセージをリクエストオブジェクトに保存

				message = "ログインIDまたはパスワードが違います";

				request.setAttribute("alert", message);

				// 処理の転送先を index.jsp に指定

				dispatcher = request.getRequestDispatcher("index.jsp");

				System.out.println("false");

			}

			// 処理を転送

			dispatcher.forward(request, response);

		}

	}

}