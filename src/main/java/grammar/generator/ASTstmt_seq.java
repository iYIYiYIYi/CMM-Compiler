/* Generated By:JJTree: Do not edit this line. ASTstmt_seq.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package grammar.generator;

public
class ASTstmt_seq extends SimpleNode {
  public ASTstmt_seq(int id) {
    super(id);
  }

  public ASTstmt_seq(CMM_PARSER p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(CMM_PARSERVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=e40034d6874960711c442216c1e0eaa6 (do not edit this line) */