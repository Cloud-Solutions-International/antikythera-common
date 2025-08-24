package sa.com.cloudsolutions.evaluator;

import com.github.javaparser.ast.type.Type;

public interface Symbol {
    Type getType();

    Object getValue();

    void setValue(Object value);

    void setType(Type type);

    String getName();

    void setName(String name);
}
