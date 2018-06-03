package user.login

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class UserLoginController {

    UserLoginService userLoginService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
    
    
    def returnUsernameAndPassword(UserLogin userLogin){
        if (userLogin == null) {
            notFound()
            return
        }
        
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'userLogin.label', default: 'UserLogin'), userLogin.id])
                redirect userLogin
            }
            '*' { respond userLogin, [status: CREATED] }
        }
    }
    
    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond userLoginService.list(params), model:[userLoginCount: userLoginService.count()]
    }

    def show(Long id) {
        respond userLoginService.get(id)
    }

    def create() {
        respond new UserLogin(params)
    }

    def save(UserLogin userLogin) {
        if (userLogin == null) {
            notFound()
            return
        }

        try {
            userLoginService.save(userLogin)
        } catch (ValidationException e) {
            respond userLogin.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'userLogin.label', default: 'UserLogin'), userLogin.id])
                redirect userLogin
            }
            '*' { respond userLogin, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond userLoginService.get(id)
    }

    def update(UserLogin userLogin) {
        if (userLogin == null) {
            notFound()
            return
        }

        try {
            userLoginService.save(userLogin)
        } catch (ValidationException e) {
            respond userLogin.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'userLogin.label', default: 'UserLogin'), userLogin.id])
                redirect userLogin
            }
            '*'{ respond userLogin, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        userLoginService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'userLogin.label', default: 'UserLogin'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }
    
    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'userLogin.label', default: 'UserLogin'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
