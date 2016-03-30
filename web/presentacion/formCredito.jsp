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
        <title>Registro del Credito</title>
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
                <div class="col-xs-12"><h2>Aprobar Credito</h2></div>
            </div>
            <br/><br/>

            <form class="form-horizontal" action="../Credito" method="POST">

                <div class="form-group">
                    <label class="col-sm-2 control-label" for="formGroup">Tasa de interes</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="text" id="formGroup" placeholder="%0-%99.9" name="tsinteres">
                    </div>
                </div>
                              
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="formGroup">Valor Prestado</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="text" id="formGroup" placeholder="$" name="vprestado">
                    </div>
                </div>
                <!-- El saldo pendiente es automatico?-->
                
                
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="formGroup">Modalidad de Credito</label>
                    <div class="col-sm-4">
                        <select class="form-control" id="mCredito" name="mCredito">
                            <option value="ESTUDIO">Estudio</option>
                            <option value="CAPITAL DE TRABAJO">Capital de Trabajo</option>
                            <option value="LIBRE INVERSION">Libre Inversión</option>
                        </select>
                    </div>
                </div>
                
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="formGroup">Cedula del Asociado</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="text" id="formGroup" placeholder="" name="cedula">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="formGroup">Cuenta del Asociado</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="text" id="formGroup" name="cuenta">
                    </div>
                </div>
                
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="formGroup"></label>
                    <div class="col-sm-4">

                        <button type="submit" class="btn btn-success btn-lg"><span class="glyphicon glyphicon-floppy-saved"></span> Guardar</button>
                        <a href="" class="btn btn-danger btn-lg" role="button"><span class="glyphicon glyphicon-remove-circle"></span> Cancelar</a>
                        


                    </div>
                </div>



            </form>	



        </div>	






        <%@include file ="../WEB-INF/jspf/bottom.jspf" %>


        <script src="/bootstrap/js/bootstrap.js"></script>
    </body>
</html>
