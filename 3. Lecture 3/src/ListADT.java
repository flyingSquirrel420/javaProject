import java.util.*;


public interface ListADT <E> extends Iterable<E> {

	int size();
	E get(int pos);
	Iterator<E> iterator();
}
