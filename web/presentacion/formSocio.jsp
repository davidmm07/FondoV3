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
        <title>Nuevo Socio</title>
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
                                    <form action="../GestionUsuarios" method="GET">
                                        <a href="#" style="text-decoration:none;color:black;" onclick="$(this).closest('form').submit()">Cerrar Sesión</a>
                                    </form>
                                </ul>
                            </li>
                        </ul>

                    </div>
                </div>
            </nav>
        </header>
        <div class=" container well"> 
            <div class="row">
                <div class="col-xs-12"><h2>Registrar Asociado</h2></div>
            </div>
            <br/><br/>

            <form class="form-horizontal" action="../Fondo" method="POST">

                <div class="form-group">
                    <label class="col-sm-2 control-label" id="formGroup" >Cedula</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="text" id="formGroup" placeholder="1073696045" name="cedula">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label" id="formGroup">Nombre</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="text" id="formGroup" placeholder="" name="nombre">
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label" id="formGroup">Apellidos</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="text" id="formGroup" name="apellidos">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label" id="formGroup">Ocupación</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="text" id="formGroup" name="ocupacion">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="formGroup">Tarjeta Profesional</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="text" id="formGroup" name="tarjeta">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="formGroup">Estado Civil</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="text" id="formGroup" name="ecivil">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="formGroup">Sexo</label>
                    <div class="col-sm-4">
                        <select class="form-control" id="sexo" name="sexo">
                            <option value="M">Masculino</option>
                            <option value="F">Femenino</option>
                        </select>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="formGroup">Dirección de Domicilio</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="text" id="formGroup" name="dirDomic">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="formGroup">Dirección Laboral</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="text" id="formGroup" name="dirJob">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="formGroup" id="tel">Correo electrónico</label>
                    <div class="input-group col-sm-3">
                        <span class="input-group-addon">@</span>
                        <input class="form-control" type="text" id="formGroup" name="correo">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="formGroup" id="tel">Teléfono Residencia</label>

                    <div class="input-group col-sm-3">
                        <span class="input-group-addon"><span class="glyphicon glyphicon-phone"></span></span>
                        <input class="form-control" type="text" id="formGroup" name="telDomic">

                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="formGroup" id="tel">Tel_Trabajo</label>

                    <div class="input-group col-sm-3">
                        <span class="input-group-addon"><span class="glyphicon glyphicon-phone"></span></span>
                        <input class="form-control" type="text" id="formGroup" name="telJob">

                    </div>
                </div>
                <!--Fecha de Ingreso -->             
                <!--Estado de Cuenta-->

                <br />

                <div class="form-group">
                    <label class="col-sm-2 control-label" for="formGroup"></label>
                    <div class="col-sm-4">

                        <input type="submit" class="btn btn-success btn-lg" >
                        <a href="" class="btn btn-danger btn-lg" role="button"><span class="glyphicon glyphicon-remove-circle"></span> Cancelar</a>


                    </div>
                </div>
            </form>





        </div>	






        <%@include file ="../WEB-INF/jspf/bottom.jspf" %>



    </body>
</html>
