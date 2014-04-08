package tekdays

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(TekEvent)
class TekEventSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "TekEvent domain objects can be created successfully"() {
        when:
        def tekEvent = new TekEvent(name:  'Groovy One', city: 'San Francisco, CA', organiser: 'John Doe',
                venue: 'Moscone Centre', startDate: new Date('01/03/2014'), endDate: new Date('05/03/2014'),
                description: 'This conference will cover...')
        then: 'Groovy One, San Francisco, CA' == tekEvent.toString()
    }
}
