
/**
 * Write a description of class MyString here.
 *
 * @author Katelyn Junker
 * @version 11/12/2022
 */

public class MyString implements Comparable<MyString> {
    char[] data;
    public MyString(char[] chars) {
        this.data = chars;
    }
    public char charAt(int i) {
        if (i < this.data.length)
            return this.data[i];
        else
            return (Character) null;
    }
    public boolean equals(Object other) {
        return this.data == (char[]) other;
    }
    boolean equalsIgnoreCase(MyString other) {
        int length1 = other.data.length;
        int length2 = this.data.length;
        other = other.toLowerCase();
        MyString now = this.toLowerCase();
        if (length1 == length2) {
            for (int i = 0; i < length1; i++) {
                if (other.data[i] == now.data[i]) {
                    continue;
                }
                else{
                    return false;
                }
            }
        }

        else{
            return false;
        }
        return true;
    }
    public int length() {
        return this.data.length;
    }
    public void output() {
        for (int i = 0; i < length(); i++) {
            System.out.print(this.data[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
    public MyString substring(int begin) {
        char[] res = new char[length() - begin];
        int count = 0;
        for (int i = begin; i < length(); i++) {
            res[count] = this.data[i];
            count++;
        }
        return new MyString(res);
    }
    public MyString substring(int begin, int end) {
        char[] res = new char[length() - begin + end];
        int count = 0;
        for (int i = begin; i < end; i++) {
            res[count] = this.data[i];
            count++;
        }
        return new MyString(res);
    }
    public MyString toLowerCase() {
        char[] res = this.data;
        char[] result = new char[length()];
        for (int i = 0; i < result.length; i++) {
            if ((int) (res[i]) < 97) {
                result[i] = (char) ((int) (res[i]) + 32);
            }
            else{
                result[i] = res[i];
            }
        }
        return new MyString(result);
    }
    public MyString toUpperCase() {
        char[] res = this.data;
        char[] result = new char[length()];
        for (int i = 0; i < result.length; i++) {
            if ((int) (res[i]) >= 97) {
                result[i] = (char) ((int) (res[i]) - 32);
            }
            else{
                result[i] = res[i];
            }
        }
        return new MyString(result);
    }
    public static MyString valueOf(int i) {
        char[] result = new char[1];
        result[0] = (char) i;
        return new MyString(result);
    }
    @Override
    public int compareTo(MyString o) {
        int len1 = this.data.length;
        int len2 = o.data.length;
        if (len1 == len2) {
            for (int i = 0; i < len1; i++) {
                if (o.data[i] > this.data[i])
                    return -1;
                else if (o.data[i] < this.data[i]){
                    return 1;
                }
                else{
                    continue;
                }
            }
        } else if (len1 > len2) {
            return 1;
        }
        else{
            return -1;
        }
        return 0;
    }
}