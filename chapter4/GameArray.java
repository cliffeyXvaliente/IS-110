import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.text.StyledEditorKit;

public class GameArray {

    private ArrayList<String> gamingfilesArray;

    public GameArray() {

        gamingfilesArray = new ArrayList<>();
    }

    public void addName(String filename) {
        gamingfilesArray.add(filename);
    }

    public void listGames(int index) {

        if (index >= 0 && index < gamingfilesArray.size()) {
            String filename = gamingfilesArray.get(index);
            System.out.println(filename);
        }

    }

    public void allnamegamelist() {
        for (String gamin : gamingfilesArray) {
            System.out.println(gamin);
        }
    }

    public void iiteratormetode() {

        Iterator<String> it = gamingfilesArray.iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }

    }

    public void removegamingArray(int index) {
        if (index >= 0 && index < gamingfilesArray.size()) {
            gamingfilesArray.remove(index);
        }
    }

}
