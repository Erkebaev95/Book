public class FromBorrowedStatusMover extends BookMover{
    @Override
    public void moveToStatus(Book book, Status requestedStatus){
        if ((book.getStatus()).equals(Status.BORROWED)){
            switch (requestedStatus){
                case ARCHIVED:
                    book.setStatus(Status.ARCHIVED);
                    break;
                case OVERDUED:
                    book.setStatus(Status.OVERDUED);
                    break;
                case BORROWED:
                    System.out.println("Книга уже имеет статус" + requestedStatus);
                    break;
                case AVAILABLE:
                    book.setStatus(Status.AVAILABLE);
                    break;
            }
        } else {
            System.out.println("Ошибка, " + requestedStatus + " не мой статус!");
        }
        System.out.println("Статус книги: " + book.getStatus());
    }

}