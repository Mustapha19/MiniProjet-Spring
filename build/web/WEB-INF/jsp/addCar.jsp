<%-- 
    Document   : addCar
    Created on : Jan 2, 2020, 11:09:33 AM
    Author     : Mustapha Abdelaziz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css"  href="bootstrap.css">
        
        <link rel="stylesheet" type="text/css"  href="addCar.css">
        <title>Reservation</title>
    </head>
    <body>
        <div class="container">
            <div class="header-text">
                <h1>ADD CAR</h1>
            </div>
            <p>${NOTIFICATION}</p>	

            <div class="center-container border-container">

                <form method="POST">				
                    <div class = "form-group our-form">
                        <input type = "text" class = "form-control" autofocus name = "brand" placeholder = "Brand" />
                    </div>			
                    <div class = "form-group our-form">
                        <input type = "text" class = "form-control" name = "color" placeholder = "color" />
                    </div>			
                    <div class = "form-group our-form">
                        <label class="text-label">Carbural</label>
                        <select class="form-control" id="exampleFormControlSelect1" name="carbural">
                            <option selected value="Essence">Essence</option>
                            <option value="Mazout">Mazout</option>
                        </select>
                    </div>	
                    <div class="form-group our-form">
                        <input type = "number" class = "form-control" name = "KM" placeholder = "Kilométrage" required/>
                    </div>	
                    <div class="form-group our-form">
                        <input type = "number" class = "form-control" name = "price" placeholder = "price" required/>
                    </div>		
                   
                    <div class="form-group our-form">
                        <label class="text-label" >State</label>
                        <select class="form-control" id="exampleFormControlSelect1" name="state">
                            <option selected value="Available">Available</option>
                            <option value="Unavailable">Unavailable</option>
                        </select>
                    </div>
                   
                    <div class="form-group our-form">
                        <input type = "text" class = "form-control" name = "pictureURL" placeholder = "Picture URL " required/>
                    </div>

                    <button type = "submit" class = "btn btn-primary" id="btn-position">Publish car</button>
                </form>   
                <div>
                    <a href="index.htm">Go back</a>
                </div>
            </div>
        </div>
    </body>
</html>
