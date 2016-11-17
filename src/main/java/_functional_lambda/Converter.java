package _functional_lambda;

/**
 * Created by USER on 12.11.2016, 21:26.
 */
@FunctionalInterface
public interface Converter<F, T> {

    // may be void
    T convert(F data);
}
