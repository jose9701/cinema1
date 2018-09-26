<%@page import="Entidades.Espectador"%>
<%@page import="Datos.DatosEspectadores"%>
<%@page import="Entidades.Reserva"%>
<%@page import="Datos.DatosReservas"%>
<%@page import="Entidades.Funcion"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>
<%@include file="Validacion.jsp" %>


<jsp:useBean id="oReserva" class="Entidades.Reserva" scope="page"/>

<%-- 
    Document   : newjsp
    Created on : 14/09/2018, 09:35:26 AM
    Author     : josea
--%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ELIMINAR RESERVAR</title>
        <link href="css/style_window.css" rel="stylesheet" type="text/css"/>
<link media="screen, all" type="text/css" href="css/master.css" rel="stylesheet"/>
<link  media="screen, all" type="text/css" href="css/skeleton.css?ver=3.4.2" rel="stylesheet"/>
<link  media="screen, all" type="text/css" href="css/style_window.css" rel="stylesheet"/>
<link id="googleFonts-css" media="all" type="text/css" href="http://fonts.googleapis.com/css?family=Oswald%3A400%2C+300%2C+700&ver=3.4.2" rel="stylesheet">
<link id="general-css-css" media="all" type="text/css" href="css/style2.css?ver=3.4.2" rel="stylesheet"/>
<link id="prettyPhoto-css-css" media="screen, all" type="text/css" href="css/prettyPhoto.css?ver=3.4.2" rel="stylesheet"/>
<link id="flexslider-css-css" media="screen, all" type="text/css" href="css/flexslider.css?ver=3.4.2" rel="stylesheet"/>
<link id="color-css-css" media="screen, all" type="text/css" href="css/color.css?ver=3.4.2" rel="stylesheet"/>

<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.form.js" type="text/javascript"></script>
<script type="text/javascript" src="js/plugins/jquery.smartWizard-2.0.min.js"></script>
<script type="text/javascript" src="js/jquery.validate.min.js"></script>
<script type="text/javascript" src="js/error.js"></script>
<script type="text/javascript" src="js/jquery.flexslider-min.js"></script> 
<script type="text/javascript"  src="js/fancy.js"></script> 
<script type="text/javascript" src="js/function_wizard.js"></script>
<script type="text/javascript" src="js/fancyreservas.js"></script>
    </head>
    <body>
        <a href="javascript:window.history.back();"> SE ELIMINO LA RESERVA</a>
        
        <%!
            DatosReservas oDatosEspectador;
            Espectador aux = null;
        %>
        <%    oDatosEspectador = new DatosReservas();
            try {

                oDatosEspectador.EliminarReserva(Integer.parseInt(request.getParameter("select")));

            } catch (Exception e) {
            }
        %>
    </body>
</html>
