package user.login

import grails.gorm.services.Service

@Service(UserLogin)
interface UserLoginService {
    
    UserLogin get(UserLogin id)
    UserLogin get(Serializable id)
    List<UserLogin> list(Map args)
    Long count()
    void delete(Serializable id)
    UserLogin save(UserLogin userLogin)

}