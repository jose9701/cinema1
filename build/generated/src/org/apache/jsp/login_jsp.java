package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("        <title>Documento sin tï¿½tulo</title>\r\n");
      out.write("        <link href=\"css/style_window.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("         <script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\r\n");
      out.write("         <script type=\"text/javascript\" src=\"js/jquery.form.js\"></script>\r\n");
      out.write("         <script type=\"text/javascript\" src=\"js/jquery.validate.min.js\"></script>\r\n");
      out.write("         <script type=\"text/javascript\" src=\"js/error.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <div id=\"popup\" style=\"height:240px !important\"> \r\n");
      out.write("            <div style=\"text-align:center; width:100%;\">\r\n");
      out.write("                <h2><span>Ingresar a Cinema</span></h2>\r\n");
      out.write("            </div>\r\n");
      out.write("             <form action=\"Procesa.jsp\" method=\"post\"  id=\"formLogin\">\r\n");
      out.write("                <p>\r\n");
      out.write("                    <label>Nombre</label>\r\n");
      out.write("                    <span class=\"field\"><input type=\"text\" class=\"longinput required\" id=\"Usuario\" name=\"Usuario\"></span>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <label>Password</label>\r\n");
      out.write("                    <span class=\"field\"><input type=\"password\" class=\"longinput required\" id=\"Password\" name=\"Password\"></span>\r\n");
      out.write("                </p>\r\n");
      out.write("                <br>\r\n");
      out.write("                    <p class=\"stdformbutton\">\r\n");
      out.write("                        <button  class=\"button\">¡Entrar!</button>\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <div id=\"ajaxLogin\"></div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("    <script>\r\n");
      out.write("         $('#formLogin').ajaxForm({\r\n");
      out.write("            target: '#ajaxLogin',\r\n");
      out.write("            success: function() {\r\n");
      out.write("                $('#ajaxLogin').fadeIn('slow');\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
