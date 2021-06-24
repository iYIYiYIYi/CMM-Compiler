package grammar.generator;

import grammar.semantic.Function;

import java.util.Stack;

public class SemanticAnalysis {

    SimpleNode root = (SimpleNode) CMM_PARSER.jjtree.peekNode();

    Stack<Function> mainStack;

    private void traverse(SimpleNode node) {
        for (int i = 0; i < node.children.length; i++) {
            SimpleNode n = (SimpleNode) node.children[i];
            traverse(n);


        }
    }

}
