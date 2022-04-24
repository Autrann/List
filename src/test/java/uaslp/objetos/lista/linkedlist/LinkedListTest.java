package uaslp.objetos.lista.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import uaslp.objetos.lista.Iterator;
import uaslp.objetos.lista.exception.NotNullValuesAllowedException;
import uaslp.objetos.lista.exception.NotValidIndexException;

public class LinkedListTest {
    @Test
    public void givenANewList_WhenGetSize_thenResultIsZero(){
        //Given:
        LinkedList<String> list = new LinkedList<>();

        //When:
        int sizeOfList = list.getSize();

        //Then:
        Assertions.assertEquals(0, sizeOfList, "Size of list after creation must be zero");
    }

    @Test
    public void givenANewList_whenAddAtFrontAnElement_thenSizeIsOne() throws NotNullValuesAllowedException, NotValidIndexException {
        //Given:
        LinkedList<String> list = new LinkedList<>();

        //When:
        list.addAtFront("Hola");

        //Then:
        int size = list.getSize();

        Assertions.assertEquals(1, size);
        Assertions.assertEquals("Hola", list.getAt(0));
    }

    @Test
    public void givenAListWith1Element_whenAddAtFrontAnElement_thenSizeIsTwo() throws NotNullValuesAllowedException, NotValidIndexException {
        //Given:
        LinkedList<String> list = new LinkedList<>();

        list.addAtFront("Hola");

        //When:
        list.addAtFront("Mundo");

        //Then:
        int size = list.getSize();

        Assertions.assertEquals(2, size);
        Assertions.assertEquals("Mundo", list.getAt(0));
        Assertions.assertEquals("Hola", list.getAt(1));
    }

    @Test
    public void givenANewList_whenAddAtTailAnElement_thenSizeIsOne() throws NotNullValuesAllowedException, NotValidIndexException {
        //Given:
        LinkedList<String> list = new LinkedList<>();

        //When:
        list.addAtTail("Hola");

        //Then:
        int size = list.getSize();

        Assertions.assertEquals(1, size);
        Assertions.assertEquals("Hola", list.getAt(0));
    }

    @Test
    public void givenAListWith1Element_whenAddAtTailAnElement_thenRSizeIsTwo() throws NotNullValuesAllowedException, NotValidIndexException {
        //Given:
        LinkedList<String> list = new LinkedList<>();

        list.addAtTail("Hola");

        //When:
        list.addAtTail("Mundo");

        //Then:
        int size = list.getSize();

        Assertions.assertEquals(2, size);
        Assertions.assertEquals("Hola", list.getAt(0));
        Assertions.assertEquals("Mundo", list.getAt(1));
    }

    @Test
    public void givenAListWith1Element_WhenRemove_thenSizeIsZero() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given:
        LinkedList<String> list = new LinkedList<>();

        list.addAtFront("Hola");

        //When:
        list.remove(0);

        //Then:
        int size = list.getSize();
        Assertions.assertEquals(0, size);
    }

    @Test
    public void givenAListWithTwoElements_whenRemove_thenSizeIsOne() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given:
        LinkedList<String> list=new LinkedList<>(); 
        list.addAtFront("Hola");
        list.addAtTail("Mundo");

        //When:
        list.remove(0);

        //Then:
        int sizeOfList = list.getSize();

        Assertions.assertEquals(1,sizeOfList);
        Assertions.assertEquals("Mundo",list.getAt(0));
    }

    @Test
    public void givenAListWithTwoElements_whenRemoveIndex3_thenSizeIsThrown() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given:
        LinkedList<String> list=new LinkedList<>(); 
        list.addAtFront("Hola");
        list.addAtTail("Mundo");

        //When:
        //Then:
        Assertions.assertThrows(NotValidIndexException.class,()->list.remove(3));
    }

    @Test
    public void givenAListWithTwoElements_whenAddAtFrontNullValue_thenNotNullValuesAllowedExceptionIsThrown() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given:
        LinkedList<String> list=new LinkedList<>(); 
        list.addAtFront("Hola");
        list.addAtTail("Mundo");

        //When:
        //Then:
        Assertions.assertThrows(NotNullValuesAllowedException.class,()->list.addAtFront(null));
    }

    @Test
    public void givenAListWithTwoElements_whenAddAtTailNullValue_thenNotNullValuesAllowedExceptionIsThrown() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given:
        LinkedList<String> list=new LinkedList<>(); 
        list.addAtFront("Hola");
        list.addAtTail("Mundo");

        //When:
        //Then:
        Assertions.assertThrows(NotNullValuesAllowedException.class,()->list.addAtTail(null));
    }

    @Test
    public void givenAListWithTwoElements_whenSetAtTailNullValue_thenNotNullValuesAllowedExceptionIsThrown() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given:
        LinkedList<String> list=new LinkedList<>(); 
        list.addAtFront("Hola");
        list.addAtTail("Mundo");

        //When:
        //Then:
        Assertions.assertThrows(NotNullValuesAllowedException.class,()->list.setAt(0,null));
    }

    @Test
    public void givenAListWithTwoElements_whenSetAtIndex3_thenSizeIsThrown() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given:
        LinkedList<String> list=new LinkedList<>(); 
        list.addAtFront("Hola");
        list.addAtTail("Mundo");

        //When:
        //Then:
        Assertions.assertThrows(NotValidIndexException.class,()->list.setAt(3,"Valor"));
    }

    @Test
    public void givenAListWithTwoElements_whenRemoveIndex1_thenSizeIsOne() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given:
        LinkedList<String> list=new LinkedList<>(); 
        list.addAtFront("Hola");
        list.addAtTail("Mundo");

        //When:
        list.remove(1);

        //Then:
        int sizeOfList = list.getSize();

        Assertions.assertEquals(1,sizeOfList);
        Assertions.assertEquals("Hola",list.getAt(0));
    }

    @Test
    public void givenAListWithThreeElements_whenRemoveIndex1_thenSizeIsTwo() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given:
        LinkedList<String> list=new LinkedList<>(); 

        list.addAtTail("Mundo");
        list.addAtTail("Cruel");
        list.addAtFront("Adiós");

        //When:
        list.remove(1);

        //Then:
        int sizeOfList = list.getSize();

        Assertions.assertEquals(2,sizeOfList);
        Assertions.assertEquals("Adiós",list.getAt(0));
        Assertions.assertEquals("Cruel",list.getAt(1));
    }

    @Test
    public void givenAListWithThreeElements_whenRemoveElementAtTail_thenSizeIsTwo() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given:
        LinkedList<String> list=new LinkedList<>(); 

        list.addAtFront("Adiós");
        list.addAtTail("Mundo");
        list.addAtTail("Cruel");

        //When:
        list.remove(2);

        //Then:
        int sizeOfList = list.getSize();

        Assertions.assertEquals(2,sizeOfList);
        Assertions.assertEquals("Adiós",list.getAt(0));
        Assertions.assertEquals("Mundo",list.getAt(1));
    }

    @Test
    public void givenAListWithThreeElements_whenRemoveAll_thenSizeIsZero() throws NotNullValuesAllowedException {
        //Given:
        LinkedList<String> list=new LinkedList<>(); 

        list.addAtFront("Adiós");
        list.addAtTail("Mundo");
        list.addAtTail("Cruel");

        //When:
        list.removeAll();

        //Then:
        int sizeOfList = list.getSize();

        Assertions.assertEquals(0,sizeOfList);
    }

    @Test
    public void givenAListWithTwoElements_whenSetAt_thenElementIsModified() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given:
        LinkedList<String> list=new LinkedList<>(); 

        list.addAtTail("Mundo");
        list.addAtFront("Adiós");

        //When:
        list.setAt(0,"Hola");

        //Then:
        int sizeOfList = list.getSize();

        Assertions.assertEquals(2,sizeOfList);
        Assertions.assertEquals("Hola",list.getAt(0));
        Assertions.assertEquals("Mundo",list.getAt(1));
    }

    @Test
    public void givenAListWithThreeElements_whenGetIterator_thenIteratorWorksOverThreeElements() throws NotNullValuesAllowedException {
        //Given:
        LinkedList<String> list=new LinkedList<>(); 

        list.addAtFront("Adiós");
        list.addAtTail("Mundo");
        list.addAtTail("Cruel");

        //When:
        Iterator<String> iterator = list.getIterator();

        //Then:
        int sizeOfList = list.getSize();

        Assertions.assertEquals(3,sizeOfList);
        Assertions.assertNotNull(iterator);
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Adiós",iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Mundo",iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Cruel",iterator.next());
        Assertions.assertFalse(iterator.hasNext());
    }

    @Test
    public void givenANewList_whenGetAt_thenExceptionIsThrown(){
        //Given:
        LinkedList<String> list=new LinkedList<>(); 

        //When:
        try {
            list.getAt(0);
            Assertions.fail("An exception should be thrown getting element zero");
        }catch (NotValidIndexException ex){
            //Exception was Thrown
        }

    }
}
