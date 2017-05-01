public class MyList
{
    private Node head;

    // elementu skaits sarakstā
    private int counter;

    // Noklusējuma konstruktors
    public MyList() {}

    /**
     * Pievieno elementu saraksta beigās
     */
    public void add(Object data)
    {
        // inicializēt Node tikai pirmā elementa gadījumā
        if (head == null) {
            head = new Node(data);
        }

        Node temp = new Node(data);
        Node current = head;

        // pārbaude uz NullPointerException
        if (current != null) {

            // pārmeklēt sarakstu un pievienot elementu saraksta beigās
            while (current.getNext() != null) {
                current = current.getNext();
            }

            // piešķirt rādītāju uz jauno mezglu
            current.setNext(temp);
        }

        // palielināt elementu skaitu sarakstā par vienu
        counter++;
    }

    /**
     * Atgriež saraksta elementu noteiktajā pozicijā
     */
    public Object get(int index)
    {
        // index vērtībai jābūt 0 vai lielākai par to
        if (index < 0)
            return null;

        Node current = null;

        if (head != null) {
            current = head.getNext();

            for (int i = 0; i < index; i++) {
                if (current.getNext() == null)
                    return null;

                current = current.getNext();
            }

            return current.getData();
        }

        return current;
    }

    /**
     * Likvidē saraksta elementu noteiktajā pozicijā
     */
    public boolean remove(int index)
    {
        if (index < 0 || index > size())
            return false;

        Node current = head;

        if (head != null) {
            for (int i = 0; i < index; i++) {
                if (current.getNext() == null)
                    return false;

                current = current.getNext();
            }

            current.setNext(current.getNext().getNext());

            // pazemināt elementu skaitu sarakstā par vienu
            counter--;

            return true;
        }

        return false;
    }

    /**
     * Atgriež elementu skaitu sarakstā
     */
    public int size()
    {
        return counter;
    }

    private class Node {
        // rādītājs uz nākamo mezglu
        Node next;

        // mezgla dati
        Object data;

        // Node konstruktors
        public Node(Object dataValue) {
            next = null;
            data = dataValue;
        }

        public Object getData()
        {
            return data;
        }

        public Node getNext()
        {
            return next;
        }

        public void setNext(Node nextValue)
        {
            next = nextValue;
        }
    }
}