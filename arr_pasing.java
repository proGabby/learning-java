
class ArraySystem {

    public static void main(String[] args) {
        // String[] names = { "Amaka", "Olu", "Precious", "Stone" };
        // System.out.println("before function call");
        // displayArray(names);
        // changeArrayContent(names);
        // System.out.println("after function call");
        // displayArray(names);
    }

    public static void displayArray(String[] arrs) {
        for (int index = 0; index < arrs.length; index++) {
            System.out.println(arrs[index]);
        }
    }

    public static void changeArrayContent(String[] arrs) {
        for (int index = 0; index < arrs.length; index++) {
            arrs[index] = "Ekaette";
        }
    }
}