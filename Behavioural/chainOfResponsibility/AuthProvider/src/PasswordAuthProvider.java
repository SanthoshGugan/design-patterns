public class PasswordAuthProvider implements AuthProvider{

    private AuthProvider next;

    @Override
    public void nextProvider(final AuthProvider provider) {
        this.next = provider;
    }
    @Override
    public void authenticate(User user) {
        if (user.getProviderType().equals(AuthProviderType.PASSWORD)) {
            System.out.println("Authenticating password");
        } else if (this.next != null){
            this.next.authenticate(user);
        } else {
            System.out.println("Not able to authenticate user!");
        }
    }
}
