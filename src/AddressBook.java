import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<BuddyInfo> buddyInfo;

    public AddressBook(){
        this.buddyInfo = new ArrayList<BuddyInfo>();
    }

    public static void main(String arg[]){
        BuddyInfo buddy = new BuddyInfo("Nick", "33 springfiel", "555-5555");
        AddressBook addressBook = new AddressBook();
        System.out.println("Address Book");
        addressBook.addBuddy(buddy);
        addressBook.printBuddy(0);
        addressBook.removeBuddy(0);
    }

    public void addBuddy(BuddyInfo aBuddyInfo){
        if (aBuddyInfo != null){
            this.buddyInfo.add(aBuddyInfo);
        }
    }

    public BuddyInfo removeBuddy(int index){
        if (index >= 0 && index < this.buddyInfo.size()){
            return this.buddyInfo.remove(index);
        }
        return null;
    }

    public void printBuddy(int index){
        if (index >= 0 && index < this.buddyInfo.size()){
            BuddyInfo bud = this.buddyInfo.get(index);
            System.out.println("Name: " + bud.getName());
            System.out.println("Address: " + bud.getAddress());
            System.out.println("Phone number : " + bud.getPhoneNumber());
        }
    }
}
