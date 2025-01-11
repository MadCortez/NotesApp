package com.madcortezz.notes.repositories;

import com.madcortezz.notes.models.NoteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface INoteRepository extends JpaRepository<NoteModel, Long> {
}
