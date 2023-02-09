import utils.Menu;
import utils.TestData;

public class App {

    public static void main(String[] args) {
        TestData data = TestData.getData();
        data.buildCatalogues();
        Menu.showMenu(data);
    }
}
