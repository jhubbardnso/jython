// Autogenerated AST node
package org.python.antlr.ast;
import org.python.antlr.PythonTree;
import org.antlr.runtime.Token;
import java.io.DataOutputStream;
import java.io.IOException;

public class Pass extends stmtType {

    public static final String[] _fields = new String[] {};

    public Pass(PythonTree tree) {
        super(tree);
    }

    public String toString() {
        return "Pass";
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitPass(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
    }

    public int getLineno() {
        return getLine();
    }

    public int getCol_offset() {
        return getCharPositionInLine();
    }

}