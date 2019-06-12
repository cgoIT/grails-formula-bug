package formula.bug

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class WithUuidObjectSpec extends Specification implements DomainUnitTest<WithUuidObject> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
