package a_basics;

public class g_variableTypes {
    static int staticVariable = 30;

    class variables {
        int instanceVariable = 20;

        void show() {
            int localVariable = 10;
            System.out.println(localVariable);
            System.out.println(instanceVariable);
            System.out.println(staticVariable);
        }
    }

    public static void main(String[] args) {
        g_variableTypes outer = new g_variableTypes();
        variables obj = outer.new variables();
        obj.show();
    }
}
