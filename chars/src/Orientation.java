enum Orientation {

    NORTH, EAST, SOUTH, WEST;

    private Orientation actualOrientation;

    public Orientation advance(Orientation actualOrientation) {
        return values()[(actualOrientation.ordinal() + 1) % values().length];
    }

    public Orientation retreat(Orientation actualOrientation) {
        return values()[(actualOrientation.ordinal() - 1 + values().length) % values().length];
    }
}