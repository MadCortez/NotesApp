package com.madcortezz.notes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class NotesController {

    public String index(Model model) {
        return "index";
    }

}
