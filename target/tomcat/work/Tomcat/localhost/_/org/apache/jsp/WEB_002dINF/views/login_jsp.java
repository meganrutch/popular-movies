/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-09-15 02:49:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Flickr Movie Website</title>\n");
      out.write("</head>\n");
      out.write("<style>\n");
      out.write("#movieBox {\n");
      out.write("\tfloat: left\n");
      out.write("}\n");
      out.write("\n");
      out.write("#movieBox #popup {\n");
      out.write("\tdisplay: none;\n");
      out.write("\tposition: absolute;\n");
      out.write("\twidth: 200px;\n");
      out.write("\tbackground-color: grey;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#movieBox:hover #popup {\n");
      out.write("\tdisplay: block;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write("\t<header> Popular Movie Page </header>\n");
      out.write("\n");
      out.write("\t<figure id=\"movieBox\">\n");
      out.write("\t\t<img\n");
      out.write("\t\t\tsrc=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSqS6A3xRyIZxUzlChgAGLWjRXehBONy5rKAEbJMi-3KetNl1kS-Zogd3HTa4oQoa0SKok&usqp=CAU\"\n");
      out.write("\t\t\tstyle=\"width: 200px; height: 200px; border: 2px solid #000; background-color: blue\">\n");
      out.write("\t\t<figcaption>\n");
      out.write("\t\t\t<center>Toy Story Movie</center>\n");
      out.write("\t\t</figcaption>\n");
      out.write("\t\t<div id=\"popup\">This is movie descripton popup</div>\n");
      out.write("\t</figure>\n");
      out.write("\t<figure id=\"movieBox\">\n");
      out.write("\t\t<img src=\"https://m.media-amazon.com/images/I/6198vp6P7nL._SY445_.jpg\"\n");
      out.write("\t\t\tstyle=\"width: 200px; height: 200px; border: 2px solid #000; background-color: blue\">\n");
      out.write("\t\t<figcaption>\n");
      out.write("\t\t\t<center>The Goonies</center>\n");
      out.write("\t\t</figcaption>\n");
      out.write("\t\t<div id=\"popup\">This is movie descripton popup</div>\n");
      out.write("\t</figure>\n");
      out.write("\t<figure id=\"movieBox\">\n");
      out.write("\t\t<img\n");
      out.write("\t\t\tsrc=\"https://m.media-amazon.com/images/M/MV5BZDhlYjk1YzQtZjA2NC00N2E4LTgxMjAtYzFhYWNhNjRlNzBmXkEyXkFqcGdeQXVyNjQ2MjQ5NzM@._V1_.jpg\"\n");
      out.write("\t\t\tstyle=\"width: 200px; height: 200px; border: 2px solid #000; background-color: blue\">\n");
      out.write("\t\t<figcaption>\n");
      out.write("\t\t\t<center>Gnomeo and Juliet</center>\n");
      out.write("\t\t</figcaption>\n");
      out.write("\t\t<div id=\"popup\">This is movie descripton popup</div>\n");
      out.write("\t</figure>\n");
      out.write("\t<figure id=\"movieBox\">\n");
      out.write("\t\t<img\n");
      out.write("\t\t\tsrc=\"https://m.media-amazon.com/images/M/MV5BM2MyNjYxNmUtYTAwNi00MTYxLWJmNWYtYzZlODY3ZTk3OTFlXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_.jpg\"\n");
      out.write("\t\t\tstyle=\"width: 200px; height: 200px; border: 2px solid #000; background-color: blue\">\n");
      out.write("\t\t<figcaption>\n");
      out.write("\t\t\t<center>The Godfather</center>\n");
      out.write("\t\t</figcaption>\n");
      out.write("\t\t<div id=\"popup\">This is movie descripton popup</div>\n");
      out.write("\t</figure>\n");
      out.write("\t<figure id=\"movieBox\">\n");
      out.write("\t\t<img\n");
      out.write("\t\t\tsrc=\"https://m.media-amazon.com/images/M/MV5BM2MyNjYxNmUtYTAwNi00MTYxLWJmNWYtYzZlODY3ZTk3OTFlXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_.jpg\"\n");
      out.write("\t\t\tstyle=\"width: 200px; height: 200px; border: 2px solid #000; background-color: blue\">\n");
      out.write("\t\t<figcaption>\n");
      out.write("\t\t\t<center>The Godfather</center>\n");
      out.write("\t\t</figcaption>\n");
      out.write("\t\t<div id=\"popup\">This is movie descripton popup</div>\n");
      out.write("\t</figure>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
