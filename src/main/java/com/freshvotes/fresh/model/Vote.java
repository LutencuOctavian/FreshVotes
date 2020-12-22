package com.freshvotes.fresh.model;

import javax.persistence.*;

@Entity
@Table(name="vote")
public class Vote  {
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
