package file_Reader;

public class UserDataFileFormatNotCorrectException extends Exception {
    private String myMsg;

    public UserDataFileFormatNotCorrectException(String myMsg) {
        this.myMsg = myMsg;
    }

    public void print() {
        System.out.println(myMsg);

    }
}
