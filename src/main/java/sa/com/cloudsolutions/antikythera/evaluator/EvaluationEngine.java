package sa.com.cloudsolutions.antikythera.evaluator;

import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.Expression;

import java.util.Map;

public interface EvaluationEngine {
    Symbol getValue(Node n, String name);

    @SuppressWarnings("java:S3776")
    Symbol evaluateExpression(Expression expr) throws ReflectiveOperationException;

    void setField(String nameAsString, Symbol v);

    @SuppressWarnings("java:S3776")
    Symbol getLocal(Node node, String name);

    Map<Integer, Map<String, Symbol>> getLocals();

    Symbol getField(String name);

    void visit(MethodDeclaration md) throws ReflectiveOperationException;

    String getClassName();
}
