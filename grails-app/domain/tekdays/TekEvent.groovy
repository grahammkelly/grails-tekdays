package tekdays

class TekEvent {
    String city
    String name
    String organiser
    String venue
    Date startDate
    Date endDate
    String description

    String toString() {
        "$name, $city"
    }

    static constraints = {
        name()
        city()
        description(maxSize:  5000)
        organiser()
        venue()
        startDate()
        endDate()
    }
}
