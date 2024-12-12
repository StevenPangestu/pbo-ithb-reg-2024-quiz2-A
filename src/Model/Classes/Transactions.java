package Model.Classes;

public class Transactions {
    private int id;
    private Books books;
    private Users users;

    public Transactions(int id, Books books, Users users) {
        this.id = id;
        this.books = books;
        this.users = users;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Books getBooks() {
        return books;
    }

    public void setBooks(Books books) {
        this.books = books;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

}
