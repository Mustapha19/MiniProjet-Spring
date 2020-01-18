<%-- 
    Document   : updateCar
    Created on : Jan 2, 2020, 2:45:59 PM
    Author     : Mustapha Abdelaziz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <link rel="stylesheet" type="text/css"  href="bootstrap.css">
        
        <link rel="stylesheet" type="text/css"  href="addCar.css">
        <title>Update car</title>
    </head>
    <body>
       <div class="container">
            <div class="header-text">
                <h1>Update CAR</h1>
            </div>
            

            <div class="center-container border-container">

                <form action method="POST">				
                    <div class = "form-group our-form">
                        <input type = "text" class = "form-control" autofocus name = "brand" placeholder = "Brand" value="${lista[0].brand}"/>
                    </div>			
                    <div class = "form-group our-form">
                        <input type = "text" class = "form-control" name = "color" placeholder = "color" value="${lista[0].color}"/>
                    </div>			
                    <div class = "form-group our-form">
                        <label class="text-label">Carbural</label>
                        <select class="form-control" id="exampleFormControlSelect1" name="carbural">
                           <option selected value="Essence">Essence</option>
                            <option value="Mazout">Mazout</option>
                        </select>
                    </div>	
                    <div class="form-group our-form">
                        <input type = "number" class = "form-control" name = "KM" placeholder = "Kilométrage" required value="${lista[0].KM}"/>
                    </div>	
                    <div class="form-group our-form">
                        <input type = "number" class = "form-control" name = "price" placeholder = "price" required value="${lista[0].price}"/>
                    </div>		
                   
                    <div class="form-group our-form">
                        <label class="text-label" >State</label>
                        <select class="form-control" id="exampleFormControlSelect1" name="state">
                            <option selected value="Available">Available</option>
                            <option value="Unavailable">Unavailable</option>
                        </select>
                    </div>

                    <button type = "submit" class = "btn btn-primary" id="btn-position">UPDATE</button>
                </form>   
                <div>
                    <a href="index.htm">Go back</a>
                </div>
            </div>
        </div>
    </body>
</html>
