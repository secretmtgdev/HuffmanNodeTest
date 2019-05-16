import java.util.*;
import java.awt.List;
public class Driver {
    public static void main(final String[] args) {
        ArrayList<HuffmanNode> myList = new ArrayList<HuffmanNode>() {
            {
                add(new HuffmanNode(2, 'a'));
                add(new HuffmanNode(4, 'b'));
                add(new HuffmanNode(1, 'c'));
            }
        };
        HuffmanTree myTree = new HuffmanTree(myList);
        myTree.compressData();
        myTree.printPaths();
    }
}