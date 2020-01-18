<%-- 
    Document   : Reservation
    Created on : Jan 2, 2020, 8:35:48 AM
    Author     : Mustapha Abdelaziz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css"  href="bootstrap.css">
        
        <link rel="stylesheet" type="text/css"  href="Reservation.css">
        <title>Reservation</title>
    </head>
    <body>
        <div class="container">
            <div class="header-text">
                <h1>Reservation</h1>
            </div>
            <p>${NOTIFICATION}</p>	

            <div class="center-container">

                <form>
                    <div class="form-group">
                        <label for="date end" class="text-label">Date Begin</label>
                        <input type="Date" class="form-control date-input"placeholder="Enter Date">
                    </div>
                    
                    <div class="form-group">
                        <label for="date begin" class="text-label">Date End</label>
                        <input type="Date" class="form-control date-input"placeholder="Enter Date">
                    </div>
                    <button type="submit" class="btn btn-primary" id="btn-position">Reserve</button>
                </form>
                <div class="go-back">
                    <a href="index.htm">GO BACK</a>
                </div>

            </div>
        </div>
    </body>
</html>
