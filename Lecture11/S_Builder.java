package Lecture11;

public class S_Builder{
    public static void main(String[] args) {
        // code
        StringBuilder sb = new StringBuilder(16);
        // sb.append("Hello");
        // sb.insert(2, "y");
        // sb.delete(2, 5);
        // sb.append("y");
        sb.ensureCapacity(8);
        // sb.append("bye");
        // sb.reverse();
        // sb.replace(2, 4, "replaced");
        System.out.println(sb.capacity());
    }
}