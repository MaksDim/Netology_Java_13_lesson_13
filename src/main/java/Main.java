public class Main {

    public static void main (String[] args) {
        System.out.println("Hello");

        String[] names = {"Petya"};


        try {
            boolean res = isSameLen(names);
            System.out.println("Равны ли по длине? " + res);
        } catch (Exception e) {
            System.out.println("Ошибочка");
        }


        System.out.println("Bye");

    }

    public static boolean isSameLen(String[] names) throws Exception {
        if (names.length != 2) {
            throw new Exception(
                    "Нужно передать в массиве 2 имени, а ты передал: " + names.length);

        }
        int firstLen = names[0].length();
        int secondLen = names[1].length();
        return firstLen == secondLen;
    }
}
