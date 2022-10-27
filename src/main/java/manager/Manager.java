package manager;

import java.util.Arrays;

public class Manager {

    private String[] filmsArray = new String[0];

    private int limit;

    public Manager() {
        limit = 10;
    }

    public Manager(int limit) {
        this.limit = limit;
    }

    public void addFilm(String film) {
        String[] tmp = new String[filmsArray.length + 1];
        for (int i = 0; i < filmsArray.length; i++) {
            tmp[i] = filmsArray[i];
        }
        tmp[tmp.length - 1] = film;
        filmsArray = tmp;
    }

    public String[] findAll() {
        return filmsArray;
    }

    public String[] findLast() {
        int resultLength;
        if (filmsArray.length < limit) {
            resultLength = filmsArray.length;
        } else {
            resultLength = limit;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = filmsArray[filmsArray.length - 1 - i];
        }

        return tmp;
    }


    @Override
    public String toString() {
        return "Manager{" +
                "filmsArray=" + Arrays.toString(filmsArray) +
                '}';
    }
}
