package tests;

import java.util.*;

public class Tests {

    List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        return languages.isEmpty();
    }

    public void addLanguage(String language) {
        languages.add(language);
    }

    public void removeLanguage(String language) {
        if (containsLanguage(language)) {
            languages.remove(language);
        }else{
            System.out.println("El lenguaje no esta en la lista");
        }
    }

    public String firstLanguage() {
        return languages.get(0);
    }

    public int count() {
        return languages.size();
    }

    public boolean containsLanguage(String language) {
        return languages.contains(language);
    }

    public boolean isExciting() {
        return languages.contains("Java") || languages.contains("Kotlin");
    }

    @Override
    public String toString() {
        return "Tests{" + "languages=" + languages + '}'+this.getClass().getSimpleName();
    }
}
