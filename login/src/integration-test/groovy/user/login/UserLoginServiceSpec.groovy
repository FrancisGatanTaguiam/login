package user.login

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class UserLoginServiceSpec extends Specification {

    UserLoginService userLoginService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new UserLogin(...).save(flush: true, failOnError: true)
        //new UserLogin(...).save(flush: true, failOnError: true)
        //UserLogin userLogin = new UserLogin(...).save(flush: true, failOnError: true)
        //new UserLogin(...).save(flush: true, failOnError: true)
        //new UserLogin(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //userLogin.id
    }

    void "test get"() {
        setupData()

        expect:
        userLoginService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<UserLogin> userLoginList = userLoginService.list(max: 2, offset: 2)

        then:
        userLoginList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        userLoginService.count() == 5
    }

    void "test delete"() {
        Long userLoginId = setupData()

        expect:
        userLoginService.count() == 5

        when:
        userLoginService.delete(userLoginId)
        sessionFactory.currentSession.flush()

        then:
        userLoginService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        UserLogin userLogin = new UserLogin()
        userLoginService.save(userLogin)

        then:
        userLogin.id != null
    }
}
