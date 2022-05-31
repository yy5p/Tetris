public class I extends Bigblock {

    public I() {
        blocks[0] = new Block(0, 4, Maingame.I);
        blocks[1] = new Block(0, 3, Maingame.I);
        blocks[2] = new Block(0, 5, Maingame.I);
        blocks[3] = new Block(0, 6, Maingame.I);

        //共有两种旋转状态
        states = new State[2];
        //初始化两种状态的相对坐标
        states[0] = new State(0, 0, 0, -1, 0, 1, 0, 2);
        states[1] = new State(0, 0, -1, 0, 1, 0, 2, 0);
    }
}
