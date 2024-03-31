import java.util.ArrayList;

public class Menu {
    ArrayList<MenuItem> menuItemList;

    public Menu(ArrayList<MenuItem> menuItemList) {
        this.menuItemList = menuItemList;
    }
    public void addItemToMenu(MenuItem item){
        menuItemList.add(item);
    }
    public void removeItemFromMenu(MenuItem item){
        menuItemList.remove(item);

    }
    public void updateItemNameFromMenu(String itemId, String menuItemName ){
        for (int i=0; i<menuItemList.size(); i++) {
            if (menuItemList.get(i).getItemId() == itemId) {
                menuItemList.get(i).setName(menuItemName);
            }
            break;
        }
    }

    public void updateItemsPriceFromMenu(String itemId, double menuItemPrice){
        for (int i=0; i<menuItemList.size(); i++) {
            if (menuItemList.get(i).getItemId()== itemId){
                menuItemList.get(i).setPrice(menuItemPrice);
            }
            break;
        }
    }
    public void updateItemDescriptionFromMenu(String itemId, String manuItemDescription){
        for (int i=0; i<menuItemList.size(); i++) {
            if (menuItemList.get(i).getItemId() == itemId) {
                menuItemList.get(i).setDescription(manuItemDescription);
            }
            break;
        }
    }
    public void displayMenu(){
        for (int i=0; i<menuItemList.size(); i++) {
            System.out.println("Menu\nname: "+menuItemList.get(i).getName() + "\nprice: "+
                    menuItemList.get(i).getPrice() + "\ndescription: "+menuItemList.get(i).getDescription());
        }
    }


}
