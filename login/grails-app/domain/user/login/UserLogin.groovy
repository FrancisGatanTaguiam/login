package user.login

import grails.rest.Resource

@Resource(uri = '/userLogin')
class UserLogin {
    
    String username
    String password
    
    static constraints = {
        username();
        password();
    }
    
    static mapping = {
        table 'user_login'
        version false
        
        columns{
            username column: 'username'
            password column: 'password'
        }
    }
}
