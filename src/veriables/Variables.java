package veriables;

public class Variables {

    public int sum = 2;

    public static void main(String[] args) {


        System.out.println(new Variables().add(4));

    }

    public int add(int data)
    {
        int sum = data * 2;
        this.sum = this.sum + data;
        return this.sum;

    }
}
