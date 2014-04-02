import tekdays.TekEvent

class BootStrap {

    def init = { servletContext ->
        def event1 = new TekEvent(name: 'Sample event 1', city: 'Dublin, Ireland', venue: 'TBD', organiser: 'John Doe',
                startDate: new Date('06/12/2014'), endDate: new Date('06/16/2014'), description: 'Some random event')
        saveAndCheckErrors(event1)

        def event2 = new TekEvent(name: 'Sample event 2', city: 'Limerick, Ireland', venue: 'TBD', organiser: 'Jonny Doe',
                startDate: new Date('07/13/2014'), endDate: new Date('07/28/2014'), description: 'Culchie event')
        saveAndCheckErrors(event2)
    }
    def destroy = {
    }

    private def saveAndCheckErrors(TekEvent event) {
        if (! event.save()) {
            event.errors.allErrors.each {errors ->
                println "\"${event.name}\" - An error occurred: ${error}"
            }
        }
    }
}
