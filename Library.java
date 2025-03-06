import java.util.ArrayList;
import java.util.Random;

public class Library {
    private ArrayList<String> collection = new ArrayList<String>();


    public void addItem(String item){ this.collection.add(item); }
    public void removeItem(String item){
        if(collection.size() == 0) System.out.println("No items");
        else {
            int i = this.collection.indexOf(item);
            if(i >= 0) this.collection.remove(i);
        }
    }
    public String getNextItem(){
        if(collection.size() == 0) return "no items";
        return this.collection.get(0);
     }
    public void skipNextItem(){ 
        if(collection.size() == 0) System.out.println("No items");
        else this.collection.remove(0); 
    }
    public void sortAlphabet(){ 
        this.collection.sort((a, b) -> a.compareTo(b)); 
    }
    public int find(String item){ return this.collection.indexOf(item); }
    public void shuffle(){
        this.collection.sort((a, b) -> new Random().nextInt()); 
    } 
    public String toString(){ 
        StringBuilder strbld = new StringBuilder("");
        for(String s : this.collection){ strbld.append(s + "\n"); }
        return strbld.toString();
      }

}
