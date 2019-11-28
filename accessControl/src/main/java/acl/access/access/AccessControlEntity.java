package acl.access.access;

import acl.access.user.User;

public class AccessControlEntity  {

    private User principal;
    private AccessRight readPrivilege;

    public AccessControlEntity(User principal, AccessRight readPrivilege){
        this.principal = principal;
        this.readPrivilege = readPrivilege;
    }

    public User getPrincipal() {
        return this.principal;
    }

    public AccessRight getAccessRight() {
        return this.readPrivilege;
    }
}
