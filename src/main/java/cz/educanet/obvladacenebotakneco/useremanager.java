package main.java.cz.educanet.obvladacenebotakneco;

import main.java.cz.educanet.zolololgicka.animels;

import javax.enterprise.context.ApplicationScoped;
import java.io.Serializable;
import java.util.ArrayList;

@ApplicationScoped
public class useremanager implements Serializable {
    private ArrayList<animels> animallist = new ArrayList<>();

    public void birthanimal(animels animal, int indeks) {
            animallist.add(indeks, animal);
    }

    public int birthanimal(animels animal) {
            animallist.add(animallist.size(), animal);
            return animallist.size();
    }

    public void slaughteranimal(int indeks) {
            animallist.remove(indeks);
    }

    public void editanimal(animels animal, int indeks){
            animallist.set(indeks, animal);
    }

    public animels getanimal(int indeks){
            return animallist.get(indeks);
    }

    public Object[] getanimalarray(){
        return animallist.toArray();
    }

}
