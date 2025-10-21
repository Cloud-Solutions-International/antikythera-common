package sa.com.cloudsolutions.antikythera.evaluator;

import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.type.Type;

import java.util.List;

public interface Symbol {
    Type getType();

    Object getValue();

    void setValue(Object value);

    void setType(Type type);

    String getName();

    void setName(String name);
    List<Expression> getInitializer();
    void setInitializer(List<Expression> initializer);
    Class<?> getClazz();
}
