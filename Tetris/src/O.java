public class O extends Bigblock {
    public O() {
        blocks[0] = new Block(0, 4, Maingame.O);
        blocks[1] = new Block(0, 5, Maingame.O);
        blocks[2] = new Block(1, 4, Maingame.O);
        blocks[3] = new Block(1, 5, Maingame.O);

        //无旋转状态
        states = new State[0];
    }
}
