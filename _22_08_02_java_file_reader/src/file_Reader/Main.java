package file_Reader;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader fr = openFileWithUserData();

        } catch (UserDataFileNotFoundException | UserDataFileFormatNotCorrectException e) {

            e.printStackTrace();
        }
    }
    public static FileReader openFileWithUserData() throws UserDataFileNotFoundException, UserDataFileFormatNotCorrectException {
        FileReader fr = null;
        try {
            fr = new FileReader("mambo.txt");
        } catch (FileNotFoundException e) {
            throw new UserDataFileNotFoundException("File not found");
        }
        if (!check(fr)) {
            throw new UserDataFileFormatNotCorrectException("file is not correct");
        }
        return fr;
    }
    private static boolean check(FileReader fr) {
        return true;
    }
}
