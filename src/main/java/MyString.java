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
        int hash = 0;
        for(int i = 0; i < string.length(); i++) {
            hash += powMultiply(31, (i + 1)) * string.charAt(i);
        }
        return hash;
    }

    public int powMultiply(int a, int pow) {
        if(pow == 0) {
            return 1;
        }
        int result = a;
        if(pow > 1) {
            result = result * powMultiply(a, (pow - 1));
        }
        return result;
    }
}
