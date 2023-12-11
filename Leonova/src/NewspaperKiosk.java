import java.sql.*;

public class NewspaperKiosk {
    static String url = "jdbc:mysql://127.0.0.1:3306/newspaper_kiosk";
    static String username = "root";
    static String password = "1234567890";
    public void addProduct(String type, String productName, int quantity){
        if(check(productName, type, quantity)){
            return;
        }
        // Добавление товара в базу данных
        try(Connection connection = DriverManager.getConnection(url, username, password)){
            String addProductQuery = "INSERT INTO new_table (name, type, quantity) VALUES (?, ?, ?)";
            PreparedStatement addProductStmt = connection.prepareStatement(addProductQuery);
            addProductStmt.setString(1, productName);
            addProductStmt.setString(2, type);
            addProductStmt.setInt(3, quantity);
            addProductStmt.executeUpdate();
            System.out.println("Товар \"" + productName + "\" добавлен в базу данных.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void sellProduct(String type, String productName, int quantity){
        // Уменьшение количества товара при продаже
        try(Connection connection = DriverManager.getConnection(url, username, password)) {
            String sellProductQuery = "UPDATE new_table SET quantity = quantity - ? WHERE (name,type) = (?, ?)";
            PreparedStatement sellProductStmt = connection.prepareStatement(sellProductQuery);
            sellProductStmt.setInt(1, quantity);
            sellProductStmt.setString(2, productName);
            sellProductStmt.setString(3, type);
            sellProductStmt.executeUpdate();
            System.out.println("Продано " + quantity + " единиц товара \"" + productName + "\".");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void newType(String oldType, String newType, String name){
        try(Connection connection = DriverManager.getConnection(url, username, password)) {
            String updateProductQuery = "UPDATE new_table SET type = ? WHERE (name,type) = (?,?)";
            PreparedStatement updateProductStmt = connection.prepareStatement(updateProductQuery);
            updateProductStmt.setString(1, newType);
            updateProductStmt.setString(2, name);
            updateProductStmt.setString(3, oldType);
            updateProductStmt.executeUpdate();
            System.out.println("Данные о товаре \"" + name + "\" обновлены.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void newName(String type, String newName, String oldName){
        try(Connection connection = DriverManager.getConnection(url, username, password)) {
            String updateProductQuery = "UPDATE new_table SET name = ? WHERE (name,type) = (?,?)";
            PreparedStatement updateProductStmt = connection.prepareStatement(updateProductQuery);
            updateProductStmt.setString(1, newName);
            updateProductStmt.setString(2, oldName);
            updateProductStmt.setString(3, type);
            updateProductStmt.executeUpdate();
            System.out.println("Данные о товаре \"" + newName + "\" обновлены.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void newQuantity(String type, String productName, int newQuantity){
        // Обновление данных о товаре
        try(Connection connection = DriverManager.getConnection(url, username, password)) {
            String updateProductQuery = "UPDATE new_table SET quantity = ? WHERE (name,type) = (?,?)";
            PreparedStatement updateProductStmt = connection.prepareStatement(updateProductQuery);
            updateProductStmt.setInt(1, newQuantity);
            updateProductStmt.setString(2, productName);
            updateProductStmt.setString(3, type);
            updateProductStmt.executeUpdate();
            System.out.println("Данные о товаре \"" + productName + "\" обновлены.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    private boolean check(String name, String type, int quantity){
        //Проверка на задвоение
        try(Connection connection = DriverManager.getConnection(url, username, password)) {
            String updateProductQuery = "SELECT name, type, quantity FROM new_table";
            ResultSet rs = connection.createStatement()
                    .executeQuery(updateProductQuery);
            while(rs.next()){
                if(rs.getString("name").equals(name)&&
                    rs.getString("type").equals(type)){
                    newQuantity(type, name, quantity+rs.getInt("quantity"));
                    return true;
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }
    public void print(String type){
        try(Connection connection = DriverManager.getConnection(url, username, password)) {
            String sql = "SELECT name, type, quantity FROM new_table";
            ResultSet rs = connection.createStatement()
                    .executeQuery(sql);
            while(rs.next()){
                if(rs.getString("type").equals(type)){
                    System.out.println("'"+rs.getString("name")+"' "+
                            rs.getInt("quantity")+"_шт");
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}