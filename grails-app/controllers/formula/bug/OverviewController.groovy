package formula.bug

class OverviewController {

    def index() {
        def personList = Person.list()
        render view: 'index', model: [personList: personList]
    }
}
