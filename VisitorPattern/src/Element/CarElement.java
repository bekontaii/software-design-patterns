package Element;

import Visitor.CarVisitor;

public interface CarElement {
    void accept(CarVisitor visitor);
}
