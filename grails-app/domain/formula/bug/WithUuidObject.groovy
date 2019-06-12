package formula.bug

abstract class WithUuidObject extends BaseObject {

    String uuid

    protected WithUuidObject() {
        this(UUID.randomUUID() as String)
    }

    protected WithUuidObject(String uuid) {
        this.uuid = uuid ?: UUID.randomUUID() as String
    }

    static mapping = {
        uuid nullable: false, formula: 'uuid'
    }

    static constraints = {
        uuid      nullable: false, maxSize: 36, minSize: 36
    }
}
