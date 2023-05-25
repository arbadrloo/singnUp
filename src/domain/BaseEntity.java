package domain;

public class BaseEntity<Id> {
    private Id id;

    public BaseEntity(Id id) {
        this.id = id;
    }

    public BaseEntity() {
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }
}
