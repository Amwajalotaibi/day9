public class MovablePoint implements Movable {

    private int x;
    private int y;
    private int xspeed;
    private int yspeed;

    public MovablePoint(int x, int y, int xspeed, int yspeed) {
        this.x = x;
        this.y = y;
        this.xspeed = xspeed;
        this.yspeed = yspeed;
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

    public int getXspeed() {
        return xspeed;
    }

    public void setXspeed(int xspeed) {
        this.xspeed = xspeed;
    }

    public int getYspeed() {
        return yspeed;
    }

    public void setYspeed(int yspeed) {
        this.yspeed = yspeed;
    }

    @Override
    public void getmoveUp() {
        System.out.println(y-=yspeed);
    }

    @Override
    public void getDown() {
        System.out.println(y+=yspeed);
    }

    @Override
    public void getLeft() {
        System.out.println(x-=xspeed);

    }

    @Override
    public void getRight() {
        System.out.println(x+=xspeed);

    }
}
