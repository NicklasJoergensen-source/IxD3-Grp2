package appuser;

public class AppUser implements UserDetails{
    private Long id;
    private String name;
    private String username;
    private String email;
    private String password;
    private AppUserRole appUserRole;
    private Boolean locked;
    private Boolean enabled;


}