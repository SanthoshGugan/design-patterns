public class Main {
    public static void main(String[] args) {

        final var passwordAuthProvider = new PasswordAuthProvider();
        final var ssoSamlAuthProvider = new SsoSamlAuthProvider();

        passwordAuthProvider.nextProvider(ssoSamlAuthProvider);

        final var user1 = new User("Sam", AuthProviderType.PASSWORD);
        passwordAuthProvider.authenticate(user1);

        final var user2 = new User("Pam", AuthProviderType.SSO_SAML);
        passwordAuthProvider.authenticate(user2);

        final var user3 = new User("Ridley", AuthProviderType.SSO_OAUTH);
        passwordAuthProvider.authenticate(user3);

        final var user4 = new User("Medley", AuthProviderType.WEB_AUTHN);
        passwordAuthProvider.authenticate(user4);
    }
}