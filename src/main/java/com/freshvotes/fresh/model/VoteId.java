package com.freshvotes.fresh.model;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class VoteId implements Serializable {

    private static final long serialVersionUID=620229445639364177L;
    private Users userId;
    private Feature featureId;

    @ManyToOne
    public Users getUserId() {
        return userId;
    }

    public void setUserId(Users userId) {
        this.userId = userId;
    }

    @ManyToOne
    public Feature getFeatureId() {
        return featureId;
    }

    public void setFeatureId(Feature featureId) {
        this.featureId = featureId;
    }
}
