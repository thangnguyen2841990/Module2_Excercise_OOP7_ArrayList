package com.codegym;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CandidatureManagement {
    private ArrayList<Candidature> candidatures = new ArrayList<>();

    public CandidatureManagement() {
    }

    public CandidatureManagement(ArrayList<Candidature> candidatures) {
        this.candidatures = candidatures;
    }

    public ArrayList<Candidature> getCandidatures() {
        return candidatures;
    }

    public void setCandidatures(ArrayList<Candidature> candidatures) {
        this.candidatures = candidatures;
    }
    public void addNewCandidature(Candidature newCandidature){
        candidatures.add(newCandidature);
    }
    public void displayAllCandidature(){
        for (int i = 0; i < candidatures.size(); i++) {
            System.out.println((i+1)+". "+candidatures.get(i));
        }
    }
    public int findExamIDCandidature(int examID){
        int index = -1;
        for (int i = 0; i < candidatures.size(); i++) {
            if (candidatures.get(i).getExamID() == examID){
                index = i;
            }
        }
        return index;
    }
    public void writerToFile(List<Candidature> candidatures, String path) throws IOException {
        OutputStream os = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(candidatures);
    }
    public void readerToFile(String path) throws IOException, ClassNotFoundException {
        InputStream is = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(is);
        this.candidatures = (ArrayList<Candidature>) ois.readObject();
    }
}
