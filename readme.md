# 编译原理课程设计  
C-- :C语言魔改子集的实现  
使用JavaCC作为语法及词法分析工具，生成LLVM IR ,然后转义为native

Token List:

| TOKEN  | 种类 | 语义值     |
| ------ | ------ | ------------- |
| IMPORT | 保留字 | import        |
| IF     | 保留字 | if            |
| ELSE   | 保留字 | else          |
| WHILE  | 保留字 | while         |
| RETURN | 保留字 | return        |
| ID     |        | 变量/函数名 |
| NUM     |  | 数字            |
| ADD    | 操作符 | +             |
| SUB    | 操作符 | -             |
| MUL    | 操作符 | *             |
| DIV    | 操作符 | /             |
| MOD    | 操作符 | %             |
| AB     | 操作符 | >            |
| BL     | 操作符 | <            |
| ASS     | 操作符 | =            |
| EQ     | 操作符 | ==            |
| LB     | 操作符 | {             |
| RB     | 操作符 | }             |
| LM     | 操作符 | [             |
| RM     | 操作符 | ]             |
| LS     | 操作符 | (             |
| RS     | 操作符 | ）            |
| SEM     | 操作符 | ,            |
| PACKAGE     | 操作符 | package            |


语法：
```cpp
program: imp_stmt stmt_seq
stmt_seq:ID LS arg_stmt RS LB fun_stmt RB stmt_seq
                | arg_stmt stmt_seq
                | ε              
imp_stmt:IMPORT PACKAGE imp_stmt
                | ε
fun_stmt: stmt fun_stmt
                | ε
arg_stmt : ID SEM arg_stmt 
                | ID 
                | ε
stmt: if_stmt
                |loop_stmt
                |ass_stmt
                |return_stmt
if_stmt: IF LS exp RS LB stmt_seq RB 
                | IF LS exp RS LB stmt_seq RB ELSE stmt_seq
ass_stmt: ID ASS exp
loop_stmt:WHILE LS exp RS LB stmt_seq RB
return_stmt: RETURN exp
exp	: simple_exp BL simple_exp
		| simple_exp EQ simple_exp
		| simple_exp AB simple_exp
		| simple_exp

simple_exp : simple_exp ADD term
		| simple_exp SUB term
		| term
term : term MUL factor
		| term DIV factor
		| factor
factor:LS exp RS | NUM | ID


```

