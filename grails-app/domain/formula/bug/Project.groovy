package formula.bug

class Project extends WithUuidObject {

    String name

    static constraints = {
        name nullable: false
    }

    static belongsTo = Person

    static hasMany = [personList: Person]

    static mapping = {
        personList  joinTable: [name: 'person_project', key: 'project_id']
    }
}
