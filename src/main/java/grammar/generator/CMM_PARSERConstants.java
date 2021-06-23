package grammar.generator;/* Generated By:JavaCC: Do not edit this line. CMM_PARSERConstants.java */

/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface CMM_PARSERConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int LINE_COMMENT = 5;
  /** RegularExpression Id. */
  int IMPORT = 6;
  /** RegularExpression Id. */
  int IF = 7;
  /** RegularExpression Id. */
  int ELSE = 8;
  /** RegularExpression Id. */
  int WHILE = 9;
  /** RegularExpression Id. */
  int RETURN = 10;
  /** RegularExpression Id. */
  int ADD = 11;
  /** RegularExpression Id. */
  int SUB = 12;
  /** RegularExpression Id. */
  int MUL = 13;
  /** RegularExpression Id. */
  int DIV = 14;
  /** RegularExpression Id. */
  int MOD = 15;
  /** RegularExpression Id. */
  int AB = 16;
  /** RegularExpression Id. */
  int BL = 17;
  /** RegularExpression Id. */
  int ASS = 18;
  /** RegularExpression Id. */
  int EQ = 19;
  /** RegularExpression Id. */
  int LB = 20;
  /** RegularExpression Id. */
  int RB = 21;
  /** RegularExpression Id. */
  int LM = 22;
  /** RegularExpression Id. */
  int RM = 23;
  /** RegularExpression Id. */
  int LS = 24;
  /** RegularExpression Id. */
  int RS = 25;
  /** RegularExpression Id. */
  int SEM = 26;
  /** RegularExpression Id. */
  int ID = 27;
  /** RegularExpression Id. */
  int NUM = 28;
  /** RegularExpression Id. */
  int DIGIT = 29;
  /** RegularExpression Id. */
  int EMPTY = 30;
  /** RegularExpression Id. */
  int NON_EMPTY = 31;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int MATCH_NON_EMPTY = 1;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\r\"",
    "\"\\t\"",
    "\"\\n\"",
    "<LINE_COMMENT>",
    "\"import\"",
    "\"if\"",
    "\"else\"",
    "\"while\"",
    "\"return\"",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\"%\"",
    "\">\"",
    "\"<\"",
    "\"=\"",
    "\"==\"",
    "\"{\"",
    "\"}\"",
    "\"[\"",
    "\"]\"",
    "\"(\"",
    "\")\"",
    "\",\"",
    "<ID>",
    "<NUM>",
    "<DIGIT>",
    "\"\"",
    "<NON_EMPTY>",
    "\";\"",
  };

}
