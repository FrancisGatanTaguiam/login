

Step 1
  created a folder file in anydirectory: C: -> md grails -> cd grails
Step 2
  then put my file in it called "login"
step 3:  	
  then: cd login
step 4:
  grails run-app

step5:
 test my webservices in postman

//DEFAULT PATH I CREATED
http://localhost:8080/api


***WEBSERVICE*** 

//INSERT
POST -http://localhost:8080/api/userLogin  

{
	"username" : "employee@gmail.com",
	"password" : "employee"
}

//UPDATE
http://localhost:8080/api/userLogin/1

{
	"username" : "employee@gmail.com",
	"password" : "passwordupdated"
}

//GET AND FETCH BY ID
http://localhost:8080/api/userLogin/2


//POST
http://localhost:8080/api/userLogin/returnUsernameAndPassword
{
	"username" : "employee@gmail.com",
	"password" : "employee"
}

