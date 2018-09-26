package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("    <title>...::: Cinema UTN :::...</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" />\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/plugins/jquery-1.7.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/plugins/jquery-ui-1.8.16.custom.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/plugins/jquery.flip.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        $(document).ready(function(){\r\n");
      out.write("            $('.loginform button').hover(function(){\r\n");
      out.write("                $(this).stop().switchClass('default','hover');\r\n");
      out.write("            },function(){\r\n");
      out.write("                $(this).stop().switchClass('hover','default');\r\n");
      out.write("            });\r\n");
      out.write("\t\r\n");
      out.write("            $('#login').submit(function(){\r\n");
      out.write("                var u = jQuery(this).find('#username');\r\n");
      out.write("                if(u.val() == '') {\r\n");
      out.write("                    jQuery('.loginerror').slideDown();\r\n");
      out.write("                    u.focus();\r\n");
      out.write("                    return false;\t\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("\t\r\n");
      out.write("            $('#username').keypress(function(){\r\n");
      out.write("                jQuery('.loginerror').slideUp();\r\n");
      out.write("            });\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        $(function(){\r\n");
      out.write("            $(\"#flipPadingreso a:not(.revert)\").bind(\"click\",function(){\r\n");
      out.write("                var $this = $(this);\r\n");
      out.write("                $(\".ingreso\").flip({\r\n");
      out.write("                    direction: $this.attr(\"rel\"),\r\n");
      out.write("\t\r\n");
      out.write("                    onEnd: function(){$(\".registro\").show();$(\".ingreso\").hide();}\r\n");
      out.write("                })\r\n");
      out.write("\r\n");
      out.write("                return false;\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        $(function(){\r\n");
      out.write("            $(\"#flipPadregistro a:not(.revert)\").bind(\"click\",function(){\r\n");
      out.write("                var $this = $(this);\r\n");
      out.write("                $(\".registro\").flip({\r\n");
      out.write("                    direction: $this.attr(\"rel\"),\r\n");
      out.write("\t\r\n");
      out.write("                    onEnd: function(){$(\".ingreso\").show();$(\".registro\").hide();}\r\n");
      out.write("                })\r\n");
      out.write("                return false;\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        });\r\n");
      out.write("    </script>    \r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"login\">\r\n");
      out.write("    <div>\r\n");
      out.write("        <div style=\"width: 100%;\">            \r\n");
      out.write("            <div style=\"position: relative; margin: auto; width: 400px; height:500px;\">\r\n");
      out.write("                <div class=\"loginbox radius3 ingreso\" style=\"position: absolute; top: 122px; left: -14px;\">\r\n");
      out.write("                    <div class=\"loginboxinner radius3 \">\r\n");
      out.write("                        <div class=\"loginheader\">\r\n");
      out.write("                            <h1 class=\"bebas\">Ingresar</h1>\r\n");
      out.write("                            <div class=\"logo\"></div>\r\n");
      out.write("                        </div><!--loginheader-->\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"loginform\">\r\n");
      out.write("                            <div class=\"loginerror\"><p>Nombre de usuario o password invalido</p></div>\r\n");
      out.write("                            <form method=\"post\" action=\"Procesa.jsp\" id=\"login\">\r\n");
      out.write("                                <p>\r\n");
      out.write("                                    <label class=\"bebas\" for=\"username\">Nombre</label>\r\n");
      out.write("                                    <input class=\"radius2\" name=\"Usuario\" id=\"username\" type=\"text\">\r\n");
      out.write("                                </p>\r\n");
      out.write("                                <p>\r\n");
      out.write("                                    <label class=\"bebas\" for=\"password\">Password</label>\r\n");
      out.write("                                    <input class=\"radius2\" name=\"Password\" id=\"password\" type=\"password\">\r\n");
      out.write("                                </p>\r\n");
      out.write("                                <p>\r\n");
      out.write("                                    <button class=\"radius3 bebas default\" style=\"background-color: steelblue; border-color: #2F2F2F; color: white;\">Comenzar</button>\r\n");
      out.write("                                </p>                               \r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div><!--loginform-->\r\n");
      out.write("                        \r\n");
      out.write("                    </div><!--loginboxinner-->\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"loginbox radius3 registro\" style=\"position:absolute; top:0px; left:0px; display:none;\">\r\n");
      out.write("                    <div class=\"loginboxinner radius3 \">\r\n");
      out.write("                        <div class=\"loginheader\">\r\n");
      out.write("                            <h1 class=\"bebas\">Registracion</h1>\r\n");
      out.write("                            <div class=\"logo\"></div>\r\n");
      out.write("                        </div><!--loginheader-->\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"loginform\">\r\n");
      out.write("                            <div class=\"loginerror\"><p>Nombre de usuario o password invalido</p></div>\r\n");
      out.write("                            <form method=\"post\" action=\"Procesa.jsp\" id=\"login\">\r\n");
      out.write("                                <p>\r\n");
      out.write("                                    <label class=\"bebas\" for=\"username\">Nombre</label>\r\n");
      out.write("                                    <input class=\"radius2\" name=\"Usuario\" id=\"username\" type=\"text\">\r\n");
      out.write("                                </p>\r\n");
      out.write("                                <p>\r\n");
      out.write("                                    <label class=\"bebas\" for=\"password\">Password</label>\r\n");
      out.write("                                    <input class=\"radius2\" name=\"Password\" id=\"password \" type=\"password\">\r\n");
      out.write("                                </p>\r\n");
      out.write("                                <p>\r\n");
      out.write("                                    <button class=\"radius3 bebas default\" style=\"background-color: steelblue; border-color: #2F2F2F; color: white;\">Registrarme</button>\r\n");
      out.write("                                </p>\r\n");
      out.write("                                <p><a class=\"whitelink small\" href=\"\">&nbsp;</a></p>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div><!--loginform-->\r\n");
      out.write("                        <div id=\"flipPadregistro\" style=\"position: absolute; right: 13px; top: 48px;\">\r\n");
      out.write("\r\n");
      out.write("                            <a class=\"bottom\"  rev=\"#CCCCCC\" rel=\"bt\" href=\"#\">Volver al login</a>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div><!--loginboxinner-->\r\n");
      out.write("                </div>\r\n");
      out.write("            </div><!--loginbox-->\r\n");
      out.write("            <pre style=\"margin: auto; padding-top: 82px; text-align: center; clear: both; width:100%;\">Sistema de registración de entradas de cine  -  U.T.N.  -  2012</pre>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>   \r\n");
      out.write("</body>\r\n");
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
