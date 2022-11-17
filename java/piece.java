public abstract class piece {
    private int x;
    private int y;
    private boolean white;
    private boolean dead;

    public piece(boolean white) {
        this.setColor(white);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean getColor() {
        return white;
    }

    public void setColor(boolean white) {
        this.white = white;
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

}
