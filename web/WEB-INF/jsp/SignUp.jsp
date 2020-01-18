<%-- 
    Document   : SignUp
    Created on : Dec 30, 2019, 12:55:28 PM
    Author     : Mustapha Abdelaziz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css"  href="bootstrap.css">
        <link rel="stylesheet" type="text/css"  href="SignUp.css">


        <title>Sign Up</title>
    </head>
    <body>
        <div class="header-text">
            <h1>Sign Up</h1>
            <h3>OR</h3>
            <div>
                <h2><a href="SignIn.htm">Login</a></h2>
            </div>

        </div>



        <div class="center-container border-container">

            <form action = "register" method="POST">				
                <div class = "form-group our-form">
                    <input type = "text" class = "form-control" autofocus name = "first-name" placeholder = "First Name" />
                </div>			
                <div class = "form-group our-form">
                    <input type = "text" class = "form-control" name = "last-name" placeholder = "Last Name" />
                </div>			
                <div class = "form-group our-form">
                    <input type = "date" class = "form-control" name = "date-birth"/>
                </div>	
                <div class="form-group our-form">
                    <input type = "text" class = "form-control" name = "solde" placeholder = "Solde" required/>
                </div>	
                <div class="form-group our-form">
                    <input type = "text" class = "form-control" name = "phone" placeholder = "Phone" required/>
                </div>		
                <div class="form-group our-form">
                    <input type = "email" class = "form-control" name = "email" placeholder = "Email" required/>
                </div>
                <div class="form-group our-form">
                    <input type = "password" class = "form-control" name = "password" placeholder = "Password" required/>
                </div>

                <button type = "submit" class = "btn btn-primary" id="btn-position">Sign up</button>
            </form>   
        </div>

    </body>
</html>
