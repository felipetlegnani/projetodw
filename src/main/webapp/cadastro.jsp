<%-- 
    Document   : cadastro
    Created on : 26/04/2017, 16:24:37
    Author     : felipetarniowicz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="NewServlet" method="post">
            <div class="div1"> 
                <label for="login"><b>Nome:</b></label>
                <input type="text" id="nome" size=30 maxlength=30 name="nome"/>
            </div>
            <div class="div2">
                <label for="senha"><b>Senha:</b></label>
                <input type="password" id="senha" size=30 maxlength=30 name="senha" />
            </div>
            <div>
                <label for="email"> <b> Email: </b> </label>
                <input type="email" id="email" size="30" maxlegth="30" name="email" />
            </div>
            <div>
                <center><button type="submit"> Confirmar </button> </center>
            </div>

        </form>
    </body>
</html>
