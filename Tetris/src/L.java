public class L extends Bigblock {
    public L() {
        blocks[0] = new Block(0, 4, Maingame.L);
        blocks[1] = new Block(0, 3, Maingame.L);
        blocks[2] = new Block(0, 5, Maingame.L);
        blocks[3] = new Block(1, 3, Maingame.L);

        states = new State[4];
        states[0] = new State(0, 0, 0, -1, 0, 1, 1, -1);
        states[1] = new State(0, 0, -1, 0, 1, 0, -1, -1);
        states[2] = new State(0, 0, 0, 1, 0, -1, -1, 1);
        states[3] = new State(0, 0, 1, 0, -1, 0, 1, 1);
    }
}
