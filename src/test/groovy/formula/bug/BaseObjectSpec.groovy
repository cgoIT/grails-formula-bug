package formula.bug

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class BaseObjectSpec extends Specification implements DomainUnitTest<BaseObject> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
