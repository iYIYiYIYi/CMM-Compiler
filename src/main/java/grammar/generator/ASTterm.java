/* Generated By:JJTree: Do not edit this line. ASTterm.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package grammar.generator;

public
class ASTterm extends SimpleNode {
  public ASTterm(int id) {
    super(id);
  }

  public ASTterm(CMM_PARSER p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(CMM_PARSERVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=62269ae59145594d7ad9702d7b2ced72 (do not edit this line) */