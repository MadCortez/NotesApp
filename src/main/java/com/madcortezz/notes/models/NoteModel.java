package com.madcortezz.notes.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class NoteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String content;

    public NoteModel(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public NoteModel() {

    }

}
