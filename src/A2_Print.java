public class A2_Print {

    public void print(int i) {
        System.out.println(i);
    }
    public void print(String s) {
        System.out.println(s);
    }
    public void print(int[] m) {
        for (int i : m) System.out.println(i + " ");
    }
    public void print(String[] m){
        for (String i : m) System.out.println(i + " ");
    }
}
