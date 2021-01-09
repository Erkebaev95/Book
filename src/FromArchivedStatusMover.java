public class FromArchivedStatusMover extends BookMover{
    @Override
    public void moveToStatus(Book book, Status requestedStatus){
        if ((book.getStatus()).equals(Status.ARCHIVED)){
            switch (requestedStatus){
                case AVAILABLE:
                    book.setStatus(Status.AVAILABLE);
                    break;
                default:
                    System.out.println("Перевод книги из статуса ARCHIVED в статус " + requestedStatus + " невозможен");
            }
        } else {
            System.out.println("Ошибка, " + requestedStatus + " не мой статус!");
        }
        System.out.println("Статус книги: " + book.getStatus());
    }
}