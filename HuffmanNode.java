import java.util.*;
import java.lang.*;
public class HuffmanNode implements Comparable<HuffmanNode> { 
    private int _frequency;
    private char _character;
    private HuffmanNode _left;
    private HuffmanNode _right;

    public HuffmanNode(final int frequency, final char character) {
        this(frequency, character, null, null);
    }

    public HuffmanNode(final int frequency, final char character, 
    final HuffmanNode left, final HuffmanNode right) {
        this._character = character;
        this._frequency = frequency;
        this._left = left;
        this._right = right;
    }

    ///////////////
    /// GETTERS ///
    ///////////////
    public int getFrequency() {
        return this._frequency;
    }

    public int getCharacter() {
        return this._character;
    }

    public HuffmanNode getLeft() {
        return this._left;
    }

    public HuffmanNode getRight() {
        return this._right;
    }

    public String toString() {
        return String.format("|| Char: %s | Freq: %s ||", this._character, this._frequency);
    }

    ///////////////
    /// SETTERS ///
    ///////////////
    public void setFrequency(final int frequency) {
        this._frequency = frequency;
    }

    public void setCharacter(final char character) {
        this._character = character;
    }

    public void setLeft(final HuffmanNode left) {
        this._left = left;
    }

    public void setRight(final HuffmanNode right) {
        this._right = right;
    }

    public int compareTo(final HuffmanNode other) {
        return this._frequency - other._frequency;
    }
}