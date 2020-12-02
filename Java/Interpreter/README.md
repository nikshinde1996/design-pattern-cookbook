### Interpreter Design Pattern - BEHAVIORAL DESIGN PATTERN
* This design pattern is used to understand natural language text.
* Involves implementing an expression interface that tells how to interpret a particular context.
* The interpreter pattern does require some knowledge for formal grammars.
* Examples : Regex, search algorithms, Compilers

### When to use?
* When there is language to interpret and the language is simple.
* Appropriate when simplcity is more important than efficiency.
* Used for scripting and programming languages.

### Advanatages
* Its easy to implement if each grammer rule is represented by class.
* The pattern makes it easy to evaluate as expression in a new way. Add add new way by defining new operation on the expression classes.

### Disadvanatages
* As the number of grammer rule is high, it is harder to maintain the code.
* It requires a lot of error checking and a lot of expressions and code to evaluate.

### Participants
* AbstractExpression
    * Declares an abstract interpret operation that is common to all the nodes in the abstract syntax tree.
* TerminalExpression
    * Implements an Interpret operation associated with the terminal symbols in the grammer.
* NonTerminalExpression
    * One such class is required for every rule in the grammer.
* Context
    * Contains infromation that is global to the interpreter.
* Client
    * Builds the abstract tree