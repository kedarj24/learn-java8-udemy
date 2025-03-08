package comparator.comparator11;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainRunner {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();

        list.add(new Book("Atomic Habits", LocalDate.of(2005,6,12)));
        list.add(new Book("The Power of Habit", LocalDate.of(2025,8,22)));
        list.add(new Book("Mindset: The New Psychology of Success", LocalDate.of(2015,1,30)));
        list.add(new Book("Getting Things Done: The Art of Stress-Free Productivity", LocalDate.of(2005,11,15)));
        list.add(new Book("How to Win Friends and Influence People", LocalDate.of(20011,6,9)));
        list.add(new Book("Rich Dad Poor Dad", LocalDate.of(2001,2,17)));
        list.add(new Book("10% Happier", LocalDate.of(2005,8,12)));
        list.add(new Book("Eat That Frog!: 21 Great Ways to Stop Procrastinating and Get More Done in Less Time", LocalDate.of(2005,6,11)));

        List<Book> newlist = list.stream().sorted(Comparator.comparing(Book::getTitle)
                .thenComparing(Book::getPublishDate)).toList();

        System.out.println(newlist);

    }
}
