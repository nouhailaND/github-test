package tn.esprit;
import java.io.File;
public class RepositoryLocation {

public static void main(String[] args) {
File file = new File("C:\\Users\\nameUser\\.m2\\repository\\tn\\esprit\\1.0");
String absolutePath = file.getAbsolutePath();
String filePath =absolutePath.substring(0,absolutePath.indexOf(File.separator,
30));
System.out.println("Le dossier contenant les dépendances "
+ "et les livrables des projets est  nounou: ");
//hello nounoju test
System.out.println( filePath);
}
}