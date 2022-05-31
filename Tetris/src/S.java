public class S extends Bigblock {
    public S() {
        blocks[0] = new Block(0, 4, Maingame.S);
        blocks[1] = new Block(0, 5, Maingame.S);
        blocks[2] = new Block(1, 3, Maingame.S);
        blocks[3] = new Block(1, 4, Maingame.S);

        //共有两种旋转状态
        states = new State[2];
        //初始化两种状态的相对坐标
        states[0] = new State(0, 0, 0, 1, 1, -1, 1, 0);
        states[1] = new State(0, 0, 1, 0, -1, -1, 0, -1);
    }
}
