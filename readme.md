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


语法：
```cpp
program: stmt_seq;
stmt_seq:ID LS RS LB fun_stmt RB stmt_seq
                |ID LS arg_stmt RS LB fun_stmt RB stmt_seq
                |arg_stmt stmt_eq
                |ε
fun_stmt: stmt fun_stmt
                |ε
arg_stmt : ID SEM arg_stmt | ID
stmt: if_stmt
                |loop_stmt
                |ass_stmt
                |return_stmt
                |call_stmt
call_stmt : ID LS arg_stmt
if_stmt: IF LS exp RS LB stmt RB 
                | IF LS exp RS LB stmt RB ELSE LB stmt RB
ass_stmt: ID ASS exp
loop_stmt:WHILE LS exp RS LB stmt RB
return_stmt: RETURN exp
exp	: simple_exp BL simple_exp
		| simple_exp EQ simple_exp
		| simple_exp AB simple_exp
		| simple_exp

simple_exp: term simple_exp`
simple_exp`: SUB term simple_exp` 
        | ε
term: factor term`
term`: DIV factor term` 
        | ε
term : term MUL factor
		| term DIV factor
		| factor
factor:LS exp RS | NUM | ID


```

