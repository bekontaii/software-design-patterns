package CarTypes;

import Element.CarElement;
import Visitor.CarVisitor;

public class SUV implements CarElement {

    @Override
    public void accept(CarVisitor visitor) {
        visitor.visit(this);
    }
}

