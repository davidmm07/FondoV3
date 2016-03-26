<%-- 
    Document   : index
    Created on : 24/03/2016, 02:50:23 PM
    Author     : David Morales
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <%@ include file="../WEB-INF/jspf/jscss.jspf"%>
        <title>JSP Page</title>
    </head>
    <body>
       <header>
        <nav class="navbar navbar-inverse navbar-static-top" role="navigation">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navegacion-fm">
                        <span class="sr-only">Desplegar / Ocultar Menu</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a href="" class="navbar-brand">Fondo ACIS</a>
                </div>
                <!-- Inicia Menu -->
                <div class="collapse navbar-collapse" id="navegacion-fm">
                    <ul class="nav navbar-nav navbar-right ">
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button">
                                Bienvenido Administrador <span class="caret"></span>
                            </a>
                            <ul class="dropdown-menu" role="menu">
                                <li><a href="login.jsp">Cerrar Sesion</a></li>
                                
                            </ul>
                        </li>
                        </ul>

                </div>
            </div>
        </nav>
       </header>   
        <div class="header">
            Fondo Asociación Colombiana de Ingenieros de Sistemas
        </div>
        <%@include file ="../WEB-INF/jspf/bottom.jspf" %>
        
        
        
        <script src="/bootstrap/js/bootstrap.js"></script>
    </body>
</html>
