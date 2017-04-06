<%-- 
    Document   : paginaPrincipal
    Created on : 31/03/2017, 08:48:13
    Author     : felipetarniowicz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="logina.css" media="all" />	
    </head>
    <body>
        <form action="NewServlet" method="get">
            <div class="div1"> 
                <label for="login"><b>Login:</b></label>
                <input type="text" id="login" size=30 maxlength=30 name="login"/>
            </div>
            <div class="div2">
                <label for="senha"><b>Senha:</b></label>
                <input type="password" id="senha" size=30 maxlength=30 name="login" />
            </div>
            <div>
                <center><button type="submit"> Confirmar </button> </center>
            </div>

        </form>


    </body>
</html>
