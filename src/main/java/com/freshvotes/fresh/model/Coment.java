package com.freshvotes.fresh.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="coment")
public class Coment implements Serializable {


    @Column(name="composeKey")
    private ComentId pk;

    @Column(name="text", length = 1000)
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @EmbeddedId
    public ComentId getPk() {
        return pk;
    }

    public void setPk(ComentId pk) {
        this.pk = pk;
    }
}
