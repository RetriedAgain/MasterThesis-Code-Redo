package de.masterzoo;

import java.util.Objects;
import java.util.function.Function;

/**
 * Created by mimicking the BiConsumer functional interface
 *
 * @param <T> the type of the first argument to the operation
 * @param <U> the type of the second argument to the operation
 * @param <V> the type of the third argument to the operation
 */
@FunctionalInterface
public interface TriConsumer<T, U, V> {

	void accept(T t, U u, V v);

	default TriConsumer<T, U, V> andThen(TriConsumer<? super T, ? super U, ? super V> after) {
		Objects.requireNonNull(after);
		return (T t, U u, V v) -> {
			accept(t, u, v);
			after.accept(t, u, v);
		};
	}
}
