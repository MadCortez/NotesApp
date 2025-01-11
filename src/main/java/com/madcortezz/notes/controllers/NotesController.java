package com.madcortezz.notes.controllers;

import com.madcortezz.notes.repositories.INoteRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NotesController {

    private final INoteRepository noteRepository;

    public NotesController(INoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @GetMapping
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/privacy")
    public String privacy() {
        return "privacy";
    }
}
