public class מחרוזת_הפוכה {
    public static String revers(String yourWord){
        String newWord = " ";
        for (int i = yourWord.length()-1; i >= 0; i--){
            newWord = newWord + yourWord.charAt(i);

            }
        return newWord;

        }

    public static void main(String[] args) {
        System.out.println(revers("arie"));
    }

    }



