package service;

import model.Notepad;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class NotepadServiceImpl implements NotepadService {
    private Notepad ntpd = new Notepad();
    List<Notepad> listOfNotes = new ArrayList<>();

    @Override
    public List<String> getHelp() {
        List<String> getHelp = new ArrayList<>();
        getHelp.add("help - выводит на экран список доступных команд с их описанием");
        getHelp.add("note-new  - создать новую заметку");
        getHelp.add("note-list - выводит все заметки на экран");
        getHelp.add("note-remove - удаляет заметку");
        getHelp.add("note-export - сохраняет все заметки в текстовый файл и выводит имя сохраненного файла");
        return getHelp;
    }

    @Override
    public void createNewNote(String lable, String note) {
        long num = ntpd.getId();
        Notepad createNewNote = new Notepad(++num, LocalDateTime.now(), lable, note);
        listOfNotes.add(createNewNote);
    }

    @Override
    public List<Notepad> outputAllNotes() {
        return listOfNotes;
    }

    @Override
    public void removeNote(long del) {
        for (Notepad ntpd :
                listOfNotes) {
            if (ntpd.getId() == del) {
                listOfNotes.remove(ntpd);
            }

        }

    }

    @Override
    public String exportNotes() {
        File myChoice = new File("C:/Users/Public/Notepad.txt");
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new BufferedWriter(new FileWriter(myChoice, true)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.flush();
        writer.close();
        return myChoice.getName();
    }


}
