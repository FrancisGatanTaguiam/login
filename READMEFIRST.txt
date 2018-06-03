

//DEFAULT PATH I CREATED
http://localhost:8080/api



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

