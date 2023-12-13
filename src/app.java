import controller.Menu;

import java.sql.SQLException;

class App {
    public static void main(String[] args) throws SQLException {
        Menu menu = new Menu();
        menu.executarMenu();
    }
}
