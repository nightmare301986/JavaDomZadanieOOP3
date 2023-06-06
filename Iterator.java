package Market;

public interface Iterator<E>{
    E next();

    default boolean hasNext() {
        return false;
    }

    void remove();
}