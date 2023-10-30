package cs2;

import java.sql.*;

public class DatabaseConnector {
    public void addContact(Contact contact) {
        // 实现添加联系人到数据库的逻辑
        // 假设使用JDBC来连接数据库
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/softstrct?serverTimezone=GMT", "root", "1234")) {
            String sql = "INSERT INTO tb_list (name, address, phone) VALUES (?, ?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, contact.getName());
                stmt.setString(2, contact.getAddress());
                stmt.setString(3, contact.getPhoneNumber());
                stmt.executeUpdate();
            }
            System.out.println("Contact added successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateContact(Contact contact) {
        // 实现更新联系人信息到数据库的逻辑
        // 假设使用JDBC来连接数据库
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/softstrct?serverTimezone=GMT", "root", "1234")) {
            String sql = "UPDATE tb_list SET phone=?, address=? WHERE name=?";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, contact.getPhoneNumber());
                stmt.setString(2, contact.getAddress());
                stmt.setString(3, contact.getName());
                stmt.executeUpdate();
            }
            System.out.println("Contact updated successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteContact(String name) {
        // 实现从数据库删除联系人的逻辑
        // 假设使用JDBC来连接数据库
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/softstrct?serverTimezone=GMT", "root", "1234")) {
            String sql = "DELETE FROM tb_list WHERE name=?";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, name);
                stmt.executeUpdate();
            }
            System.out.println("Contact deleted successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public cs3.model.Contact getContact(String name) {
        // 实现从数据库中查询联系人的逻辑，并返回Contact对象
        // 假设使用JDBC来连接数据库
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/softstrct?serverTimezone=GMT", "root", "1234")) {
            String sql = "SELECT * FROM tb_list WHERE name=?";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, name);
                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        String phone = rs.getString("phone");
                        String address = rs.getString("address");
                        return new cs3.model.Contact(name, phone, address);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}