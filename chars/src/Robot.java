class Robot {
    private GridPosition initialPosition;
    private Orientation initialOrientation;
    Robot(GridPosition initialPosition, Orientation initialOrientation) {
        this.initialOrientation = initialOrientation ;
        this.initialPosition = initialPosition ;
    }

    GridPosition getGridPosition() {
        return this.initialPosition;
    }

    Orientation getOrientation() {
        return this.initialOrientation;
    }

    void advance() {
        int x = this.initialPosition.x;
        int y = this.initialPosition.y;
        if (initialOrientation == Orientation.NORTH) {
            y += 1 ;
        } else if (initialOrientation == Orientation.EAST) {
            x ++ ;
        } else if (initialOrientation == Orientation.SOUTH) {
            y -= 1;
        } else if (initialOrientation == Orientation.WEST) {
            x -- ;
        }
        this.initialPosition = new GridPosition(x,y);
    }

    void turnLeft() {
        this.initialOrientation = this.initialOrientation.retreat(this.initialOrientation);
    }

    void turnRight() {
        this.initialOrientation = this.initialOrientation.advance(this.initialOrientation);
    }

    void simulate(String instructions) {
        char[] chars = instructions.toCharArray();
        for(char c: chars){
            if(c == 'R'){
                turnRight();
            } else if (c == 'L') {
                turnLeft();
            } else if (c == 'A') {
                advance();
            }
        }
    }

}