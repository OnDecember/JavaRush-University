package ua.javarush.task.jdk13.task41.task4112;

import java.util.*;

public class Bowling {

    private final Queue<Track> tracks = new LinkedList<>();
    private final Queue<PairOfShoes> shoesShelf = new LinkedList<>();

    public Bowling(int tracksNumber) {
        for (int i = 1; i <= tracksNumber; i++) {
            tracks.add(new Track(i));
        }
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            shoesShelf.add(new PairOfShoes(random.nextInt(8) + 38));
        }
    }

    public synchronized Track acquireTrack() {
        Track track = null;
        if (!tracks.isEmpty()) {
            track = tracks.remove();
            track.setPrice(100 - tracks.size() * 10);
        }
        return track;
    }

    public synchronized void releaseTrack(Track track) {
        System.out.printf("З доріжки №%d зняли броню\n", track.getNumber());
        tracks.add(track);
    }

    public synchronized Set<PairOfShoes> acquireShoes(int number) {
        Set<PairOfShoes> shoes = null;
        if (shoesShelf.size() >= number) {
            shoes = new HashSet<>();
            for (int i = 0; i < number; i++) {
                shoes.add(shoesShelf.remove());
            }
        }
        return shoes;
    }

    public synchronized void releaseShoes(Set<PairOfShoes> shoes) {
        System.out.printf("У гардероб повернули %d пар взуття\n", shoes.size());
        shoesShelf.addAll(shoes);
    }
}
