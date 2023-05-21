package com.controller;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.dao.RegDAO;
import com.vo.RegVO;
/**
 * Servlet implementation class RegController
 */
@WebServlet("/RegController")
public class RegController extends HttpServlet {
  private static final long serialVersionUID = 1 L;
  /**
   * @see HttpServlet#HttpServlet()
   */
  public RegController() {
    super();
    // TODO Auto-generated constructor stub
  }
  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,
    IOException {
      String flag = request.getParameter("flag");
      if (flag.equals("Search")) {
        Search(request, response);
      }
      if (flag.equals("Delete")) {
        Delete(request, response);
        Search(request, response);
      }
      if (flag.equals("Edit")) {
        Edit(request, response);
      }
      if (flag.equals("Update")) {
        Update(request, response);
        Search(request, response);
      }
    }
  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
  ServletException, IOException {
    String flag = request.getParameter("flag");
    if (flag.equals("Insert")) {
      Insert(request, response);
      response.sendRedirect("form.jsp");
    }
  }
  protected void Insert(HttpServletRequest request, HttpServletResponse response) throws ServletException,
    IOException {
      String fn = request.getParameter("fn");
      String ln = request.getParameter("ln");
      String cn = request.getParameter("cn");
      String add = request.getParameter("add");
      RegVO regVO = new RegVO();
      regVO.setFn(fn);
      regVO.setLn(ln);
      regVO.setCn(cn);
      regVO.setAdd(add);
      RegDAO regDAO = new RegDAO();
      regDAO.Insert(regVO);
    }
  protected void Search(HttpServletRequest request, HttpServletResponse response) throws
  ServletException, IOException {
    RegDAO regDAO = new RegDAO();
    List searchList = regDAO.Search();
    HttpSession session = request.getSession();
    session.setAttribute("data", searchList);
    response.sendRedirect("search.jsp");
  }
  protected void Delete(HttpServletRequest request, HttpServletResponse response) throws ServletException,
    IOException {
      int id = Integer.parseInt(request.getParameter("x"));
      RegVO regVO1 = new RegVO();
      regVO1.setId(id);
      RegDAO regDAO = new RegDAO();
      regDAO.Delete(regVO1);
    }
  protected void Edit(HttpServletRequest request, HttpServletResponse response) throws ServletException,
    IOException {
      int id1 = Integer.parseInt(request.getParameter("y"));
      RegVO regVO2 = new RegVO();
      regVO2.setId(id1);
      RegDAO regDAO = new RegDAO();
      List ls1 = regDAO.Edit(regVO2);
      HttpSession session = request.getSession();
      session.setAttribute("data1", ls1);
      response.sendRedirect("edit.jsp");
    }
  protected void Update(HttpServletRequest request, HttpServletResponse response) throws
  ServletException, IOException {
    int idu = Integer.parseInt(request.getParameter("idupdate"));
    String fn1 = request.getParameter("fn");
    String ln1 = request.getParameter("ln");
    String cn1 = request.getParameter("cn");
    String add1 = request.getParameter("add");
    RegVO regVO3 = new RegVO();
    regVO3.setId(idu);
    regVO3.setFn(fn1);
    regVO3.setLn(ln1);
    regVO3.setCn(cn1);
    regVO3.setAdd(add1);
    RegDAO regDAO = new RegDAO();
    regDAO.Update(regVO3);
  }
}