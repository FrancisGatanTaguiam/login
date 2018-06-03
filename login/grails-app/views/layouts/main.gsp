<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>

         <asset:stylesheet src="bootstrap.min.css"/>
         <asset:stylesheet src="style.css"/>
    </head>
    <body>
        
        <br>
        <div class="container editContainerInLogin">
            <div class="row">
                <h2 class=""><asset:image src="apple-touch-icon-retina.png" alt="Grails Logo"/></h2>
                <div class="col-lg-12 col-md-12 col-sm-12">
                    <form>
                        
                        <br/>
                        <div class="form-group">
                            <div class="input-group">
                                <span class="input-group-addon">
                                    <span class="glyphicon glyphicon-user"></span>
                                </span>
                                <input type="email" class="form-control" id="username" placeholder="Username">
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="input-group">
                                <span class="input-group-addon">
                                    <span class="glyphicon glyphicon-lock"></span>
                                </span>
                                <input type="password" class="form-control" id="password" placeholder="Password">
                            </div>

                        </div>
                        <br/>
                        <div class="align-center">

                            <button type="submit" class="btn btn-default btnEdit btn-block" id="loginButton">Login</button>
                        </div>
                        <br/>
                    </form>
                </div>
            </div>
        </div>


    <asset:javascript src="jquery-1.12.4.js"/>
    <asset:javascript src="bootstrap.min.js"/>

</body>
</html>