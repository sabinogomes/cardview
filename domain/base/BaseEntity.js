class BaseEntity {

    constructor({
        id,
        createdAt,
        updatedAt
    }) {
        this.id = id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}

export default BaseEntity;
