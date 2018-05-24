/**
 * Created by david on 24.05.2018.
 */
public class MyString {
    String string;

    public MyString(String string) {
        this.string = string;
    }

    public int hash() {
        if(string == null) {
            return 0;
        }
        return 1;
    }
}
