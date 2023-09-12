package pl.globallogic.exercises.intermediate.Playlist2;

public static class Song {
    private String title;
    private double duration;

    private Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }
}
}