package com.freshvotes.fresh.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="vote")
public class Vote implements Serializable {

    @Column(name="composeKey")
    private VoteId pk;

    @Column(name="upvote")
    private Boolean upvote;

    public Boolean getUpvote() {
        return upvote;
    }

    public void setUpvote(Boolean upvote) {
        this.upvote = upvote;
    }

    @EmbeddedId
    public VoteId getPk() {
        return pk;
    }

    public void setPk(VoteId pk) {
        this.pk = pk;
    }
}
