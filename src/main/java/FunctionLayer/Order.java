
package FunctionLayer;


public class Order {
    private int id;
    private int width;
    private int length;
    private int height;
    private String status;

    public Order(int id, int width, int length, int height, String status) {
        this.id = id;
        this.width = width;
        this.length = length;
        this.height = height;
        this.status = status;
    }
     public Order(int width, int length, int height) {
         
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", width=" + width + ", length=" + length + ", height=" + height + ", status=" + status + '}';
    }

}