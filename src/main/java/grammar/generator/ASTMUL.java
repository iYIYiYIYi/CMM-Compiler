/* Generated By:JJTree: Do not edit this line. ASTMUL.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package grammar.generator;

public
class ASTMUL extends SimpleNode {
  public ASTMUL(int id) {
    super(id);
  }

  public ASTMUL(CMM_PARSER p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(CMM_PARSERVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=e52016e1d17656c842c6e53ddfb5bade (do not edit this line) */
