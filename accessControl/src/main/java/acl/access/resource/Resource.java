package acl.access.resource;

import acl.access.access.AccessControlList;
import acl.access.access.AccessRight;
import acl.access.user.User;

public class Resource {
    private String name;
    private AccessControlList acl;
    private Directory parent;

    public Resource(String name){
        this.name = name;
    }


    public void setACL(AccessControlList accessControlList){
        this.acl = accessControlList;

    }


    public String accessBy(User principal){
        String  str = this.getContent();
        AccessRight accr = null;
        Resource resource = this;

        while (resource.parent != null){
            if(resource.acl !=null && resource.acl.getAccessRigthFor(principal) != null){
                break;
            }
            resource = resource.parent;
        }

        if(resource.acl !=null){
            accr = resource.acl.getAccessRigthFor(principal);
        }

        if(accr == AccessRight.GRANTED){
            return str;
        }else {
            return null;
        }

    }


    public String getName(){

        return this.name;
    }


    public void setParent(Directory parent){
        this.parent = parent;
    }


    public String getContent(){
        return this.name;
    }


}
