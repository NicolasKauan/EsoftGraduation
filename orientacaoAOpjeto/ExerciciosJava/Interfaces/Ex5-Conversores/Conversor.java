public interface Conversor<T, R> {
    R converter(T entrada);
}
