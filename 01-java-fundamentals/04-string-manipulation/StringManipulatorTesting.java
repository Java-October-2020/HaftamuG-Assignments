public class StringManipulatorTesting {
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();
        String str = manipulator.trimAndConcat("    Coding     ","     Dojo    ");
        System.out.println(str); 
        
    }
}
