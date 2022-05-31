public class Z extends Bigblock {
    public Z() {
        blocks[0] = new Block(1, 4, Maingame.Z);
        blocks[1] = new Block(0, 3, Maingame.Z);
        blocks[2] = new Block(0, 4, Maingame.Z);
        blocks[3] = new Block(1, 5, Maingame.Z);

        //共有两种旋转状态
        states = new State[2];
        //初始化两种状态的相对坐标
        states[0] = new State(0, 0, -1, -1, -1, 0, 0, 1);
        states[1] = new State(0, 0, -1, 1, 0, 1, 1, 0);
    }
}