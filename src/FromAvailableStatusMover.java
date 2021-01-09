public class FromAvailableStatusMover extends BookMover{
    @Override
    public void moveToStatus(Book book, Status requestedStatus){
        if ((book.getStatus()).equals(Status.AVAILABLE)){
            switch (requestedStatus){
                case ARCHIVED:
                    book.setStatus(Status.ARCHIVED);
                    break;
                case BORROWED:
                    book.setStatus(Status.BORROWED);
                    break;
                case AVAILABLE:
                    System.out.println("Книга уже имеет этот статус");
                    break;
                default:
                    System.out.println("Перевод книги из статуса" + book.getStatus() + " в статус" + requestedStatus + " невозможен");
            }
        } else {
            System.out.println("Ошибка, " + requestedStatus + " не мой статус!");
        }
        System.out.println("Статус книги: " + book.getStatus());
    }
}