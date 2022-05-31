public class T extends Bigblock {
    public T() {
        blocks[0] = new Block(0, 4, Maingame.T);
        blocks[1] = new Block(0, 3, Maingame.T);
        blocks[2] = new Block(0, 5, Maingame.T);
        blocks[3] = new Block(1, 4, Maingame.T);

        states = new State[4];
        states[0] = new State(0, 0, 0, -1, 0, 1, 1, 0);
        states[1] = new State(0, 0, -1, 0, 1, 0, 0, -1);
        states[2] = new State(0, 0, 0, 1, 0, -1, -1, 0);
        states[3] = new State(0, 0, 1, 0, -1, 0, 0, 1);
    }
}
