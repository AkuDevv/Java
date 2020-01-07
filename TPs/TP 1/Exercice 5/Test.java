import java.nio.file.FileSystems;
import java.nio.file.Path;

class Test {
    public static void main(String[] args) {
        Path path = FileSystems.getDefault().getPath("").toAbsolutePath();
        FileStatistics fst = new FileStatistics(path + "/TP 1/Exercice 5/fichier1.txt");
        System.out.println("Le nombre de characteres: " + fst.getCharCount());
        System.out.println("Le nombre de mots: " + fst.getWordCount());
        System.out.println("Le nombre de phrases: " + fst.getSentanceCount());
        System.out.println("Le nombre de paragraphes : " + fst.getParagrapheCount());

        fst.saveCounts("counts.txt");
        System.out.println(fst.getDictionary());
        fst.saveDictionary("dictionnaire.txt");
}
}
