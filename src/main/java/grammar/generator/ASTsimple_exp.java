/* Generated By:JJTree: Do not edit this line. ASTsimple_exp.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package grammar.generator;

public
class ASTsimple_exp extends SimpleNode {
  public ASTsimple_exp(int id) {
    super(id);
  }

  public ASTsimple_exp(CMM_PARSER p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(CMM_PARSERVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=31f301cee471917da49c68cee80432df (do not edit this line) */
