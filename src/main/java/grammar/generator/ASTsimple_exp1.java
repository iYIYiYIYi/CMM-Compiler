/* Generated By:JJTree: Do not edit this line. ASTsimple_exp1.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package grammar.generator;

public
class ASTsimple_exp1 extends SimpleNode {
  public ASTsimple_exp1(int id) {
    super(id);
  }

  public ASTsimple_exp1(CMM_PARSER p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(CMM_PARSERVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=612c528e12bd0555a186e708ef010fd6 (do not edit this line) */
