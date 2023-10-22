package ua.javarush.task.jdk13.task41.task4118.states;

import ua.javarush.task.jdk13.task41.task4118.ui.Player;

public class PlayingState extends State {

    public PlayingState(Player player) {
        super(player);
        player.setPlaying(true);
    }

    @Override
    public String onLock() {
        player.setState(new LockedState(player));
        player.setCurrentTrackAfterStop();
        return "Stop playing";
    }

    @Override
    public String onPlay() {
        player.setState(new ReadyState(player));
        return "Paused...";
    }

    @Override
    public String onNext() {
        return player.nextTrack();
    }

    @Override
    public String onPrevious() {
        return player.previousTrack();
    }
}
