package chapters.chapter9;

public class StackTestDynamic {
    public static void main(String[] args) {

        DynStack dynStack = new DynStack(5);
        DynStack dynStack1 = new DynStack(8);

        for (int i = 0; i < 10; i++) {
            dynStack.push(i);
        }
        for (int i = 0; i < 15; i++) {
            dynStack1.push(i);
        }
        System.out.println("stack in dynStack");
        for (int i = 0; i < 10; i++) {
            System.out.print(dynStack.pop() + " ");
        }
        System.out.println();
        System.out.println("stack in dynStack2");
        for (int i = 0; i < 15; i++) {
            System.out.print(dynStack1.pop() + " ");
        }
    }
}
