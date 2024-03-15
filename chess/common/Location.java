package chess.common;

public class Location {
    private final File file;
    private final Interger rank;

    public Location(File file, Interger rank) {
        this.file = file;
        this.rank = rank;
    }

    public File getFile() {
        return file;
    }

    public Interger getRank() {
        return rank;
    }

    
}
