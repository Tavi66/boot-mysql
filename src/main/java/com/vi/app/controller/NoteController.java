package com.vi.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vi.app.domain.Note;
import com.vi.app.service.NoteService;

@RestController
@RequestMapping(path="notes")
public class NoteController {
	@Autowired
	private NoteService noteService;
  @GetMapping
  public List<Note> getAllNotes(){
	  return noteService.getAllNotes();
  }
}
