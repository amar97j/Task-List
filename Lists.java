
import java.util.ArrayList;
import java.util.List;

class Main {
  public static void main(String[] args) {
    List<String> Favourites = new ArrayList<>();
    Favourites.add("classic");
    Favourites.add("Jazz");
    Favourites.add("pop");
    Favourites.add("harry potter");
    Favourites.add("seinfeld");
    Favourites.add("the simpsons");
    Favourites.add("Black List");
    Favourites.add("The Walking Dead");
    
    Favourites.remove(2);
    System.out.println(Favourites.get(2));
    
    for (String Favourite: Favourites) {
    
    System.out.println(Favourite);
  }

}
}