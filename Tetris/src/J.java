public class J extends Bigblock {
    public J() {
        blocks[0] = new Block(0, 4, Maingame.J);
        blocks[1] = new Block(0, 3, Maingame.J);
        blocks[2] = new Block(0, 5, Maingame.J);
        blocks[3] = new Block(1, 5, Maingame.J);

        states = new State[4];
        states[0] = new State(0, 0, 0, -1, 0, 1, 1, 1);
        states[1] = new State(0, 0, -1, 0, 1, 0, 1, -1);
        states[2] = new State(0, 0, 0, 1, 0, -1, -1, -1);
        states[3] = new State(0, 0, 1, 0, -1, 0, -1, 1);
    }
}
