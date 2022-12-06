public class GeminiBots {

    private int x1, x2, x3, x4;
    private int y1, y2, y3, y4;

    public GeminiBots (int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.x4 = x4;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.y4 = y4;
    }

    public String left() {
        x1 -= 1;
        y3 += 1;
        return "L";
    }
    public String right() {
        x1 += 1;
        y3 -= 1;
        return "R";
    }
    public String up() {
        y1 += 1;
        x3 += 1;
        return "U";
    }
    public String down() {
        y1 -= 1;
        x3 -= 1;
        return "D";
    }
}
