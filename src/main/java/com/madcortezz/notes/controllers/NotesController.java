package com.madcortezz.notes.controllers;

import com.madcortezz.notes.models.NoteModel;
import com.madcortezz.notes.repositories.INotesRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class NotesController {

    private final INotesRepository notesRepository;

    public NotesController(INotesRepository notesRepository) {
        this.notesRepository = notesRepository;
    }

    @GetMapping
    public String index(Model model) {
        List<NoteModel> notes = notesRepository.findAll();
        model.addAttribute("notes", notes);

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

    @PostMapping("/notes/create")
    public String createNote(@ModelAttribute NoteModel note) {

        notesRepository.save(note);
        return "redirect:/";
    }

    @PostMapping("/delete/{id}")
    public String deleteNote(@PathVariable("id") Long id) {
        notesRepository.deleteById(id);
        return "redirect:/";
    }
}
