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
        <title>Registrar Movimiento</title>
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
                                    <li><a href="login.jsp">Cerrar Sesion</a></li>

                                </ul>
                            </li>
                        </ul>

                    </div>
                </div>
            </nav>
        </header>
        <div class=" container well"> 
            <div class="row">
                <div class="col-xs-12"><h2>Registrar Aporte</h2></div>
            </div>
            <br/><br/>

            <form class="form-horizontal" action="../Movimiento" method="POST">

                <div class="form-group">
                    <label class="col-sm-2 control-label" for="formGroup">Tipo de Movimiento</label>
                    <div class="col-sm-4">
                        <select class="form-control" id="tipoMov" name="tipoMov">
                            <option value="APORTE">Aporte</option>
                            <option value="CUOTA DE CREDITO">Cuota</option>
                        </select>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="formGroup">Valor</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="text" id="formGroup" placeholder="$" name="valor">
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label" for="formGroup">Medio de Pago</label>
                    <div class="col-sm-4">
                        <select class="form-control" id="medioPago" name="medioPago">
                            <option value="CHEQUE">Cheque</option>
                            <option value="EFECTIVO">Efectivo</option>
                        </select>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="formGroup">Cuenta del Socio</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="text" id="formGroup" placeholder="3456" name="ctaSocio" >
                    </div>
                </div>
                
                
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="formGroup"></label>
                    <div class="col-sm-4">

                        <input type="submit" class="btn btn-success " placeholder="Guardar">
                        <a href="" class="btn btn-danger btn-lg" role="button"><span class="glyphicon glyphicon-remove-circle"></span> Cancelar</a>
                        


                    </div>
                </div>



            </form>	



        </div>	






        <%@include file ="../WEB-INF/jspf/bottom.jspf" %>


        <script src="/bootstrap/js/bootstrap.js"></script>
    </body>
</html>
