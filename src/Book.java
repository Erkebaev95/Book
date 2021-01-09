public class Book {
    private String title;
    private Status status = Status.AVAILABLE;

    public String getTitle() {
        return title;
    }

    public void setName(String title) {
        this.title = title;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return  status;
    }

    public Book(String title){
        this.title = title;
    }
}