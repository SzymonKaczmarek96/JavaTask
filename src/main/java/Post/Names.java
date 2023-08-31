package Post;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.List;

public class Names {
    private List<String> nameList = new ArrayList<>();

    private String nameToList;

    private List<String> secondList = new ArrayList<>();



    public void addName() {

        nameList.add("Szymon");
        nameList.add("Ola");
        nameList.add("Karolina");
        nameList.add("Dawid");
        nameList.add("Andrzej");

        secondList.add("Jadwiga");
        secondList.add("Piotr");



    }


    public void displayList() {

        for(String name: nameList){
            System.out.println(name);
        }



    }

    public void displayFirstName() {

        String name = nameList.get(0);

        System.out.println(name);
    }

    public void changeName(int nameIndex, String name) {

        nameList.add(nameIndex,name);


    }


    public void deleteName(int whichName) {

        nameList.remove(whichName);

    }

    public void connectList() {

        secondList.addAll(nameList);

        for (String name: secondList) {
            System.out.println(name);
        }




    }

    public void displayWithLargeLetters() {

        for (String name: secondList) {
            System.out.println(name.toUpperCase());
        }


    }


    public void displayWomanNames() {

        for (String name: secondList) {
            if(name.endsWith("a")) {
                System.out.println(name);
            }
        }


    }
}
