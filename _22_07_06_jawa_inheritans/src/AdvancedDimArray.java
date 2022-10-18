public class AdvancedDimArray {
    private  int[] source;
    public AdvancedDimArray(int initialSize) {
    source= new int[initialSize];
    }
    public int get(int index) {
return source[index];
    }
    public void set(int index, int value) {
source[index]=value;
    }
    public int size() {
return source.length;
    }
    public void append(int value) {
int[]newsource=new int[source.length+1];
        for (int i = 0; i < source.length; i++) {
            newsource[i]=source[i];
        }
        newsource[newsource.length-1]=value;
        source=newsource;
    }
    public void insert(int index, int value) {


    }
    public void delete(int index) {

    }
    public boolean contains(int value) {


    }

}
