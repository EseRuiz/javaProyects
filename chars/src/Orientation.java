enum Orientation {

    NORTH, EAST, SOUTH, WEST;

    private Orientation actualOrientation;

    public Orientation advance(Orientation actualOrientation) {
        this.actualOrientation = actualOrientation;
        return values()[(this.actualOrientation.ordinal() + 1) % values().length];
    }

    public Orientation retreat(Orientation actualOrientation) {
        this.actualOrientation = actualOrientation;
        return values()[(this.actualOrientation.ordinal() - 1 + values().length) % values().length];
    }
}