package user.login

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class ZipCodeServiceSpec extends Specification {

    ZipCodeService zipCodeService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new ZipCode(...).save(flush: true, failOnError: true)
        //new ZipCode(...).save(flush: true, failOnError: true)
        //ZipCode zipCode = new ZipCode(...).save(flush: true, failOnError: true)
        //new ZipCode(...).save(flush: true, failOnError: true)
        //new ZipCode(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //zipCode.id
    }

    void "test get"() {
        setupData()

        expect:
        zipCodeService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<ZipCode> zipCodeList = zipCodeService.list(max: 2, offset: 2)

        then:
        zipCodeList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        zipCodeService.count() == 5
    }

    void "test delete"() {
        Long zipCodeId = setupData()

        expect:
        zipCodeService.count() == 5

        when:
        zipCodeService.delete(zipCodeId)
        sessionFactory.currentSession.flush()

        then:
        zipCodeService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        ZipCode zipCode = new ZipCode()
        zipCodeService.save(zipCode)

        then:
        zipCode.id != null
    }
}
