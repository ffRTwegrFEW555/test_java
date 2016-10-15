package __com.javarush.test.level26.lesson_11;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *

 ------------------
 1	Какие методы есть у класса Collections?
 ------------------

 === Рекомендую:
 === https://habrahabr.ru/company/luxoft/blog/256877/

 static <T> boolean	addAll(Collection<? super T> c, T... elements)
 >>> Adds all of the specified elements to the specified collection.
 === Добавляет указанные элементы в коллекцию

 static <T> Queue<T> asLifoQueue(Deque<T> deque)
 >>> Returns a view of a Deque as a Last-in-first-out (Lifo) Queue.
 === (Habrahabr) Возвращает view из Deque в виде очереди работающей по принципу Last In First Out (LIFO).

 static <T> int	binarySearch(List<? extends Comparable<? super T>> list, T key)
 >>> Searches the specified list for the specified object using the binary search algorithm.
 === Поиск элемента в списке (list), используя binary search алгоритм.

 static <T> int	binarySearch(List<? extends T> list, T key, Comparator<? super T> c)
 >>> Searches the specified list for the specified object using the binary search algorithm.
 === Поиск элемента в списке (list), используя binary search алгоритм.
 === С использованием компаратора?

 static <E> Collection<E> checkedCollection(Collection<E> c, Class<E> type)
 >>> Returns a dynamically typesafe view of the specified collection.
 === Это просто обертка над любой другой коллекцией, которая выполняет проверку типа в runtime для любой операции модификации.
 === http://ru.stackoverflow.com/questions/430582/checked-collections-in-java

 static <E> List<E>	checkedList(List<E> list, Class<E> type)
 >>> Returns a dynamically typesafe view of the specified list.
 === Аналог

 static <K,V> Map<K,V> checkedMap(Map<K,V> m, Class<K> keyType, Class<V> valueType)
 >>> Returns a dynamically typesafe view of the specified map.
 === Аналог

 static <E> Set<E> checkedSet(Set<E> s, Class<E> type)
 >>> Returns a dynamically typesafe view of the specified set.
 === Аналог

 static <K,V> SortedMap<K,V> checkedSortedMap(SortedMap<K,V> m, Class<K> keyType, Class<V> valueType)
 >>> Returns a dynamically typesafe view of the specified sorted map.
 === Аналог

 static <E> SortedSet<E> checkedSortedSet(SortedSet<E> s, Class<E> type)
 >>> Returns a dynamically typesafe view of the specified sorted set.
 === Аналог

 static <T> void copy(List<? super T> dest, List<? extends T> src)
 >>> Copies all of the elements from one list into another.
 === Копирует все элементы из одного списка в другой.

 static boolean	disjoint(Collection<?> c1, Collection<?> c2)
 >>> Returns true if the _super specified collections have no elements in common.
 === Возвращает истину, если обе коллекции не имеют общих элементов.

 //////////////////// Continue
 //////////////////// https://habrahabr.ru/company/luxoft/blog/256877/
 //////////////////// https://docs.oracle.com/javase/7/docs/api/java/util/Collections.html#copy(java.util.List,%20java.util.List)


 static <T> Enumeration<T> emptyEnumeration()
 Returns an enumeration that has no elements.

 static <T> Iterator<T>	emptyIterator()
 Returns an iterator that has no elements.

 static <T> List<T>	emptyList()
 Returns the empty list (immutable).

 static <T> ListIterator<T>	emptyListIterator()
 Returns a list iterator that has no elements.

 static <K,V> Map<K,V>	emptyMap()
 Returns the empty map (immutable).

 static <T> Set<T>	emptySet()
 Returns the empty set (immutable).

 static <T> Enumeration<T>	enumeration(Collection<T> c)
 Returns an enumeration over the specified collection.

 static <T> void	fill(List<? super T> list, T obj)
 Replaces all of the elements of the specified list with the specified element.

 static int	frequency(Collection<?> c, Object o)
 Returns the number of elements in the specified collection equal to the specified object.

 static int	indexOfSubList(List<?> source, List<?> target)
 Returns the starting position of the first occurrence of the specified target list within the specified source list, or -1 if there is no such occurrence.

 static int	lastIndexOfSubList(List<?> source, List<?> target)
 Returns the starting position of the last occurrence of the specified target list within the specified source list, or -1 if there is no such occurrence.

 static <T> ArrayList<T>	list(Enumeration<T> e)
 Returns an array list containing the elements returned by the specified enumeration in the order they are returned by the enumeration.

 static <T extends Object & Comparable<? super T>>
 T	max(Collection<? extends T> coll)
 Returns the maximum element of the given collection, according to the natural ordering of its elements.

 static <T> T	max(Collection<? extends T> coll, Comparator<? super T> comp)
 Returns the maximum element of the given collection, according to the order induced by the specified comparator.

 static <T extends Object & Comparable<? super T>>
 T	min(Collection<? extends T> coll)
 Returns the minimum element of the given collection, according to the natural ordering of its elements.

 static <T> T	min(Collection<? extends T> coll, Comparator<? super T> comp)
 Returns the minimum element of the given collection, according to the order induced by the specified comparator.

 static <T> List<T>	nCopies(int n, T o)
 Returns an immutable list consisting of n copies of the specified object.

 static <E> Set<E>	newSetFromMap(Map<E,Boolean> map)
 Returns a set backed by the specified map.

 static <T> boolean	replaceAll(List<T> list, T oldVal, T newVal)
 Replaces all occurrences of one specified value in a list with another.

 static void	reverse(List<?> list)
 Reverses the order of the elements in the specified list.

 static <T> Comparator<T>	reverseOrder()
 Returns a comparator that imposes the reverse of the natural ordering on a collection of objects that implement the Comparable interface.

 static <T> Comparator<T>	reverseOrder(Comparator<T> cmp)
 Returns a comparator that imposes the reverse ordering of the specified comparator.

 static void	rotate(List<?> list, int distance)
 Rotates the elements in the specified list by the specified distance.

 static void	shuffle(List<?> list)
 Randomly permutes the specified list using a default source of randomness.

 static void	shuffle(List<?> list, Random rnd)
 Randomly permute the specified list using the specified source of randomness.

 static <T> Set<T>	singleton(T o)
 Returns an immutable set containing only the specified object.

 static <T> List<T>	singletonList(T o)
 Returns an immutable list containing only the specified object.

 static <K,V> Map<K,V>	singletonMap(K key, V value)
 Returns an immutable map, mapping only the specified key to the specified value.

 static <T extends Comparable<? super T>>
 void	sort(List<T> list)
 Sorts the specified list into ascending order, according to the natural ordering of its elements.

 static <T> void	sort(List<T> list, Comparator<? super T> c)
 Sorts the specified list according to the order induced by the specified comparator.

 static void	swap(List<?> list, int i, int j)
 Swaps the elements at the specified positions in the specified list.

 static <T> Collection<T>	synchronizedCollection(Collection<T> c)
 Returns a synchronized (thread-safe) collection backed by the specified collection.

 static <T> List<T>	synchronizedList(List<T> list)
 Returns a synchronized (thread-safe) list backed by the specified list.

 static <K,V> Map<K,V>	synchronizedMap(Map<K,V> m)
 Returns a synchronized (thread-safe) map backed by the specified map.

 static <T> Set<T>	synchronizedSet(Set<T> s)
 Returns a synchronized (thread-safe) set backed by the specified set.

 static <K,V> SortedMap<K,V>	synchronizedSortedMap(SortedMap<K,V> m)
 Returns a synchronized (thread-safe) sorted map backed by the specified sorted map.

 static <T> SortedSet<T>	synchronizedSortedSet(SortedSet<T> s)
 Returns a synchronized (thread-safe) sorted set backed by the specified sorted set.

 static <T> Collection<T>	unmodifiableCollection(Collection<? extends T> c)
 Returns an unmodifiable view of the specified collection.

 static <T> List<T>	unmodifiableList(List<? extends T> list)
 Returns an unmodifiable view of the specified list.

 static <K,V> Map<K,V>	unmodifiableMap(Map<? extends K,? extends V> m)
 Returns an unmodifiable view of the specified map.

 static <T> Set<T>	unmodifiableSet(Set<? extends T> s)
 Returns an unmodifiable view of the specified set.

 static <K,V> SortedMap<K,V>	unmodifiableSortedMap(SortedMap<K,? extends V> m)
 Returns an unmodifiable view of the specified sorted map.

 static <T> SortedSet<T>	unmodifiableSortedSet(SortedSet<T> s)
 Returns an unmodifiable view of the specified sorted set.

 ------------------
 2	Какие методы есть у класса Arrays?
 ------------------

 ------------------
 3	Как называется сортировка, которая используется при вызове Collections.sort()?
 ------------------

 ------------------
 4	Что такое mutex?
 ------------------

 ------------------
 5	Что такое монитор?
 ------------------

 ------------------
 6	Какие есть атомарные типы?
 ------------------

 ------------------
 7	Какие классы есть в канкаренси?
 ------------------

 ------------------
 8	Что такое "happens-before"?
 ------------------

 ------------------
 9	Что такое «барьер» в канкаренси?
 ------------------

 ------------------
 10	Нагуглить 5 различных классов из канкаренси.
 ------------------

 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
public class Questions {
    public static void main(String[] args) {
        List newList = new LinkedList();
        List простоСписок = Collections.emptyList();
        System.out.println(простоСписок);
    }
}
