<%-- 
    Document   : index
    Created on : 24/03/2016, 02:50:23 PM
    Author     : David Morales
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <title>JSP Page</title>
        <%@ include file="../WEB-INF/jspf/jscss.jspf"%>
        
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
                    <a href="index.jsp" class="navbar-brand">Fondo ACIS</a>
                </div>
                <!-- Inicia Menu -->
                <div class="collapse navbar-collapse" id="navegacion-fm">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="#">Iniciar Sesión</a></li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button">
                                Categorias <span class="caret"></span>
                            </a>
                            <ul class="dropdown-menu" role="menu">
                                <li><a href="#">Categoria #1</a></li>
                                <li class="divider"></li>
                                <li><a href="#">Categoria #2</a></li>
                                <li><a href="#">Categoria #3</a></li>
                                <li><a href="#">Categoria #4</a></li>
                            </ul>
                        </li>
                        
                    </ul>

                    <form action="" class="navbar-form navbar-right" role="search">
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="buscar">
                        </div>
                        <button type="submit" class="btn btn-primary">
                            <span class="glyphicon glyphicon-search"></span>
                        </button>
                    </form>
                </div>
            </div>
        </nav>
       </header>     
        <div class="header">
            Fondo Asociación Colombiana de Ingenieros de Sistemas
        </div>
        <div class="container well" id="sha">
            <form class="login" action="Usuario.jsp" method="POST">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Cedula" name="Cedula" required autofocus>
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" placeholder="Contraseña" name="pass" required >
                </div>
                <button class="btn btn-lg btn-primary btn-block " type="Submit" >Entrar al Sistema</button>
            </form>
        </div>

        <%@include file ="../WEB-INF/jspf/bottom.jspf" %>
        <script src="/bootstrap/js/bootstrap.js"></script>

    </body>
</html>
