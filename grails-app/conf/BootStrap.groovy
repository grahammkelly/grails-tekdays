import tekdays.TekEvent

class BootStrap {

    def init = { servletContext ->
        def event1 = new TekEvent(name: 'Sample event 1 - Gateway Code Camp', city: 'Dublin, Ireland', venue: 'TBD',
                organiser: 'John Doe', startDate: new Date('06/12/2014'), endDate: new Date('06/16/2014'),
                description: '''Some random event.

                                This conference will bring coders from across
                                platforms, languages, and industries together
                                for an exciting few days of tips, tricks, and
                                tech!

                                Stay Sharp! Stay at the top[ of your game! But
                                don't stay at home!

                                Join us for the first annual Gateway Code Camp.'''
        )
        saveAndCheckErrors(event1)

        def event2 = new TekEvent(name: 'Sample event 2 - Perl before Swine', city: 'Limerick, Ireland', venue: 'TBD',
                organiser: 'Jonny Doe', startDate: new Date('07/13/2014'), endDate: new Date('07/28/2014'),
                description: '''Culchie event.

                                Join the Perl programmers of Pork Producers of Ireland, as we
                                hone our skills and ham it up a bit.

                                You can show off your programming chops, while trying to win
                                a years supply of pork chops, in our programming challenge.

                                Come and join us in the historic (and aromatic) city of
                                Limerick. You'll know when you're there!''')
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
