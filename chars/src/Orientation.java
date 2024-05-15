enum Orientation {

    NORTH, EAST, SOUTH, WEST;



    public Orientation advance() {
        return values()[(this.ordinal() + 1) % values().length];
    }

    public Orientation retreat() {
        return values()[(this.ordinal() - 1 + values().length) % values().length];
    }
}