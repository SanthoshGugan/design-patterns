public class SsoSamlAuthProvider implements AuthProvider{
    private AuthProvider next;

    @Override
    public void nextProvider(final AuthProvider authProvider) {
        this.next = authProvider;
    }

    @Override
    public void authenticate(final User user) {
        if (user.getProviderType().equals(AuthProviderType.SSO_SAML)) {
            System.out.println("Authenticating SSO SAML");
        } else if(this.next != null) {
            this.next.authenticate(user);
        } else {
            System.out.println("Not able to authenticate user!");
        }
    }
}
