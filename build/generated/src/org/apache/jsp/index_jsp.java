package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Entidades.Pelicula;
import java.util.Enumeration;
import java.util.Hashtable;
import Datos.DatosPeliculas;

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

      out.write('\r');
      out.write('\n');
      Entidades.Espectador Espectador = null;
      synchronized (session) {
        Espectador = (Entidades.Espectador) _jspx_page_context.getAttribute("Espectador", PageContext.SESSION_SCOPE);
        if (Espectador == null){
          Espectador = new Entidades.Espectador();
          _jspx_page_context.setAttribute("Espectador", Espectador, PageContext.SESSION_SCOPE);
        }
      }
      out.write(" \r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("Espectador"), "usuario", "", null, null, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    Datos.DatosPeliculas oDatosPeliculas = new DatosPeliculas();
    Hashtable ListaPeliculas = oDatosPeliculas.ListarPeliculas();
    Enumeration ePeliculas = ListaPeliculas.elements();
    HttpSession sesion = request.getSession();
    Object user=sesion.getAttribute("Logueado");
    

      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>Cinema UTN</title>\r\n");
      out.write("\r\n");
      out.write("<link media=\"screen, all\" type=\"text/css\" href=\"css/master.css\" rel=\"stylesheet\"/>\r\n");
      out.write("<link  media=\"screen, all\" type=\"text/css\" href=\"css/skeleton.css?ver=3.4.2\" rel=\"stylesheet\"/>\r\n");
      out.write("<link  media=\"screen, all\" type=\"text/css\" href=\"css/style_window.css\" rel=\"stylesheet\"/>\r\n");
      out.write("<link id=\"googleFonts-css\" media=\"all\" type=\"text/css\" href=\"http://fonts.googleapis.com/css?family=Oswald%3A400%2C+300%2C+700&ver=3.4.2\" rel=\"stylesheet\">\r\n");
      out.write("<link id=\"general-css-css\" media=\"all\" type=\"text/css\" href=\"css/style2.css?ver=3.4.2\" rel=\"stylesheet\"/>\r\n");
      out.write("<link id=\"prettyPhoto-css-css\" media=\"screen, all\" type=\"text/css\" href=\"css/prettyPhoto.css?ver=3.4.2\" rel=\"stylesheet\"/>\r\n");
      out.write("<link id=\"flexslider-css-css\" media=\"screen, all\" type=\"text/css\" href=\"css/flexslider.css?ver=3.4.2\" rel=\"stylesheet\"/>\r\n");
      out.write("<link id=\"color-css-css\" media=\"screen, all\" type=\"text/css\" href=\"css/color.css?ver=3.4.2\" rel=\"stylesheet\"/>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.form.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/plugins/jquery.smartWizard-2.0.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.validate.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/error.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.flexslider-min.js\"></script> \r\n");
      out.write("<script type=\"text/javascript\"  src=\"js/fancy.js\"></script> \r\n");
      out.write("<script type=\"text/javascript\" src=\"js/function_wizard.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/fancyreservas.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"bodychild\">\r\n");
      out.write("  <div id=\"outercontainer\"> \r\n");
      out.write("    \r\n");
      out.write("    <!-- HEADER -->\r\n");
      out.write("    \r\n");
      out.write("    <div id=\"outerheader\">\r\n");
      out.write("      <div class=\"header-bglight\">\r\n");
      out.write("        <header id=\"top\">\r\n");
      out.write("          <div class=\"container\">\r\n");
      out.write("            <div id=\"container-logomenu\" class=\"twelve columns\"> <span class=\"logo-light\"></span>\r\n");
      out.write("              <div id=\"logo\" class=\"three columns alpha\">                \r\n");
      out.write("              </div>\r\n");
      out.write("              <section id=\"navigation\" class=\"nine columns omega\">\r\n");
      out.write("                <nav id=\"nav-wrap\">\r\n");
      out.write("                  <ul id=\"topnav\" class=\"sf-menu\">\r\n");
      out.write("                    <li id=\"menu-item-664\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-664\"><a target=\"_blank\" id=\"userLogueado\"></a></li>\r\n");
      out.write("                    <li id=\"reservas\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-664\" style=\"display:none\"><a target=\"_blank\" id=\"misreservas\" href=\"misreservas.jsp\">Mis reservas</a></li>\r\n");
      out.write("                    <li id=\"login\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-664\"><a target=\"_blank\" id=\"window\" class=\"login\" href=\"login.jsp\">Ingresar</a></li>\r\n");
      out.write("                    <li id=\"registrarme\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-664\"><a target=\"_blank\" id=\"window\" href=\"registrarme.html\">Registrarme</a></li>\r\n");
      out.write("                    <li id=\"\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-664\"><a target=\"_blank\"  href=\"Logout.jsp\" id=\"salir\"></a></li>\r\n");
      out.write("                  </ul>\r\n");
      out.write("                </nav>\r\n");
      out.write("                <!-- nav -->\r\n");
      out.write("                <div class=\"clear\"></div>\r\n");
      out.write("              </section>\r\n");
      out.write("              <div class=\"clear\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </header>\r\n");
      out.write("        <div id=\"headertext\">\r\n");
      out.write("          <div class=\"container\">\r\n");
      out.write("            <div class=\"headertitle\">\r\n");
      out.write("              <h1 class=\"pagetitle\">Bienvenido a Cinema UTN</h1>\r\n");
      out.write("              <span class=\"pagedesc\">Aquí podras reservar de forma on-line tus peliculas preferidas</span> </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("      <!-- SLIDER -->\r\n");
      out.write("      <div id=\"outerslider\">\r\n");
      out.write("        <div id=\"slidercontainer\">\r\n");
      out.write("          <section id=\"slider\">\r\n");
      out.write("            <div id=\"slideritems\" class=\"flexslider\">\r\n");
      out.write("              <ul class=\"slides\">\r\n");
      out.write("                <li><img src=\"images/slide1.jpg\" alt=\"\">\r\n");
      out.write("                  <div class=\"flex-caption\">\r\n");
      out.write("                    <div class=\"slidertext\">\r\n");
      out.write("                      <h1>Making Movie Scene</h1>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li><img src=\"images/slide2.jpg\" alt=\"\">\r\n");
      out.write("                  <div class=\"flex-caption\">\r\n");
      out.write("                    <div class=\"slidertext\">\r\n");
      out.write("                      <h1>A man with crossed legs watching TV</h1>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li><img src=\"images/slide3.jpg\" alt=\"\">\r\n");
      out.write("                  <div class=\"flex-caption\">\r\n");
      out.write("                    <div class=\"slidertext\">\r\n");
      out.write("                      <h1>Bronze Cameraman</h1>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"slidershadow\"></div>\r\n");
      out.write("          </section>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- END SLIDER --> \r\n");
      out.write("      \r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- END HEADER --> \r\n");
      out.write("    \r\n");
      out.write("    <!-- MAIN CONTENT -->\r\n");
      out.write("    <div id=\"outermain\" class=\"inner\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <section id=\"maincontent\" class=\"twelve columns\">\r\n");
      out.write("          <div id=\"post-94\" class=\"post-94 page type-page status-publish hentry\">\r\n");
      out.write("            <div class=\"entry-content\">\r\n");
      out.write("              <div class=\"highlight-content\">\r\n");
      out.write("                <div class=\"highlight-container\">\r\n");
      out.write("                  <h1>Estos son algunas de las peliculas que podrás reservar.</h1>\r\n");
      out.write("                  <p><span>Es la manera más facil de poder ir al cine, solo eliges la pelicula haces clic en reservar , elegis tu lugar y confirmas , y todo listo para disfrutar.</span></p>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"separator\">\r\n");
      out.write("                <div></div>\r\n");
      out.write("              </div>\r\n");
      out.write("              ");
 while (ePeliculas.hasMoreElements())
              {
                    Pelicula aux = (Pelicula) ePeliculas.nextElement();
              
      out.write("\r\n");
      out.write("              <div class=\"boxed-container\">\r\n");
      out.write("                <div class=\"boxed three columns alpha\">\r\n");
      out.write("                  <div class=\"boxed-content\">\r\n");
      out.write("                      <a id=\"trailer\" href=\"trailer.jsp?idvideo=");
      out.print(aux.getIdVideo() );
      out.write("\"> <img height=\"135\" src=\"");
      out.print(aux.getPoster());
      out.write("\" alt=\"\" class=\"imgopacity\"></a>\r\n");
      out.write("                    <h3 class=\"titleUppercase\">");
      out.print(aux.getGenero());
      out.write("</h3>\r\n");
      out.write("                    <div class=\"sep\"><span class=\"sep2\"></span></div>\r\n");
      out.write("                    <p> ");
      out.print(aux.getTitulo());
      out.write(" </p>\r\n");
      out.write("                    <a  id=\"reserva\" href=\"reserva.jsp?id=");
      out.print(aux.getIdPelicula());
      out.write("\" class=\"button\">Reservar</a></div>\r\n");
      out.write("                  <div class=\"shadow-220\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("               ");
}
      out.write("\r\n");
      out.write("         \r\n");
      out.write("            \r\n");
      out.write("           \r\n");
      out.write("              <div class=\"clear\"></div>\r\n");
      out.write("              \r\n");
      out.write("              <div class=\"separator line\">\r\n");
      out.write("                <div></div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- .entry-content --> \r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- #post -->\r\n");
      out.write("          \r\n");
      out.write("          <div id=\"comments\">\r\n");
      out.write("            <p class=\"nocomments\">Comments are closed.</p>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- #comments -->\r\n");
      out.write("          \r\n");
      out.write("          <div class=\"clear\"></div>\r\n");
      out.write("          <!-- clear float --> \r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- maincontent --> \r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- END MAIN CONTENT -->\r\n");
      out.write("    \r\n");
      out.write("    <div id=\"shadowbottom\"></div>\r\n");
      out.write("    \r\n");
      out.write("    <!-- FOOTER SECTION -->\r\n");
      out.write("    <div id=\"footersection\"> \r\n");
      out.write("      \r\n");
      out.write("      <!-- FOOTER SIDEBAR -->\r\n");
      out.write("      <div id=\"outerfootersidebar\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("          <div id=\"footersidebarcontainer\" class=\"twelve columns\">\r\n");
      out.write("            <footer id=\"footersidebar\">\r\n");
      out.write("              <div id=\"footcol1\" class=\"three columns alpha\">\r\n");
      out.write("                <div class=\"widget-area\">\r\n");
      out.write("                  <div class=\"widget-bottom\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                      <li id=\"ts-recent-posts-2\" class=\"widget-container widget_ts_recent_posts\">\r\n");
      out.write("                        <h2 class=\"widget-title\"><span> CSistema Cinema UTN</span></h2>\r\n");
      out.write("                        <ul class=\"ts-recent-post-widget\">\r\n");
      out.write("                          <li>\r\n");
      out.write("                            <h3> <a target=\"_blank\" title=\"Permanent Link to Hello world!\" rel=\"bookmark\" href=\"\">Java </a> </h3>\r\n");
      out.write("                            <span class=\"lp-text\">Sistema realizado en java jsp.</span> <span class=\"clear\"></span> </li>\r\n");
      out.write("                          <li>\r\n");
      out.write("                            <h3> <a target=\"_blank\" title=\"Programación avanzada 2\" rel=\"bookmark\" href=\"\">Programación avanzada 2</a> </h3>\r\n");
      out.write("                            <span class=\"lp-text\">El Sistema esta divido en un backend y en un frontend.</span> <span class=\"clear\"></span> </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                      </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div id=\"footcol2\" class=\"three columns\">\r\n");
      out.write("                <div class=\"widget-area\">\r\n");
      out.write("                  <div class=\"widget-bottom\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                      <li id=\"text-2\" class=\"widget-container widget_text\">\r\n");
      out.write("                        <h2 class=\"widget-title\"><span>walter zalazar</span></h2>\r\n");
      out.write("                        <div class=\"textwidget\">\r\n");
      out.write("                          <ul class=\"sn\">\r\n");
      out.write("                            <li><a target=\"_blank\" href=\"http://www.twitter.com/@wz_developer\"><span class=\"icon-img\" style=\"background-image:url(images/twitter.png)\"></span></a></li>\r\n");
      out.write("                            <li><a target=\"_blank\" href=\"http://www.facebook.com/walterzalazarmdp\"><span class=\"icon-img\" style=\"background-image:url(images/fb.png)\"></span></a></li>\r\n");
      out.write("                            <li><a target=\"_blank\" href=\"https://plus.google.com/u/0/117586809414029959427/posts\"><span class=\"icon-img\" style=\"background-image:url(images/googleplus.png)\"></span></a></li>\r\n");
      out.write("                            <li><a target=\"_blank\" href=\"http://pinterest.com/zalwalter/\"><span class=\"icon-img\" style=\"background-image:url(images/pinterest.png)\"></span></a></li>\r\n");
      out.write("                          </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                      </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div id=\"footcol3\" class=\"three columns\">\r\n");
      out.write("                <div class=\"widget-area\">\r\n");
      out.write("                  <div class=\"widget-bottom\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                      <li id=\"simple-flickr-photos-widget-2\" class=\"widget-container Simple_Flickr_Photos\">\r\n");
      out.write("                        <h2 class=\"widget-title\"><span>nazareno oviedo</span></h2>\r\n");
      out.write("                        <!--simple flickr photos-->\r\n");
      out.write("                        <style type=\"text/css\">\r\n");
      out.write("#flickr {text-align:center;}\r\n");
      out.write("#flickr img {\r\n");
      out.write("display:inline;\r\n");
      out.write("margin:3px;\r\n");
      out.write("padding:1px;\r\n");
      out.write("border:1px solid #ccc;}\r\n");
      out.write("</style>\r\n");
      out.write("                        <div class=\"textwidget\">\r\n");
      out.write("                          <ul class=\"sn\">\r\n");
      out.write("                            <li><a target=\"_blank\" href=\"\"><span class=\"icon-img\" style=\"background-image:url(images/twitter.png)\"></span></a></li>\r\n");
      out.write("                            <li><a target=\"_blank\" href=\"\"><span class=\"icon-img\" style=\"background-image:url(images/fb.png)\"></span></a></li>\r\n");
      out.write("                            <li><a target=\"_blank\" href=\"\"><span class=\"icon-img\" style=\"background-image:url(images/googleplus.png)\"></span></a></li>\r\n");
      out.write("                            <li><a target=\"_blank\" href=\"\"><span class=\"icon-img\" style=\"background-image:url(images/pinterest.png)\"></span></a></li>\r\n");
      out.write("                          </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!--simple flickr photos ends--></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div id=\"footcol4\" class=\"three columns omega\">\r\n");
      out.write("                <div class=\"widget-area\">\r\n");
      out.write("                  <div class=\"widget-bottom\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                      <li id=\"text-3\" class=\"widget-container widget_text\">\r\n");
      out.write("                        <h2 class=\"widget-title\"><span>facundo sirvent</span></h2>\r\n");
      out.write("                        <div class=\"textwidget\">\r\n");
      out.write("                          <ul class=\"sn\">\r\n");
      out.write("                            <li><a target=\"_blank\"  href=\"\"><span class=\"icon-img\" style=\"background-image:url(images/twitter.png)\"></span></a></li>\r\n");
      out.write("                            <li><a target=\"_blank\" href=\"\"><span class=\"icon-img\" style=\"background-image:url(images/fb.png)\"></span></a></li>\r\n");
      out.write("                            <li><a target=\"_blank\" href=\"\"><span class=\"icon-img\" style=\"background-image:url(images/googleplus.png)\"></span></a></li>\r\n");
      out.write("                            <li><a target=\"_blank\" href=\"\"><span class=\"icon-img\" style=\"background-image:url(images/pinterest.png)\"></span></a></li>\r\n");
      out.write("                          </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                      </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"clear\"></div>\r\n");
      out.write("            </footer>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- END FOOTER SIDEBAR --> \r\n");
      out.write("      \r\n");
      out.write("      <!-- FOOTER --> \r\n");
      out.write("      \r\n");
      out.write("      <!-- END FOOTER --> \r\n");
      out.write("      \r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- END FOOTER SECTION --> \r\n");
      out.write("    \r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- end bodychild --> \r\n");
      out.write("</div>\r\n");
      out.write("<!-- end outercontainer --> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Hook Flexslider --> \r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function cargaIndex(){\r\n");
      out.write("$(document).ready(function() {\r\n");
      out.write("    jQuery('.flexslider').flexslider({\r\n");
      out.write("          animation: \"fade\",\r\n");
      out.write("\t\t  animationDuration: 600,\r\n");
      out.write("\t\t  directionNav: false,\r\n");
      out.write("\t\t  controlNav: true        });\r\n");
      out.write("\t\t \r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\t $('#window').fancy();\r\n");
      out.write("         $('#trailer').fancy();\r\n");
      out.write("\t $('#reserva').function_wizard();\r\n");
      out.write("         $('#misreservas').fancyreservas();\r\n");
      out.write("})\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("  $('#salir').click(function(e) {\r\n");
      out.write("    var url = $(this).attr('href');\r\n");
      out.write("    $('#bodychild').load(url);\r\n");
      out.write("    e.preventDefault();\r\n");
      out.write("  })\r\n");
      out.write("});\r\n");
      out.write("}\r\n");
      out.write("cargaIndex();\r\n");
      out.write("\r\n");
      out.write("</script> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
