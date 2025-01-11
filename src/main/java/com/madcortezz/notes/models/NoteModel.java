package com.madcortezz.notes.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class NoteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 100)
    private String title;
    @Lob
    private String content;

    public NoteModel(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public NoteModel() {

    }

}
