<%-- 
    Document   : index
    Created on : 24/03/2016, 02:50:23 PM
    Author     : David Morales
--%>

<%@page import="negocio.Administrador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="negocio.Fondo" %>
<jsp:useBean id="list" scope="session" class="java.util.ArrayList"/>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <%@ include file="../WEB-INF/jspf/jscss.jspf"%>
        <title>Consulta de Socios</title>
        <style>
            #tel{
                margin-right:16px;	
            }
        </style>
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
                        <a href="Usuario.jsp" class="navbar-brand">Fondo ACIS</a>
                    </div>
                    <div class="collapse navbar-collapse" id="navegacion-fm">
                        <ul class="nav navbar-nav">
                            <li class="dropdown"> 
                                <a href="" class="dropdown-toggle" data-toggle="dropdown" role="button">
                                    Asociados <span class="caret"></span>
                                </a>
                                <ul class="dropdown-menu" role="menu">
                                    <li class="divider"></li>
                                    <li><a href="formSocio.jsp">Registrar Asociado</a></li>
                                    <li><a href="consultaSocio.jsp">Consultar Asociado</a></li>
                                </ul>
                            </li>
                            <%@include file ="../WEB-INF/jspf/Mov.jspf" %>
                            <%@include file ="../WEB-INF/jspf/Credito.jspf" %>
                        </ul>
                        <ul class="nav navbar-nav navbar-right ">
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button">
                                    Bienvenido Administrador <span class="caret"></span>
                                </a>
                                <ul class="dropdown-menu" role="menu">
                                    <li class="divider"></li>
                                    <li><a href="#">Consultar mi cuenta</a></li>
                                    <li>
                                        <form action="../GestionUsuarios" method="GET">
                                            <a href="#" style="text-decoration:none;color:black;" onclick="$(this).closest('form').submit()">Cerrar Sesión</a>
                                        </form>
                                    </li>

                                </ul>
                            </li>
                        </ul>

                    </div>
                </div>
            </nav>
        </header>
        <div class=" container well"> 
            <div class="row">
                <div class="col-xs-12"><h2>Consultar Asociado</h2></div>
            </div>
            <br/><br/>

            <form action="<%=request.getContextPath()%>/Fondo" class="col-xs-6" class="navbar-form " role="search" method="post">
                <div class="col-xs-6" class="form-group"  >
                    <input type="text" class="form-control" placeholder="Buscar por Nombre o Cedula" name="id_socio">
                </div>
                <input type="submit" class="btn btn-primary" role="button">
                    
            </form>	
            <br/><br/>
            <br/><br/>
            <div>
            <table class="table table-striped">
                <tr>
                    <th>ID SOCIO</th>
                    <th>Nombre </th>
                    <th>Apellido</th>
                    <th>NoTarjeta</th>
                    <th>Email</th>
                    <th>Fecha Ingreso</th>
                </tr>
                
                <% for(int i=0; i<list.size();i++){ 
                    Administrador admin= new Administrador();
                    admin=(Administrador)list.get(i);
                %>
                    <tr>
                    <th><%= admin.getSocio().getK_idSocio() %></th>
                    <th><%= admin.getSocio().getN_nomSocio() %></th>
                    <th><%= admin.getSocio().getN_apeSocio() %></th>
                    <th><%= admin.getSocio().getN_tarjProfesional() %></th>
                    <th><%= admin.getSocio().getO_email() %></th>
                    <th><%= admin.getSocio().getF_ingreso() %></th>
                    
                </tr>
                <% }%>
                
                
            </table>
                </div>



        </div>	






        <%@include file ="../WEB-INF/jspf/bottom.jspf" %>


        <script src="/bootstrap/js/bootstrap.js"></script>
    </body>
</html>
