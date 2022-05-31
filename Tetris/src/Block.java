import java.awt.image.BufferedImage;
import java.util.Objects;

public class Block {
    // 行
    private int row;
    // 列
    private int col;
    private BufferedImage image;

    public Block() {
    }

    public Block(int row, int col, BufferedImage image) {
        this.row = row;
        this.col = col;
        this.image = image;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "row=" + row +
                ", col=" + col +
                ", image=" + image +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Block)) {
            return false;
        }
        Block block = (Block) o;
        return getRow() == block.getRow() &&
                getCol() == block.getCol() &&
                Objects.equals(getImage(), block.getImage());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRow(), getCol(), getImage());
    }

    //左移动一格
    public void left(){
        col--;
    }

    //右移动一格
    public void right(){
        col++;
    }

    //下移动一格
    public void down(){
        row++;
    }}