package formula.bug

import groovy.sql.Sql

class BootStrap {

    def dataSource

    def init = { servletContext ->
        createSqlViews()

        def projects = [
                new Project(name: 'Project 1'),
                new Project(name: 'Project 2'),
                new Project(name: 'Project 3'),
                new Project(name: 'Project 4'),
                new Project(name: 'Project 5'),
                new Project(name: 'Project 6'),
        ]

        projects.each {
            it.save(failOnError: true)
        }

        def persons = [
                new Person(name: 'Person 1'),
                new Person(name: 'Person 2'),
                new Person(name: 'Person 3'),
                new Person(name: 'Person 4'),
                new Person(name: 'Person 5'),
        ]
        persons.eachWithIndex { p, i ->
            if (i == 0) {
                p.addToProjectList(projects[0])
                p.addToProjectList(projects[1])
                p.addToProjectList(projects[2])
            } else if (i == 1) {
                p.addToProjectList(projects[2])
                p.addToProjectList(projects[3])
            }
            p.save(failOnError: true)
        }
    }

    def destroy = {
    }

    private createSqlViews() {
        log.info("Create sql views...")
        def scripts = []
        scripts << new File(this.class.classLoader.getResource('sql/view.sql').toURI()).getText('UTF-8')

        Project.withTransaction {
            def sql = new Sql(dataSource)
            scripts.each {
                sql.execute(it)
            }
        }
    }
}
