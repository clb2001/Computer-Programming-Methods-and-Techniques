public class MyString {
    /*
     * define chararray
     */
    private final char[] value;

    /*
     * make function
     */
    public MyString(char[] value) {
        this.value = value;
    }

    public MyString(byte[] bytes) {
        this.value = new char[bytes.length];
        for (int i = 0; i < bytes.length; i++) {
            /*
             * byte exception
             */
            if (bytes[i] < 0) {
                this.value[i] = (char) (bytes[i] + 256);
            } else {
                this.value[i] = (char) bytes[i];
            }
        }
    }

    public int indexOf(char[] v) {
        for (int i = 0; i < value.length; i++) {
            int count = 0;
            int orig = 0;
            while (true) {
                if (count < v.length && value[i] == v[count]) {
                    i += 1;
                    count += 1;
                } else if (count == v.length) {
                    break;
                } else {
                    break;
                }
            }
            if (count == v.length) {
                return orig;
            }
        }
        return -1;
    }

    public MyString concat(char[] v) {
        int len = value.length;
        int len_concat = v.length;
        // concatenate
        char[] ConcatString = new char[len + len_concat];
        for (int i = 0; i < len; i++) {
            ConcatString[i] = value[i];
        }
        for (int i = len; i < len + len_concat; i++) {
            ConcatString[i] = v[i - len];
        }
        return new MyString(ConcatString);
    }

    public MyString replace(char[] v1, char[] v2) {
        // replace the substring v1 in value with v2
        int sameChar = 0;
        // the number of same chararray
        for (int k = 0; k < value.length; k++) {
            int count = 0;
            while (true) {
                if (count < v1.length && value[k] == v1[count]) {
                    k += 1;
                    count += 1;
                } else if (count == v1.length) {
                    break;
                } else {
                    break;
                }
            }
            if (count == v1.length) {
                sameChar += 1;
            }
        }
        int[] indexArray = new int[sameChar];
        int index = 0;
        int i = 0;
        // index array
        while (i < value.length) {
            int count = 0;
            while (true) {
                if (count < v1.length && value[i] == v1[count]) {
                    i += 1;
                    count += 1;
                } else {
                    i++;
                    break;
                }
            }
            if (count == v1.length) {
                indexArray[index] = i - v1.length - 1;
                index++;
            }
        }
        char[] ReplaceString = new char[value.length + (v2.length - v1.length) * sameChar];
        // replace
        int res = 0;
        int j = 0;
        while (j < value.length) {
            if (res < indexArray.length && j == indexArray[res]) {
                for (int l = 0; l < v2.length; l++) {
                    ReplaceString[j + res * (v2.length - v1.length) + l] = v2[l];
                }
                res++;
                j += v1.length;
            } else {
                ReplaceString[j + res * (v2.length - v1.length)] = value[j];
                j++;
            }
        }
        return new MyString(ReplaceString);
    }

    public int length() {
        return value.length;
    }

    public char[] getValue() {
        char[] charArray = new char[value.length];
        for (int i = 0; i < value.length; i++) {
            charArray[i] = value[i];
        }
        return charArray;
    }
}
