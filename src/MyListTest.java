import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MyListTest
{
    @Test
    public void testAddOneItem()
    {
        MyList list = new MyList();
        list.add(3);
        assertEquals(3, list.get(0));
    }

    @Test
    public void testAddSecondItem()
    {
        MyList list = new MyList();
        list.add(3);
        list.add(5);
        assertEquals(5, list.get(1));
    }

    @Test
    public void testFirstItemRemainsAfterAddingSecond()
    {
        MyList list = new MyList();
        list.add(3);
        list.add(5);
        assertEquals(3, list.get(0));
    }

    // Papildus testi
    @Test
    public void testRemoveSecondItemAfterAddingThreeItems()
    {
        MyList list = new MyList();
        list.add(3);
        list.add(5);
        list.add(7);
        list.remove(1);
        assertEquals(7, list.get(1));
    }

    @Test
    void testGetListSizeAfterAddingThreeItems()
    {
        MyList list = new MyList();
        list.add(3);
        list.add(5);
        list.add(7);
        assertEquals(3, list.size());
    }
}