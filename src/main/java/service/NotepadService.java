package service;

import model.Notepad;

import java.util.List;

public interface NotepadService {
    List<String> getHelp();

    void createNewNote(String lable, String note);

    List<Notepad> outputAllNotes();

    void removeNote(long del);

    String exportNotes();

}
