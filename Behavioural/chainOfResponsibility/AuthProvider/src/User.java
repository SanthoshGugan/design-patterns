public class User {
    private String name;

    private AuthProviderType providerType;

    public User(final String name,
                final AuthProviderType providerType) {
        this.name = name;
        this.providerType = providerType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AuthProviderType getProviderType() {
        return providerType;
    }

    public void setProviderType(AuthProviderType providerType) {
        this.providerType = providerType;
    }
}

