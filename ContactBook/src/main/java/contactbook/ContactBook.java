package contactbook;


public class ContactBook{
    private int size;
    private Contact[]contacts;

    /**
     *
     * @param capacity the length of the array
     */
    public ContactBook(int capacity){
        this.contacts = new Contact[capacity];

    }


    public int getCapacity(){
        return  this.contacts.length;
    }

    /**
     *
     * @return how many contacts do we have
     */
    public int getSize(){
        return this.size;
    }

    /**
     *
     * @param contact to be added if not exist
     * @return true if added and false if not
     * 1. Check if already exists
     * 2. Check if has Capacity
     * 3. add the element by creating a new Array, and copy all Elements of the old array in the new one, and extend
     * the size by one
     */
    public boolean addContact(Contact contact){

        for(int i = 0; i<contacts.length;i++){
            if(contacts[i] == null){
                continue;
            }
            if (contacts[i].getName().equals(contact.getName())){
                return false;
            }
        }
        for(int j = 0; j<contacts.length; j++){
            if(contacts[j]==null) {
                contacts[j] = contact;
                this.size++;
                return true;
            }
        }
        int newSize = contacts.length+1;
        Contact[] temp = new Contact[newSize];
        System.arraycopy(contacts,0,temp,0,contacts.length);
        temp[newSize-1] = contact;
        this.contacts = temp;
        this.size++;
        return true;
    }

    /**
     *
     * @param name the element that we are looking for
     * @return the contact with this name if we found it, and if not we return null ( no element was found)
     *
     */
    public Contact findContact(String name){
        for(Contact cont : contacts){
            if(cont == null) continue;
            if(cont.getName().equals(name)){
                return cont;
            }
        }
        return null;
    }

    /**
     *
     * @param name to be removed
     * @return true if elements was removed and false if element havent removed
     * at first we check if the element = null, if it null then we check the next element
     * if the next element is not null then we check wth the second if if this element is what we are
     * looking for.
     */
    public boolean removeContact(String name){
        for(int i = 0; i<contacts.length;i++){
            if(contacts[i] == null) continue; // check all elements if i == null mach nächste element i+1
            if(contacts[i].getName().equals(name)){
                contacts[i]=null;
                this.size--;
                return true;
            }
        }
        return false;
    }

}
