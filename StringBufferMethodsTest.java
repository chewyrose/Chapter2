public class StringBufferMethodsTest {
    public static void main(String[] args) {
        // Create a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

        // 1. append() - Appends a string to the buffer
        sb.append(" World");
        System.out.println("After append: " + sb);

        // 2. insert() - Inserts a string at the specified position
        sb.insert(6, "Java ");
        System.out.println("After insert: " + sb);

        // 3. replace() - Replaces a portion of the string buffer
        sb.replace(6, 10, "Awesome");
        System.out.println("After replace: " + sb);

        // 4. delete() - Deletes a portion of the string buffer
        sb.delete(6, 13);
        System.out.println("After delete: " + sb);

        // 5. deleteCharAt() - Deletes the character at the specified index
        sb.deleteCharAt(5);
        System.out.println("After deleteCharAt: " + sb);

        // 6. reverse() - Reverses the content of the buffer
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // 7. capacity() - Returns the current capacity of the buffer
        System.out.println("Capacity: " + sb.capacity());

        // 8. ensureCapacity() - Ensures the minimum capacity
        sb.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity(50): " + sb.capacity());

        // 9. setLength() - Sets the length of the buffer
        sb.setLength(5);
        System.out.println("After setLength(5): " + sb);

        // 10. charAt() - Returns the character at the specified index
        System.out.println("Character at index 1: " + sb.charAt(1));
    }
}
