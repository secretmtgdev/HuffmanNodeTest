import java.util.PriorityQueue;
import java.util.List;
public class HuffmanTree { 
    private PriorityQueue<HuffmanNode> _tree;

    public HuffmanTree() {
        this(null);
    }

    public HuffmanTree(List<HuffmanNode> nodeList) {
        this._tree = new PriorityQueue<HuffmanNode>();
        if(nodeList != null){
            for(HuffmanNode node: nodeList) {
                this._tree.add(node);
            }
        }
    }

    ////////////////
    /// MUTATORS ///
    ////////////////
    public void add(final HuffmanNode toAdd) {
        this._tree.add(toAdd);
    }

    public void compressData() {
        while(this._tree.size() > 1) {
            extractAndFuse();
        }
    }

    private void extractAndFuse() {
        if(this._tree.size() <= 1) {
            throw new IllegalStateException("Can't perform an extraction due lack of elements in the queue");
        }
        HuffmanNode left = this._tree.poll();
        HuffmanNode right = this._tree.poll();
        HuffmanNode parent = new HuffmanNode(left.getFrequency() + right.getFrequency(), 
            '/', left, right);
        this._tree.add(parent);
    }

    public void printPaths() {
        traverseTree(this._tree.peek(), "");
    }

    private void traverseTree(HuffmanNode root, String binaryPath) {
        if(root == null) {
            return;
        }
        // go left 
        traverseTree(root.getLeft(), binaryPath + "0");
        
        // print
        if(root.getCharacter() != '/') {
            System.out.println(root.toString() + ":\t" + binaryPath);
        }

        // go right
        traverseTree(root.getRight(), binaryPath + "1");
    }
}