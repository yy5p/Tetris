public class Bigblock {

    public Block[] blocks = new Block[4];

    //旋转的状态
    protected State[] states;
    //声明旋转次数
    protected int count = 10000;


    //左移方法
    public void moveLeft() {
        for (Block block : blocks) {
            block.left();
        }
    }

    //右移方法
    public void moveRight() {
        for (Block block : blocks) {
            block.right();
        }
    }

    //单元格下落
    public void moveDrop() {
        for (Block block : blocks) {
            block.down();
        }
    }

    //编写随机生成四方格
    public static Bigblock randomOne() {
        int num = (int) (Math.random() * 7);
        Bigblock bigblock = null;
        switch (num) {
            case 0:
                bigblock = new I();
                break;
            case 1:
                bigblock = new J();
                break;
            case 2:
                bigblock = new L();
                break;
            case 3:
                bigblock = new O();
                break;
            case 4:
                bigblock = new S();
                break;
            case 5:
                bigblock = new T();
                break;
            case 6:
                bigblock = new Z();
                break;
        }

        return bigblock;
    }

    //顺时针旋转的方法
    public void rotateRight() {
        if (states.length == 0) {
            return;
        }

        //旋转次数+1
        count++;
        State s = states[count % states.length];
        Block block = blocks[0];
        int row = block.getRow();
        int col = block.getCol();
        blocks[1].setRow(row + s.row1);
        blocks[1].setCol(col + s.col1);
        blocks[2].setRow(row + s.row2);
        blocks[2].setCol(col + s.col2);
        blocks[3].setRow(row + s.row3);
        blocks[3].setCol(col + s.col3);
    }

    //逆时针旋转的方法
    public void rotateLeft() {
        if (states.length == 0) {
            return;
        }

        //旋转次数+1
        count--;
        State s = states[count % states.length];
        Block block = blocks[0];
        int row = block.getRow();
        int col = block.getCol();
        blocks[1].setRow(row + s.row1);
        blocks[1].setCol(col + s.col1);
        blocks[2].setRow(row + s.row2);
        blocks[2].setCol(col + s.col2);
        blocks[3].setRow(row + s.row3);
        blocks[3].setCol(col + s.col3);
    }

    //四方格旋转状态的内部类
    protected class State {
        //存储四方格各元素的位置
        int row0, col0, row1, col1, row2, col2, row3, col3;

        public State() {
        }

        public State(int row0, int col0, int row1, int col1, int row2, int col2, int row3, int col3) {
            this.row0 = row0;
            this.col0 = col0;
            this.row1 = row1;
            this.col1 = col1;
            this.row2 = row2;
            this.col2 = col2;
            this.row3 = row3;
            this.col3 = col3;
        }

        public int getRow0() {
            return row0;
        }

        public void setRow0(int row0) {
            this.row0 = row0;
        }

        public int getCol0() {
            return col0;
        }

        public void setCol0(int col0) {
            this.col0 = col0;
        }

        public int getRow1() {
            return row1;
        }

        public void setRow1(int row1) {
            this.row1 = row1;
        }

        public int getCol1() {
            return col1;
        }

        public void setCol1(int col1) {
            this.col1 = col1;
        }

        public int getRow2() {
            return row2;
        }

        public void setRow2(int row2) {
            this.row2 = row2;
        }

        public int getCol2() {
            return col2;
        }

        public void setCol2(int col2) {
            this.col2 = col2;
        }

        public int getRow3() {
            return row3;
        }

        public void setRow3(int row3) {
            this.row3 = row3;
        }

        public int getCol3() {
            return col3;
        }

        public void setCol3(int col3) {
            this.col3 = col3;
        }

        @Override
        public String toString() {
            return "State{" +
                    "row0=" + row0 +
                    ", col0=" + col0 +
                    ", row1=" + row1 +
                    ", col1=" + col1 +
                    ", row2=" + row2 +
                    ", col2=" + col2 +
                    ", row3=" + row3 +
                    ", col3=" + col3 +
                    '}';
        }
    }
}
