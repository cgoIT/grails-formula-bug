package formula.bug

class Person extends WithUuidObject {

    String name

    int projectCount

    static constraints = {
        name nullable: false
    }

    static hasMany = [projectList: Project]

    static mapping = {
        projectList  joinTable: [name: 'person_project', key: 'person_id']
        projectCount formula: '(SELECT prj_cnt FROM person_project_vw WHERE pers_id = id)'
    }

    static transients = ['projectCount']
}
