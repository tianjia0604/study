package practice_05;
import java.util.*;

public class QueuesToStack<E> {
    LinkedList<E> q1 = new LinkedList<E>();//入栈
    LinkedList<E> q2 = new LinkedList<E>();//出栈

    //isEmpty()
    public boolean isEmpty() {
        return q1.isEmpty() && q2.isEmpty();
    }

    //push()
    public synchronized void push(E data) {
        q1.add(data);
    }

    //pop()
    public synchronized E pop() {
        if (q1.size() == 1) {
            return q1.poll();
        } else {
            while (q1.size() != 1) {
                q2.add(q1.poll());
            }
            E tem = q1.poll();
            while (!q2.isEmpty()) {
                q1.add(q2.poll());
            }
            return tem;
        }

    }

    public static void main(String[] args) {
        QueuesToStack test = new QueuesToStack();

        test.push('a');
        test.push('b');
        test.push('c');
        System.out.println(test.pop());
        System.out.println(test.pop());
        test.push('d');
        test.push('e');
        System.out.println(test.pop());
        System.out.println(test.pop());
        System.out.println(test.pop());

    }
}
