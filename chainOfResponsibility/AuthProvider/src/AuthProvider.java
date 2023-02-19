public interface AuthProvider {

    void nextProvider(AuthProvider next);

    void authenticate(User user);
}
