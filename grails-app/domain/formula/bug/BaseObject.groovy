package formula.bug

abstract class BaseObject {
    Date dateCreated
    Date lastUpdated

    static mapping = {
        tablePerConcreteClass true
        autowire true
    }

    static constraints = {
        dateCreated()
        lastUpdated nullable: true
    }
}
