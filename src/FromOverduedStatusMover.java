public class FromOverduedStatusMover extends BookMover{
    @Override
    public void moveToStatus(Book book, Status requestedStatus){
        if ((book.getStatus()).equals(Status.OVERDUED)){
            switch (requestedStatus){
                case ARCHIVED:
                    book.setStatus(Status.ARCHIVED);
                    break;
                case AVAILABLE:
                    book.setStatus(Status.AVAILABLE);
                    break;
                case OVERDUED:
                    System.out.println("Книга уже имеет этот статус");
                    break;
                default:
                    System.out.println("Перевод книги из статуса" + book.getStatus() + "в статус" + requestedStatus + " невозможен");
            }
        } else {
            System.out.println("Ошибка, " + requestedStatus + " не мой статус!");
        }
        System.out.println("Статус книги: " + book.getStatus());
    }
}