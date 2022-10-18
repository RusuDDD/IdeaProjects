package file_Reader;

public class UserDataFileNotFoundException extends Exception {
    private String myMsg;

    public UserDataFileNotFoundException(String myMsg) {
        this.myMsg = myMsg;
    }

    public void print() {
        System.out.println(myMsg);

    }
}
