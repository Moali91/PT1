/*
 * Project and Training 1 - Computer Science, Berner Fachhochschule
 */

package acl.access.access;

import acl.access.user.User;

import java.util.ArrayList;

public class AccessControlList{

        private ArrayList<AccessControlEntity> acl = new ArrayList<>();

        public void add(AccessControlEntity ace) {
                for (AccessControlEntity ac : acl) {
                        if (ac.getPrincipal().equals(ace.getPrincipal())) {
                                if (ac.getAccessRight().equals(AccessRight.DENIED)) {
                                        return;
                                } else {
                                        this.acl.set(acl.indexOf(ac), ace);
                                        return;
                                }
                        }
                }
                acl.add(ace);
        }


        public AccessRight getAccessRigthFor(User principal){
                for(AccessControlEntity ac : this.acl){
                        if(principal.equals(ac.getPrincipal())){
                                return ac.getAccessRight();
                        }
                }
                return null;
        }
}
